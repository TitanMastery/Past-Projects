import javax.swing.JOptionPane;

public class DistanceTraveled{
	public static void calc(){
		int speed=Integer.parseInt(JOptionPane.showInputDialog("What was your speed?"));
		int time=Integer.parseInt(JOptionPane.showInputDialog("How long were you traveling?"));
		int distance=0;
		if(speed>=0&&time>0){
			System.out.println("Hour      Distance Traveled");
			System.out.println("---------------------------");
			for(int i=1;i<=time;i++){
				System.out.printf("%4d",i);
				distance=i*speed;
				System.out.printf("%23d\n",distance);
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "Please enter a positive speed and a time greater than 0", "Incorrect Values", JOptionPane.ERROR_MESSAGE);
			calc();
		}
	}
	public static void main(String[] args){
		calc();
	}
}