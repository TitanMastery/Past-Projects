import javax.swing.JOptionPane;

public class StarPattern{
	public static void star(){
		int mStars=Integer.parseInt(JOptionPane.showInputDialog("How many stars?"));
		String pString;
		int stars=1;
		int spaces=mStars/2;
		int spMod=-1;
		int stMod=2;
		while(stars>0){
			pString="";
			for(int i = spaces;i>0;i--){
				pString+=" ";
			}
			for(int i = stars;i>0;i--){
				pString+="*";
			}
			if(stars==mStars){
				stMod=-2;
				spMod=1;
			}
			stars+=stMod;
			spaces+=spMod;
			System.out.println(pString);
		}
	}
	public static void main(String[] args){
		star();
	}
}