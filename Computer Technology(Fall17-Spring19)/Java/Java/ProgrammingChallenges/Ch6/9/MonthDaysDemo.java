import javax.swing.JOptionPane;

public class MonthDaysDemo{
	public static void main(String[] args){
		int month=Integer.parseInt(JOptionPane.showInputDialog("Enter a month(1-12):"));
		int year=Integer.parseInt(JOptionPane.showInputDialog("Enter a year:"));
		MonthDays md=new MonthDays(month,year);
		JOptionPane.showMessageDialog(null,"Days: "+md.getNumberOfDays());
	}
}