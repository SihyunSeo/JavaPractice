package questWonji;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class Quest_Chap_12_wonji {

	public static void main(String[] args) throws Exception {
		Charset cs = Charset.defaultCharset();
		Path p = new File("C:\\Users\\Sihyun\\Desktop\\Duplicate.dup").toPath(); 
		
		if(Files.notExists(p))
			Files.createFile(p);
		
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sihyun\\Desktop\\Main.txt")); 
				PrintWriter pr = new PrintWriter(new FileWriter("C:\\Users\\Sihyun\\Desktop\\Duplicate.dup"));) {
			
			br.lines().forEach(x -> pr.println(x));
			
		} catch(IOException e) {
			
		}
		
		try {
			int LoginIdCount = 0;
			int EpicAccount = 0;
			int ErrorCount = 0;
			String s;
			File file = new File("C:\\Users\\Sihyun\\Desktop\\Main.txt");
			BufferedReader bReader = new BufferedReader(new FileReader(file));
			PrintWriter pWriter = new PrintWriter(new FileWriter("C:\\Users\\Sihyun\\Desktop\\LogID.loi"));
			
			while((s = bReader.readLine()) != null)
			{
				if(s.contains("LoginId"))
					LoginIdCount ++;
				
				if(s.contains("EpicAccountId"))
					EpicAccount ++;
				
				if(s.contains("UE4Editor"))
					ErrorCount ++;
			}
			
			pWriter.write("로그인 된 아이디 개수 : " + LoginIdCount + "\n");
			pWriter.write("에픽 어카운트 아이디 개수 : " + EpicAccount + "\n");
			pWriter.write("에러 개수 : " + ErrorCount);
			pWriter.flush();
			pWriter.close();
			
		} catch(IOException e) {
			
		}
		
	}

}
