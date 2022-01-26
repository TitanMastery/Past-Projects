import javax.swing.JOptionPane;

public class TestScore{
	public static void calc(){
		double one=Double.parseDouble(JOptionPane.showInputDialog("What was your first test score?"));
		double two=Double.parseDouble(JOptionPane.showInputDialog("What was your second test score?"));
		double three=Double.parseDouble(JOptionPane.showInputDialog("What was your third test score?"));
		double average=(one+two+three)/3;
		if(average>=90){
			System.out.println("You have an A average");
		}
		else if(average>=80){
			System.out.println("You have a B average");
		}
		else if(average>=70){
			System.out.println("You have a C average");
		}
		else if(average>=60){
			System.out.println("You have a D average");
		}
		else{
			System.out.println("You have a F average");
		}
	}
	public static void main(String[] args){
		calc();
	}
}