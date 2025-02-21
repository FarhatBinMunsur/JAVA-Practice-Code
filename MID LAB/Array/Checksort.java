import java.lang.*;
import java.util.*;
public class Checksort{
	public static void main(String[] args){
		int [] arr1=new int[]{1,3,4,3,5,6,2,8,6,4,2,9,10,5,9};
		
		for(int i=1;i<arr1.length;i++){
			int min=arr1[i-1];
			if(arr1[i]<min){
				System.out.print("Not sorted");
				break;
			}
		}		
}
}