import java.lang.*;
public class Start{
	public static void main(String[] args){
		short a=64;
		short b=63;
		byte sum=(byte)(a+b);
		System.out.println(sum);
		
		double d1=58.5940935;
		double d2=93.493752;
		float sum2=(float)(d1+d2);
		System.out.println(sum2);
		
		double d3=14.4953;
		double d4=49.6552;
		int sum3=(int)(d3+d4);
		System.out.println(sum3);
		
		long l1=1073741824l;
		long l2=1073741823l;
		int sum4=(int)(l1+l2);
		System.out.println(sum4);
		
		long l3=4549582;
		long l4=2482948;
		float sum5=l3+l4;
		System.out.println(sum5);
		
		char ch='M';
		System.out.println((short)ch);
		
		short num=122;
		System.out.println((char)num);
		
	}
}