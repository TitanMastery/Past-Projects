import javax.swing.JOptionPane;

public class BookClub{
	public static void calc(){
		int num=Integer.parseInt(JOptionPane.showInputDialog("How many books have you purchased this month?"));
		if(num<0){
			calc();
		}
		else{
			int points;
			switch(num){
				case 0:
					points=0;
					break;
				case 1:
					points=5;
					break;
				case 2:
					points=15;
					break;
				case 3:
					points=30;
					break;
				default:
					points=60;
					break;
			}
			JOptionPane.showMessageDialog(null,"Congratulations you've earned "+points+" points");
		}
	}
	public static void main(String[] args){
		calc();
	}
}