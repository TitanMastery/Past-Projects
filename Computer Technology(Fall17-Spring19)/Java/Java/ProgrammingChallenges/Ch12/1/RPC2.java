import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RPC2 extends JFrame{
	private JLabel costLabel;
	private JLabel markupLabel;
	private JPanel panel;
	private JTextField costField;
	private JTextField markupField;
	private JButton calc;
	private JLabel retailLabel;
	private JTextField retailField;
	
	private final int WIDTH=180;
	private final int HEIGHT=160;
	
	public RPC2(){
		setTitle("Retail Price Calculator");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	public void buildPanel(){
		panel=new JPanel();
		panel.setBackground(Color.CYAN);
		
		costLabel=new JLabel("Cost:");
		panel.add(costLabel);
		
		costField=new JTextField(7);
		costField.setHorizontalAlignment(JTextField.RIGHT);
		panel.add(costField);
		
		markupLabel=new JLabel("Markup:");
		panel.add(markupLabel);
		
		markupField=new JTextField(7);
		markupField.setHorizontalAlignment(JTextField.RIGHT);
		panel.add(markupField);
		
		calc=new JButton("Calculate");
		calc.addActionListener(new calcListener());
		panel.add(calc);
		
		retailLabel=new JLabel("Retail Price: ");
		panel.add(retailLabel);
		
		retailField=new JTextField(7);
		retailField.setEditable(false);
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
		new RPC2();
	}
}