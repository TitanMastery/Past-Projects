//Created by David Helmick on 3/22/18
import javax.swing.JOptionPane;

public class practicalAssessment5{
	public static double celsius(double f){
		return (5.0*(f-32.0)/9.0);
	}
	public static double kelvin(double f){
		return ((5.0*(f-32.0)/9.0)+273);
	}
	public static void main(String[] args){
		double f=Double.parseDouble(JOptionPane.showInputDialog("What is the temperature in degrees Fahrenheit?"));
		double c=celsius(f);
		double k=kelvin(f);
		System.out.printf("\nFahrenheit: %,.2f",f);
		System.out.printf("\nCelsius: %,.2f",c);
		System.out.printf("\nKelvin: %,.2f\n",k);
	}
}