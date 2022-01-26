import java.util.Random;
import javax.swing.JOptionPane;

public class RNGGame{
	public static void calc(){
		Random rand=new Random();
		int rInt=rand.nextInt(1000)+1;
		int guess=Integer.parseInt(JOptionPane.showInputDialog("Guess an Integer"));
		while(guess!=rInt){
			if(guess<rInt){
				JOptionPane.showMessageDialog(null,"Guess is too low");
			}
			else if(guess>rInt){
				JOptionPane.showMessageDialog(null,"Guess is too high");
			}
			guess=Integer.parseInt(JOptionPane.showInputDialog("Guess an Integer"));
		}
		JOptionPane.showMessageDialog(null,"You got it!");
	}
	public static void main(String[] args){
		calc();
	}
}