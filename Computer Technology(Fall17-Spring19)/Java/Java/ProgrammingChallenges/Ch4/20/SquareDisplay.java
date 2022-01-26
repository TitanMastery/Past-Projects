import javax.swing.JOptionPane;

public class SquareDisplay{
	public static void calc(){
		int input=Integer.parseInt(JOptionPane.showInputDialog("Enter a positive int no greater than 15"));
		if(input>15||input<1){
			JOptionPane.showMessageDialog(null,"Enter a positive whole number less than 16","Invalid value",JOptionPane.ERROR_MESSAGE);
			calc();
		}
		else{
			for(int i=1;i<=input;i++){
				String line="";
				for(int x=1;x<=input;x++){
					line+="X ";
				}
				System.out.println(line);
			}
		}
	}
	public static void main(String[] args){
		calc();
	}
}