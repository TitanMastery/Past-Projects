import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JA extends JFrame{
	private JPanel left;
	private JPanel right;
	private JLabel title;
	
	private JLabel laborLabel;
	private JLabel partsLabel;
	private JLabel totalLabel;
	private JTextField laborField;
	private JTextField partsField;
	private JTextField totalField;
	private JButton calc;
	
	private JCheckBox oil;
	private JCheckBox lube;
	private JCheckBox radiator;
	private JCheckBox transmission;
	private JCheckBox inspection;
	private JCheckBox muffler;
	private JCheckBox tire;
	
	public JA(){
		setTitle("Joe's Automotive");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildLeft();
		buildRight();
		title=new JLabel("Joe's Automotive");
		title.setHorizontalAlignment(JLabel.CENTER);
		add(title,BorderLayout.NORTH);
		add(left,BorderLayout.WEST);
		add(right,BorderLayout.EAST);
		pack();
		setVisible(true);
	}
	
	private void buildLeft(){
		left=new JPanel();
		left.setBorder(BorderFactory.createTitledBorder("Services"));
		left.setLayout(new GridLayout(7,0));
		
		oil=new JCheckBox("Oil Change--$26.00");
		left.add(oil);
		lube=new JCheckBox("Lube Job--$18.00");
		left.add(lube);
		radiator=new JCheckBox("Radiator Flush--$30.00");
		left.add(radiator);
		transmission=new JCheckBox("Transmission Flush--$80.00");
		left.add(transmission);
		inspection=new JCheckBox("Inspection--$15.00");
		left.add(inspection);
		muffler=new JCheckBox("Muffler Replacement--$100.00");
		left.add(muffler);
		tire=new JCheckBox("Tire Rotation--$20.00");
		left.add(tire);
	}
	private void buildRight(){
		right=new JPanel();
		right.setLayout(new GridLayout(6,0));
		
		JPanel subpanel=new JPanel();
		partsLabel=new JLabel("Extra Part Costs:");
		subpanel.add(partsLabel);
		partsField=new JTextField(7);
		subpanel.add(partsField);
		right.add(subpanel);
		
		JPanel subpanel2=new JPanel();
		laborLabel=new JLabel("Labor Hours($20/Hour):");
		subpanel2.add(laborLabel);
		laborField=new JTextField(7);
		subpanel2.add(laborField);
		right.add(subpanel2);
		
		right.add(new JLabel());
		
		JPanel subpanel3=new JPanel();
		totalLabel=new JLabel("Total Cost:");
		subpanel3.add(totalLabel);
		totalField=new JTextField(7);
		totalField.setEditable(false);
		subpanel3.add(totalField);
		right.add(subpanel3);
		
		right.add(new JLabel());
		
		calc=new JButton("Calculate");
		calc.addActionListener(new CalcListener());
		right.add(calc);
	}
	
	private class CalcListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double total=0;
			if(oil.isSelected()){
				total+=26.00;
			}
			if(lube.isSelected()){
				total+=18.00;
			}
			if(radiator.isSelected()){
				total+=30.00;
			}
			if(transmission.isSelected()){
				total+=80.00;
			}
			if(inspection.isSelected()){
				total+=15.00;
			}
			if(muffler.isSelected()){
				total+=100.00;
			}
			if(tire.isSelected()){
				total+=20.00;
			}
			total+=Double.parseDouble(partsField.getText());
			total+=Double.parseDouble(laborField.getText())*20.00;
			totalField.setText(String.format("$%,.2f",total));
		}
	}
	
	public static void main(String[] args){
		new JA();
	}
}