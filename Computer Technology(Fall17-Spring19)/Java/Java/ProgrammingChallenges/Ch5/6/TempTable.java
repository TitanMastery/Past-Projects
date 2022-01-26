public class TempTable{
	public static double celsius(double f){
		double c=(f-32)*5/9;
		return c;
	}
	public static void main(String[] args){
		System.out.println("\nFahrenheit              Celsius");
		System.out.println("-------------------------------");
		for(double i=0;i<=20;i++){
			double c=celsius(i);
			System.out.printf("%,.2f\t\t\t%,.2f\n",i,c);
		}
	}
}