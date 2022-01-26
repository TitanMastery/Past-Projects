import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class MST2 extends JFrame{
	private JPanel panel;
	private JPanel nPanel;
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
	
	public MST2(){
		setTitle("Monthly Sales Tax");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(nPanel, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		pack();
		setVisible(true);
	}
	private void buildPanel(){
		panel=new JPanel();
		nPanel=new JPanel();
		
		label=new JLabel("Total Monthly Sales:");
		nPanel.add(label);
		
		field=new JTextField(7);
		field.setHorizontalAlignment(JTextField.RIGHT);
		nPanel.add(field);
		
		button=new JButton("Calculate");
		button.addActionListener(new ButtonListener());
		add(button, BorderLayout.SOUTH);
		
		cLabel=new JLabel("County Sales Tax:");
		panel.add(cLabel);
		
		cField=new JTextField(7);
		cField.setHorizontalAlignment(JTextField.RIGHT);
		cField.setEditable(false);
		panel.add(cField);
		
		sLabel=new JLabel("State Sales Tax:");
		panel.add(sLabel);
		
		sField=new JTextField(7);
		sField.setHorizontalAlignment(JTextField.RIGHT);
		sField.setEditable(false);
		panel.add(sField);
		
		tLabel=new JLabel("Total Sales Tax:");
		panel.add(tLabel);
		
		tField=new JTextField(7);
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
		new MST2();
	}
}