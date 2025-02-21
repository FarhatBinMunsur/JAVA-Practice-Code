import java.lang.*;
import java.util.*;
public class Frequency{
	public static void main(String[] args){
		int [] arr1=new int[]{1,2,3,4,3,5,6,2,8,6,4,2,9,10,5,9};
		int[] arr2=new int [arr1.length];
		for(int i:arr1){
				arr2[i]++;
		}
		for(int i=0;i<10;i++){
			System.out.println(i+" : "+arr2[i]);
		}
	}
		
}