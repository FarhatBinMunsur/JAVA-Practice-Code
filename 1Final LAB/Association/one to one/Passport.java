import java.lang.*;
public class Passport{
	private String PassportId;
	private String holderName;
	private String personId;
	
	public Passport(){
		
	}
	
	public Passport(String PassportId,String holderName,String personId){
			this.PassportId=PassportId;
			this.holderName=holderName;
			this.personId=personId;
	}
	public String getID(){
		return this.personId;
	}
	
	public void showDetails(){
		System.out.println("Name: "+this.holderName);
		System.out.println("passportID:"+this.PassportId);
		System.out.println("PersonID: "+this.personId);
	}
}