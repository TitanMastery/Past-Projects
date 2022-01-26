import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TR extends JFrame{
	private JPanel panelWest,panelEast;
	private JButton calc;
	private JLabel atpLabel,natLabel,ctpLabel,nctLabel,gatrLabel,natrLabel,gctrLabel,nctrLabel,gtrLabel,ntrLabel;
	private JTextField atpField,natField,ctpField,nctField,gatrField,natrField,gctrField,nctrField,gtrField,ntrField;
	
	private final double PERCENT=0.20;
	
	public TR(){
		setTitle("Theater Revenue");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanelWest();
		buildPanelEast();
		add(panelWest,BorderLayout.WEST);
		add(panelEast,BorderLayout.EAST);
		pack();
		setVisible(true);
	}
	
	private void buildPanelWest(){
		panelWest=new JPanel();
		panelWest.setLayout(new GridLayout(6,0));
		
		JPanel subpanel1=new JPanel();
		atpLabel=new JLabel("Adult Ticket Price:");
		subpanel1.add(atpLabel);
		atpField=new JTextField(7);
		subpanel1.add(atpField);
		panelWest.add(subpanel1);
		
		JPanel subpanel2=new JPanel();
		natLabel=new JLabel("Adult Tickets Sold:");
		subpanel2.add(natLabel);
		natField=new JTextField(7);
		subpanel2.add(natField);
		panelWest.add(subpanel2);
		
		JPanel subpanel3=new JPanel();
		ctpLabel=new JLabel("Child Ticket Price:");
		subpanel3.add(ctpLabel);
		ctpField=new JTextField(7);
		subpanel3.add(ctpField);
		panelWest.add(subpanel3);
		
		JPanel subpanel4=new JPanel();
		nctLabel=new JLabel("Child Tickets Sold:");
		subpanel4.add(nctLabel);
		nctField=new JTextField(7);
		subpanel4.add(nctField);
		panelWest.add(subpanel4);
		
		panelWest.add(new JLabel());
		
		calc=new JButton("Calculate");
		calc.addActionListener(new CalcListener());
		panelWest.add(calc);
		
		panelEast=new JPanel();
		panelEast.setLayout(new GridLayout(6,0));
	}
	
	private void buildPanelEast(){
		panelEast=new JPanel();
		panelEast.setLayout(new GridLayout(6,0));
		panelEast.setBorder(BorderFactory.createTitledBorder("Revenue"));
		
		JPanel subpanel1=new JPanel();
		gatrLabel=new JLabel("Gross Adult Ticket:");
		subpanel1.add(gatrLabel);
		gatrField=new JTextField(7);
		gatrField.setEditable(false);
		subpanel1.add(gatrField);
		panelEast.add(subpanel1);
		
		JPanel subpanel2=new JPanel();
		natrLabel=new JLabel("Net Adult Ticket:");
		subpanel2.add(natrLabel);
		natrField=new JTextField(7);
		natrField.setEditable(false);
		subpanel2.add(natrField);
		panelEast.add(subpanel2);
		
		JPanel subpanel3=new JPanel();
		gctrLabel=new JLabel("Gross Child Ticket:");
		subpanel3.add(gctrLabel);
		gctrField=new JTextField(7);
		gctrField.setEditable(false);
		subpanel3.add(gctrField);
		panelEast.add(subpanel3);
		
		JPanel subpanel4=new JPanel();
		nctrLabel=new JLabel("Net Child Ticket:");
		subpanel4.add(nctrLabel);
		nctrField=new JTextField(7);
		nctrField.setEditable(false);
		subpanel4.add(nctrField);
		panelEast.add(subpanel4);
		
		JPanel subpanel5=new JPanel();
		gtrLabel=new JLabel("Gross Total:");
		subpanel5.add(gtrLabel);
		gtrField=new JTextField(7);
		gtrField.setEditable(false);
		subpanel5.add(gtrField);
		panelEast.add(subpanel5);
		
		JPanel subpanel6=new JPanel();
		ntrLabel=new JLabel("Net Total:");
		subpanel6.add(ntrLabel);
		ntrField=new JTextField(7);
		ntrField.setEditable(false);
		subpanel6.add(ntrField);
		panelEast.add(subpanel6);
	}
	
	private class CalcListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double gatr,natr,gctr,nctr,gtr,ntr;
			double atp=Double.parseDouble(atpField.getText());
			int nat=Integer.parseInt(natField.getText());
			double ctp=Double.parseDouble(ctpField.getText());
			int nct=Integer.parseInt(nctField.getText());
			gatr=atp*nat;
			gatrField.setText(String.format("$%,.2f",gatr));
			natr=gatr*PERCENT;
			natrField.setText(String.format("$%,.2f",natr));
			gctr=ctp*nct;
			gctrField.setText(String.format("$%,.2f",gctr));
			nctr=gctr*PERCENT;
			nctrField.setText(String.format("$%,.2f",nctr));
			gtr=gatr+gctr;
			gtrField.setText(String.format("$%,.2f",gtr));
			ntr=natr+nctr;
			ntrField.setText(String.format("$%,.2f",ntr));
		}
	}
	
	public static void main(String[] args){
		new TR();
	}
}