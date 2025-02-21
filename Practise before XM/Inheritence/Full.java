import java.lang.*;
public class Full extends Employee{
	private double salary;
	public Full(){
		
	}
	public Full(int id,String name,double salary){
		super(id,name);
		this.salary=salary;
	}
	public void showFullInfo(){
		super.showDetails();
		System.out.println(this.salary);
	}
	public void yearlySalary(){
		System.out.println(this.salary*12);

	}
}