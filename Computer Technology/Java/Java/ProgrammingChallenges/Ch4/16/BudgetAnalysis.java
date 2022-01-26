import javax.swing.JOptionPane;

public class BudgetAnalysis{
	public static void calc(){
		double budget=Double.parseDouble(JOptionPane.showInputDialog("What is your budget?"));
		String input="0";
		double expenses=0;
		while(!input.equals("end")){
			double expense=Double.parseDouble(input);
			expenses+=expense;
			input=JOptionPane.showInputDialog("Enter an expense or 'end' when finished");
		}
		if(budget==expenses){
			System.out.println("You are exactly on budget");
		}
		else if(budget>expenses){
			System.out.println("You are $"+(budget-expenses)+" under budget");
		}
		else{
			System.out.println("You are $"+(expenses-budget)+" over budget");
		}
	}
	public static void main(String[] args){
		calc();
	}
}