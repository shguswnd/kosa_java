package kr.or.kosa;


//원칙적으로 (실무)....
//1.캡슐화 (member field)
//2.캡슐화 (간접적으로 처리 : setter, getter 함수)

public class Car {
	private int window;
	private int speed;
	
	//필요에 따라서 (setter 만) >> write
	//필요에 따라서 (getter 만) >> read (return)
	//필요에 따라서 (setter, getter 만) write, read 둘다 하겠다.
	
	public int getWindow() {
		return window;
	}
	public void setWindow(int window) {
		this.window = window;
	}

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//일반적으로 아래처럼 별도의 함수를 만들기 보다 read/write만 사용한다면,
	//기본 setter, getter 를 사용하여 제어하는것이 올바르므로,
	// 추후에 getSpeed, setSpeed 에 사용을 한다.
//	private static int test;
//	
//	
//	
//	public static int getTest() {
//		return test;
//	}
//	public static void setTest(int test) {
//		Car.test = test;
//	}
	
	
	public int getUp() {
		return speed;
	}
	public void setUp() {
		this.speed += 10;
	}
	
	public int getDown() {
		return speed;
	}
	public void setDown() {
		if(speed > 0)
		{
			this.speed -= 10;			
		}
		else {
			speed = 0;
		}
	}
	
	
	
	
	
	/*
	 	set, get 자동으로 만드는법.
	 	
	 	1.IDE 사용
	 	- 마우스 우클릭 -> souerce -> get/set 만들기.
		2.Lombok (롬복) (라이브러리임)
		- getter, setter, toString 등의 반복 메서드 작성 코드를 줄여주는 코드 다이어트 라이브러리 이다.
	 	// Lombok 이란
		- java 라이브러리로 반복되는 getter, setter, toString.....
		- 등의 반복 메서드 작성 코드를 줄여주는 코드 다이어트 라이브러리 이다.
		@Getter
		@Setter
		//컴파일러에게 자동으로 setter, getter 만들어줌.
		3.이런 데이터를 담을 수 있는 클래스 (VO, DTO, DOMAIN) >> MVC 패턴
		VO : value object
		DTO : Data transfer object
		
		
		//필요하다면 별도의 함수를 생성.
		//speed를 10씩 올리거나 감소하는 기능을 만들기.

	 */
	
		
//	public int getWindow() {
//		return window;
//	}
//	public void setWindow(int window) {
//		this.window = window;
//	}
//	public int getSpeed() {
//		return speed;
//	}
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
	
	
}
