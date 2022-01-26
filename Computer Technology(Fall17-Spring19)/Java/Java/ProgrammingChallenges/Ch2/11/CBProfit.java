import javax.swing.JOptionPane;

public class CBProfit{
	public static void calc(){
		double rp=Double.parseDouble(JOptionPane.showInputDialog("What is the retail price?"));
		double profit=rp*.4;
		System.out.println("The retail price is $"+rp);
		System.out.println("The total profit is $"+profit);
	}
	public static void main(String[] args){
		calc();
	}
}