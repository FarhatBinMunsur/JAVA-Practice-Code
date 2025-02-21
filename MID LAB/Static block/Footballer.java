import java.lang.*;

public class Footballer
{
	private String playerName;
	private int jerseyNo;
	private long numberOfMatches;
	private short numberOfGoals;
	private float salary;
	
	static{
		System.out.println("welcome to the club !");
	}
	static{
		System.out.println("Our club name is secQ");
	}
	
	//**
	private static int count;
	
	public Footballer()
	{
		this.playerName="Cristiano Ronaldo";
		this.jerseyNo=7;
		this.numberOfMatches=1200l;
		this.numberOfGoals=908;
		this.salary=999999999.00f;
		count++;
	}
	
	public Footballer(String playerName, int jerseyNo, long numberOfMatches, short numberOfGoals, float salary)
	{
		this.playerName=playerName;
		this.jerseyNo=jerseyNo;
		this.numberOfMatches=numberOfMatches;
		this.numberOfGoals=numberOfGoals;
		this.salary=salary;
		count++;
	}
	
	
	public void setPlayerName(String playerName)
	{
		this.playerName=playerName;
	}
	
	public void setJerseyNo(int jerseyNo)
	{
		this.jerseyNo=jerseyNo;
	}
	
	public void setNumberOfMatches(long numberOfMatches)
	{
		this.numberOfMatches=numberOfMatches;
	}
	
	public void setNumberOfGoals(short numberOfGoals)
	{
		this.numberOfGoals=numberOfGoals;
	}
	
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	
	public String getPlayerName()
	{
		return this.playerName;
	}
	
	public int getJerseyNo()
	{
		return this.jerseyNo;
	}
	
	public long getNumberOfMatches()
	{
		return this.numberOfMatches;
	}
	
	public short getNumberOfGoals()
	{
		return this.numberOfGoals;
	}
	
	public float getSalary()
	{
		return this.salary;
	}
	
	public float goalPerMatch()
	{
		float goals=this.numberOfGoals;
		float matches=this.numberOfMatches;
		return goals/matches;
	}
	
	public static int getCount()
	{
		return count;
	}
	
	public void showDetails()
	{
		System.out.println("Object No:"+count);
		System.out.println("Player Name: "+this.playerName);
		System.out.println("Jersey No: "+this.jerseyNo);
		System.out.println("Number of Matches: "+this.numberOfMatches);
		System.out.println("Number of Goals: "+this.numberOfGoals);
		System.out.println("Salary: "+this.salary);
	}
	
}