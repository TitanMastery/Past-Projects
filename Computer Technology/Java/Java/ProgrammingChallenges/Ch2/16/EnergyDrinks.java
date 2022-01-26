public class EnergyDrinks{
	public static void main(String[] args){
		int customers=12467;
		double weekly=0.14;
		double citrus=0.64;
		weekly*=customers;
		citrus*=weekly;
		System.out.println(weekly+" customers purchase energy drinks weekly");
		System.out.println(citrus+" weekly energy drink consumers prefer citrus flavors");
	}
}