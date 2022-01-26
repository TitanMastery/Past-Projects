//Created by David Helmick 3/7/18
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class practicalAssessment4{
	public static void main(String[] args)throws IOException{
		File iFile=new File("temp.txt");
		if(!iFile.exists()){
			JOptionPane.showMessageDialog(null,"Cannot find file tempF.txt","File Does Not Exist",JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		Scanner inputFile=new Scanner(iFile);
		File oFile=new File("tempTable.txt");
		PrintWriter outputFile=new PrintWriter(oFile);
		outputFile.println(" F\t  C");
		outputFile.println("--------------");
		while(inputFile.hasNext()){
			double f=inputFile.nextDouble();
			double c=5.0/9.0*(f-32);
			outputFile.printf(f+"\t%.2f%n",c);
		}
		outputFile.println("");
		outputFile.println("David Helmick");
		outputFile.close();
		inputFile.close();
	}
}