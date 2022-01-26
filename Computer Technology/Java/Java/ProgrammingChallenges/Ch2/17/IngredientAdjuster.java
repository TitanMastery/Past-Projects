import javax.swing.JOptionPane;

public class IngredientAdjuster{
	public static void main(String[] args){
		int cookies=Integer.parseInt(JOptionPane.showInputDialog("How many cookies do you want to make?"));
		cookies/=48;
		double sugar=1.5*cookies;
		double butter=cookies;
		double flour=2.75*cookies;
		System.out.println("You will need "+sugar+" cups of sugar");
		System.out.println("You will need "+butter+" cups of butter");
		System.out.println("You will need "+flour+" cups of flour");
	}
}