import javax.swing.JOptionPane;

public class BankCharge{
	public static void calc(){
		double total=10;
		int n=Integer.parseInt(JOptionPane.showInputDialog("How many checks did you use?"));
		if(n>59){
			total+=n*.04;
		}
		else if(n>39){
			total+=n*.06;
		}
		else if(n>19){
			total+=n*.08;
		}
		else{
			total+=n*.1;
		}
		System.out.printf("Your total for this month is $%,.2f",total);
	}
	public static void main(String[] args){
		calc();
	}
}