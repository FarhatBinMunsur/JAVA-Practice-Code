import java.lang.*;
public class Start{
	public static void main(String[] args){
		Student s2=new Student();
		s2.setName("Farhan");
		s2.setStudentID("23-34567-2");
		s2.setCGPA(3.76f);
		s2.setMajor("SWE");
		s2.setcreditCompleted((short)34);
		s2.setEmail("farhan21@gmail.com");
		s2.showDetails();
		
		if(s2.isEligibleForDeanList()){
			System.out.println(s2.getEmail());
		}
		System.out.println(s2.getName());
		System.out.println(s2.getStudentID());
		System.out.println(s2.getMajor());
		System.out.println(s2.getCGPA());
		System.out.println(s2.getcreditCompleted());
		
		Student s1=new Student("Farhat","24-56328-1",null,4.00f,(short)24,"xyz@gmail.com");
		s1.showDetails();
		System.out.println(s1.isEligibleForDeanList());
		
		//System.out.println(s2.getName());
	}
}