import java.lang.*;
import java.io.*;
public class FileReading{
	public void readFile(){
	try{
	File f=new File("myfile2.txt");
	FileReader fd=new FileReader(f);
	BufferedReader bfd=new BufferedReader(fd);
	
	String data="",temp="";
	
	while((temp=bfd.readLine())!=null){
		data=data+"\n"+temp;
	}
	bfd.close();
	System.out.println(data);
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}