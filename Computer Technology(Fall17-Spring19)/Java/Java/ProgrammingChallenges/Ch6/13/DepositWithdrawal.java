public class DepositWithdrawal{
	private double balance;
	private double annualInterest;
	
	public DepositWithdrawal(double b){
		balance=b;
		annualInterest=.12;
	}
	public void setAnnualInterest(double a){
		annualInterest=a;
	}
	public double getBalance(){
		return balance;
	}
	
	public void deposit(double d){
		balance+=d;
	}
	public void withdrawal(double w){
		balance-=w;
	}
	public double interest(){
		double i=(balance*(annualInterest/12));
		balance+=i;
		return i;
	}
}