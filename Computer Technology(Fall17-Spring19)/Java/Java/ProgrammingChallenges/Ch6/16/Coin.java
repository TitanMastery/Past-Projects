import java.util.Random;

public class Coin{
	private String sideUp;
	
	public Coin(){
		Random rand=new Random();
		int num=rand.nextInt(2);
		if(num==0){
			sideUp="Heads";
		}
		else if(num==1){
			sideUp="Tails";
		}
	}
	
	public void toss(){
		Random rand=new Random();
		int num=rand.nextInt(2);
		if(num==0){
			sideUp="Heads";
		}
		else if(num==1){
			sideUp="Tails";
		}
	}
	public String getSideUp(){
		return sideUp;
	}
}