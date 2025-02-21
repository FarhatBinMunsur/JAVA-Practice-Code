import java.lang.*;
public class Account{
	private int accNo;
	private String accountHolderName;
	private double balance;
	
	public void setAccNo(int accNo){
		this.accNo=accNo;
	}
	public void setHolder(String accountHolderName){
		this.accountHolderName=accountHolderName;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	public int getAccNo(){
		return this.accNo;
	}
	public String getAccHolder(){
		return this.accountHolderName;
	}
	public double getBalance(){
		return this.balance;
	}
	
	public void showDetails(){
		System.out.println("Acc Name: "+this.accountHolderName);
		System.out.println("Acc NO: "+this.accNo);
		System.out.println("Balance: "+this.balance);
	}
	public static void main(String[] args){
		Account acc1=new Account();
		acc1.setAccNo(1039489393);
		acc1.setHolder("Mahir");
		acc1.setBalance(3384.22);
		acc1.showDetails();
		
}
}