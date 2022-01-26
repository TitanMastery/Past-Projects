import javax.swing.JOptionPane;

public class ISP{
	public static double A(int hrs){
		double total;
		int over=hrs-10;
		if(over>0){
			over*=2;
			total=9.95+over;
		}
		else{
			total=9.95;
		}
		return total;
	}
	public static double B(int hrs){
		double total;
		int over=hrs-20;
		if(over>0){
			over*=1;
			total=13.95+over;
		}
		else{
			total=13.95;
		}
		return total;
	}
	public static double C(){
		double total=19.95;
		return total;
	}
	public static void calc(){
		double total=0;
		String pack=JOptionPane.showInputDialog("What package do you own(A, B, or C)?").toUpperCase();
		int hrs=Integer.parseInt(JOptionPane.showInputDialog("How many hours did you use?"));
		switch(pack){
			case "A":
				total=A(hrs);
				break;
			case "B":
				total=B(hrs);
				break;
			case "C":
				total=C();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Please choose one of the packages", "Incorrect Package", JOptionPane.ERROR_MESSAGE);
				calc();
				System.exit(0);
		}
		System.out.printf("Your total is $%,.2f",total);
	}
	public static void main(String[] args){
		calc();
	}
}