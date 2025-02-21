import java.lang.*;
import java.io.*;
public class Start{
	public static void main(String [] args){
		FileCreation cf=new FileCreation();
		cf.existency();
		cf.fileCreate();
		cf.readable();
		cf.writable();
		cf.existency();
		//cf.deleteFile();
		cf.existency();
		cf.AbsPath();
		cf.length();
		
		File f2=new File("D:\\AIUB\\AIUB 3rd(Fall24) Semester\\OOP(JAVA)\\1Final LAB\\Work With File");
		cf.listing(f2);
		
		File f3=new File("D:\\AIUB\\AIUB 3rd(Fall24) Semester\\OOP(JAVA)\\1Final LAB\\Work With File\\newDirectory");
		cf.makeDirectory(f3);
		
		FileWritting fw=new FileWritting();
		fw.writeFile();
		
		FileReading fr=new FileReading();
		fr.readFile();
		
	}
}