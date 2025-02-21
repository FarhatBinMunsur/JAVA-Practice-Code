import java.lang.*;
public class Circle{
	private double radius=1.0;
	private String color="red";
	
	public Circle (){
		
	}
	public Circle(double r){
		this.radius=r;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public void setColor(String color){
		this.color=color;
	}
	public double getRadius(){
		return this.radius;
	}
	public String getColor(){
		return this.color;
	}
	
	public double getArea(){
		return (3.1416*(this.radius)*(this.radius));
	}
	
}