import java.lang.*;
public class StoryBook extends Book{
	private String catagory;
	
	public StoryBook(){
		
	}
	
	public StoryBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity, 
	String category){
		super(isbn,bookTitle,authorName,price,availableQuantity);
		this.catagory=catagory;
	}
	
	public void setCatagory(String category){
		this.catagory=catagory;
	}
	public String getCategory( ){
		return this.catagory;
	}
	public void showDetails(){
		super.showDetails();
		System.out.println("Catagory: "+this.catagory);
	}	
}	
