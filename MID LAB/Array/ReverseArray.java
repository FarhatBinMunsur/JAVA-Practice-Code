import java.lang.*;
public class ReverseArray{
	public static void main(String[] args){
		int [] arr1=new int[]{34,56,17,49,28};
		int st=arr1[0];
		int end=arr1.length-1;
		for(int i=0;i<end;i++){
			int temp=arr1[i];
			arr1[i]=arr1[end];
			arr1[end]=temp;
			end--;
		}
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		
}
}