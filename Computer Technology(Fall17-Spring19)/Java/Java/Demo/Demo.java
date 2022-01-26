import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame{
	private JPanel panel;
	private JLabel label;
	private JTextField field;
	private JButton button;
	
	public Demo(){
		setTitle("Demo");
		setSize(310,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	public void buildPanel(){
		label=new JLabel("Enter a distance in kilometers");
		field=new JTextField(10);
		button=new JButton("Calculate");
		panel=new JPanel();
		panel.add(label);
		panel.add(field);
		panel.add(button);
	}
	public static void main(String[] args){
		Demo d=new Demo();
	}
}