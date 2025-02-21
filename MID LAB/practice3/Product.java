import java.lang.*;
public class Product{
	private String name;
	private String productID;
	private float price;
	private int stockQuantity;
	private String catagory;
	private String supplierName;
	private String expirationDate;
	
	public Product(){
		
	}
	public Product(String name,String productID,float price,int stockQuantity,
	String catagory,String supplierName,String expirationDate){
		this.name=name;
		this.productID=productID;
		this.price=price;
		this.stockQuantity=stockQuantity;
		this.catagory=catagory;
		this.supplierName=supplierName;
		this.expirationDate=expirationDate;
	}
	public void showDetails(){
		System.out.println("Name: "+name);
		System.out.println("productID: "+productID);
		System.out.println("price: "+price);
		System.out.println("stockQuantity: "+stockQuantity);
		System.out.println("catagory: "+catagory);
		System.out.println("supplierName: "+supplierName);
		System.out.println("expirationDate: "+expirationDate);
	}
	
	public void setName(String name){
		this.name=name;
	}
	public void setProductID(String productID){
		this.productID=productID;
	}
	public void setPrice(float price){
		this.price=price;
	}
	public void setStockQuantity(int stockQuantity){
		this.stockQuantity=stockQuantity;
	}
	public void setCatagory(String catagory){
		this.catagory=catagory;
	}
	public void setSupplierName(String supplierName){
		this.supplierName=supplierName;
	}
	public void setExpirationDate(String expirationDate){
		this.expirationDate=expirationDate;
	}
	
	public String getName(){
		return this.name;
	}
	public String getProductID(){
		return this.productID;
	}
	public float getPrice(){
		return this.price;
	}
	public int getStockQuantity(){
		return this.stockQuantity;
	}
	public String getCatagory(){
		return this.catagory;
	}
	public String getSupplierName(){
		return this.supplierName;
	}
	public String getExpirationDate(){
		return this.expirationDate;
	}
	
	public double applyDiscount(double discountPercentage){
		return price-(price*discountPercentage/100);
	}
}