import java.lang.*;
public class Employee{
	private int id;
	private String name;
	
	public Employee(){
		System.out.println("mahir");
	}
	public Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void setEmployeeID(int id){
		this.id=id;
	}
	public void setEmployeeName(String name){
		this.name=name;
	}
	public int getEmployeeID(){
		return this.id;
	}
	public String getEmployeeName(){
		return this.name;
	}
	public void showDetails(){
		System.out.println(this.name+" "+this.id);
		
	}
	
}