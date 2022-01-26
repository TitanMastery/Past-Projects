import javax.swing.JOptionPane;

public class StringManipulator{
	public static void calc(){
		String city=JOptionPane.showInputDialog("What is your favorite city?");
		int chars=city.length();
		String upper=city.toUpperCase();
		String lower=city.toLowerCase();
		char firstC=city.charAt(0);
		System.out.println("Number of characters: "+chars);
		System.out.println("Uppercase: "+upper);
		System.out.println("Lowercase: "+lower);
		System.out.println("First character: "+firstC);
	}
	public static void main(String[] args){
		calc();
	}
}