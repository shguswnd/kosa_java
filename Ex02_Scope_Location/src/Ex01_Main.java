import kr.or.kosa.common.Car;

//import kr.or.kosa.common.Car;
//import kr.or.kosa.common.;
/*
 클래스 == 설계도 == 타입
 
 클래스 구성 요소( 설계도라고 판단할려면 최소한 무엇을 가지고 있어야 한다.
 필드 + 함수 + 생성자 함수
 
 필드(field) >> 데이터, 정보 담아야 한다. >> 고유정보, 상태정보 ,부품정보 >> field >> variable
 함수(method) >> 기능 (행위) >> 자동차 >> 달린다, 멈춘다, 소리가 난다.
 + 추가적으로 생성자 >> 특수한 목적의 함수 >> 객체가 생성시 member field 초기화 목적으로 ......

 클래스, 필드, 생성자, 함수 : 영역(범위) >> 접근자, 한정자, 수정자
 
 >>public, private, default, protected
 
 
 >>kr.or.kosa.common 안에 Car 클래스 생성 >> public class CarP{} // 누구가 사용할 수 있는 설계도 // 다오픈
 
  >>kr.or.kosa.common 안에 AirPlane >> class AirPlane { >> 아무것도 안쓰면 실제로 default class AirPlane 으로 표시}
  >>default 같은 폴더에서는 공유 하겠다. : 같은 package 안에서는 오픈할꺼고, 다른 패키지에서 다른패키지에서는 접근을 불가능하게 하겠다.
  >>default 접근자는 : 같은 폴더(package) 내에서 만들어서 연습용......
  
  
  하나의 물리적은 java 파일은 여러개의 클래스를 가질 수 있다.
  >> Ex01_Main.java 파일은 그안에 Ex01_Main이라는 클래스를 하나 가지고 있다.
  >> 일반적으로 필요한 클래스를 별도의 파일로 생성해서 사용 .... Apt.java
  >> 그냥 연습 ... 해볼 굳이 물리적으로 파일 만들 필요 있을까??
  >>하나의 물리적 파일은 여러개의 클래스를 가지고 있을 수 있지만, public은 하나의 클래스만 가진다 (대표)
  
 */

class Emp { //공부하거나 실습할때 바로 확인........
	
}


class Test{ // 컴파일러가 default class Test 해석
	int data; //instance variable // 컴파일러가 default int data 로 해석함.
	public int p_data; //에러는 아니지만 다른 폴더에서 사용 불가 ... public 의미없다.
	private int pri_data; //감추다, 숨기다, 캡슐화(은닉화)
}

public class Ex01_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();//ctrl + shift + o (다른 사람 소스를 받았을때 위의 import를 자동으로 생성해줌.)
		//AirPlane air = new AirPlane(); 이런 클래스 없는데 해석... 보이지 않음.
//		car.
		Emp e = new Emp();
		
		Test t = new Test();
		//t.pri_data 이녀석은 사용불가능이다.
		
	}

}
