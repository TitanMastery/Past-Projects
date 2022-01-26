import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Upgrade extends JPanel{
	private Game game;
	private JButton upgradeButton;
	private JLabel upgradeLabel;
	private long upgradeValue,upgradeCost;
	private boolean autoClickerButton,autoClickerUpgradeButton;
	private int lvl=0;
	
	public Upgrade(long uv, long uc, boolean ac, boolean acu, Game g){
		game=g;
		upgradeValue=uv;
		upgradeCost=uc;
		autoClickerButton=ac;
		autoClickerUpgradeButton=acu;
		
		setBackground(Color.DARK_GRAY);
		setLayout(new FlowLayout(FlowLayout.CENTER,0,5));
		
		upgradeLabel=new JLabel("<html><center>LPC +"+Xlat(upgradeValue)+"<br/>Lvl "+lvl+"</center></html>");
		if(upgradeValue==-1){
			upgradeLabel.setText("Purchase AutoFire");
		}
		if(upgradeValue==-2){
			upgradeLabel.setText("Upgrade AutoFire");
		}
		upgradeLabel.setForeground(Color.WHITE);
		add(upgradeLabel);
		
		upgradeButton=new JButton(Xlat(upgradeCost)+" Lasers");
		upgradeButton.addActionListener(new UpgradeListener());
		add(upgradeButton);
	}
	
	private class UpgradeListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			long lasers=game.getLasers();
			if(upgradeCost<=lasers){
				lvl+=1;
				if(autoClickerButton){
					game.startAutoClick();
					upgradeButton.setEnabled(false);
					upgradeButton.setText("Purchased");
					game.setLasers(upgradeCost);
				}
				else if(autoClickerUpgradeButton&&lvl<5){
					game.upgradeAutoClick();
					game.setLasers(upgradeCost);
					upgradeCost*=10*lvl;
					upgradeButton.setText(Xlat(upgradeCost)+" Lasers");
				}
				else if(autoClickerUpgradeButton&&lvl==5){
					game.upgradeAutoClick();
					game.setLasers(upgradeCost);
					upgradeCost*=10*lvl;
					upgradeButton.setText("Max Lvl");
					upgradeButton.setEnabled(false);
				}
				else{
					game.setLasers(upgradeCost);
					game.setValue(upgradeValue);
					upgradeLabel.setText("<html><center>LPC +"+Xlat(upgradeValue)+"<br/>Lvl "+lvl+"</center></html>");
					upgradeCost*=1.20;
					upgradeButton.setText(Xlat(upgradeCost)+" Lasers");
				}
			}
			else{
				JOptionPane.showMessageDialog(null,"You need at least "+Xlat(upgradeCost)+" lasers to purchase this upgrade!","Not Enough Lasers!",JOptionPane.ERROR_MESSAGE);
			}
		}
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
		if (val < MILL) return makeDecimal(val, THOU, " K");
		if (val < BILL) return makeDecimal(val, MILL, " M");
		if (val < TRIL) return makeDecimal(val, BILL, " B");
		if (val < QUAD) return makeDecimal(val, TRIL, " T");
		return makeDecimal(val, QUAD, " Q");
	}
	//---end---//
	
	public static void main(String[] args){
		new Main();
	}
}