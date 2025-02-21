import java.lang.*;
public class StringPractice{
	public static void main(String[] args){
	//directly assign:string literal to a String reference
	String str1="Hello";		//Hello is the string literal
	
	//via new operator and constructor like any other classes
	String str2=new String("HelloMahir");
	
	System.out.println(str1.length());
	char ch=str2.charAt(5);
	System.out.println(ch);
	
	boolean bl=str2.equals(str1);
	System.out.println(bl);
	
	String str3=str2.substring(0,5);
	System.out.println(str3);
	System.out.println(str1.compareTo(str3));
	
	System.out.println(str3.indexOf('o'));
	
	String capital=str1.toUpperCase();
	System.out.println(capital);
	
	String str4=str1.concat("Bangladesh");
	
	System.out.println(str4);
}
}