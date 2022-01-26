import javax.swing.JOptionPane;

public class NumberSum{
	public static void calc(){
		int num=Integer.parseInt(JOptionPane.showInputDialog("Pick a whole number that is greater than zero"));
		int total=0;
		while(num>0){
			total+=num;
			num--;
		}
		System.out.println("The sum of integers equals "+total);
	}
	public static void main(String[] args){
		calc();
	}
}