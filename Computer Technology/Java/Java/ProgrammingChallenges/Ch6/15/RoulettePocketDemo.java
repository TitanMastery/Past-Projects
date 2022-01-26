import javax.swing.JOptionPane;

public class RoulettePocketDemo{
	public static void main(String[] args){
		int num=Integer.parseInt(JOptionPane.showInputDialog("Enter a pocket number?"));
		while(num<0||num>36){
			JOptionPane.showMessageDialog(null,"Enter a value between 0-36","Invalid Value",JOptionPane.ERROR_MESSAGE);
			num=Integer.parseInt(JOptionPane.showInputDialog("Enter a pocket number?"));
		}
		RoulettePocket user=new RoulettePocket(num);
		JOptionPane.showMessageDialog(null,"The color of the pocket is "+user.getPocketColor());
	}
}