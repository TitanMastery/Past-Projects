import javax.swing.JOptionPane;
import java.io.*;

public class DistanceFile{
	public static void calc()throws IOException{
		PrintWriter outputFile=new PrintWriter("DistanceFile.txt");
		int speed=Integer.parseInt(JOptionPane.showInputDialog("What was your speed?"));
		int time=Integer.parseInt(JOptionPane.showInputDialog("How long were you traveling?"));
		int distance=0;
		if(speed>=0&&time>0){
			outputFile.println("Hour      Distance Traveled");
			outputFile.println("---------------------------");
			for(int i=1;i<=time;i++){
				outputFile.printf("%4d",i);
				distance=i*speed;
				outputFile.printf("%23d",distance);
				outputFile.println("");
			}
			System.out.println("Data written to DistanceFile.txt");
		}
		else{
			JOptionPane.showMessageDialog(null, "Please enter a positive speed and a time greater than 0", "Incorrect Values", JOptionPane.ERROR_MESSAGE);
			calc();
		}
		outputFile.close();
	}
	public static void main(String[] args)throws IOException{
		calc();
	}
}