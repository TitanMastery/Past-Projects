import javax.swing.JOptionPane;

public class CookieCal{
	public static void calc(){
		double cookies=Double.parseDouble(JOptionPane.showInputDialog("How many cookies did you eat?"));
		double calories=(cookies/4)*300;
		System.out.println("You consumed "+calories+" calories");
	}
	public static void main(String[] args){
		calc();
	}
}