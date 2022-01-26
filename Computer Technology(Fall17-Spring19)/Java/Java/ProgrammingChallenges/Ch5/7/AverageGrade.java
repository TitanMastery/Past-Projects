import javax.swing.JOptionPane;

public class AverageGrade{
	public static char determineGrade(double score){
		if(score>=90){
			return 'A';
		}
		else if(score>=80){
			return 'B';
		}
		else if(score>=70){
			return 'C';
		}
		else if(score>=60){
			return 'D';
		}
		else{
			return 'F';
		}
	}
	public static void main(String[] args){
		System.out.println("\nScore\t\tGrade");
		System.out.println("---------------------");
		double avg=0;
		for(int i=1;i<=5;i++){
			double score=Double.parseDouble(JOptionPane.showInputDialog("What is the score of test "+i+"?"));
			avg+=score;
			char letter=determineGrade(score);
			System.out.println(score+"%\t\t"+letter);
		}
		avg/=5;
		System.out.printf("\n\nThe average of the test scores is %.2f",avg);
		System.out.print("%\n");
	}
}