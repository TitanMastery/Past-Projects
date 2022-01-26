public class Payroll{
	private String name;
	private int idNumber;
	private double payRate;
	private double hoursWorked;
	
	public Payroll(String n,int id){
		name=n;
		idNumber=id;
		payRate=0.0;
		hoursWorked=0.0;
	}
	
	public void setName(String n){
		name=n;
	}
	public String getName(){
		return name;
	}
	public void setIdNumber(int id){
		idNumber=id;
	}
	public int getIdNumber(){
		return idNumber;
	}
	public void setPayRate(double p){
		payRate=p;
	}
	public double getPayRate(){
		return payRate;
	}
	public void setHoursWorked(double h){
		hoursWorked=h;
	}
	public double getHoursWorked(){
		return hoursWorked;
	}
	public double getGrossPay(){
		return payRate*hoursWorked;
	}
}