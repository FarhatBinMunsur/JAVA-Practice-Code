import java.lang.*;
public class MinInArray{
	public static void main(String[] args){
		int [] arr1=new int[]{34,56,17,49,28};
		int min=arr1[0];
		for(int i=1;i<arr1.length;i++){
			if(arr1[i]<min){
				min=arr1[i];
			}
		}
		System.out.println("Minimum="+min);
}
}