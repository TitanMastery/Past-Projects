import javax.swing.JOptionPane;

public class MagicDates{
	public static void calc(){
		int m=Integer.parseInt(JOptionPane.showInputDialog("Enter a Month in Numeric Form"));
		int d=Integer.parseInt(JOptionPane.showInputDialog("Enter a Day"));
		int y=Integer.parseInt(JOptionPane.showInputDialog("Enter a Two-Digit Year"));
		if (m*d==y){
			System.out.println(m+"/"+d+"/"+y+" is magic");
		}
		else{
			System.out.println(m+"/"+d+"/"+y+" is not magic");
		}
	}
	public static void main(String[] args){
		calc();
	}
}