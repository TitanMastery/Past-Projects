import javax.swing.JOptionPane;

public class CircleDemo{
	public static void main(String[] args){
		Circle cir=new Circle(Double.parseDouble(JOptionPane.showInputDialog("What is the radius of the circle?")));
		System.out.println("Area: "+cir.getArea());
		System.out.println("Diameter: "+cir.getDiameter());
		System.out.println("Circumference: "+cir.getCircumference());
	}
}