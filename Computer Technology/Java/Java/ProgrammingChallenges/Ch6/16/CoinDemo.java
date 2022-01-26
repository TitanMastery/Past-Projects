public class CoinDemo{
	public static void main(String[] args){
		int heads=0;
		int tails=0;
		Coin coin=new Coin();
		System.out.println("Initial: "+coin.getSideUp());
		for(int i=1;i<=20;i++){
			coin.toss();
			String side=coin.getSideUp();
			System.out.println(i+": "+side);
			if(side.equals("Heads")){
				heads+=1;
			}
			else{
				tails+=1;
			}
		}
		System.out.println("Heads: "+heads);
		System.out.println("Tails: "+tails);
	}
}