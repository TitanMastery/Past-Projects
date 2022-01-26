import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Upgrades extends JFrame{
	private JLabel title;
	private JPanel panel,northPanel;
	private JButton u1,u2,u3,u4,u5,u6,u7,u8,u9,u10,u11,u12,u13,u14,u15,u16;
	
	private Game game;
	
	private final int WIDTH=250;
	private final int HEIGHT=590;
	
	public Upgrades(Game g){
		game=g;
		setTitle("Upgrades");
		setSize(WIDTH,HEIGHT);
		setResizable(false);
		title=new JLabel();
		title.setIcon(new ImageIcon("gr/laserUpgrades.png"));
		northPanel=new JPanel();
		northPanel.add(title);
		northPanel.setBackground(Color.DARK_GRAY);
		add(northPanel,BorderLayout.NORTH);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	private void buildPanel(){
		panel=new JPanel();
		panel.setLayout(new GridLayout(8,2));
		
		panel.add(new Upgrade(1,50,false,false,game));
		
		panel.add(new Upgrade(10,500,false,false,game));
		
		panel.add(new Upgrade(100,5000,false,false,game));
		
		panel.add(new Upgrade(1000,50000,false,false,game));
		
		panel.add(new Upgrade(10000,500000,false,false,game));
		
		panel.add(new Upgrade(100000,5000000,false,false,game));
		
		panel.add(new Upgrade(1000000,50000000,false,false,game));
		
		panel.add(new Upgrade(10000000,500000000,false,false,game));
		
		panel.add(new Upgrade(100000000L,5000000000L,false,false,game));
		
		panel.add(new Upgrade(1000000000L,50000000000L,false,false,game));
		
		panel.add(new Upgrade(10000000000L,500000000000L,false,false,game));
		
		panel.add(new Upgrade(100000000000L,5000000000000L,false,false,game));
		
		panel.add(new Upgrade(1000000000000L,50000000000000L,false,false,game));
		
		panel.add(new Upgrade(10000000000000L,500000000000000L,false,false,game));
		
		panel.add(new Upgrade(-1,5000,true,false,game));
		
		panel.add(new Upgrade(-2,50000,false,true,game));
		
		
	}
	
	public static void main(String[] args){
		new Main();
	}
}