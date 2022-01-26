import javax.swing.JOptionPane;

public class SalesTax{
	public static void calc(){
		String input=JOptionPane.showInputDialog("Enter the price of the item:");
		double cost=Double.parseDouble(input);
		double sTax=.04;
		sTax=sTax*cost;
		double cTax=.02;
		cTax=cTax*cost;
		double total=cost+sTax+cTax;
		System.out.println("Your starting cost is $"+cost);
		System.out.println("Your state tax is $"+sTax);
		System.out.println("Your county tax is $"+cTax);
		System.out.println("Your total tax is $"+(sTax+cTax));
		System.out.println("Your total cost is $"+total);
	}
	public static void main(String[] args){
		calc();
	}
}