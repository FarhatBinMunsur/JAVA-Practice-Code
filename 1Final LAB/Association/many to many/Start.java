import java.lang.*;
public class Start{
	public static void main(String[] args){
		Class c1=new Class ("9A","9A");
		Class c2=new Class ("6C","6C");
		Class c3=new Class ("7A","7A");
		
		Subject s1=new Subject("101","Bangla","9A");
		Subject s2=new Subject("102","English","7A");
		Subject s3=new Subject("154","ICT","10A");
		Subject s4=new Subject("178","History","9A");
		Subject s5=new Subject("132","physics","9A");
		
		Subject SArr[] =new Subject[5];
		
		SArr[0]=s1;
		SArr[1]=s2;
		SArr[2]=s3;
		SArr[3]=s4;
		SArr[4]=s5;
		for(Subject s: SArr){
			if(s!=null && s.getClassID().equals("9A") ){
				s.showDetails();
			}
		}
	}
}