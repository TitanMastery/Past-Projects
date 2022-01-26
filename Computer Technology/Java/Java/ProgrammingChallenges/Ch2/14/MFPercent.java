import javax.swing.JOptionPane;

public class MFPercent{
	public static void calc(){
		double male=Double.parseDouble(JOptionPane.showInputDialog("What is the number of male students?"));
		double female=Double.parseDouble(JOptionPane.showInputDialog("What is the number of female students?"));
		double classN=male+female;
		male=male/classN*100;
		female=female/classN*100;
		System.out.println("Male percentage: "+male+"%");
		System.out.println("Female percentage: "+female+"%");
	}
	public static void main(String[] args){
		calc();
	}
}