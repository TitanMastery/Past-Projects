public class FallDist{
	public static double fallingDistance(double sec){
		double dist=.5*9.8*(sec*sec);
		return dist;
	}
	public static void main(String[] args){
		System.out.println("");
		for(double i=1;i<=10;i++){
			System.out.printf("The object fell %,.1f in "+i+" seconds.\n",fallingDistance(i));
		}
	}
}