import java.lang.*;
public class CountEvenOdd{
	public static void main(String[] args){
		int [] arr1=new int[]{34,56,17,49,28};
		int countEven=0;
		int countOdd=0;		
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]%2==0) countEven++;
			else countOdd++;
			
		}
		
			System.out.print(countEven+" "+countOdd);
		
}
}