import javax.swing.JOptionPane;

public class BarChart{
	public static void calc(){
		System.out.println("\nSALES BAR CHART");
		for(int i=1;i<=5;i++){
			String bar="";
			int sales=Integer.parseInt(JOptionPane.showInputDialog("Enter today's sales for store "+i));
			int stars=(int)sales/100;
			for(int x=1;x<=stars;x++){
				bar+="*";
			}
			System.out.println("Store "+i+": "+bar);
		}
	}
	public static void main(String[] args){
		calc();
	}
}