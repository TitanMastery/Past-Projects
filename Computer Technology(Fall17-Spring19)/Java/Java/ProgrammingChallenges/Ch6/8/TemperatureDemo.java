import javax.swing.JOptionPane;

public class TemperatureDemo{
	public static void main(String[] args){
		Temperature temp=new Temperature(Double.parseDouble(JOptionPane.showInputDialog("What is the temperature in degrees Fahrenheit?")));
		System.out.println("Celsius: "+temp.getCelsius()+"\nKelvin: "+temp.getKelvin());
	}
}