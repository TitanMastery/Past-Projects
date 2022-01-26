import javax.swing.JOptionPane;

public class FreezeBoilDemo{
	public static void main(String[] args){
		int temp=Integer.parseInt(JOptionPane.showInputDialog("What is the temperature?"));
		FreezeBoil FB=new FreezeBoil(temp);
		System.out.print("Freeze:");
		if(FB.isEthylFreezing()){
			System.out.print("\tEthyl Alcohol\n");
		}
		if(FB.isOxygenFreezing()){
			System.out.print("\tOxygen\n");
		}
		if(FB.isWaterFreezing()){
			System.out.print("\tWater\n");
		}
		System.out.print("\nLiquid:");
		if(!FB.isEthylBoiling()&&!FB.isEthylFreezing()){
			System.out.print("\tEthyl Alcohol\n");
		}
		if(!FB.isOxygenBoiling()&&!FB.isOxygenFreezing()){
			System.out.print("\tOxygen\n");
		}
		if(!FB.isWaterBoiling()&&!FB.isWaterFreezing()){
			System.out.print("\tWater\n");
		}
		System.out.print("\nBoil:");
		if(FB.isEthylBoiling()){
			System.out.print("\tEthyl Alcohol\n");
		}
		if(FB.isOxygenBoiling()){
			System.out.print("\tOxygen\n");
		}
		if(FB.isWaterBoiling()){
			System.out.print("\tWater\n");
		}
	}
}