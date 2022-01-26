import java.io.*;

public class CFT{
	public static void main(String[] args)throws IOException{
		File file=new File("text.txt");
		PrintWriter outputFile=new PrintWriter(file);
		outputFile.println("Celsius         Fahrenheit");
		outputFile.println("--------------------------");
		for(int c=0;c<=20;c++){
			double f=9.0/5.0*c+32;
			outputFile.printf(c+"\t\t%.2f%n",f);
		}
		outputFile.close();
	}
}