import javax.swing.JOptionPane;

public class MassWeight{
	public static void calc(){
		double mass=Double.parseDouble(JOptionPane.showInputDialog("What is the mass(in kg) of the object?"));
		double weight=mass*9.8;
		System.out.println("The weight of the object is "+weight+" newtons");
		if (weight>1000){
			System.out.println("The object is too heavy");
		}
		else if (weight<10){
			System.out.println("The object is too light");
		}
	}
	public static void main(String[] args){
		calc();
	}
}