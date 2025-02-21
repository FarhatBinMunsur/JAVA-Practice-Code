import java.lang.*;

public class Company{
	String companyID;
	String name;
	String type;
	String location;
	
	public Company(){
		
	}
	public Company(String companyID,String name,String type,String location){
		this.companyID=companyID;
		this.name=name;
		this.type=type;
		this.location=location;
	}
	
	public String getCompanyID(){
		return this.companyID;
	}
	
	public void showDetails(){
		System.out.println("Company ID: "+this.companyID);
		System.out.println("Name: "+this.name);
		System.out.println("Type: "+this.type);
		System.out.println("Location: "+this.location);
		
	}
}
