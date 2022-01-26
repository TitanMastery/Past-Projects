import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RPC extends JFrame{
	private JLabel costLabel;
	private JLabel markupLabel;
	private JPanel panel;
	private JTextField costField;
	private JTextField markupField;
	private JButton calc;
	private JLabel retailLabel;
	private JTextField retailField;
	
	private final int WIDTH=300;
	private final int HEIGHT=210;
	
	public RPC(){
		setTitle("Retail Price Calculator");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	public void buildPanel(){
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.CYAN);
		
		costLabel=new JLabel("Cost:");
		costLabel.setBounds(10,10,150,24);
		panel.add(costLabel);
		
		costField=new JTextField();
		costField.setBounds(170,10,100,24);
		costField.setHorizontalAlignment(JTextField.RIGHT);
		panel.add(costField);
		
		markupLabel=new JLabel("Markup Percentage:");
		markupLabel.setBounds(10,50,150,24);
		panel.add(markupLabel);
		
		markupField=new JTextField();
		markupField.setBounds(170,50,100,24);
		markupField.setHorizontalAlignment(JTextField.RIGHT);
		panel.add(markupField);
		
		calc=new JButton("Calculate");
		calc.setBounds(80,90,100,24);
		calc.addActionListener(new calcListener());
		panel.add(calc);
		
		retailLabel=new JLabel("Retail Price: ");
		retailLabel.setBounds(10,130,150,24);
		panel.add(retailLabel);
		
		retailField=new JTextField();
		retailField.setEditable(false);
		retailField.setBounds(170,130,100,24);
		retailField.setHorizontalAlignment(JTextField.RIGHT);
		panel.add(retailField);
	}
	private class calcListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double cost=Double.parseDouble(costField.getText());
			double markup=Double.parseDouble(markupField.getText());
			double price=cost+cost*markup/100.0;
			costField.setText(String.format("$%,.2f",cost));
			markupField.setText(String.format("$%,.2f",markup));
			retailField.setText(String.format("$%,.2f",price));
		}
	}
	public static void main(String[] args){
		new RPC();
	}
}