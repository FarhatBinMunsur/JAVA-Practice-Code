import java.lang.*;
public class Stringbuilder{
	public static void main(String[] args){
		
		StringBuilder bfr1=new StringBuilder("Hello");
		int size =bfr1.length();
		int cpct=bfr1.capacity();
		System.out.println(size);
		System.out.println(cpct);
		
		StringBuilder sbfr1=bfr1.append(" Bangladesh ");
		System.out.println(sbfr1);
		StringBuilder sbfr2=bfr1.append(2);
		System.out.println(sbfr2);
		
		StringBuilder sbfr3=sbfr2.insert(5," everyone in");
		System.out.println(sbfr3);
		
		StringBuilder sbfr4=bfr1.reverse();
		System.out.println(sbfr4);
		System.out.println(bfr1);		//bfr 1 will also be reversed
		
		//thik kre dilam
		bfr1.reverse();
		System.out.println(bfr1);	
		
		StringBuilder sbfr5=sbfr3.delete(6,17);
		System.out.println(sbfr5);

		StringBuilder sbfr6=sbfr2.deleteCharAt(18);
		System.out.println(sbfr6);
		
		int lastIndexOfSbrf2=sbfr2.length()-1;
		System.out.println(lastIndexOfSbrf2);
		StringBuilder sbfr7=sbfr2.replace(6,17,"Mahir");
		System.out.println(sbfr7);
}
}