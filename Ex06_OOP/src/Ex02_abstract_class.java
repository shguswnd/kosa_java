import java.util.Scanner;

/*
 게임 : 유닛(unit)
 
 unit : 공통기능(이동좌표, 이동, 멈춘다) : 추상화 , 일반화
 
 unit : 이동방법은 다르다. (이동방법은 unit 마다 별도의 구현 강제)
 
 abstract class Unit(){ abstract void move();  } 
 
 */

abstract class Unit{
	int x, y;
	void stop() {
		System.out.println("Unit Stop");
	}
	
	//이동 (서로 다르게) 강제구현 ...... 다름을 구현
	abstract void move(int x, int y); //실행블럭(x) >> 추상함수
}

//Tank
class Tank extends Unit{
	
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y =y;
		System.out.println("Tank 소리내며 이동 : " + this.x + "," + this.y);
	}
	//필요하다면 탱크만의 구체화 특수화 내용을 구현
	void changeMode() {
		System.out.println("탱크모드 변환");
	}	
}

class Marine extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine 이동 : " + this.x + "," + this.y);
	}
	//특수화, 구체화
	
	void stimpack() {
		System.out.println("스팀팩기능");
	}
}

////Nested Class
//class A extends Unit{
//
//	@Override
//	void move(int x, int y) {
//		// TODO Auto-generated method stub
//		
//	}
//	class D extends Unit{
//
//		@Override
//		void move(int x, int y) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//	}
//}
class DropShip extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("DropShip 하늘로 이동 : " + this.x + "," + this.y);
	}
	//특수화, 구체화
	
	void load() {
		System.out.println("Unit load");
	}
	
	void unload() {
		System.out.println("Unit Unload");
	}
}

class MyUnit extends Unit{
	int index;
	int size;
	Unit[] myUnit;
	
	MyUnit() { //기본 생성자
		move(0, 0);
	}
	
	MyUnit(int index) { //초기화
		this.size = size;
		myUnit = new Unit[size];
	}
	
	void make(Unit unit) {
		myUnit[index++] = unit;
	}
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex02_abstract_class {

	public static void main(String[] args) {
//		Tank tank = new Tank();
//		tank.move(500, 200);
//		tank.stop();
//		tank.changeMode();
//		
//		Marine marine = new Marine();
//		marine.move(200, 300);
//		marine.stop();
//		marine.stimpack();

		
//		//1. 탱크 3대를 만들고 같은 좌표(600, 800)으로 이동
//		
//		Tank[] tanklist = {new Tank(), new Tank(), new Tank()};
//		for(Tank t : tanklist)
//		{
//			t.move(600,800);
//		}
//		
//		//2. 여러개의 (Tank 1대, Marine 1사람, DropShip 1대) 를 생성하고 같은 좌표로 이동.
//		Unit[] unitlist = {new Tank(), new Marine(), new DropShip()};
//		for(Unit t : unitlist)
//		{
//			t.move(600,800);
//		}
		
		
//		Scanner scan = new Scanner(System.in);
//		int index = scan.nextInt();
//		Tank[] tank = new Tank[index];
//		for(int i=0; i<index; i++) {
//			tank[i] = new Tank();
//			tank[i].move(600, 800);
//		}
		
		Scanner scan = new Scanner(System.in);
		int index = scan.nextInt();
		MyUnit myunit = new MyUnit(); //기본테스트
		MyUnit myunitList = new MyUnit(index);
		
		myunitList = new MyUnit();
		
		while(true) {
			int input = scan.nextInt();
			switch(input) {
				case 1 :
					System.out.println("Tank 생성");
					myunitList.make(new Tank());
				break;
				case 2 :
					System.out.println("Marine 생성");
					myunitList.make(new Marine());
				break;
				case 3 :
					System.out.println("DropShip");
					myunitList.make(new DropShip());
				break;
				case 4 :
				break;
			}
		}
	
	}

}
