import javax.swing.JOptionPane;

public class RetailPriceCalc{
	public static double calculateRetail(double cost,double percent){
		double total=cost*((percent/100)+1);
		return total;
	}
	public static void main(String[] args){
		double cost=Double.parseDouble(JOptionPane.showInputDialog("What is the wholesale cost of the item?"));
		double percent=Double.parseDouble(JOptionPane.showInputDialog("What is the markup percentage of the item?"));
		double price=calculateRetail(cost,percent);
		System.out.printf("The retail price of the item is $%,.2f",price);
	}
}