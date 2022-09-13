
//인터페이스 설계!!!!커멘드와, 탱크유닛을 공통점을 구분하여 수리하기 위한 껍데기 인터페이스를 만든다.
//~할 수 있는 (수리할 수 있는) ~~able

interface Irepairable{
	
}


class Unit2{
	int hitpoint; //기본 에너지
	final int MAX_HP; //최대에너지
	//Unit2(){}
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}

//지상유닛, 공중유닛, 건물

//지상유닛
class GroundUnit extends Unit2{
	GroundUnit(int hp) {
		super(hp);
	}
}

//공중유닛
class AirUnit extends Unit2{
	AirUnit(int hp){
		super(hp);
	}
}

//건물
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


//Scv 광물캐고, 치료
class Scv extends GroundUnit implements Irepairable{
	public Scv() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Scv";
	}
	
	//Scv 구체화, 특수화된 고유한 기능.
	//수리하다 (reqair)
	//Tank2, Scv
	
	//전자제품 매장 제품 1000개 >> buy() 1000개 생성 (x)
	//다형성 부모타입 buy(Product p)
	
	//문제점) 객체의 부모를  찾음 : GroundUnit ( Tank2, Marine2, Scv)
	
	//Marine2는 repair 대상이 아니다.
	//Marine을 찾을때 메소드에서 받은 파라미터의 객체를 insteadof로 비교를 한다.
	//고민??
	//**CommandCenter repair 대상이다.
	//Tank2, Marine2, Scv, CommandCenter 연결된 고리 (연관성)
	
	
	//interface Irepairable{} 연관성 부모.
	
	//class CommandCenter implements Irepairable
	//class Tank2 extends GroundUnit implements Irepairable
	//class Scv extends GroundUnit implements Irepairable
	
	
	//단 부모자원만 접근 가능
	//단 재정의된 자원 접근
	
	
	//1. 	void repair(Irepairable repairunit) >> Tank2, CommandCenter, Scv 
	//Irepairable 의 자식타입 ........
	//repair에서 Tank2, Scv >> scv.hitpoint를 건들어야된다.
	//하지만 
	//repair에서 CommandCenter를 접근 못하다보니 implement를 사용한다.
	void repair(Irepairable repairunit) {
		//repairunit 통해서 Unit2 접근
		
		
		//다운캐스팅
		//CommandCenter > Unit2 연관성이 없다
		//Unit2 unit = (Unit2)repairunit;
		//하지만 CommandCenter를 못받는다.
		
		//repair(Irepairable repairunit) 사용
		//커멘드를 받기위해 타입 비교를 한다.
		//비교 (타입) >> instanceof >> 타입 질문
		
		if(repairunit instanceof Unit2) {
			//Tank2, Scv
			Unit2 unit = (Unit2)repairunit;
			if(unit.hitpoint != unit.MAX_HP){
				unit.hitpoint = unit.MAX_HP;
			}
		}
		else {
			//다른 객체
			System.out.println("다른 충전방식을 통해서 repair 제공 ");
		}
	}
	
	
//	void repair(Tank2 tank) {
//		if(tank.hitpoint != tank.MAX_HP) { //SCV 체력이 달아있으면 치료시킴
//			tank.hitpoint+=5;
//		}
//	}
	
}

public class Ex04_Interface_Poly {

	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		
		//전부
		tank.hitpoint-=20;
		System.out.println("탱크 : " + tank.hitpoint);
		System.out.println("Scv 수리 요청");
		scv.repair(tank);
		
		System.out.println("탱크 수리 완료 : " + tank.hitpoint);
		
		scv.hitpoint-=30;
		System.out.println("scv : " + scv.hitpoint);
		System.out.println("Scv 수리요청");
		scv.repair(scv);
		System.out.println("scv 수리 완료 : " + scv.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);
		
	}

}
