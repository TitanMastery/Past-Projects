import java.util.Random;
import javax.swing.JOptionPane;

public class SlotMachine{
	public static Random rand=new Random();
	public static String[] words=new String[]{"Cherries","Oranges","Plums","Bells","Melons","Bars"};
	
	public static void calc(){
		double cash=100;
		double totalE=0;
		double totalW=0;
		String again="";
		double win;
		do{
			double bet=Double.parseDouble(JOptionPane.showInputDialog("You have $"+cash+". How much money would you like to bet?"));
			if(bet<=cash){
				cash-=bet;
				totalE+=bet;
				String first=words[rand.nextInt(5)];
				String second=words[rand.nextInt(5)];
				String third=words[rand.nextInt(5)];
				JOptionPane.showMessageDialog(null,first);
				JOptionPane.showMessageDialog(null,first+" "+second);
				JOptionPane.showMessageDialog(null,first+" "+second+" "+third);
				if(first.equals(second)&&first.equals(third)){
					win=bet*3;
				}
				else if(first.equals(second)||first.equals(third)||second.equals(third)){
					win=bet*2;
				}
				else{
					win=0;
				}
				JOptionPane.showMessageDialog(null,"Congratulations! You won $"+win);
				totalW+=win;
				cash+=win;
				again=JOptionPane.showInputDialog("Would you like to play again?");
			}
		}while(again.equals("yes"));
		JOptionPane.showMessageDialog(null,"You entered $"+totalE+" into the slot machine and won $"+totalW);
	}
	public static void main(String[] args){
		calc();
	}
}