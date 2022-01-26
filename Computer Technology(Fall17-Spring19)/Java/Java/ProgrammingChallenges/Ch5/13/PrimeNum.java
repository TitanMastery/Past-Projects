import javax.swing.JOptionPane;

public class PrimeNum{
	public static boolean isPrime(int n){
		if(n<=2){
			return true;
		}
		else if(n%2==0){
			return false;
		}
		for(int i=3;i*i<=n;i+=2){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		int num=Integer.parseInt(JOptionPane.showInputDialog("Pick a number"));
		if(isPrime(num)){
			JOptionPane.showMessageDialog(null,"The number is prime");
		}
		else{
			JOptionPane.showMessageDialog(null,"The number is not prime");
		}
	}
}