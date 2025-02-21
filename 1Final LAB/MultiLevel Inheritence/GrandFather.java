import java.lang.*;
public class GrandFather{
	private String familyName;
	private int numofAllies;
	
	public GrandFather(){
		
	}
	public GrandFather(String familyName,int numofAllies){
		this.familyName=familyName;
		this.numofAllies=numofAllies;
	}
	
	public void setName(Stru=ing familyName){
		this.familyName=familyName;
	}
	public void setAllies(int numofAllies){
		this.numofAllies=numofAllies;
	}
	public String getName(){
		return this.familyName;
	}
	public int getAllies(){
		return this.numofAllies;
	}
	
	public void showDetails(){
		System.out.println("Family: "+this.familyName);
		System.out.println("Allies: "+this.numofAllies);
	}
}
