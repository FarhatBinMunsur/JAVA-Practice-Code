import java.lang.*;
public class Start{
	public static void main(String[] args){
		StoryBook sb1=new StoryBook("474936429","Confessions","Abdullah",200,34,"Thriller");
		StoryBook sb2=new StoryBook();
		sb2.setIsbn("386382945");
		sb2.setBookTitle("XYZ");
		sb2.setAuthorName("fahmid");
		sb2.setPrice(2354.32);
		sb2.setAvaiableQuantity(23);
		sb2.setCatagory("Horror");
		sb1.showDetails();
		sb2.showDetails();
		
	}
}