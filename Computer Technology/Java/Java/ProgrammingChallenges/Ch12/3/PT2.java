import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class PT2 extends JFrame{
	private JPanel panel0;
	private JPanel panel1;
	private JPanel panel2;
	private JLabel acLabel;
	private JLabel asLabel;
	private JLabel taLabel;
	private JTextField acField;
	private JTextField asField;
	private JTextField taField;
	private JButton calc;
	private final int WIDTH=250;
	private final int HEIGHT=220;
	
	public PT2(){
		setTitle("Property Tax");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,1));
		buildPanel();
		add(panel0);
		add(panel1);
		add(panel2);
		setVisible(true);
	}
	
	public void buildPanel(){
		panel0=new JPanel();
		panel1=new JPanel();
		panel2=new JPanel();
		
		acLabel=new JLabel("Actual Value:");
		panel0.add(acLabel);
		
		acField=new JTextField(7);
		acField.setHorizontalAlignment(JTextField.RIGHT);
		panel0.add(acField);
		
		calc=new JButton("Calculate");
		calc.addActionListener(new CalcListener());
		panel1.add(calc);
		
		asLabel=new JLabel("Assessment Value:");
		panel2.add(asLabel);
		
		asField=new JTextField(7);
		asField.setEditable(false);
		asField.setHorizontalAlignment(JTextField.RIGHT);
		panel2.add(asField);
		
		taLabel=new JLabel("Property Tax:");
		panel2.add(taLabel);
		
		taField=new JTextField(7);
		taField.setEditable(false);
		taField.setHorizontalAlignment(JTextField.RIGHT);
		panel2.add(taField);
	}
	
	private class CalcListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double actual=Double.parseDouble(acField.getText());
			double assessment=actual*.6;
			double propertyTax=assessment/100*.64;
			DecimalFormat dollar=new DecimalFormat("$0.00");
			asField.setText(dollar.format(assessment));
			taField.setText(dollar.format(propertyTax));
		}
	}
	
	public static void main(String[] args){
		new PT2();
	}
}