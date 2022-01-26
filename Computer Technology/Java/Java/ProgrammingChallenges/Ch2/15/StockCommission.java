import javax.swing.JOptionPane;

public class StockCommission{
	public static void main(String[] args){
		int shares=Integer.parseInt(JOptionPane.showInputDialog("How many shares did you purchase?"));
		double cost=shares*21.77;
		double commission=cost*0.02;
		double total=cost+commission;
		System.out.println("The cost of the shares is $"+cost);
		System.out.println("The commission of the shares is $"+commission);
		System.out.println("The total of the shares is $"+total);
	}
}