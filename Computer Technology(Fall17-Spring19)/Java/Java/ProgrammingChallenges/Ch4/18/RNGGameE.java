import java.util.Random;
import javax.swing.JOptionPane;

public class RNGGameE{
	public static void calc(){
		Random rand=new Random();
		int rInt=rand.nextInt(1000)+1;
		int guess=Integer.parseInt(JOptionPane.showInputDialog("Guess an Integer"));
		int i=1;
		while(guess!=rInt){
			if(guess<rInt){
				JOptionPane.showMessageDialog(null,"Guess is too low");
			}
			else if(guess>rInt){
				JOptionPane.showMessageDialog(null,"Guess is too high");
			}
			i++;
			guess=Integer.parseInt(JOptionPane.showInputDialog("Guess an Integer"));
		}
		JOptionPane.showMessageDialog(null,"You got it! It only took "+i+" guesses");
	}
	public static void main(String[] args){
		calc();
	}
}