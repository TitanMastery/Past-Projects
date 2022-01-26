public class CoinDollar{
	public static void results(String n,String d,String q,int i,double b){
		System.out.println("Round "+i+":");
		System.out.println("Nickel: "+n);
		System.out.println("Dime: "+d);
		System.out.println("Quarter: "+q);
		System.out.printf("\nBalance: %.2f\n\n\n",b);
	}
	public static void main(String[] args)throws InterruptedException{
		double balance=0.00;
		Coin nickel=new Coin();
		Coin dime=new Coin();
		Coin quarter=new Coin();
		int i=1;
		while(!(balance>=1.00)){
			nickel.toss();
			dime.toss();
			quarter.toss();
			String nSide=nickel.getSideUp();
			String dSide=dime.getSideUp();
			String qSide=quarter.getSideUp();
			if(nSide.equals("Heads")){
				balance+=.05;
			}
			if(dSide.equals("Heads")){
				balance+=.1;
			}
			if(qSide.equals("Heads")){
				balance+=.25;
			}
			results(nSide,dSide,qSide,i,balance);
			i++;
			Thread.sleep(1250);
		}
		if(balance==1.00){
			System.out.println("You win!");
		}
		else{
			System.out.println("You lose!");
		}
	}
}