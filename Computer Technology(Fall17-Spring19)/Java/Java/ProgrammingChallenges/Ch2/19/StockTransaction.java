import javax.swing.JOptionPane;

public class StockTransaction{
	public static void main(String[] args){
		int shares=1000;
		double iCost=shares*32.87;
		double eCost=shares*33.92;
		double iCommission=iCost*0.02;
		double eCommission=eCost*0.02;
		double profit=eCost-iCost-eCommission-iCommission;
		System.out.println("The cost of the shares initially is $"+iCost);
		System.out.println("The commission of the shares initially is $"+iCommission);
		System.out.println("The cost of the shares afterwards is $"+eCost);
		System.out.println("The commission of the shares afterwards is $"+eCommission);
		System.out.println("The profit of the shares is $"+profit);
	}
}