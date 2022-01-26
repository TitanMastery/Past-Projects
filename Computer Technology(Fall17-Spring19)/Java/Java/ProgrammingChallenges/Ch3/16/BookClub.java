import javax.swing.JOptionPane;

public class BookClub{
	public static void calc(){
		int n=Integer.parseInt(JOptionPane.showInputDialog("How many books did you purchase this month?"));
		int p=0;
		if(n>3){
			p=60;
		}
		else if(n==3){
			p=30;
		}
		else if(n==2){
			p=15;
		}
		else if(n==1){
			p=5;
		}
		System.out.println("You have earned "+p+" points this month");
	}
	public static void main(String[] args){
		calc();
	}
}