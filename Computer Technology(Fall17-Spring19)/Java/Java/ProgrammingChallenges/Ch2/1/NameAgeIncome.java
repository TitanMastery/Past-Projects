public class NameAgeIncome{
	public static String name(){
		String fullName="David Helmick";
		return fullName;
	}
	public static int age(){
		int yo=17;
		return yo;
	}
	public static double income(){
		double annualPay=100000.01;
		return annualPay;
	}
	public static void concat(String n, int a, double i){
		System.out.println("My name is "+n+", my age is "+a+" and\nI hope to earn $"+i+" per year.");
	}
	public static void main(String[] args){
		concat(name(),age(),income());
	}
}