public class TestScores{
	private double test1;
	private double test2;
	private double test3;
	
	public TestScores(){
		test1=0.0;
		test2=0.0;
		test3=0.0;
	}
	public TestScores(double t1,double t2,double t3){
		test1=t1;
		test2=t2;
		test3=t3;
	}
	public void setTest1(double t1){
		test1=t1;
	}
	public double getTest1(){
		return test1;
	}
	public void setTest2(double t2){
		test2=t2;
	}
	public double getTest2(){
		return test2;
	}
	public void setTest3(double t3){
		test3=t3;
	}
	public double getTest3(){
		return test3;
	}
	public double getAverage(){
		return ((test1+test2+test3)/3);
	}
}