public class Temperature{
	private double fTemp;
	
	public Temperature(double f){
		fTemp=f;
	}
	public void setFahrenheit(double f){
		fTemp=f;
	}
	public double getFahrenheit(){
		return fTemp;
	}
	public double getCelsius(){
		return ((5.0/9.0)*(fTemp-32));
	}
	public double getKelvin(){
		return (((5.0/9.0)*(fTemp-32))+273);
	}
}