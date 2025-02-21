import java.lang.*;
public class Circle extends Shape{
	private double radius;
	
	public Circle(){
		
	}
	public Circle(double radius){
		this.radius=radius;
	}
	
	public double area(){
		return 3.1416*this.radius*this.radius;
	}
}