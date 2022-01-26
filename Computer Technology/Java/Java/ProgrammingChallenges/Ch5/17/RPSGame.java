import java.util.Random;
import javax.swing.JOptionPane;

public class RPSGame{
	public static String comp(){
		String[] rps=new String[]{"rock","paper","scissors"};
		Random rand=new Random();
		return rps[rand.nextInt(3)];
	}
	public static void game(){
		String computer=comp();
		String player=JOptionPane.showInputDialog("Pick Rock, Paper, or Scissors").toLowerCase();
		if(!player.equals("paper")||!player.equals("rock")||!player.equals("scissors")){
			JOptionPane.showMessageDialog(null,"Please type rock, paper, or scissors","invalid response",JOptionPane.ERROR_MESSAGE);
			game();
		}
		else if(computer.equals(player)){
			JOptionPane.showMessageDialog(null,"The computer chose "+computer);
			JOptionPane.showMessageDialog(null,"It's a draw! Break the tie!");
			game();
		}
		else{
			JOptionPane.showMessageDialog(null,"The computer chose "+computer);
			switch(player){
				case "rock":
					if(computer.equals("scissors")){
						JOptionPane.showMessageDialog(null,"You Win!");
					}
					else{
						JOptionPane.showMessageDialog(null,"The Computer Wins!");
					}
					break;
				case "paper":
					if(computer.equals("rock")){
						JOptionPane.showMessageDialog(null,"You Win!");
					}
					else{
						JOptionPane.showMessageDialog(null,"The Computer Wins!");
					}
					break;
				case "scissors":
					if(computer.equals("paper")){
						JOptionPane.showMessageDialog(null,"You Win!");
					}
					else{
						JOptionPane.showMessageDialog(null,"The Computer Wins!");
					}
					break;
			}
		}
	}
	public static void main(String[] args){
		String reply;
		do{
			game();
			reply=JOptionPane.showInputDialog("Would you like to play again? (yes or no)").toLowerCase();
		}while(reply.equals("yes"));
	}
}