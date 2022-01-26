import javax.swing.JOptionPane;

public class WordGame{
	public static void main(String[] args){
		String name=JOptionPane.showInputDialog("What is your name?");
		String age=JOptionPane.showInputDialog("What is your age?");
		String city=JOptionPane.showInputDialog("What is the name of your city");
		String college=JOptionPane.showInputDialog("Where did you go to college?");
		String job=JOptionPane.showInputDialog("What is your profession?");
		String pet=JOptionPane.showInputDialog("What is your species is your pet?");
		String petName=JOptionPane.showInputDialog("What is your pet's name?");
		System.out.println("There once was a person named "+name+" who lived in "+city+". At the age of "+age+", "+name+" went to college at "+college+". "+name+" graduated and went to work as a "+job+". Then, "+name+" adopted a(n) "+pet+" named "+petName+". They both lived happily ever after!");
	}
}