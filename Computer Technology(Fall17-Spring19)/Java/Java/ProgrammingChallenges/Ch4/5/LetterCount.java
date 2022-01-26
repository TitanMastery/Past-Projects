import javax.swing.JOptionPane;

public class LetterCount{
	public static void calc(){
		String text=JOptionPane.showInputDialog("Enter a string of text").toLowerCase();
		char letter=JOptionPane.showInputDialog("Enter a character").toLowerCase().charAt(0);
		int total=0;
		for(int i=0;i<=(text.length()-1);i++){
			if(letter==text.charAt(i)){
				total++;
			}
		}
		System.out.println("There are "+total+" instances of "+letter+" in "+text);
	}
	public static void main(String[] args){
		calc();
	}
}