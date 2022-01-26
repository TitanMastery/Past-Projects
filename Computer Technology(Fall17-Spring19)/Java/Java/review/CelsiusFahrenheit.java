public class CelsiusFahrenheit{
	public static void main(String[] args){
		System.out.println("Celsius    Fahrenheit");
		System.out.println("---------------------");
		for(double c=0;c<=20;c++){
			System.out.printf(c+"\t\t%.2f\n",(c*9/5+32));
		}
	}
}