import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NA extends JFrame{
	private JPanel panel;
	private JLabel title;
	private JButton enter;
	
	private JLabel nameLabel;
	private JLabel addressLabel;
	private JLabel address2Label;
	private JLabel cityLabel;
	private JLabel stateLabel;
	private JLabel zipLabel;
	
	private JTextField nameField;
	private JTextField addressField;
	private JTextField address2Field;
	private JTextField cityField;
	private JComboBox stateCombo;
	private JTextField zipField;

	private final String[] states={"(Select One)","Iowa","Illinois","Kentucky","Tennessee","Arkansas","Oklahoma","Kansas","Nebraska","Missouri"};
	
	private final int WIDTH=300;
	private final int HEIGHT=235;
	
	public NA(){
		setTitle("Personal Info");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		title=new JLabel("Personal Information");
		title.setHorizontalAlignment(JLabel.CENTER);
		add(title,BorderLayout.NORTH);
		enter=new JButton("Enter Info");
		enter.addActionListener(new EnterListener());
		add(enter,BorderLayout.SOUTH);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	private void buildPanel(){
		panel=new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		nameLabel=new JLabel("Name:");
		panel.add(nameLabel);
		
		nameField=new JTextField(20);
		panel.add(nameField);
		
		addressLabel=new JLabel("Address:");
		panel.add(addressLabel);
		
		addressField=new JTextField(19);
		panel.add(addressField);
		
		address2Label=new JLabel("Address 2:");
		panel.add(address2Label);
		
		address2Field=new JTextField(18);
		panel.add(address2Field);
		
		cityLabel=new JLabel("City:");
		panel.add(cityLabel);
		
		cityField=new JTextField(21);
		panel.add(cityField);
		
		stateLabel=new JLabel("State:");
		panel.add(stateLabel);
		
		stateCombo=new JComboBox<>(states);
		panel.add(stateCombo);
		
		zipLabel=new JLabel("Zip:");
		panel.add(zipLabel);
		
		zipField=new JTextField(9);
		panel.add(zipField);
	}
	
	private class EnterListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(null,nameField.getText()+"\n"+addressField.getText()+"\n"+address2Field.getText()+"\n"+cityField.getText()+"\n"+stateCombo.getSelectedItem()+"\n"+zipField.getText());
		}
	}
	
	public static void main(String[] args){
		new NA();
	}
}