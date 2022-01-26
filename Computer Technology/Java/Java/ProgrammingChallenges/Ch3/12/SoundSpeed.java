import javax.swing.JOptionPane;

public class SoundSpeed{
	public static void calc(){
		String med=JOptionPane.showInputDialog("What is the medium?").toLowerCase();
		double dis=Double.parseDouble(JOptionPane.showInputDialog("What is the distance in feet?"));
		double t=0;
		switch(med){
			case "air":
				t=dis/1100;
				break;
			case "water":
				t=dis/4900;
				break;
			case "steel":
				t=dis/16400;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Please use one of the three mediums and a proper distance", "Incorrect Medium and/or Distance", JOptionPane.ERROR_MESSAGE);
				calc();
				System.exit(0);
		}
		System.out.println("It will take "+t+" seconds for sound to travel "+dis+" feet in "+med);
	}
	public static void main(String[] args){
		calc();
	}
}