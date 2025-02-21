import java.lang.*;
public class Employee{
	private String employeeID;
	private String employeeName;
	private int salary;
	private String designation;
	private String companyID;
	
	public Employee(){}
	
	public Employee(String employeeID,String employeeName,int salary,String designation,String companyID){
		this.employeeID=employeeID;
		this.employeeName=employeeName;
		this.salary=salary;
		this.designation=designation;
		this.companyID=companyID;
	}
	
	public String getCompanyID(){
	return this.companyID;
	}
	
	public void showDetails(){
		System.out.println("Employee ID: "+this.employeeID);
		System.out.println("CompanyID: "+this.companyID);
		System.out.println("Name: "+this.employeeName);
		System.out.println("Salary: "+this.salary);
		System.out.println("Desg: "+this.designation);
	}
	
}