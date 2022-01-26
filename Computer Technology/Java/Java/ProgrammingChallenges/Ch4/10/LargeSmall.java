import javax.swing.JOptionPane;

public class LargeSmall{
	public static void calc(){
		JOptionPane.showMessageDialog(null,"Enter -99 to end the program");
		double num=Double.parseDouble(JOptionPane.showInputDialog("Pick a number"));
		double max=num;
		double min=num;
		while(num!=-99){
			if(num>max){
				max=num;
			}
			else if(num<min){
				min=num;
			}
			num=Double.parseDouble(JOptionPane.showInputDialog("Pick a number"));
		}
		System.out.println("The max value entered was "+max);
		System.out.println("The min value entered was "+min);
	}
	public static void main(String[] args){
		calc();
	}
}