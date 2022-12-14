/*
 추상클래스
 >> 미완성 클래스(미완성 설계도)
 1. 완성된 코드 + 미완성 코드
 2. 완성(함수) 실행블럭이 있는 함수 + 미완성(함수) 실행블럭이 없는 함수 >> public void run();
 원래함수) public void run() {실행블럭;}
 3. 완성된 클래스(new 가능) >> 미완성 클래스 (스스로 객체를 못만듬 객체 생성 불가)
 
 설계자 입장에서
 >> 의도 >> 반드시 재정의 해라 >> 강제적 구현을 목적(서로간의 믿음이 없으니깐, 믿지를 못하니깐!!!!)
 
 
 
 */
class Car{
	void run() {} //실행블록안에 어떠한 구문이 없어도 실행블럭만 있으면 완성된 코드
}

class Hcar extends Car{
	//믿음
	@Override
	void run() {
		System.out.println("재정의");
	}
}
//Car 만든 사람이 run() 재정의 해서 내용을 바꾸어라.
//그러나 강제가 없다. Hcar 만드는 사람이 의무사항이 아님.
//강제를 위해 abstract 사용하자.
//위코드는 강제성이 없다.

abstract class Abclass{ //클래스 안에 최소 1개 이상의 추상함수를 가지고 있는 클래스
	//완성된 코드
	int pos;
	void run() {
		pos++;
	}
	
	//미완성 코드 추가 (미완성 함수 : 추상함수)
	abstract void stop(); //추상메소드 : 실행블럭이 없다. >> 재정의 강제
	
}

class Child extends Abclass{

	@Override
	void stop() { // 실행블럭을 만들면 구현(강제적)
		this.pos = 0;
		System.out.println("stop : " + this.pos);		
	}
	
}

class Child2 extends Abclass{

	@Override
	void stop() { // 실행블럭을 만들면 구현(강제적)
		this.pos = 0;
		System.out.println("stop : " + -1);		
	}
	
}
public class Ex01_abstract_class {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.run();
		ch.run();
		ch.stop();
		
		Child2 ch2 = new Child2();
		ch2.stop();
		
		Abclass ab = ch; //다형성
		//상속관계에서 부모타입의 참조변수가 자식타입객체들의 주소를 받을 수 있다 (다형성)
		//단 부모는 자신의 것만 볼 수 있다.
		//단 재정의 ... 자식의 자원을 본다
		ab.run();
		ab.stop();  //자식의 메소드를 접근한다. >> 논리적으로 생각해봐도 다형성때 오버로딩을 부르는데 자식함수는 구현이 되어있고 부모는 구현되지않음.
		
		
	}

}
