import java.lang.*;
public class Start{
	public static void main(String [] args){
		ScientificCalculator sc1=new ScientificCalculator(23.0,4.0);
		System.out.println(sc1.toThePow());
		
		//ami basicCalculator er functionalities o use krte parobo
		System.out.println(sc1.add());
		System.out.println(sc1.subtract());
		System.out.println(sc1.multiply());
		System.out.println(sc1.divide());
	}
}