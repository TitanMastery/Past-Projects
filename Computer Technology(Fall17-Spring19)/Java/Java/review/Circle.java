import javax.swing.JOptionPane;

public class Circle{
	public static final double PI=3.14159;
	public static double getArea(double r){
		return PI*Math.pow(r,2);
	}
	public static double getDiameter(double r){
		return r*2;
	}
	public static double getCircumference(double r){
		return 2*PI*r;
	}
	public static void main(String[] args){
		double radius=Double.parseDouble(JOptionPane.showInputDialog("What is the radius?"));
		System.out.printf("\nArea: %,.2f\n",getArea(radius));
		System.out.printf("Diameter: %,.2f\n",getDiameter(radius));
		System.out.printf("Circumference: %,.2f\n",getCircumference(radius));
	}
}