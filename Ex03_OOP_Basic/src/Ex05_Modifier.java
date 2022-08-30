import kr.or.kosa.Car;

public class Ex05_Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		int speed = car.getSpeed();
		System.out.println("speed : " + speed);
		
		car.setUp();
		car.setUp();
		
		speed = car.getSpeed();
		System.out.println("speed : " + speed);
		
		car.getDown();
		car.getDown();
		car.getDown();
		
//		speed = car.get
	}

}
