import java.lang.*;
public class Start{
	public static void main(String[] args){
	Box boxes[]=new Box[3];
	Box b1=new Box(1,2,3); 
	boxes[0]=b1;
	
	
	boxes[1]=new Box(1,3,5);
	
	//boxes[2]=new Box();
	
	for(int i=0;i<boxes.length;i++){
		if(boxes[i]!=null){
	boxes[i].showDetails();
	}
	}
}
}