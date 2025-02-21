import java.lang.*;
public class Start{
	public static void main(String [] args){
		Company c1=new Company("c1","BS23","SWC","Badda");
		Company c2=new Company("c2","Ellipse","Mnational","kuril");
		
		Employee e1=new Employee("e1","Sabbir",20000,"manager","c1");
		Employee e2=new Employee("e2","Mohsin",20000,"manager","c2");
		Employee e3=new Employee("e3","Mahir",60000,"SWE","c1");
		Employee e4=new Employee("e4","Hamid",56000,"SWE","c1");
		Employee e5=new Employee("e5","taher",30000,"Accountant","c2");
		
		
		Employee emp[]=new Employee[]{e1,e2,e3,e4,e5};
		
		for(Employee e: emp){
			if(e!=null && e.getCompanyID().equals("c1")){
				e.showDetails();
			}
		}
	}
}