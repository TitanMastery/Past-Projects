//Created by David Helmick 2/1/18

import javax.swing.JOptionPane;

public class practicalAssessment2{
	public static void main(String[] args){
		int numberOfWidgets=Integer.parseInt(JOptionPane.showInputDialog("How many widgets would you like to order?"));
		double totalCostOfWidgets=numberOfWidgets*5;
		System.out.printf("Your total cost is $%,.2f\n",totalCostOfWidgets);
	}
}