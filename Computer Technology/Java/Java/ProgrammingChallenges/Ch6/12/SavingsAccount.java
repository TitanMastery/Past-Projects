public class SavingsAccount{
	private double balance;
	private double annualInterest;
	
	public SavingsAccount(double b){
		balance=b;
		annualInterest=0;
	}
	public void setAnnualInterest(double a){
		annualInterest=a;
	}
	public double getBalance(){
		return balance;
	}
	
	public double deposit(double d){
		balance+=d;
		return d;
	}
	public double withdrawal(double w){
		balance-=w;
		return w;
	}
	public double interest(){
		double i=(balance*(annualInterest/12));
		balance+=i;
		return i;
	}
}