package kr.or.kosa;


//��Ģ������ (�ǹ�)....
//1.ĸ��ȭ (member field)
//2.ĸ��ȭ (���������� ó�� : setter, getter �Լ�)

public class Car {
	private int window;
	private int speed;
	
	//�ʿ信 ���� (setter ��) >> write
	//�ʿ信 ���� (getter ��) >> read (return)
	//�ʿ信 ���� (setter, getter ��) write, read �Ѵ� �ϰڴ�.
	
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
	
	//�Ϲ������� �Ʒ�ó�� ������ �Լ��� ����� ���� read/write�� ����Ѵٸ�,
	//�⺻ setter, getter �� ����Ͽ� �����ϴ°��� �ùٸ��Ƿ�,
	// ���Ŀ� getSpeed, setSpeed �� ����� �Ѵ�.
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
	 	set, get �ڵ����� ����¹�.
	 	
	 	1.IDE ���
	 	- ���콺 ��Ŭ�� -> souerce -> get/set �����.
		2.Lombok (�Һ�) (���̺귯����)
		- getter, setter, toString ���� �ݺ� �޼��� �ۼ� �ڵ带 �ٿ��ִ� �ڵ� ���̾�Ʈ ���̺귯�� �̴�.
	 	// Lombok �̶�
		- java ���̺귯���� �ݺ��Ǵ� getter, setter, toString.....
		- ���� �ݺ� �޼��� �ۼ� �ڵ带 �ٿ��ִ� �ڵ� ���̾�Ʈ ���̺귯�� �̴�.
		@Getter
		@Setter
		//�����Ϸ����� �ڵ����� setter, getter �������.
		3.�̷� �����͸� ���� �� �ִ� Ŭ���� (VO, DTO, DOMAIN) >> MVC ����
		VO : value object
		DTO : Data transfer object
		
		
		//�ʿ��ϴٸ� ������ �Լ��� ����.
		//speed�� 10�� �ø��ų� �����ϴ� ����� �����.

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
