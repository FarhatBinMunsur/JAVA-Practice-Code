import java.lang.*;
public class Variables1{
	public static void main(String [] args){
		
		/*byte byteVariable=-129;
		is not possible.cause byte datatype limit is -128 */
		
		byte byteVariable=-128;			 
		System.out.println("ByteResult: "+byteVariable);
		
		short shortVariable=9867;
		System.out.println("ShortValue:"+shortVariable);
		
		/*use l in last..otherwise compiler will consider it as a integer
		 it can't be able to take the last value 2^31 -1*/
		long longVariable =9223372036854775807l;
		System.out.println("Longvariable:"+longVariable);
		
		int intVariable=10;
		System.out.println("Integer: "+intVariable);
		
		float floatVariable=10.5488594f;
		System.out.println("Float: "+floatVariable);
		
		double doubleVariable=19.485873;
		System.out.println("DoubleValue:"+doubleVariable);
		
		char charVariable='m';
		System.out.println("Character:"+charVariable);
		
		boolean boolVariable=false;
		System.out.println("BoolResult: "+boolVariable);
	}
}