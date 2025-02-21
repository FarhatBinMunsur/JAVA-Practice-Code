import java.lang.*;
import java.util.*;
public class StringPrct{

	public static void main(String[] args){
	String s1="Mahir";
	String s2="Mahir Orieted";
	String s3="HelloBangladesh";
		System.out.println(s1.equals(s2));
		System.out.println((int)s1.charAt(0)); //M=77
		System.out.println((int)s2.charAt(0));	//m=109
		System.out.println(s1.compareTo(s2));	// M-m = -32
		System.out.println(s3.substring(3,11));	
		System.out.println(s2.toUpperCase());
		System.out.println(s2.concat(" VAI"));
		System.out.println(s1==s2);	//compare the refference
		s2="MahirA";
		System.out.println(s1+s2);
		
		Scanner sc=new Scanner (System.in);
		String s=sc.nextLine();
		
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.reverse());
	
	}
	
}