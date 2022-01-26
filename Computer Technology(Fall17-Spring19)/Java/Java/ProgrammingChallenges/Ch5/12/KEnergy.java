import javax.swing.JOptionPane;

public class KEnergy{
	public static double kineticEnergy(double m,double v){
		return (1.0/2*m*v*v);
	}
	public static void main(String[] args){
		double mass=Double.parseDouble(JOptionPane.showInputDialog("What is the mass of the object?"));
		double velocity=Double.parseDouble(JOptionPane.showInputDialog("What is the velocity of the object?"));
		double ke=kineticEnergy(mass,velocity);
		JOptionPane.showMessageDialog(null,"The kinetic energy of the object is "+ke);
	}
}