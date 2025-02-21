import java.lang.*;
public class Box{
	public int h;
	public int l;
	public int w;
	
	public Box(){
		
	}
	public Box(int h,int l,int w){
		this.h=h;
		this.l=l;
		this.w=w;
	}
	
	public void showDetails(){
		System.out.println("Height: "+this.h);
		System.out.println("Length: "+this.l);
		System.out.println("Weight: "+this.w);
	}
}