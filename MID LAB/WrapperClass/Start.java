import java.lang.*;
public class Start{
	public static void main(String[] args){
		
		String str1="True";
		boolean value1=Boolean.parseBoolean(str1);
		System.out.println(value1);
		
		String str2="34053.4503";
		String str3="23429.5215";
		float value2=Float.parseFloat(str2);
		float value3=Float.parseFloat(str3);
		System.out.println(value2+value3);
		
		String str4="127";
		byte value4=Byte.parseByte(str4);
		System.out.println(value4);
		
		String str5="32534";
		short value5=Short.parseShort(str5);
		System.out.println(value5);
		
		String str6="World";
		char ch=str6.charAt(4);
		System.out.println(ch);
		
		String str7="20794383";
		long value7=Long.parseLong(str7);
		System.out.println(value7);
	}
}