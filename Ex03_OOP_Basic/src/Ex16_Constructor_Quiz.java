import kr.or.kosa.Car_Quiz;


public class Ex16_Constructor_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_Quiz car= new Car_Quiz();
		Car_Quiz car1= new Car_Quiz(5);
		Car_Quiz car2= new Car_Quiz("blue");
		Car_Quiz car3= new Car_Quiz(6,"blue");
	
		car.print();
		car1.print();
		car2.print();
		car3.print();
	}

}
