public class CelsiusToFahrenheit{
	public static void calc(){
		System.out.println("Celsius           Fahrenheit");
		System.out.println("----------------------------");
		for(double c=0;c<=20;c++){
			double f=c*1.8+32;
			System.out.printf(c+"\t\t\t%.1f\n",f);
		}
	}
	public static void main(String[] args){
		calc();
	}
}