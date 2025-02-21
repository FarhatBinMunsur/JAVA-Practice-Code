import java.lang.*;
public class Rmvduplicates{
	public static void main(String[] args){
		int [] arr1=new int[]{34,28,56,17,49,28};
		int size=arr1.length;
		int dltcnt=0;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(arr1[i]==arr1[j]){
					for(int k=j;k<size-1;k++){
					arr1[k]=arr1[k+1];
					}
				dltcnt++;
				j--;
				}
			}
		}
		for(int i=0;i<size-dltcnt;i++){
			System.out.print(arr1[i]+" ");
		}
}
}