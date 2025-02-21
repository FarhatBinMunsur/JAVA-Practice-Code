import java.lang.*;

public class Start{
	public static void main(String[] args){
		Person p1=new Person("001","Mahir");
		Person p2=new Person("002","karim");
		Person p3=new Person("003","rochona");
		
		Passport pa1=new Passport("p-1","Mahir","001");
		
		System.out.println("Passport Details: ");
		pa1.showDetails();
		
		Person pArr[]=new Person[3];
		pArr[0]=p1;
		pArr[1]=p2;
		pArr[2]=p3;
		
		for(Person p: pArr){
			if(p!=null && pa1.getID().equals("001")){
				//p.showDetails();
			}
		}
	}
}