import java.lang.*;
public class Car{
	private String carID;
	private String model;
	private String brand;
	private int noOfSeats;
	private int noOfWheel;
	
	public Car(){}
	
	public Car(String carID,String model,String brand,int noOfSeats,int noOfWheel){
		this.carID=carID;
		this.model=model;
		this.brand=brand;
		this.noOfSeats=noOfSeats;
		this.noOfWheel=noOfWheel;
	}
	
	public String getCarID(){
		return this.carID;
	}
	
	public void showDetails(){
		System.out.println("Car ID: "+this.carID);
		System.out.println("Model: "+this.model);
		System.out.println("Brand: "+this.brand);
		System.out.println("Seats: "+this.noOfSeats);
		System.out.println("Wheels: "+this.noOfWheel);
	}
	
	
}