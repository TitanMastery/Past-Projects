import javax.swing.JOptionPane;

public class RunRace{
	public static void calc(){
		String r1=JOptionPane.showInputDialog("What is the first runner's name?");
		double rt1=Double.parseDouble(JOptionPane.showInputDialog("What is their time?"));
		String r2=JOptionPane.showInputDialog("What is the second runner's name?");
		double rt2=Double.parseDouble(JOptionPane.showInputDialog("What is their time?"));
		String r3=JOptionPane.showInputDialog("What is the third runner's name?");
		double rt3=Double.parseDouble(JOptionPane.showInputDialog("What is their time?"));
		if(rt1<rt2&&rt1<rt3){
			System.out.println(r1+" "+rt1);
			if(rt2<rt3){
				System.out.println(r2+" "+rt2);
				System.out.println(r3+" "+rt3);
			}
			else{
				System.out.println(r3+" "+rt3);
				System.out.println(r2+" "+rt2);
			}
		}
		else if(rt2<rt1&&rt2<rt3){
			System.out.println(r2+" "+rt2);
			if(rt1<rt3){
				System.out.println(r1+" "+rt1);
				System.out.println(r3+" "+rt3);
			}
			else{
				System.out.println(r3+" "+rt3);
				System.out.println(r1+" "+rt1);
			}
		}
		else if(rt3<rt2&&rt3<rt1){
			System.out.println(r3+" "+rt3);
			if(rt1<rt2){
				System.out.println(r1+" "+rt1);
				System.out.println(r2+" "+rt2);
			}
			else{
				System.out.println(r2+" "+rt2);
				System.out.println(r1+" "+rt1);
			}
		}
	}
	public static void main(String[] args){
		calc();
	}
}