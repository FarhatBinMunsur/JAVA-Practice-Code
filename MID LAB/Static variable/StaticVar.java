import java.lang.*;
public class StaticVar{
	public String brand;
	public int price;
	public String type;
	
	static int count;
	StaticVar(String brand,int price,String type){
		this.brand=brand;
		this.price=price;
		this.type=type;	
	}
	public void showDetails(){
		count++;
		System.out.println(count);
		
		System.out.println(brand);
		System.out.println(price);
		System.out.println(type);
		
	}
}