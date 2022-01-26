//David Helmick 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class WeeklyPay extends JFrame{
	//window size settings
	private final int WIDTH=250;
	private final int HEIGHT=225;
	
	//panels
	private JPanel panelL;
	private JPanel panelR;
	
	//labels
	private JLabel fName;
	private JLabel lName;
	private JLabel ssn;
	private JLabel hours;
	private JLabel prc;
	
	//textfields
	private JTextField fNameInput;
	private JTextField lNameInput;
	private JTextField ssnInput;
	private JTextField hoursInput;
	
	//radio buttons w/ group
	private JRadioButton b1;
	private JRadioButton b2;
	private JRadioButton b3;
	private JRadioButton b4;
	private JRadioButton b5;
	private ButtonGroup group;
	
	//buttons
	private JButton calc;
	
	//Personal data vars
	private String name;
	private String socialSecutity;
	private double hoursWorked;
	private double hourlyWage;
	private double grossPay;
	private double insurance;
	private double taxes;
	private double netPay;
	
	//Puts together window
	public WeeklyPay(){
		setTitle("Weekly Pay Calculator");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,2));
		buildPanelL();
		buildPanelR();
		add(panelL);
		add(panelR);
		setVisible(true);
	}
	//Builds left half of window
	public void buildPanelL(){
		panelL=new JPanel();
		panelL.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		fName=new JLabel("First Name: ");
		fName.setBorder(BorderFactory.createEmptyBorder(0,0,4,0));
		panelL.add(fName);
		
		lName=new JLabel("Last Name: ");
		lName.setBorder(BorderFactory.createEmptyBorder(0,0,4,0));
		panelL.add(lName);
		
		ssn=new JLabel("Social Security: ");
		ssn.setBorder(BorderFactory.createEmptyBorder(0,0,4,0));
		panelL.add(ssn);
		
		hours=new JLabel("Hours Worked: ");
		hours.setBorder(BorderFactory.createEmptyBorder(0,0,4,0));
		panelL.add(hours);
		
		prc=new JLabel("Pay Rate Code: ");
		panelL.add(prc);
	}
	//Builds the right half of window
	public void buildPanelR(){
		panelR=new JPanel();
		panelR.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		fNameInput=new JTextField(10);
		panelR.add(fNameInput);
		
		lNameInput=new JTextField(10);
		panelR.add(lNameInput);
		
		ssnInput=new JTextField(10);
		panelR.add(ssnInput);
		
		hoursInput=new JTextField(10);
		panelR.add(hoursInput);
		
		b1=new JRadioButton("1", true);
		b2=new JRadioButton("2");
		b3=new JRadioButton("3");
		b4=new JRadioButton("4");
		b5=new JRadioButton("5");
		group=new ButtonGroup();
		group.add(b1);
		group.add(b2);
		group.add(b3);
		group.add(b4);
		group.add(b5);
		panelR.add(b1);
		panelR.add(b2);
		panelR.add(b3);
		panelR.add(b4);
		panelR.add(b5);
		
		calc=new JButton("Calculate");
		calc.addActionListener(new CalcListener());
		panelR.add(calc);
	}
	//Outputs data when button is clicked
	private class CalcListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(fNameInput.getText().equals("")||lNameInput.getText().equals("")||ssnInput.getText().equals("")||hoursInput.getText().equals("")||Double.parseDouble(hoursInput.getText())<0){
				JOptionPane.showMessageDialog(null,"Please fill out all fields completely","Error",JOptionPane.ERROR_MESSAGE);
			}
			else{
			name=fNameInput.getText()+" "+lNameInput.getText();
			socialSecutity=ssnInput.getText();
			hoursWorked=Double.parseDouble(hoursInput.getText());
			//converts pay rate code in hourly wage
			if(b2.isSelected()){
				hourlyWage=12.5;
			}
			else if(b3.isSelected()){
				hourlyWage=15;
			}
			else if(b4.isSelected()){
				hourlyWage=17.5;
			}
			else if(b5.isSelected()){
				hourlyWage=20;
			}
			else{
				hourlyWage=10;
			}
			//determines gross pay
			if(hoursWorked>40){
				grossPay=(40*hourlyWage)+((hoursWorked-40)*1.5*hourlyWage);
			}
			else{
				grossPay=(hoursWorked*hourlyWage);
			}
			insurance=grossPay*0.05;
			taxes=grossPay*0.10;
			netPay=grossPay-insurance-taxes;
			//outputs data and catches IOException for printwriter
			try{
				File outputFile=new File("../Results/paysheet.txt");
				PrintWriter output=new PrintWriter(outputFile);
				output.println(name);
				output.println(socialSecutity);
				output.println("");
				output.println("Hours Worked: \t\t"+hoursWorked);
				output.println(String.format("Hourly Wage: \t\t$%,.2f",hourlyWage));
				output.println(String.format("Gross Pay: \t\t$%,.2f",grossPay));
				output.println(String.format("Insurance Cost: \t$%,.2f",insurance));
				output.println(String.format("Taxes Deducted: \t$%,.2f",taxes));
				output.println(String.format("Net Pay: \t\t$%,.2f",netPay));
				output.close();
				JOptionPane.showMessageDialog(null,"Please open paysheet.txt for your weekly pay information.","Results",JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
			catch(FileNotFoundException x){
				
			}
			}
		}
	}
	//Opens window
	public static void main(String[] args){
		new WeeklyPay();
	}
}