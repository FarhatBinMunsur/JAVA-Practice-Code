import java.lang.*;
import java.util.*;
public class Merge{
	public static void main(String[] args){
		int [] arr1=new int[]{34,56,17,49,28};
		int[] arr2=new int []{23,45,64,76};
		int size =arr1.length+arr2.length;
		int arr3[]=new int[size];
		for(int i=0;i<arr1.length;i++){
			arr3[i]=arr1[i];
		}
		for(int i=arr1.length,j=0;i<size && j<arr2.length;i++,j++){
			arr3[i]=arr2[j];
		}
		for(int i=0;i<size;i++){
			System.out.print(arr3[i]+" ");
		}
	}
}