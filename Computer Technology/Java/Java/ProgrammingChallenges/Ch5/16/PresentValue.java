import javax.swing.JOptionPane;

public class PresentValue{
	public static double presentValue(double f,double r,int n){
		return (f/Math.pow(1+r,n));
	}
	public static void main(String[] args){
		double f=Double.parseDouble(JOptionPane.showInputDialog("What is the future value?"));
		double r=Double.parseDouble(JOptionPane.showInputDialog("What is the annual interest rate?"));
		int n=Integer.parseInt(JOptionPane.showInputDialog("What is the number of years?"));
		JOptionPane.showMessageDialog(null,"You need to deposit $"+presentValue(f,r,n)+" today.");
	}
}