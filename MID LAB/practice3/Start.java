import java.lang.*;
public class Start{
	public static void main(String[] args){
		Product p1;
		p1=new Product(null,null,0,2,"LED","orient","3-9-34");
		p1.setName("bulb");
		p1.setProductID("324");
		p1.setPrice(1343);
		
		p1.showDetails(
		double netPrice=p1.applyDiscount(23);
		System.out.println("netPrice: "+netPrice);
		
		
		Product p2=new Product("Fan","24513-2",3458,4,"celing fan","panasonic",null);
		System.out.println(p2.getName());
		System.out.println(p2.getProductID());
		System.out.println(p2.getPrice());
		System.out.println(p2.getStockQuantity());
		System.out.println(p2.getCatagory());
		System.out.println(p2.getSupplierName());
		System.out.println(p2.getExpirationDate());
		System.out.println(p2.applyDiscount(21));
		
		
	} 
}