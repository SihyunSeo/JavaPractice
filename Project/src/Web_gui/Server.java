package Web_gui;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server extends Thread{
	private ServerSocket sSocket;	//server socket
	private Socket cSocket;			//client socket
	private OutputStream opStream;	//output stream
	private InputStream ipStream;	//input stream
	private byte[] data;
	private String serverFolder;
	private boolean runThread;
 	
	public Server(int port,String serverFolder) {
		runThread=true;
		data=new byte[1024];
		try {
			sSocket=new ServerSocket(port);
			this.serverFolder=new String(serverFolder);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void run() {
		WebFile file;
		String reqMsg;
		byte[] resMsg;
		while(runThread) {
			AcceptClient();
			reqMsg=new String(GetData());
			System.out.println(reqMsg);
			file=new WebFile(serverFolder,GetRequestedFile(reqMsg));
			//resMsg=String.format("HTTP/1.1 200 OK\r\nContent-Type: text/html\r\nContent-Length: %d\r\n\r\n%s\r\n", fileStr.length(),fileStr);
			//SendData()
			resMsg=MakeResponeMessage(new String(file.ReadFile()),file.GetStateCode(),file.GetFileType());
			System.out.println(new String(resMsg));
			SendData(resMsg);
			DisconnectClient();
		}
	}
	private void AcceptClient() {
		try {
			cSocket=sSocket.accept();	//wait connect
			
			opStream=cSocket.getOutputStream();	//get output stream
			ipStream=cSocket.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void SendData(byte []data) {
		int offset=0;
		int len=10;
		int dataLen=data.length;
		//while(true) {
			try {
				opStream.write(data,offset,dataLen);
				offset+=len;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}/* catch (IndexOutOfBoundsException e) {
				try {
					System.out.println(String.format("%d  %d  %d  %d", offset, len, dataLen, dataLen-offset));
					opStream.write(data, offset, dataLen-offset);
					break;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}*/
		//}
	}
	private byte[] GetData() {
		try {
			ipStream.read(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	public void DisconnectClient() {
		try {
			cSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void CloseServer() {
		runThread=false;
		try {
			sSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private String GetRequestedFile(String reqMsg) {
		String[] msgBlocks=reqMsg.split(" ");
		String file;

		if(msgBlocks[1].equals("/")) {
			file=new String("/main.html");
		}
		else {
			file=new String(msgBlocks[1]);
		}

		return file;
	}
	private byte[] MakeResponeMessage(String file,int stateCode,String fileType) {
		String tstrMsg;
		String strMsg;
		byte[] msg;
		System.out.println("¾È³ç".length());
		System.out.println(file.length());
		//tstrMsg=String.format("HTTP/1.1 %d OK\r\nContent-Type: text/%s\r\nContent-Length: %d\r\n\r\n%s\r\n",stateCode,fileType,file.length(),file);
		strMsg=String.format("HTTP/1.1 %d OK\r\nContent-Type: text/%s\r\nContent-Length: %d\r\n\r\n%s\r\n",stateCode,fileType,file.getBytes().length,file);
		System.out.println(strMsg);
		msg=strMsg.getBytes();
		
		return msg;
	}
}