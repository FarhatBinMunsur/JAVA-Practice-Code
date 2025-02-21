import java.lang.*;
public class DataType{
		boolean bool1;
		byte byte1;
		short short1;
		long long1;
		int intval;
		float float1;
		double double1;
		char char1;
		String name;
		double d1=230.403;
		double d2=2410.442453;
	public static void main(String[] args){
		
		DataType dt=new DataType();
		float result=(float)(dt.d1+dt.d2);
		System.out.println(result);
		System.out.println("Bool="+dt.bool1);
		System.out.println("ShortVal="+dt.short1);
		System.out.println("ByteVal="+dt.byte1);
		System.out.println("LongVal="+dt.long1);
		System.out.println("IntVal="+dt.intval);
		System.out.println("FloatVal="+dt.float1);
		System.out.println("Character="+dt.char1);
		System.out.println("DoubleVal="+dt.double1);
		System.out.println("Stringval="+dt.name);
		
		//typeCasting
		char ch='e';
		byte b=(byte)ch;
		System.out.println(b);
		
		short s2=102;
		char ch2=char(s2);
		System.out.println(s2);

		
}
	
}
