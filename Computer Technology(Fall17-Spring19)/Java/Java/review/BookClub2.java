import javax.swing.JOptionPane;

public class BookClub2{
	public static void calc(){
		int books=Integer.parseInt(JOptionPane.showInputDialog("How many books have you purchased this month?"));
		int points;
		while(books<0){
			books=Integer.parseInt(JOptionPane.showInputDialog("How many books have you purchased this month?"));
		}
		switch(books){
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
		JOptionPane.showMessageDialog(null,"Congratulations! You've earned "+points+" points this month!");
	}
	public static void main(String[] args){
		calc();
	}
}