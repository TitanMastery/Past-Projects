import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FileHead{
	public static void calc()throws IOException{
		String fName=JOptionPane.showInputDialog("What is the name of the file?");
		File file=new File(fName);
		Scanner inputFile=new Scanner(file);
		int i=1;
		System.out.println(fName);
		while(inputFile.hasNext()&&i<=5){
			System.out.println(inputFile.nextLine());
			i++;
		}
		inputFile.close();
	}
	public static void main(String[] args)throws IOException{
		calc();
	}
}