import java.lang.*;
public class Student{
	private String name;
	private String studentID;
	private String major;
	private float cgpa;
	private short creditCompleted;
	private String email;
	
	//public Student(){
		
	//}
	public Student(String name,String studentID,String major,float cgpa,short creditCompleted,String email){
		this.name=name;
		this.studentID=studentID;
		this.major=major;
		this.cgpa=cgpa;
		this.creditCompleted=creditCompleted;
		this.email=email;
	}
	public void setName(String name){
		this.name=name;
	}	
	public void setStudentID(String studentID){
		this.studentID=studentID;
	}
	public void setMajor(String major){
		this.major=major;
	}	
	public void setCGPA(float cgpa){
		this.cgpa=cgpa;
	}	
	public void setcreditCompleted(short creditCompleted){
		this.creditCompleted=creditCompleted;
	}
	public void setEmail(String email){
		this.email=email;
	}
	
	public String getName(){
		return this.name;
	}
	public String getStudentID(){
		return this.studentID;
	}
	public String getMajor(){
		return this.major;
	}
	public float getCGPA(){
		return this.cgpa;
	}
	public short getcreditCompleted(){
		return this.creditCompleted;
	}
	public String getEmail(){
		return this.email;
	}
	
	public boolean isEligibleForDeanList(){
		if(this.cgpa>=3.70 && this.creditCompleted>=30)return true;
		else return false;
	}
	public void showDetails(){
			System.out.println("Name: "+this.name);
			System.out.println("ID: "+this.studentID);
			System.out.println("Major: "+this.major);
			System.out.println("CGPA: "+this.cgpa);
			System.out.println("Completed Credit: "+this.creditCompleted);
			System.out.println("Email: "+this.email);
		}
	
}