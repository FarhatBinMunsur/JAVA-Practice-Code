import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Footballer f=new Footballer();
		f.showDetails();
		System.out.println("Average:"+f.goalPerMatch());
		
		Footballer g=new Footballer();
		g.setPlayerName("Cristiano Ronaldo Jr.");
		g.showDetails();
		System.out.println("Average:"+g.goalPerMatch());
		
		Footballer h=new Footballer("Lionel Messi",10,1100l,(short)845,999999999.00f);
		h.showDetails();
		System.out.println("Average:"+h.goalPerMatch());
		
		System.out.println("Total Object Count: "+Footballer.getCount());
		
		
	}
}