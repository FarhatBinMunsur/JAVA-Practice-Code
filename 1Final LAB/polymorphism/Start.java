import java.lang.*;
public class Start{
	public static void main(String [] args){
	Shape s[]=new Shape[5];
	
	Shape s1=new Circle(7.8);
	Shape s2=new Rectangle(3,5);
	Shape s3=new Triangle(5,4);
	
	s[0]=s1;
	s[1]=s2;
	s[4]=s3;
	
	for(Shape sh:s){
		if(sh!=null){
			System.out.println(sh.area());
		}
	}
}
	
}