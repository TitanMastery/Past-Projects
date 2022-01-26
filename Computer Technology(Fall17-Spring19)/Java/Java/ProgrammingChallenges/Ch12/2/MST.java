import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class MST extends JFrame{
	private JPanel panel;
	private JLabel label;
	private JTextField field;
	private JLabel cLabel;
	private JTextField cField;
	private JLabel sLabel;
	private JTextField sField;
	private JLabel tLabel;
	private JTextField tField;
	private JButton button;
	private final double COUNTY=0.02;
	private final double STATE=0.04;
	private final int WIDTH=300;
	private final int HEIGHT=250;
	
	public MST(){
		setTitle("Monthly Sales Tax");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	private void buildPanel(){
		panel=new JPanel();
		panel.setLayout(null);
		
		label=new JLabel("Total Monthly Sales:");
		label.setBounds(10,10,150,24);
		panel.add(label);
		
		field=new JTextField();
		field.setBounds(170,10,100,24);
		field.setHorizontalAlignment(JTextField.RIGHT);
		panel.add(field);
		
		button=new JButton("Calculate");
		button.setBounds(80,50,100,24);
		button.addActionListener(new ButtonListener());
		panel.add(button);
		
		cLabel=new JLabel("County Sales Tax:");
		cLabel.setBounds(10,90,150,24);
		panel.add(cLabel);
		
		cField=new JTextField();
		cField.setBounds(170,90,100,24);
		cField.setHorizontalAlignment(JTextField.RIGHT);
		cField.setEditable(false);
		panel.add(cField);
		
		sLabel=new JLabel("State Sales Tax:");
		sLabel.setBounds(10,130,150,24);
		panel.add(sLabel);
		
		sField=new JTextField();
		sField.setBounds(170,130,100,24);
		sField.setHorizontalAlignment(JTextField.RIGHT);
		sField.setEditable(false);
		panel.add(sField);
		
		tLabel=new JLabel("Total Sales Tax:");
		tLabel.setBounds(10,170,150,24);
		panel.add(tLabel);
		
		tField=new JTextField();
		tField.setBounds(170,170,100,24);
		tField.setHorizontalAlignment(JTextField.RIGHT);
		tField.setEditable(false);
		panel.add(tField);
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double sales=Double.parseDouble(field.getText());
			double cTax=sales*COUNTY;
			double sTax=sales*STATE;
			double tTax=cTax+sTax;
			DecimalFormat dollar=new DecimalFormat("$0.00");
			cField.setText(dollar.format(cTax));
			sField.setText(dollar.format(sTax));
			tField.setText(dollar.format(tTax));
		}
	}
	public static void main(String[] args){
		new MST();
	}
}