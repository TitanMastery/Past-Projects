import javax.swing.JOptionPane;

public class RestaurantBill{
	public static void calc(){
		double bill=Double.parseDouble(JOptionPane.showInputDialog("What is your bill amount?"));
		double tax=bill*.0675;
		double tip=(bill+tax)*.2;
		System.out.println("Bill: $"+bill);
		System.out.println("Tax: $"+tax);
		System.out.println("Tip: $"+tip);
		System.out.println("Total: $"+(bill+tip+tax));
	}
	public static void main(String[] args){
		calc();
	}
}