import java.util.Random;

public class EvenOdd{
	public static boolean isEven(int num){
		if((num%2)==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args){
		Random rand=new Random();
		int evens=0;
		int odds=0;
		for(int i=1;i<=100;i++){
			int num=rand.nextInt();
			if(isEven(num)){
				evens++;
			}
			else{
				odds++;
			}
		}
		System.out.println("Evens: "+evens);
		System.out.println("Odds: "+odds);
	}
}