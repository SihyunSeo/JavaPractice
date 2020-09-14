package Web_gui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WebFile {
	private FileInputStream fipStream;
	private byte[] buffer;
	private int stateCode;
	private String fileType;
	
	public WebFile(String serverFolder,String fileName) {
		String[] str=fileName.split("\\.");
		fileType=str[1];
		try {
			fipStream=new FileInputStream(serverFolder+fileName);
			stateCode=200;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			stateCode=404;
			try {
				fipStream=new FileInputStream(serverFolder+"/404.html");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	public byte[] ReadFile() {
		try {
			buffer=new byte[fipStream.available()];
			while(fipStream.read(buffer)!=-1) {}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return buffer;
	}
	public void CloseStream() {
		try {
			fipStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int GetStateCode() {
		return stateCode;
	}
	public String GetFileType() {
		return fileType;
	}
}
