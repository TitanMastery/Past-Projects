import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MEB extends JFrame{
	private JPanel panel;
	private JLabel title,pic;
	private JTextField input,output;
	private JButton enter;
	
	private final int WIDTH=330;
	private final int HEIGHT=290;
	
	private final String[] responses={"Ask Again Later","Better Not Tell You Now","Concentrate and Ask Again","Don't Count on It","It Is Certain","Most Likely","My Reply is No","My Sources Say No","No","Outlook Good","Outlook Not So Good","Reply Hazy, Try Again","Signs Point to Yes","Yes","Yes, Definitely","You May Rely On It"};
	private final Random rand=new Random();
	
	public MEB(){
		setTitle("Magic 8 Ball");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	private void buildPanel(){
		panel=new JPanel();
		panel.setBackground(Color.BLACK);
		
		title=new JLabel("Ask The Magic 8 Ball A Question If You Dare");
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setForeground(Color.WHITE);
		panel.add(title);
		
		pic=new JLabel();
		pic.setIcon(new ImageIcon("8ball.png"));
		pic.setHorizontalAlignment(JLabel.CENTER);
		panel.add(pic);
		
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
				output.setText(responses[rand.nextInt(16)]);
				input.setText("");
			}
		}
	}
	
	public static void main(String[] args){
		new MEB();
	}
}