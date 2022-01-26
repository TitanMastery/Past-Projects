import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;

public class BudgetAnalysis2{
	public static void calc()throws IOException{
		File file=new File("expenses.txt");
		Scanner inputFile=new Scanner(file);
		double budget=Double.parseDouble(JOptionPane.showInputDialog("What is your budget?"));
		double expenses=0;
		System.out.println("Expense\t\t\tAmount");
		System.out.println("------------------------------");
		while(inputFile.hasNext()){
			String line=inputFile.nextLine();
			double input=Double.parseDouble(JOptionPane.showInputDialog("Enter the amount for "+line));
			expenses+=input;
			System.out.println(line+"\t\t\t$"+input);
		}
		System.out.println("------------------------------");
		System.out.println("Total\t\t\t$"+expenses);
		if(budget==expenses){
			System.out.println("\nYou are exactly on budget");
		}
		else if(budget>expenses){
			System.out.println("\nYou are $"+(budget-expenses)+" under budget");
		}
		else{
			System.out.println("\nYou are $"+(expenses-budget)+" over budget");
		}
	}
	public static void main(String[] args)throws IOException{
		calc();
	}
}