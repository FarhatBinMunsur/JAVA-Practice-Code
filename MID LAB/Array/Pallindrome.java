import java.lang.*;
import java.util.*;
public class Pallindrome{
	public static void main(String[] args){
		int [] arr1=new int[]{34,56,17,49,28};
		int[] arr2=Arrays.copyOf(arr1,arr1.length);
		int st=arr1[0];
		int end=arr1.length-1;
		for(int i=0;i<end;i++){
			int temp=arr1[i];
			arr1[i]=arr1[end];
			arr1[end]=temp;
			end--;
		}
		boolean check=true;
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=arr2[i]){
				check=false;
				break;
			}
			
		}
		System.out.print(check);
		
}
}