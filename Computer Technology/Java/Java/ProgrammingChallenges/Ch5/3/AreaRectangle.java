import javax.swing.JOptionPane;

public class AreaRectangle{
	public static double getLength(){
		return Double.parseDouble(JOptionPane.showInputDialog("What is the length of the rectangle?"));
	}
	public static double getWidth(){
		return Double.parseDouble(JOptionPane.showInputDialog("What is the width of the rectangle?"));
	}
	public static double getArea(double l,double w){
		return (l*w);
	}
	public static void displayData(double l,double w,double area){
		JOptionPane.showMessageDialog(null,"The length is "+l+".\nThe width is "+w+".\nThe area is "+area+".");
	}
	public static void main(String[] args){
		double length = getLength();
		double width = getWidth();
		double area = getArea(length, width);
		displayData(length, width, area);
	}
}