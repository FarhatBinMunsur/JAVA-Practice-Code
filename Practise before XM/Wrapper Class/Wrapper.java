import java.lang.*;
public class Wrapper{
	public static void main(String [] args){
		String s2="1393.42399993932393";
		float val=Float.parseFloat(s2);
		System.out.println(val);
		
		String s3="Mahir";
		char ch=s3.charAt(3);
		System.out.println(ch);
		System.out.println((short)ch); //typecasting
		
		String s4="true";
		System.out.println(Boolean.parseBoolean(s4));
	}
}