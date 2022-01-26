import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Game extends JPanel{
	private long total=0;
	private long value=1;
	private long acTime=16000;
	
	private Upgrades upgrades;
	private boolean settingsCreated=false;
	private boolean soundEffects=true;
	
	private JLabel totalLabel=new JLabel("0");
	private JLabel laserLabel=new JLabel("Lasers:");
	private JLabel sharkLabel=new JLabel();
	private JLabel beamLabel=new JLabel();
	private JButton clickButton=new JButton();
	private JButton upgradeButton=new JButton();
	private JButton settingsButton=new JButton();
	
	private File beamSoundFile=new File("gr/beamSound.wav");
	private File bgMusicFile=new File("gr/backgroundMusic.wav");
	
	private Timer timer=new Timer();
	private Timer autoClickTimer=new Timer();
	private Clip bgMusicClip;
	
	private JFrame settings;
	private JPanel settingsPanel;
	private JCheckBox musicCheckBox,soundEffectCheckBox,pinkCheckBox;
	private JButton done,reset;
	
	ImageIcon zambieShark=new ImageIcon("gr/ZambieShark.png");
	ImageIcon pinkShark=new ImageIcon("gr/PinkShark.png");
	ImageIcon redBeam=new ImageIcon("gr/beam.png");
	ImageIcon greenBeam=new ImageIcon("gr/beam2.png");
	
	public Game(){
		clickButton.addActionListener(new ClickListener());
		clickButton.setIcon(new ImageIcon("gr/button_fire.png"));
		clickButton.setBackground(null);
		clickButton.setBorder(null);
		clickButton.setOpaque(false);
		clickButton.setContentAreaFilled(false);
		clickButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		upgradeButton.addActionListener(new UpgradeListener());
		upgradeButton.setIcon(new ImageIcon("gr/button_upgrades.png"));
		upgradeButton.setBackground(null);
		upgradeButton.setBorder(null);
		upgradeButton.setOpaque(false);
		upgradeButton.setContentAreaFilled(false);
		upgradeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		settingsButton.addActionListener(new SettingsButtonListener());
		settingsButton.setIcon(new ImageIcon("gr/button_settings.png"));
		settingsButton.setBackground(null);
		settingsButton.setBorder(null);
		settingsButton.setOpaque(false);
		settingsButton.setContentAreaFilled(false);
		settingsButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		laserLabel.setForeground(new Color(200,0,0));
		totalLabel.setForeground(Color.WHITE);
		totalLabel.setHorizontalAlignment(JLabel.RIGHT);
		
		
		sharkLabel.setIcon(zambieShark);
		beamLabel.setIcon(redBeam);
		beamLabel.setVisible(false);
		
		setLayout(null);
		add(laserLabel);
		laserLabel.setBounds(310,110,50,50);
		add(totalLabel);
		totalLabel.setBounds(360,110,230,50);
		add(settingsButton);
		settingsButton.setBounds(655,550,175,50);
		add(upgradeButton);
		upgradeButton.setBounds(60,550,175,50);
		add(clickButton);
		clickButton.setBounds(350,525,200,75);
		add(sharkLabel);
		sharkLabel.setBounds(400,200,413,324);
		add(beamLabel);
		beamLabel.setBounds(170,230,322,216);
		setBackground(Color.DARK_GRAY);
		
		try{
			bgMusicClip=AudioSystem.getClip();
			bgMusicClip.open(AudioSystem.getAudioInputStream(bgMusicFile));
			bgMusicClip.loop(Clip.LOOP_CONTINUOUSLY);
		}catch(Exception e){}
	}
	
	private class ClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			click();
		}
	}
	
	private class UpgradeListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(upgrades==null){
				createUpgrade();
			}
			else{
				upgrades.setVisible(true);
			}
		}
	}
	
	private void createUpgrade(){
		upgrades=new Upgrades(this);
	}
	
	private void buildSettings(){
		settingsPanel=new JPanel();
		
		musicCheckBox=new JCheckBox("Music",true);
		musicCheckBox.addActionListener(new SettingsListener());
		settingsPanel.add(musicCheckBox);
		
		soundEffectCheckBox=new JCheckBox("Sound Effects",true);
		soundEffectCheckBox.addActionListener(new SettingsListener());
		settingsPanel.add(soundEffectCheckBox);
		
		pinkCheckBox=new JCheckBox("Pink Shark",false);
		pinkCheckBox.addActionListener(new SettingsListener());
		settingsPanel.add(pinkCheckBox);
		
		reset=new JButton("Reset");
		reset.addActionListener(new ResetButtonListener());
		settingsPanel.add(reset);
		
		done=new JButton("Done");
		done.addActionListener(new DoneButtonListener());
		settingsPanel.add(done);
	}
	
	private class SettingsButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(!settingsCreated){
				settings=new JFrame();
				settings.setTitle("Settings");
				settings.setSize(160,130);
				buildSettings();
				settings.add(settingsPanel);
				settings.setUndecorated(true);
				settings.getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.DARK_GRAY));
				settings.setResizable(false);
				settings.setLocationRelativeTo(null);
				settings.setIconImage(Toolkit.getDefaultToolkit().getImage("gr/settings-icon.png"));
				settings.setVisible(true);
				settingsCreated=true;
			}
			else{
				settings.setVisible(true);
			}
		}
	}
	
	private class DoneButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			settings.setVisible(false);
		}
	}
	
	private class ResetButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			closeWindow();
		}
	}
	
	private void closeWindow(){
		new Main();
		settings.dispose();
		SwingUtilities.windowForComponent(this).dispose();
		if(upgrades!=null){
			upgrades.dispose();
		}
	}
	
	private class SettingsListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(!musicCheckBox.isSelected()){
				bgMusicClip.stop();
			}
			if(musicCheckBox.isSelected()&&!bgMusicClip.isRunning()){
				bgMusicClip.loop(Clip.LOOP_CONTINUOUSLY);
			}
			if(!soundEffectCheckBox.isSelected()){
				soundEffects=false;
			}
			if(soundEffectCheckBox.isSelected()){
				soundEffects=true;
			}
			if(!pinkCheckBox.isSelected()&&sharkLabel.getIcon()!=zambieShark){
				sharkLabel.setIcon(zambieShark);
				beamLabel.setIcon(redBeam);
			}
			if(pinkCheckBox.isSelected()&&sharkLabel.getIcon()!=pinkShark){
				sharkLabel.setIcon(pinkShark);
				beamLabel.setIcon(greenBeam);
			}
		}
	}
	
	private void click(){
		total+=value;
		totalLabel.setText(Xlat(total));
		if(!beamLabel.isVisible()){
			beamLabel.setVisible(true);
			timer.schedule(new TimerTask(){public void run(){beamLabel.setVisible(false);if(soundEffects){beamSound();}}},100);
		}
	}
	
	public void startAutoClick(){
		autoClickTimer.scheduleAtFixedRate(new TimerTask(){public void run(){click();}}, 0, acTime);
	}
	
	public void upgradeAutoClick(){
		acTime/=2;
		autoClickTimer.cancel();
		autoClickTimer=new Timer();
		autoClickTimer.scheduleAtFixedRate(new TimerTask(){public void run(){click();}}, 0, acTime);
	}
	
	private void beamSound(){
		try{
			Clip beamClip=AudioSystem.getClip();
			beamClip.open(AudioSystem.getAudioInputStream(beamSoundFile));
			beamClip.start();
		}catch(Exception e){}
	}
	
	public void setLasers(long l){
		total-=l;
		totalLabel.setText(Xlat(total));
	}
	public long getLasers(){
		return total;
	}
	
	public void setValue(long v){
		value+=v;
	}
	public long getValue(){
		return value;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(40,110,810,510);
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Image bg=toolkit.getImage("gr/bg.jpeg");
		g.drawImage(bg,45,115,this);
		g.setColor(new Color(150,150,150,150));
		g.fillRoundRect(300, 120, 300, 30, 15, 15);
		Image title=toolkit.getImage("gr/title.png");
		g.drawImage(title,75,15,this);
		Image subtitle=toolkit.getImage("gr/subtitle.png");
		g.drawImage(subtitle,120,65,this);
	}
	
	
	//---Created by paxdiablo on Stack Overflow---//
	//---Modified to function with program---//
	static private String makeDecimal(long val, long div, String sfx) {
		val = val / (div / 100);
		long whole = val / 100;
		long tenths = val % 100;
		if ((tenths == 0) || (whole >= 100)){
			return String.format("%d%s", whole, sfx);
		}
		if ((tenths > 0) && (tenths < 10)){
			return String.format("%d.0%d%s", whole, tenths, sfx);
		}
		return String.format("%d.%d%s", whole, tenths, sfx);
	}
	
	static final long THOU =                1000L;
	static final long MILL =             1000000L;
	static final long BILL =          1000000000L;
	static final long TRIL =       1000000000000L;
	static final long QUAD =    1000000000000000L;
	
	static private String Xlat(long val) {
		if (val < THOU) return Long.toString(val);
		if (val < MILL) return makeDecimal(val, THOU, " Thousand");
		if (val < BILL) return makeDecimal(val, MILL, " Million");
		if (val < TRIL) return makeDecimal(val, BILL, " Billion");
		if (val < QUAD) return makeDecimal(val, TRIL, " Trillion");
		return makeDecimal(val, QUAD, " Quadrillion");
	}
	//---end---//
	
	public static void main(String[] args){
		new Main();
	}
}