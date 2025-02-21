import java.lang.*;
import java.util.*;
public class Target{
	public static void main(String[] args){
		int [] arr1=new int[]{34,56,17,49,28};
		int target;
		Scanner inp=new Scanner(System.in);
		target=inp.nextInt();
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]==target){
			System.out.println("Found at "+i+" index");
			}	
		}
		
}
}