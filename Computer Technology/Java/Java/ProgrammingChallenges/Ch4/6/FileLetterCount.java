import java.io.*;
import java.util.Scanner;

public class FileLetterCount{
	public static void calc()throws IOException{
		Scanner keyboard=new Scanner(System.in);
		int total=0;
		String line="";
		System.out.println("What is the name of the file?");
		String fName=keyboard.nextLine();
		File file=new File(fName);
		Scanner inputFile=new Scanner(file);
		System.out.println("Enter a character");
		char letter=keyboard.next().charAt(0);
		if(!file.exists()){
			System.out.println("The file doesn't exist");
			System.exit(0);
		}
		while(inputFile.hasNext()){
			line=inputFile.nextLine();
			for(int i=0;i<=(line.length()-1);i++){
				if(letter==line.charAt(i)){
					total++;
				}
			}
		}
		inputFile.close();
		System.out.println("There are "+total+" "+letter+"'s in "+fName);
	}
	public static void main(String[] args)throws IOException{
		calc();
	}
}