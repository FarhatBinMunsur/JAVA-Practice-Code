import java.lang.*;
public class ElementSum{
	public static void main(String[] args){
		int [] arr1=new int[]{34,56,17,49,28};
		int sum=0;
		for(int i=0;i<arr1.length;i++){
			sum=sum+arr1[i];
		}
		System.out.println("Result="+sum);
}
}