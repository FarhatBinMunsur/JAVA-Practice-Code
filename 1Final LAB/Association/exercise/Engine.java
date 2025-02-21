import java.lang.*;
public class Engine{
	private String engineID;
	private int horsePower;
	private String manfCompany;
	private String carID;
	public Engine(){
		
	}
	
	public Engine (String engineID,int horsePower,String manfCompany,String carID){
		this.engineID=engineID;
		this.horsePower=horsePower;
		this.manfCompany=manfCompany;
		this.carID=carID;
	}
	
	public String getEngineID(){
		return this.engineID;
	}
	
	public String getCarID(){
		return this.carID;
	}
	
	public void showDeteails(){
		System.out.println("Car ID: "+this.carID);
		System.out.println("Engine ID: "+this.engineID);
		System.out.println("Power: "+this.horsePower);
		System.out.println("Manufacturer: "+this.manfCompany);
		
	}
	
}
