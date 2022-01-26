import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LT extends JFrame{
	private JPanel panel;
	private JLabel title;
	private JLabel image;
	private JTextField results;
	private JButton sinister;
	private JButton dexter;
	private JButton medium;
	private final int WIDTH=320;
	private final int HEIGHT=340;
	
	public LT(){
		setTitle("Latin Translator");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		title=new JLabel("Select one of the buttons for an English Translation");
		add(title, BorderLayout.NORTH);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	private void buildPanel(){
		panel=new JPanel();
		
		sinister=new JButton("Sinister");
		sinister.addActionListener(new ButtonListener());
		panel.add(sinister);
		
		medium=new JButton("Medium");
		medium.addActionListener(new ButtonListener());
		panel.add(medium);
		
		dexter=new JButton("Dexter");
		dexter.addActionListener(new ButtonListener());
		panel.add(dexter);
		
		image=new JLabel();
		image.setIcon(new ImageIcon("latin.png"));
		panel.add(image);
		
		results=new JTextField(7);
		results.setEditable(true);
		panel.add(results);
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==sinister){
				results.setText("Left");
			}
			else if(e.getSource()==medium){
				results.setText("Center");
			}
			else if(e.getSource()==dexter){
				results.setText("Right");
			}
		}
	}
	
	public static void main(String[] args){
		new LT();
	}
}