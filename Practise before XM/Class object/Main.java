import java.lang.*;
public class Main{
	public static void main(String [] args){
		ClassB cb=new ClassB();
		cb =new ClassB();
		ClassA ca=new ClassA();
	}
	static {
		System.out.println("loading class MAin");

	}
}