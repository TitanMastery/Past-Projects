import javax.swing.JOptionPane;

public class PaintJob{
	public static double gallons(double sqFt){
		return sqFt/115;
	}
	public static double hours(double sqFt){
		return (sqFt/115)*8;
	}
	public static double paintCost(double gallons){
		double galCost=Double.parseDouble(JOptionPane.showInputDialog("What is the price per gallon of paint?"));
		return gallons*galCost;
	}
	public static double laborCharges(double hours){
		return hours*18.0;
	}
	public static double totalCost(double paintCost,double laborCharges){
		return paintCost+laborCharges;
	}
	public static void main(String[] args){
		int rooms=Integer.parseInt(JOptionPane.showInputDialog("How many rooms do you need painted"));
		double sqFt=0;
		for(int i=1;i<=rooms;i++){
			sqFt+=Double.parseDouble(JOptionPane.showInputDialog("How many square feet in room "+i+"?"));
		}
		double gallons=gallons(sqFt);
		double hours=hours(sqFt);
		double paintCost=paintCost(gallons);
		double laborCharges=laborCharges(hours);
		double totalCost=totalCost(paintCost,laborCharges);
		System.out.printf("\nTo paint "+rooms+" rooms you will need "+gallons+" gallons of paint and it will take "+hours+" hours.\nThe paint will cost $%,.2f",paintCost);
		System.out.printf(" and the labor will cost $%,.2f",laborCharges);
		System.out.printf(".\nThe overall cost is $%,.2f\n",totalCost);
	}
}