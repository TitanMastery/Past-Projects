import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TTF extends JFrame{
	private JPanel panel;
	private JLabel title;
	private JTextField input,output;
	private JButton enter;
	
	private final int WIDTH=330;
	private final int HEIGHT=150;
	
	private final String[] responses={"Yes","No","Maybe So","Of Course","Never","Idk","Who Cares","Whatever","Nope","Possibly"};
	private final Random rand=new Random();
	
	public TTF(){
		setTitle("Tell the Future");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		title=new JLabel("Enter a Yes or No Question to Predict Your Future");
		title.setHorizontalAlignment(JLabel.CENTER);
		add(title,BorderLayout.NORTH);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	private void buildPanel(){
		panel=new JPanel();
		
		input=new JTextField(22);
		input.setHorizontalAlignment(JTextField.CENTER);
		panel.add(input);
		
		enter=new JButton("Enter");
		enter.addActionListener(new EventButtonListener());
		panel.add(enter);
		
		output=new JTextField(22);
		output.setEditable(false);
		output.setHorizontalAlignment(JTextField.CENTER);
		panel.add(output);
	}
	
	private class EventButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(input.getText().equals("")){
				output.setText("");
				JOptionPane.showMessageDialog(null,"Please enter a question","Error",JOptionPane.ERROR_MESSAGE);
			}
			else{
				output.setText(responses[rand.nextInt(10)]);
				input.setText("");
			}
		}
	}
	
	public static void main(String[] args){
		new TTF();
	}
}