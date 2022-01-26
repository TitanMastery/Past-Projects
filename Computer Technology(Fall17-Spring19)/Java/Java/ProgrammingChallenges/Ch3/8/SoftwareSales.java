import javax.swing.JOptionPane;

public class SoftwareSales{
	public static void calc(){
		double dis,total;
		int q=Integer.parseInt(JOptionPane.showInputDialog("How many packages are you going to purchase?"));
		if(q>99){
			dis=.5;
			total=q*(99-99*dis);
			System.out.println("You want "+q+" packages");
			System.out.println("Each package is $99");
			System.out.println("You get a "+(dis*100)+"% discount");
			System.out.printf("Your total is $%,.2f\n",total);
		}
		else if(q>49){
			dis=.4;
			total=q*(99-99*dis);
			System.out.println("You want "+q+" packages");
			System.out.println("Each package is $99");
			System.out.println("You get a "+(dis*100)+"% discount");
			System.out.printf("Your total is $%,.2f\n",total);
		}
		else if(q>19){
			dis=.3;
			total=q*(99-99*dis);
			System.out.println("You want "+q+" packages");
			System.out.println("Each package is $99");
			System.out.println("You get a "+(dis*100)+"% discount");
			System.out.printf("Your total is $%,.2f\n",total);
		}
		else if(q>9){
			dis=.2;
			total=q*(99-99*dis);
			System.out.println("You want "+q+" packages");
			System.out.println("Each package is $99");
			System.out.println("You get a "+(dis*100)+"% discount");
			System.out.printf("Your total is $%,.2f\n",total);
		}
		else{
			total=q*99;
			System.out.println("You want "+q+" packages");
			System.out.println("Each package is $99");
			System.out.printf("Your total is $%,.2f\n",total);
		}
	}
	public static void main(String[] args){
		calc();
	}
}