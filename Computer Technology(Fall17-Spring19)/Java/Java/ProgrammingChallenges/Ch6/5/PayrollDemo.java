import javax.swing.JOptionPane;

public class PayrollDemo{
	public static void main(String[] args){
		String name=JOptionPane.showInputDialog("What is your name?");
		int id=Integer.parseInt(JOptionPane.showInputDialog("What is your employee id?"));
		Payroll employee=new Payroll(name,id);
		employee.setPayRate(Double.parseDouble(JOptionPane.showInputDialog("What is your pay rate?")));
		employee.setHoursWorked(Double.parseDouble(JOptionPane.showInputDialog("How many hours did you work?")));
		System.out.printf("You have a gross pay of $%,.2f%n",employee.getGrossPay());
	}
}