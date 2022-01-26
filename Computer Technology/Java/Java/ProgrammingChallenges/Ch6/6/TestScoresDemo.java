import javax.swing.JOptionPane;

public class TestScoresDemo{
	public static void main(String[] args){
		TestScores test=new TestScores();
		test.setTest1(Double.parseDouble(JOptionPane.showInputDialog("What is your first test score?")));
		test.setTest2(Double.parseDouble(JOptionPane.showInputDialog("What is your second test score?")));
		test.setTest3(Double.parseDouble(JOptionPane.showInputDialog("What is your third test score?")));
		JOptionPane.showMessageDialog(null,"Your average test score is "+test.getAverage()+"%");
	}
}