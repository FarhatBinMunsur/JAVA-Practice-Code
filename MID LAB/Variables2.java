import java.lang.*;
public class Variables2{
	public static void main(String[] args){
		int a=10;
		long b=27l;
		long sum=a+b;
		long sub=a-b;
		long mul=a*b;
		double div=(double)b/a;
		
		System.out.println("Sum= "+sum);
		System.out.println("Sub= "+sub);
		System.out.println("Mul= "+mul);
		System.out.println("Div= "+div);
		
		byte b1=114;
		byte b2=14;
		
		float divResult=(float)b1/b2;
		System.out.println("ByteDivResult= "+divResult);
		
		double d1=7695.547;
		float f1=54.7785f;
		
		double dByF=d1/f1;
		System.out.println("Result: "+dByF);
	}
}