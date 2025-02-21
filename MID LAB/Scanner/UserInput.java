import java.lang.*;
import java.util.Scanner;
public class UserInput{
public static void main(String[] args){
	Scanner inp=new Scanner(System.in);
	
	//int input
	System.out.print("Enter a int number:");
	int intVal=inp.nextInt();
	System.out.println("intResult:"+intVal);
	
	//Byte input
	System.out.print("Enter a byte number:");
	byte btVal=inp.nextByte();
	System.out.println("ByteResult:"+btVal);
	
	//Long input
	System.out.print("Enter a Long number:");
	long longVal=inp.nextLong();
	System.out.println("LongResult:"+longVal);
	
	//Short input
	System.out.print("Enter a Short number:");
	short ShortVal=inp.nextShort();
	System.out.println("ShortResult:"+ShortVal);
	
	//float input
	System.out.print("Enter a Float number:");
	float floatVal=inp.nextFloat();
	System.out.println("FloatResult:"+floatVal);
	
	//Double input
	System.out.print("Enter a double number:");
	double dblVal=inp.nextDouble();
	System.out.println("DoubleResult:"+dblVal);
	
	//Boolean input
	System.out.print("Enter a Boolean:");
	boolean boolVal=inp.nextBoolean();
	System.out.println("BooleanResult:"+boolVal);
	
	//Word input
	System.out.print("Enter a Word:");
	String word=inp.next();
	System.out.println("Word:"+word);
	
	//Clearing Buffer ::Word input dite giye sentence input diye felle baki parttuku grab kre nibe nextLine()
	inp.nextLine();
	
	//char input
	System.out.print("Enter a Character:");
	char charVal=inp.next().charAt(0);
	System.out.println("Character:"+charVal);
	
	inp.nextLine();  //Ager char input dewar por enter dile jate nextLine() seta niye nite pare
	//sentance input
	System.out.print("Please Input a sentance: ");
	String sentance=inp.nextLine();
	System.out.println(sentance);
	
	
	
	
	
}
}