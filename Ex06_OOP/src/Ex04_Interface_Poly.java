
//�������̽� ����!!!!Ŀ����, ��ũ������ �������� �����Ͽ� �����ϱ� ���� ������ �������̽��� �����.
//~�� �� �ִ� (������ �� �ִ�) ~~able

interface Irepairable{
	
}


class Unit2{
	int hitpoint; //�⺻ ������
	final int MAX_HP; //�ִ뿡����
	//Unit2(){}
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}

//��������, ��������, �ǹ�

//��������
class GroundUnit extends Unit2{
	GroundUnit(int hp) {
		super(hp);
	}
}

//��������
class AirUnit extends Unit2{
	AirUnit(int hp){
		super(hp);
	}
}

//�ǹ�
class CommandCenter implements Irepairable{}


class Tank2 extends GroundUnit implements Irepairable{
	public Tank2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Tank2";
	}
}


class Marine2 extends GroundUnit{
	public Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Marine2";
	}
}


//Scv ����ĳ��, ġ��
class Scv extends GroundUnit implements Irepairable{
	public Scv() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Scv";
	}
	
	//Scv ��üȭ, Ư��ȭ�� ������ ���.
	//�����ϴ� (reqair)
	//Tank2, Scv
	
	//������ǰ ���� ��ǰ 1000�� >> buy() 1000�� ���� (x)
	//������ �θ�Ÿ�� buy(Product p)
	
	//������) ��ü�� �θ�  ã�� : GroundUnit ( Tank2, Marine2, Scv)
	
	//Marine2�� repair ����� �ƴϴ�.
	//Marine�� ã���� �޼ҵ忡�� ���� �Ķ������ ��ü�� insteadof�� �񱳸� �Ѵ�.
	//���??
	//**CommandCenter repair ����̴�.
	//Tank2, Marine2, Scv, CommandCenter ����� �� (������)
	
	
	//interface Irepairable{} ������ �θ�.
	
	//class CommandCenter implements Irepairable
	//class Tank2 extends GroundUnit implements Irepairable
	//class Scv extends GroundUnit implements Irepairable
	
	
	//�� �θ��ڿ��� ���� ����
	//�� �����ǵ� �ڿ� ����
	
	
	//1. 	void repair(Irepairable repairunit) >> Tank2, CommandCenter, Scv 
	//Irepairable �� �ڽ�Ÿ�� ........
	//repair���� Tank2, Scv >> scv.hitpoint�� �ǵ��ߵȴ�.
	//������ 
	//repair���� CommandCenter�� ���� ���ϴٺ��� implement�� ����Ѵ�.
	void repair(Irepairable repairunit) {
		//repairunit ���ؼ� Unit2 ����
		
		
		//�ٿ�ĳ����
		//CommandCenter > Unit2 �������� ����
		//Unit2 unit = (Unit2)repairunit;
		//������ CommandCenter�� ���޴´�.
		
		//repair(Irepairable repairunit) ���
		//Ŀ��带 �ޱ����� Ÿ�� �񱳸� �Ѵ�.
		//�� (Ÿ��) >> instanceof >> Ÿ�� ����
		
		if(repairunit instanceof Unit2) {
			//Tank2, Scv
			Unit2 unit = (Unit2)repairunit;
			if(unit.hitpoint != unit.MAX_HP){
				unit.hitpoint = unit.MAX_HP;
			}
		}
		else {
			//�ٸ� ��ü
			System.out.println("�ٸ� ��������� ���ؼ� repair ���� ");
		}
	}
	
	
//	void repair(Tank2 tank) {
//		if(tank.hitpoint != tank.MAX_HP) { //SCV ü���� �޾������� ġ���Ŵ
//			tank.hitpoint+=5;
//		}
//	}
	
}

public class Ex04_Interface_Poly {

	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		
		//����
		tank.hitpoint-=20;
		System.out.println("��ũ : " + tank.hitpoint);
		System.out.println("Scv ���� ��û");
		scv.repair(tank);
		
		System.out.println("��ũ ���� �Ϸ� : " + tank.hitpoint);
		
		scv.hitpoint-=30;
		System.out.println("scv : " + scv.hitpoint);
		System.out.println("Scv ������û");
		scv.repair(scv);
		System.out.println("scv ���� �Ϸ� : " + scv.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);
		
	}

}
