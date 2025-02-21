import java.lang.*;
public class Part extends Employee{
	private double payperHour;
	public Part(){
		
	}
	public Part(int id,String name,double payperHour){
		super(id,name);
		this.payperHour=payperHour;
	}
	
	public void setPayperHour(double payperHour){
		this.payperHour=payperHour;
	}
	public double getPayperHour(){
		return this.payperHour;
	}
	
	public void showFullInfo(){
		super.showDetails();
		System.out.println(this.payperHour);
	}
	public void DailyIncome(int hour){
		System.out.println(payperHour*hour);

	}
}