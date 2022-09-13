import java.util.Scanner;

/*
 ���� : ����(unit)
 
 unit : ������(�̵���ǥ, �̵�, �����) : �߻�ȭ , �Ϲ�ȭ
 
 unit : �̵������ �ٸ���. (�̵������ unit ���� ������ ���� ����)
 
 abstract class Unit(){ abstract void move();  } 
 
 */

abstract class Unit{
	int x, y;
	void stop() {
		System.out.println("Unit Stop");
	}
	
	//�̵� (���� �ٸ���) �������� ...... �ٸ��� ����
	abstract void move(int x, int y); //�����(x) >> �߻��Լ�
}

//Tank
class Tank extends Unit{
	
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y =y;
		System.out.println("Tank �Ҹ����� �̵� : " + this.x + "," + this.y);
	}
	//�ʿ��ϴٸ� ��ũ���� ��üȭ Ư��ȭ ������ ����
	void changeMode() {
		System.out.println("��ũ��� ��ȯ");
	}	
}

class Marine extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine �̵� : " + this.x + "," + this.y);
	}
	//Ư��ȭ, ��üȭ
	
	void stimpack() {
		System.out.println("�����ѱ��");
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
		System.out.println("DropShip �ϴ÷� �̵� : " + this.x + "," + this.y);
	}
	//Ư��ȭ, ��üȭ
	
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
	
	MyUnit() { //�⺻ ������
		move(0, 0);
	}
	
	MyUnit(int index) { //�ʱ�ȭ
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

		
//		//1. ��ũ 3�븦 ����� ���� ��ǥ(600, 800)���� �̵�
//		
//		Tank[] tanklist = {new Tank(), new Tank(), new Tank()};
//		for(Tank t : tanklist)
//		{
//			t.move(600,800);
//		}
//		
//		//2. �������� (Tank 1��, Marine 1���, DropShip 1��) �� �����ϰ� ���� ��ǥ�� �̵�.
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
		MyUnit myunit = new MyUnit(); //�⺻�׽�Ʈ
		MyUnit myunitList = new MyUnit(index);
		
		myunitList = new MyUnit();
		
		while(true) {
			int input = scan.nextInt();
			switch(input) {
				case 1 :
					System.out.println("Tank ����");
					myunitList.make(new Tank());
				break;
				case 2 :
					System.out.println("Marine ����");
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
