import java.lang.*;
import java.util.*;
public class Input{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter an integer:");
		int x1=sc.nextInt();
		System.out.println(x1);
		
		System.out.print("Enter an double:");
		double x2=sc.nextDouble();
		System.out.println(x2);
		
		System.out.print("Enter an bool:");
		boolean x3=sc.nextBoolean();
		System.out.println(x3);
		
		System.out.print("Enter an Word:");
		String word=sc.next();
		
		sc.nextLine();
		
		System.out.print("Enter your name:");
		String name=sc.nextLine();
		System.out.println(word);
		
		System.out.println(name);
		
		char ch=sc.next().charAt(0);
		System.out.println(ch);
		
		
	}
}