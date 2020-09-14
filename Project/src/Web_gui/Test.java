package Web_gui;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ServerGUI sgui = new ServerGUI();
		System.out.println(sgui.getServerFolder());
		/*Server server=new Server(80,sgui.getServerFolder());
		String message;
		Scanner scn=new Scanner(System.in);*/
		//WebFile file=new WebFile("C:\\Users\\audrb\\OneDrive\\諛뷀깢 �솕硫�\\computer\\test\\�옄諛� �냼耳�\\src\\Server\\main.html");
		
		//server.start();
		
		/*server.AcceptClient();
		System.out.println("connect");
		System.out.println(new String(server.GetData()));
		String fileStr=new String(file.ReadFile());
		message=String.format("HTTP/1.1 200 OK\r\nContent-Type: text/html\r\nContent-Length: %d\r\n\r\n%s\r\n", fileStr.length(),fileStr);
		System.out.println(message);
		server.SendData(message.getBytes());
		server.DisconnectClient();
		server.CloseServer();*/
		//server.CloseServer();
		
		/*System.out.println("con");
		scn.nextLine();
		server.CloseServer();
		System.out.println("server closed");*/
	}

}
