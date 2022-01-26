import java.util.Scanner;

public class keyInput{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		System.out.println("What is your desired annual income?");
		System.out.print("$");
		double income=keyboard.nextDouble();
		System.out.println("Your desired annual income is $"+income);
	}
}