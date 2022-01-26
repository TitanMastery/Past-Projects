import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;

public class ConversionProgram{
	public static void showKilometers(double m){
		double km=m*.001;
		System.out.println(m+" meters is "+km+" kilometers.\n");
	}
	public static void showInches(double m){
		double in=m*39.37;
		System.out.println(m+" meters is "+in+" inches.\n");
	}
	public static void showFeet(double m){
		double ft=m*3.281;
		System.out.println(m+" meters is "+ft+" feet.\n");
	}
	public static void menu(){
		System.out.println("1. Convert to kilometers");
		System.out.println("2. Convert to inches");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit the program\n");
		System.out.print("Enter your choice: ");
	}
	public static void main(String[] args)throws IOException{
		Scanner keyboard=new Scanner(System.in);
		int num;
		System.out.print("\nEnter a distance in meters: ");
		double meters=keyboard.nextDouble();
		do{
			menu();
			num=keyboard.nextInt();
			switch(num){
				case 1:
					showKilometers(meters);
					break;
				case 2:
					showInches(meters);
					break;
				case 3:
					showFeet(meters);
					break;
				case 4:
					System.out.println("Bye!");
					break;
				default:
					JOptionPane.showMessageDialog(null,"Please enter a number 1-4","Invalid value",JOptionPane.ERROR_MESSAGE);
			}
		}while(num!=4);
	}
}