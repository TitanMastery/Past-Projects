import javax.swing.JOptionPane;

public class PennyPay{
	public static void calc(){
		int days=Integer.parseInt(JOptionPane.showInputDialog("How many days did you work?"));
		double total=0;
		double pennies=1;
		if(days>0){
			System.out.println("Days             Wages");
			System.out.println("----------------------");
			for(int i=1;i<=days;i++){
				System.out.printf("%,4d",i);
				total+=pennies;
				System.out.printf("\t\t$%,.2f\n",(total/100));
				pennies*=2;
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "Please enter a whole number of days greater than zero", "Incorrect Value", JOptionPane.ERROR_MESSAGE);
			calc();
		}
	}
	public static void main(String[] args){
		calc();
	}
}