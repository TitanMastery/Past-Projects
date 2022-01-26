import javax.swing.JOptionPane;

public class Population{
	public static void calc(){
		int size=-1;
		double increase=-1;
		int days=-1;
		while(size<2){
			size=Integer.parseInt(JOptionPane.showInputDialog("What is the size of the population?"));
		}
		while(increase<0){
			increase=Double.parseDouble(JOptionPane.showInputDialog("What is the percentage of increase of the population?"))/100;
		}
		while(days<1){
			days=Integer.parseInt(JOptionPane.showInputDialog("How many days did the population increase?"));
		}
		for(int i=1;i<=days;i++){
			System.out.println("Day: "+i+"\t\tPopulation: "+size);
			size+=Math.floor((double)size*increase);
		}
	}
	public static void main(String[] args){
		calc();
	}
}