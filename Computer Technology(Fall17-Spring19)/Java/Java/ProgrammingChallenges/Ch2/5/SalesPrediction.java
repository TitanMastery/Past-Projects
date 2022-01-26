public class SalesPrediction{
	public static void calc(){
		double totalSales=4600000.00;
		double percent=0.62;
		double income=totalSales*percent;
		System.out.println("$"+income);
	}
	public static void main(String[] args){
		calc();
	}
}