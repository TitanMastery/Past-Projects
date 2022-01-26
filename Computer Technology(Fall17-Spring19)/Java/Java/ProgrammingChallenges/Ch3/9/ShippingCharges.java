import javax.swing.JOptionPane;

public class ShippingCharges{
	public static void calc(){
		double weight=Double.parseDouble(JOptionPane.showInputDialog("What is the weight of the object in pounds?"));
		if(weight>10){
			System.out.println("0-500 miles:    $3.80");
			System.out.println("500-1000 miles: $7.60");
		}
		else if(weight>6){
			System.out.println("0-500 miles:    $3.70");
			System.out.println("500-1000 miles: $7.40");
		}
		else if(weight>2){
			System.out.println("0-500 miles:    $2.20");
			System.out.println("500-1000 miles: $4.40");
		}
		else{
			System.out.println("0-500 miles:    $1.10");
			System.out.println("500-1000 miles: $2.20");
		}
	}
	public static void main(String[] args){
		calc();
	}
}