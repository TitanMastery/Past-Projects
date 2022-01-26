import javax.swing.JOptionPane;

public class MPG{
	public static void calc(){
		double miles=Double.parseDouble(JOptionPane.showInputDialog("How many miles did you drive?"));
		double gallons=Double.parseDouble(JOptionPane.showInputDialog("How many gallons of gas did you use?"));
		double mpg=miles/gallons;
		System.out.println("Your vehicle has "+mpg+" mpg");
	}
	public static void main(String[] args){
		calc();
	}
}