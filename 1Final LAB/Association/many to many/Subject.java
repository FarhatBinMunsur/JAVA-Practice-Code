import java.lang.*;
public class Subject{
	private String subjectID;
	private String subjectName;
	private String classId;
	
	public Subject(){
		
	}
	public Subject(String subjectID,String subjectName,String classId){
		this.subjectID=subjectID;
		this.subjectName=subjectName;
		this.classId=classId;
	}
	
	public String getClassID(){
		return this.classId;
	}
	
	public void showDetails(){
		System.out.println("Subject ID: "+this.subjectID);
		System.out.println("Subject Name: "+this.subjectName);
		System.out.println("classId ID: "+this.classId);
	}
}