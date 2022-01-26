//Created by David Helmick 2-23-18
import javax.swing.JOptionPane;

public class practicalAssessment3{
	public static void calc(){
		int num=Integer.parseInt(JOptionPane.showInputDialog("Pick a number 1-4"));
		String pun="";
		switch(num){
			case 1:
				pun="You cannot run in a campground. You can only ran because it is past tents.";
				break;
			case 2:
				pun="What did the watermelon say to the cantaloupe? You are one in a melon!";
				break;
			case 3:
				pun="What do you get when two dinosaurs crash their cars? T-Rex.";
				break;
			case 4:
				pun="What do you call an everyday potato? A commentator.";
				break;
			default:
				JOptionPane.showMessageDialog(null,"Please enter a number within the parameters","Incorrect value",JOptionPane.ERROR_MESSAGE);
				calc();
				break;
		}
		if(!pun.equals("")){
			JOptionPane.showMessageDialog(null,pun);
		}
	}
	public static void main(String[] args){
		calc();
	}
}