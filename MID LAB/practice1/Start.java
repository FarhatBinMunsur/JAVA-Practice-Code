import java.lang.*;

public class Start{
	public static void main(String[] args){
		Book b1=new Book(null,"Abc",456,500,14); //author name will modify later
		b1.setAuthor("XYZ");
		System.out.println(b1.isLongBook());
		b1.showDetails();
		System.out.println("----------------");
		
		Book b2=new Book();
		System.out.println(b2.getAuthor());	//null
		b2.setTitle("Head First Java");
		b2.setAuthor("Kathy Sierra");
		b2.setNumofPages(324);
		b2.setPrice(1586.45f);
		b2.setStockQuantity(6);
		System.out.println(b2.getStockQuantity());
		System.out.println(b2.getPrice());
		System.out.println(b2.getTotalValueofStock());
	}
}