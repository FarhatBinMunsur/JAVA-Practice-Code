import java.lang.*;
public class Maxinarray{
	public static void main(String[] args){
		int [] arr1=new int[]{34,56,17,49,28};
		int max=arr1[0];
		for(int i=1;i<arr1.length;i++){
			if(arr1[i]>max){
				max=arr1[i];
			}
		}
		System.out.println("Maximum="+max);
}
}