import javax.swing.JOptionPane;

public class HotelOccupancy{
	public static void calc(){
		int floors=Integer.parseInt(JOptionPane.showInputDialog("How many floors are there?"));
		int i=1;
		double rTotal=0;
		double oTotal=0;
		if(floors<1){
			JOptionPane.showMessageDialog(null, "Please enter a whole value of 1 or greater", "Improper Value", JOptionPane.ERROR_MESSAGE);
			calc();
		}
		else{
			while(i<=floors){
				int rNum=Integer.parseInt(JOptionPane.showInputDialog("How many rooms are on floor "+i));
				if(rNum<10){
					JOptionPane.showMessageDialog(null,"Rooms must be 10 or greater","Improper Value",JOptionPane.ERROR_MESSAGE);
				}	
				else{
					int oNum=Integer.parseInt(JOptionPane.showInputDialog("How many of those rooms are occupied?"));
					rTotal+=rNum;
					oTotal+=oNum;
					i++;
				}
			}
			System.out.printf("There are %.0f rooms total\n",rTotal);
			System.out.printf("%.0f of them are occupied\n",oTotal);
			System.out.printf("%.0f of them are vacant\n",rTotal-oTotal);
			System.out.println("The hotel has an occupancy rate of "+(oTotal/rTotal*100)+"%");
		}
	}
	public static void main(String[] args){
		calc();
	}
}