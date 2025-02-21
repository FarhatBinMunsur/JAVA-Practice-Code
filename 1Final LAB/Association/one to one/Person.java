import java.lang.*;
public class Person{
	private String personId;
	private String name;
	
	public Person(){}
	
	public Person(String personId,String name){
			this.personId=personId;
			this.name=name;
	}
	public String getID(){
		return this.personId;
	}
	
	public void showDetails(){
		System.out.println("Name: "+this.name);
		System.out.println("ID:"+this.personId);
	}
}