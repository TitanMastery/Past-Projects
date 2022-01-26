public class CarDemo{
	public static void main(String[] args){
		Car car=new Car(2005,"Chevrolet");
		System.out.println("Speed:");
		for(int i=1;i<=5;i++){
			car.accelerate();
			System.out.println(car.getSpeed());
		}
		for(int i=1;i<=5;i++){
			car.brake();
			System.out.println(car.getSpeed());
		}
	}
}