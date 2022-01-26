import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class UppercaseFile{
	public static void calc()throws IOException{
		String iFName=JOptionPane.showInputDialog("What is the name of the first file?");
		String oFName=JOptionPane.showInputDialog("What is the name of the second file?");
		PrintWriter outputFile=new PrintWriter(oFName);
		File file=new File(iFName);
		Scanner inputFile=new Scanner(file);
		while(inputFile.hasNext()){
			outputFile.println(inputFile.nextLine().toUpperCase());
		}
		inputFile.close();
		outputFile.close();
	}
	public static void main(String[] args)throws IOException{
		calc();
	}
}