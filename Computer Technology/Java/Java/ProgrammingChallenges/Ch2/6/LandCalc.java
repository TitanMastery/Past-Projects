public class LandCalc{
	public static void calc(){
		int acre=43560;
		int tract=389767;
		double acres=tract/acre;
		System.out.println(acres+" acres");
	}
	public static void main(String[] args){
		calc();
	}
}