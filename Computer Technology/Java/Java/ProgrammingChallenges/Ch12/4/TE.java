import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TE extends JFrame{
	private JPanel panel;
	private JLabel
	
	public TE(){
		setTitle("Travel Expenses");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	private void buildPanel(){
		
	}
	
	private class CalcListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
		}
	}
	
	public static void main(String[] args){
		new TE();
}