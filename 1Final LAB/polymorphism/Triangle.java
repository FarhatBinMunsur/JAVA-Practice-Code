import java.lang.*;
public class Triangle extends Shape{
	private double base,height;
	
	public Triangle(){
		
	}
	
	public Triangle(double base,double height){
		this.base=base;
		this.height=height;
	}
	
	public double area(){
		return 0.5*this.base*this.height;
	}
}