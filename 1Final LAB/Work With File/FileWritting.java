import java.lang.*;
import java.io.*;
public class FileWritting{
	public void writeFile(){
	try{
		
	File f=new File("myfile2.txt");
	FileWriter fw=new FileWriter(f,false);
	fw.write("Hello I'm Writting the file");
	fw.flush();
	fw.close();
	}
	catch(Exception e){
		
		e.printStackTrace();
	}
}
}