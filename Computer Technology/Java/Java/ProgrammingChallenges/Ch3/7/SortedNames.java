import javax.swing.JOptionPane;

public class SortedNames{
	public static void calc(){
		String n1=JOptionPane.showInputDialog("What is the first name?");
		String n2=JOptionPane.showInputDialog("What is the second name?");
		String n3=JOptionPane.showInputDialog("What is the third name?");
		if(n1.compareTo(n2)<0&&n1.compareTo(n3)<0){
			System.out.println(n1);
			if(n2.compareTo(n3)<0){
				System.out.println(n2);
				System.out.println(n3);
			}
			else{
				System.out.println(n3);
				System.out.println(n2);
			}
		}
		else if(n2.compareTo(n1)<0&&n2.compareTo(n3)<0){
			System.out.println(n2);
			if(n1.compareTo(n3)<0){
				System.out.println(n1);
				System.out.println(n3);
			}
			else{
				System.out.println(n3);
				System.out.println(n1);
			}
		}
		else if(n3.compareTo(n1)<0&&n3.compareTo(n2)<0){
			System.out.println(n3);
			if(n1.compareTo(n2)<0){
				System.out.println(n1);
				System.out.println(n2);
			}
			else{
				System.out.println(n2);
				System.out.println(n1);
			}
		}
	}
	public static void main(String[] args){
		calc();
	}
}