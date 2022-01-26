import javax.swing.JOptionPane;

public class SavingsAccountDemo{
	public static void main(String[] args){
		double balance=Double.parseDouble(JOptionPane.showInputDialog("What is the starting balance?"));
		SavingsAccount user=new SavingsAccount(balance);
		
		double ai=Double.parseDouble(JOptionPane.showInputDialog("What is the annual interest rate?"));
		user.setAnnualInterest(ai);
		
		double totalD=0;
		double totalW=0;
		double totalI=0;
		
		int months=Integer.parseInt(JOptionPane.showInputDialog("How many months?"));
		for(int month=1;month<=months;month++){
			totalD+=user.deposit(Double.parseDouble(JOptionPane.showInputDialog("How much did you deposit in month "+month)));
			totalW+=user.withdrawal(Double.parseDouble(JOptionPane.showInputDialog("How much did you withdrawal in month "+month)));
			totalI+=user.interest();
		}
		
		System.out.printf("\nEnding balance: $%,.2f",user.getBalance());
		System.out.printf("\nTotal deposits: $%,.2f",totalD);
		System.out.printf("\nTotal withdrawals: $%,.2f",totalW);
		System.out.printf("\nTotal interest: $%,.2f\n",totalI);
	}
}