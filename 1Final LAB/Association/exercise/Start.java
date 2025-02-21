import java.lang.*;

public class Start{
	public static void main(String [] args){
		Car car1=new Car("c101","civic","Honda",5,4);
		
		Engine engine1 =new Engine("E120",1500,"Honda","c101");
		Engine engine2 =new Engine("E125",750,"cherry","c102");
		Engine engine3 =new Engine("E143",600,"toyota","c103");
		
		Engine eng[]=new Engine[3];
		eng[0]=engine1;
		eng[1]=engine2;
		eng[2]=engine3;
		
		for(Engine e: eng){
			if(e!=null && e.getCarID().equals(car1.getCarID())){
				e.showDeteails();
			}
		}
		
	}
}