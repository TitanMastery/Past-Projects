import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class PT extends JFrame{
	private JPanel panel;
	private JLabel acLabel;
	private JLabel asLabel;
	private JLabel taLabel;
	private JTextField acField;
	private JTextField asField;
	private JTextField taField;
	private JButton calc;
	private final int WIDTH=300;
	private final int HEIGHT=200;
	
	public PT(){
		setTitle("Property Tax");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	public void buildPanel(){
		panel=new JPanel();
		panel.setLayout(null);
		
		acLabel=new JLabel("Actual Value:");
		acLabel.setBounds(10,10,150,24);
		panel.add(acLabel);
		
		acField=new JTextField();
		acField.setBounds(170,10,100,24);
		acField.setHorizontalAlignment(JTextField.RIGHT);
		panel.add(acField);
		
		calc=new JButton("Calculate");
		calc.setBounds(80,50,100,24);
		calc.addActionListener(new CalcListener());
		panel.add(calc);
		
		asLabel=new JLabel("Assessment Value:");
		asLabel.setBounds(10,90,150,24);
		panel.add(asLabel);
		
		asField=new JTextField();
		asField.setBounds(170,90,100,24);
		asField.setEditable(false);
		asField.setHorizontalAlignment(JTextField.RIGHT);
		panel.add(asField);
		
		taLabel=new JLabel("Property Tax:");
		taLabel.setBounds(10,130,150,24);
		panel.add(taLabel);
		
		taField=new JTextField();
		taField.setBounds(170,130,100,24);
		taField.setEditable(false);
		taField.setHorizontalAlignment(JTextField.RIGHT);
		panel.add(taField);
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
		new PT();
	}
}