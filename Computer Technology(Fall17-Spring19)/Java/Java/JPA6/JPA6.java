//Created by David Helmick on 4/17/18
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPA6 extends JFrame{
	private JPanel nPanel;
	private JPanel cPanel;
	private JPanel sPanel;
	private JLabel title;
	private JLabel fLabel;
	private JLabel cLabel;
	private JTextField fField;
	private JTextField cField;
	private JButton calc;
	
	private final int WIDTH=200;
	private final int HEIGHT=150;
	//This height does not work properly on Windows 10. 
	//It should be adjusted to 162 for best results.
	
	public JPA6(){
		setTitle("Degrees F to C");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildNPanel();
		add(nPanel,BorderLayout.NORTH);
		buildCPanel();
		add(cPanel);
		buildSPanel();
		add(sPanel,BorderLayout.SOUTH);
		setVisible(true);
	}
	
	private void buildNPanel(){
		nPanel=new JPanel();
		nPanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));
		
		title=new JLabel("Degrees Fahrenheit to Celsius");
		nPanel.add(title);
	}
	private void buildCPanel(){
		cPanel=new JPanel();
		cPanel.setLayout(new FlowLayout(FlowLayout.LEFT,3,3));
		
		fLabel=new JLabel("Degrees Fahrenheit:");
		cPanel.add(fLabel);
		
		fField=new JTextField(5);
		cPanel.add(fField);
		
		cLabel=new JLabel("Degrees Celsius:");
		cPanel.add(cLabel);
		
		cField=new JTextField(5);
		cField.setEditable(false);
		cPanel.add(cField);
	}
	private void buildSPanel(){
		sPanel=new JPanel();
		sPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		calc=new JButton("Calculate");
		calc.addActionListener(new CalcListener());
		sPanel.add(calc);
	}
	
	private class CalcListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double f=Double.parseDouble(fField.getText());
			double c=5*(f-32)/9;
			cField.setText(String.format("%,.2f",c));
		}
	}
	
	public static void main(String[] args){
		new JPA6();
	}
}