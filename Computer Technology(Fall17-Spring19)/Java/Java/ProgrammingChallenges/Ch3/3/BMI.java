import javax.swing.JOptionPane;

public class BMI{
	public static void calc(){
		double weight=Double.parseDouble(JOptionPane.showInputDialog("What is your weight in pounds?"));
		double height=Double.parseDouble(JOptionPane.showInputDialog("What is your height in inches?"));
		double bmi=weight*703/Math.pow(height, 2);
		if(bmi<18.5){
			System.out.println("You are underweight");
		}
		else if(bmi>25){
			System.out.println("You are overweight");
		}
		else{
			System.out.println("You are an optimal weight");
		}
	}
	public static void main(String[] args){
		calc();
	}
}