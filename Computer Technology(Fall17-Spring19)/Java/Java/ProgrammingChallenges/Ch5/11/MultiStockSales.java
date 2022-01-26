import javax.swing.JOptionPane;

public class StockProfit{
	public static double calc(int ns,double sp,double sc,double pp,double pc){
		return(((ns*sp)-sc)-((ns*pp)+pc));
	}
	public static void main(String[] args){
		int num=Integer.parseInt(JOptionPane.showInputDialog("How many sales?"));
		for(int i=1;i<=num;i++){
			int ns=Integer.parseInt(JOptionPane.showInputDialog("What is the number of stock?"));
			double sp=Double.parseDouble(JOptionPane.showInputDialog("What is the sale price?"));
			double sc=Double.parseDouble(JOptionPane.showInputDialog("What is the sale commission?"));
			double pp=Double.parseDouble(JOptionPane.showInputDialog("What is the purchase price?"));
			double pc=Double.parseDouble(JOptionPane.showInputDialog("What is the purchase commission?"));
			double profit+=calc(ns,sp,sc,pp,pc);
		}
		JOptionPane.showMessageDialog(null,"Your profit is "+profit+" dollars");
	}
}