import java.util.Random;
import javax.swing.JOptionPane;

public class DiceGame{
	public static int die(){
		Random rand=new Random();
		return rand.nextInt(5)+1;
	}
	public static void calc(){
		int uTotal=0;
		int cTotal=0;
		for(int i=1;i<=10;i++){
			int cDie=die();
			int uDie=die();
			if(cDie>uDie){
				JOptionPane.showMessageDialog(null,"The computer rolled a "+cDie+" and you rolled a "+uDie+". The computer wins!");
				cTotal++;
			}
			else if(cDie<uDie){
				JOptionPane.showMessageDialog(null,"The computer rolled a "+cDie+" and you rolled a "+uDie+". You win!");
				uTotal++;
			}
			else{
				JOptionPane.showMessageDialog(null,"There was a tie, no one wins!");
			}
		}
		if(cTotal>uTotal){
			JOptionPane.showMessageDialog(null,"The final score is "+uTotal+"-"+cTotal+". The computer is the Grand Winner!");
		}
		else if(cTotal<uTotal){
			JOptionPane.showMessageDialog(null,"The final score is "+uTotal+"-"+cTotal+". You are the Grand Winner!");
		}
		else{
			JOptionPane.showMessageDialog(null,"The final score is tied. No one is the Grand Winner!");
		}
	}
	public static void main(String[] args){
		calc();
	}
}