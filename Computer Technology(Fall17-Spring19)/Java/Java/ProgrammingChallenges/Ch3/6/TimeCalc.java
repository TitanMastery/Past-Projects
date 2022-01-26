import javax.swing.JOptionPane;

public class TimeCalc{
	public static void calc(){
		double sec=Double.parseDouble(JOptionPane.showInputDialog("Enter a number of seconds:"));
	if(sec>=86400){
		double day=sec/86400;
		System.out.println(day+" days");
	}
	else if(sec>=3600){
		double hr=sec/3600;
		System.out.println(hr+" hours");
	}
	else if(sec>=60){
		double min=sec/60;
		System.out.println(min+" minutes");
	}
	else{
		System.out.println(sec+" seconds");
	}
	}
	public static void main(String[] args){
		calc();
	}
}