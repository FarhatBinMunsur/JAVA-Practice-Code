import java.lang.*;
public class Secondlargest{
	public static void main(String[] args){
		int [] arr1=new int[]{34,56,17,49,28};
		int max=Integer.MIN_VALUE;
		int large2=Integer.MIN_VALUE;
		
		for(int i:arr1){
			if(i>max){
				large2=max;
				max=i;
			}
			else if (i>large2){
				large2=i;
			}
		}
		System.out.println("Maximum="+max);
		System.out.println("2nd Large="+large2);
}
}