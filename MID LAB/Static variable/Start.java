import java.lang.*;
public class Start{
	public static void main(String[] args){
		StaticVar m1=new StaticVar("xiaomi",29000,"Smartphone");
		StaticVar m2=new StaticVar("walton",29000,"button");
		StaticVar m3=new StaticVar("Samsung",125000,"Smartphone");
		m1.showDetails();
		m2.showDetails();
		m3.showDetails();
	}
}