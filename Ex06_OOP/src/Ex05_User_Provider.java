

/*
 user 사용자 <> provider 제공자
 
  class A{}
  class B{}
  
  관계 : A는 B를 사용한다.
  
  1. 상속 : A extends B
  2. 포함 : A라는 클래스가 Member field B를 사용 class A {}
  	2.1 부분
  	2.2 전체
  	
  public class B{}
  public class A{
  	public int i;
  	public B b;  //A는 B를 사용합니다 (포함)
  	public A(){
  		b = new B(); //생성자를 통해서 초기화(주소값)
  	}
  }
  
  >> 위와같이 포함관계로 사용시
  >> B는 독자생성 불가능 >> A라는 객체가 만들어져야 B도 생성.
  >> A a = new A() 해야만 B객체도 생성이 된다.
  >> A, B 같은 운명 공통체 (전체집합)
  >> 자동차와 엔진, 노트북과 CPU
  ---------------------------------------------------------------------------
  class B{}
  class A{
  	int i;
  	B b; //A는 B를 사용합니다.
  	A(){}
  	
  	//method
  	void m(B b){
  		this.b = b;
  	}
  }
  >> main 함수 영역
  >> A a = new A();
  >> B b = new B();
  >> a.m(b);
  >> 같은 운명이 아니다.
  >> 학교 학생간의 관계 (공동운명체가 아님)
  
  class A{}
  class B{}
  관계 : A는 B를 사용합니다.
  
  
  A는 B를 참조합니다. (포함)
  B를 member field 사용
  
 */

interface Icall{
	void m();
}

class D implements Icall{
	@Override
	public void m() {
		System.out.println("D Icall 인터페이스의 m()라는 함수를 재정의");
	}	
}

class F implements Icall{
	@Override
	public void m() {
		System.out.println("F Icall 인터페이스의 m()라는 함수를 재정의");
	}	
}
//현대적인 프로그래밍 방식 (interface 가 대세이다) >> 유연성 확보. >> 대충 만들어도 대충 들어맞게......
//>> 느슨하게 ..... >> interface 

class C{
	void method(Icall ic) { //Icall을 구현하는 모든 객체의 주소를 올 수 있다.
		ic.m();
	}
	/*
	 확장성 변환 무시 ...
	 void method(D d){}
	 void m(F f){}
	 */
}

public class Ex05_User_Provider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		D d = new D();//implements Icall 
		F f = new F();//F implements Icall
		c.method(d);
		c.method(f);
	}

}
