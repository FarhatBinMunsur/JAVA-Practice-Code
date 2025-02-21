import java .lang.*;
public class Footballer
{
	private String playerName;
	private String jerseyNum;
	private int numofGoals;
	private short numofMatch;
	private long salary;
	
	public void showDetails(){
		System.out.println("Player Name: "+playerName);		  //null
		System.out.println("Player jerseyNum: "+this.jerseyNum);	 //null
		System.out.println("Player numofGoals: "+numofGoals);	// 0
		System.out.println("Player numofMatch: "+this.numofMatch); //0
		System.out.println("Player Salary: "+this.salary);		  //0
		
	}
}