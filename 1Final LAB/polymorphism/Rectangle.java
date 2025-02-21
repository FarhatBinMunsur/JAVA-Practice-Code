import java.lang.*;
public class Rectangle extends Shape{
	private double height,width;
	
	public Rectangle(){
		
	}
	
	public Rectangle(double height,double width){
		this.height=height;
		this.width=width;
	}
	
	public double area(){
		return width*height;
	}

}