import javax.swing.JOptionPane;

public class ISP2{
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
		if(total>19.95){
			double bTotal=B(hrs, false);
			double bSave=total-bTotal;
			double cTotal=C();
			double cSave=total-cTotal;
			System.out.println("You would've saved $"+bSave+" with the B package");
			System.out.println("You would've saved $"+cSave+" with the C package");
		}
		else if(over>2){
			double bTotal=B(hrs, false);
			double bSave=total-bTotal;
			System.out.println("You would've saved $"+bSave+" with the B package");
		}
		return total;
	}
	public static double B(int hrs, boolean flg){
		double total;
		int over=hrs-20;
		if(over>0){
			over*=1;
			total=13.95+over;
		}
		else{
			total=13.95;
		}
		if(total>19.95&&flg){
			double cTotal=C();
			double cSave=total-cTotal;
			System.out.println("You would've saved $"+cSave+" with the C package");
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
				total=B(hrs, true);
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