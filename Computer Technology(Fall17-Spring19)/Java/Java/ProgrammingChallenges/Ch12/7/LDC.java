import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LDC extends JFrame{
	private JPanel panelWest;
	private JPanel panelEast;
	
	private JPanel subpanel;
	private JPanel subpanel2;
	
	private JLabel minutesLabel;
	private JTextField minutesField;
	private JLabel resultsLabel;
	private JTextField resultsField;
	
	private ButtonGroup rc;
	private JRadioButton daytime,evening,offpeak;
	
	private JButton calc;
	
	public LDC(){
		setTitle("Long Distance Calls");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panelEast,BorderLayout.EAST);
		add(panelWest);
		calc=new JButton("Calculate");
		calc.addActionListener(new CalcListener());
		add(calc,BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
	
	private void buildPanel(){
		panelEast=new JPanel();
		panelEast.setLayout(new GridLayout(2,0));
		
		subpanel=new JPanel();
		minutesLabel=new JLabel("Minutes:");
		subpanel.add(minutesLabel);
		minutesField=new JTextField(7);
		subpanel.add(minutesField);
		panelEast.add(subpanel);
		
		subpanel2=new JPanel();
		resultsLabel=new JLabel("Charge:");
		subpanel2.add(resultsLabel);
		resultsField=new JTextField(7);
		resultsField.setEditable(false);
		subpanel2.add(resultsField);
		panelEast.add(subpanel2);
		
		panelWest=new JPanel();
		panelWest.setLayout(new GridLayout(3,0));
		panelWest.setBorder(BorderFactory.createTitledBorder("Rate Category"));
		daytime=new JRadioButton("Daytime(6:00-17:59)",true);
		panelWest.add(daytime);
		evening=new JRadioButton("Evening(18:00-23:59)");
		panelWest.add(evening);
		offpeak=new JRadioButton("Off-Peak(0:00-5:59)");
		panelWest.add(offpeak);
		rc=new ButtonGroup();
		rc.add(daytime);
		rc.add(evening);
		rc.add(offpeak);
	}
	
	private class CalcListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double rate=0.07;
			double minutes=Double.parseDouble(minutesField.getText());
			if(daytime.isSelected()){
				rate=0.07;
			}
			else if(evening.isSelected()){
				rate=0.12;
			}
			else if(offpeak.isSelected()){
				rate=0.05;
			}
			resultsField.setText(String.format("$%,.2f",rate*minutes));
		}
	}
	
	public static void main(String[] args){
		new LDC();
	}
}