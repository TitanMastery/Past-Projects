import javax.swing.JOptionPane;

public class FatCalc{
	public static void calc(){
		double cal=Double.parseDouble(JOptionPane.showInputDialog("How many calories?"));
		double fat=Double.parseDouble(JOptionPane.showInputDialog("How many grams of fat?"));
		double calfat=fat*9;
		double percent=calfat/cal*100;
		System.out.println("The percentage of calories that comes from fat is "+percent+"%");
		if(percent<30){
			System.out.println("This food item is low fat");
		}
	}
	public static void main(String[] args){
		calc();
	}
}