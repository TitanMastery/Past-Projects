import javax.swing.JOptionPane;

public class AvgRainfall{
	public static void calc(){
		int years=Integer.parseInt(JOptionPane.showInputDialog("How many years?"));
		if(years<1){
			JOptionPane.showMessageDialog(null,"Enter a whole number of years greater than 0","Invalid Input",JOptionPane.ERROR_MESSAGE);
			calc();
		}
		else{
			int totalMonths=years*12;
			double totalRain=0;
			for(int i=1;i<=years;i++){
				for(int x=1;x<=12;x++){
					double rain=Integer.parseInt(JOptionPane.showInputDialog("How much rain for month "+x+" in year "+i+"?"));
					while(rain<0){
						JOptionPane.showMessageDialog(null,"Enter a positive rainfall amount","Invalid Input",JOptionPane.ERROR_MESSAGE);
						rain=Integer.parseInt(JOptionPane.showInputDialog("How much rain for month "+x+" in year "+i+"?"));
					}
					totalRain+=rain;
				}
			}
			System.out.println("The total number of months is "+totalMonths);
			System.out.println("The total amount of rainfall is "+totalRain+" inches");
			System.out.println("The average rainfall per month is "+(totalRain/totalMonths)+" inches");
		}
	}
	public static void main(String[] args){
		calc();
	}
}