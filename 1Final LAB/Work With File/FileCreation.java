import java.lang.*;
import java.io.*;

public class FileCreation{
	File f=new File("myfile2.txt");
	
	public void existency(){
		if(f.exists()){
			System.out.println(f.getName()+ " exists");
		}
		
		else{
			System.out.println(f.getName()+ " doesn't exist");
		}
	}
	
	public void readable(){
		if(f.canRead()){
			System.out.println(f.getName()+" can read");
		}
		else{
			System.out.println(f.getName()+" can not read");
		}
	}
	public void writable(){
		if(f.canWrite()){
			System.out.println(f.getName()+" can Write");
		}
		else{
			System.out.println(f.getName()+" can not write");
		}
	}
	public void fileCreate(){
		try{
			if(f.createNewFile()){
				System.out.println(f.getName()+" created Successfully");
			}
			
			else{
				System.out.println(f.getName()+" isn't created Successfully");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void deleteFile(){
		try{
			if(f.delete()){
				System.out.println(f.getName()+" deleted.");
			}
			else{
				System.out.println(f.getName()+" isn't deleted.");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void AbsPath(){
		System.out.println("Absolute path: "+f.getAbsolutePath());
	}
	
	public void length(){
		System.out.println("Length: "+f.length());
	}
	
	
	public void listing(File f2){
		String[] list=f2.list();
		
		for(int i=0;i<list.length;i++){
			System.out.println(list[i]);
		}
	}
	
	public void makeDirectory(File f3){
		if(f3.mkdir()){
			System.out.println("Directory created.");
		}
		else {
			System.out.println("Directory is not created.");
		}
	}
	
	
	
}
