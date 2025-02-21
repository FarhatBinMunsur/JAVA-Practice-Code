import java.lang.*;
public class Start{
	public static void main(String [] args){
		Bank b1=new Bank("Mahir",434433,2033.3f);
		System.out.println(b1.ownersName);
		
		//b2.ownersName="jalil";
		Bank b2=b1;
		System.out.println(b2.ownersName);

		//b2=b1;
		System.out.println(b2.ownersName);

	}
}