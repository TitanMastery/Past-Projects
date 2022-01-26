import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class LineNumbers{
	public static void calc()throws IOException{
		String fName=JOptionPane.showInputDialog("What is the name of the file?");
		File file=new File(fName);
		Scanner inputFile=new Scanner(file);
		int i=1;
		while(inputFile.hasNext()){
			System.out.println(i+": "+inputFile.nextLine());
			i++;
		}
		inputFile.close();
	}
	public static void main(String[] args)throws IOException
	{
		calc();
	}
}