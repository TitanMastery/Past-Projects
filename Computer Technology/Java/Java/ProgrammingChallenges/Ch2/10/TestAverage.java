import javax.swing.JOptionPane;

public class TestAverage{
	public static void calc(){
		double test1=Double.parseDouble(JOptionPane.showInputDialog("What is your first test score?"));
		double test2=Double.parseDouble(JOptionPane.showInputDialog("What is your second test score?"));
		double test3=Double.parseDouble(JOptionPane.showInputDialog("What is your third	test score?"));
		double average=(test1+test2+test3)/3;
		System.out.println("Your first test score is "+test1);
		System.out.println("Your second test score is "+test2);
		System.out.println("Your third test score is "+test3);
		System.out.println("Your average test score is "+average);
	}
	public static void main(String[] args){
		calc();
	}
}