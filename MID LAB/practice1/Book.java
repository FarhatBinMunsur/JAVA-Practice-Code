import java.lang.*;
public class Book{
		private String title;
		private String author;
		private int numofPages;
		private float price;
		private int stockQuantity;
		public Book(){
			
		}
		
		public Book(String title,String author,int numofPages,float price,int stockQuantity){
			this.title=title;
			this.author=author;
			this.numofPages=numofPages;
			this.price=price;
			this.stockQuantity=stockQuantity;
		}
		
		public void showDetails(){
			System.out.println("Title: "+this.title);
			System.out.println("Author: "+this.author);
			System.out.println("Num of Pages: "+this.numofPages);
			System.out.println("Price: "+this.price);
			System.out.println("Quantity: "+this.stockQuantity);
		}
		public void setAuthor(String author){
			this.author=author;
		}
		public void setTitle(String title){
			this.title=title;
		}
		public void setNumofPages(int numofPages){
			this.numofPages=numofPages;
		}
		public void setPrice(float price){
			this.price=price;
		}
		
		public void setStockQuantity(int stockQuantity){
			this.stockQuantity=stockQuantity;
		}
		
		public String getAuthor(){
			return this.author;
		}
		public String getTitle(){
			return this.title;
		}
		public int getNumofPages(){
			return this.numofPages;
		}
		public float getPrice(){
			return this.price;
		}
		public int getStockQuantity(){
			return this.stockQuantity;
		}
		
		public float getTotalValueofStock(){
			return this.stockQuantity*this.price;
		}
		public boolean isLongBook(){
			if(this.numofPages>=300){
				return true;
			}
			else return false;
		}
}