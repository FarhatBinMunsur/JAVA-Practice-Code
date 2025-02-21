package mypackage.Mypackage2.mypackage3;
import java.lang.*;
public class Myclass{
	private String name;
	private int id;
	
	public Myclass(){
		
	}
	
	public Myclass(String name,int id){
		this.name=name;
		this.id=id;
		
	}
	
	public void showDetails(){
		System.out.println(this.name);
		System.out.println(this.id);
	}
}