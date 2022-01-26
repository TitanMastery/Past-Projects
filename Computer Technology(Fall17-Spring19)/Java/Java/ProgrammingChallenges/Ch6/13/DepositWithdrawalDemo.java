import java.util.Scanner;
import java.io.*;

public class DepositWithdrawalDemo{
	public static void main(String[] args)throws IOException{
		DepositWithdrawal user=new DepositWithdrawal(500.00);
		File dfile=new File("Deposits.txt");
		File wfile=new File("Withdrawals.txt");
		Scanner deposits=new Scanner(dfile);
		Scanner withdrawals=new Scanner(wfile);
		while(deposits.hasNext()){
			user.deposit(deposits.nextDouble());
		}
		while(withdrawals.hasNext()){
			user.withdrawal(withdrawals.nextDouble());
		}
		double i=user.interest();
		System.out.printf("\nBalance: $%,.2f\n",user.getBalance());
		System.out.printf("Interest earned: $%,.2f\n",i);
	}
}