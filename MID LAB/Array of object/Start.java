import java.lang.*;
public class Start{
	public static void main(String[] args){
		Footballer fb1=new Footballer();
		//fb1.showDetails();
		
		Footballer fb2=new Footballer("Messi",10,1300l,(short)560,99999999.99f);
		//fb2.showDetails();
		Footballer fb3=new Footballer("Mbappe",7,6000l,(short)765,94933534.95f);
		//fb3.showDetails
		
		Footballer arr[]=new Footballer[3];
		
	arr[0]=fb1;
	arr[2]=fb2;
	
	for(int i=0;i<3;i++){
		if(arr[i]!=null){
			arr[i].showDetails();
		}
	}
	arr[1]=fb3;
	System.out.println(arr[1].getNumberOfMatches());
	arr[1].setNumberOfMatches(1873);
	System.out.println(arr[1].getNumberOfMatches());
	}
}