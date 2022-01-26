import java.io.*;

public class PrimeNumList{
	public static boolean isPrime(int n){
		if(n<2){
			return false;
		}
		else if(n==2){
			return true;
		}
		else if(n%2==0){
			return false;
		}
		for(int i=3;i*i<=n;i+=2){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)throws IOException{
		File file=new File("text.txt");
		PrintWriter outputFile=new PrintWriter(file);
		outputFile.println("Prime numbers 1-100:");
		for(int i=1;i<=100;i++){
			if(isPrime(i)){
				outputFile.println(i);
			}
		}
		outputFile.close();
	}
}