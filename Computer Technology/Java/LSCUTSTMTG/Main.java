import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
	private final int WIDTH=900;
	private final int HEIGHT=700;
	
	private JLabel titleLabel;
	private JPanel titlePanel;
	
	public Main(){
		setTitle("Laser Shark Clicker: Undead");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("gr/ZambieShark.png"));
		add(new Game());
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new Main();
	}
}