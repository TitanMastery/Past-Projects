import java.util.Random;
import javax.swing.JOptionPane;

public class ESPGame{
	public static Random rand=new Random();
	public static String[] colors=new String[]{"red","green","blue","orange","yellow"};
	
	public static String rGenerator(){
		int rNum=rand.nextInt(4);
		return colors[rNum];
	}
	public static void calc(){
		int total=0;
		for(int i=1;i<=10;i++){
			String color=rGenerator();
			String guess=JOptionPane.showInputDialog("Enter a color(red, green, blue, orange, or yellow)").toLowerCase();
			if(guess.equals(color)){
				total++;
				JOptionPane.showMessageDialog(null,"Correct the color was "+color);
			}
			else{
				JOptionPane.showMessageDialog(null,"Wrong the color was "+color);
			}
		}
		JOptionPane.showMessageDialog(null,"Congratulations your score is "+total);
	}
	public static void main(String[] args){
		calc();
	}
}