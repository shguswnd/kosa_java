import java.awt.GradientPaint;

import javax.swing.text.AsyncBoxView.ChildLocator;

/*
 OOP특징 (여러개의 조각(클래스)들을 조립해서 하나의 큰 제품을 만드는 행위)
 1. 상속.
 2. 캡슐화(은닉화) >>> private
 3. 다형성(상속관계에서 부모 타입이 자식 타입을 주소를 가질 수 있다.
  
  
 상속
 java : child extends Base
 C# : child : Base
 
 특징
 1. 다중 상속은 불가 ( 단일상속 (계층적 상속가능))
 2. 단일 상속 (계층적 상속) 가능 (여러개의 클래스를 상속)
 3. 다중 상속을 지원 (interface)
 
 
 상속
 1. 진정한 의미 : 재사용성
 2. 단점 : 초기 설계 비용
 3. 재사용성 >> 설계 >> 시간 (여러개의 설계도 분할 ... 부모, 자식 관계)

 상속관계에서는
 부모부터 메모리에 올라간다 .... 자식순으로
 
 
 GrandFather >> Father >> Child < heap 메모리에 3객체>
 
 //개발자가 만드는 모든 클래스는 default로 Object란 클래스를 상속 받는다.
 // class Car extends Object 라고 해석.
 // Object는 모든 클래스의 root : 모든 클래스의 부모 
 */

/*
 실무(현업) 환경
 한개의 클래스만 설계 사용경우 (x)
 
 설계도 1장 모든 업무를 구현 현실적으로 불가능.
 설계도 여러개를 나눈다 .... 문제발생 .... (기준, 관계)
 
 쇼핑몰 : 결재관리, 배송관리, 판매처, 회원관리, 상품관리..............
 기준
 
 여러개의 설계도를 관계 .... 이어주는 기준
 
 1.상속(is ~ a : 상속) 은(는) ~이다(부모를 뒤에)
 2. 포함 (has ~ a : 포함) 은(는) ~ 가지고 있다.
 
 
 예)
 원은 도형이다
 원 extends 도형
 삼각형은 도형이다
 삼각형 extends 도형
 
 원 과 점 관계
 원은 점이다? No
 원은 점을 가지고 있다 (O)
 has ~ a (부품정보)
 >> class 원 {점이라는 부품이 member field}
 
 경찰 권총
 경찰은 권총이다 (x)
 경찰은 권총을 가지고 있다 (O)
 >> class 권총 {}  
 >> class 경찰 {권총 member field}
 
 
 원은 도형이다.
 삼각형은 도형이다.
 사각형은 도형이다.
 
 도형은 분모 (공통적) 공통자원 : 추상화, 일반화 (그리다, 색상)
 원은 구체화, 특수화 (본인만이 가지는 특징) (반지름, 한점)
 
 점 : 좌표값 (x, y) 
 원은 점을 가지고 있다.
 삼각형은 점을 가지고 있다.
 사각형은 점을 가지고 있다.
 
 class Shapre{그리다, 색상} >> 상속관계 부모 (원, 삼각형, 사각형)
 class Point{좌표값} >> 포함관계 (부품)
 
 구체화, 특수화 : Circle, Triangle
 
 
 */

class Car{
	
}

class GrandFather{
	public int gmoney = 5000;
	private int pmoney = 10000; //(상속관계여도 접근 불가)
	public GrandFather() {
		System.out.println("GrandFather");
	}
	
	public int getMoney() {
		return 0;
	}
	public void getMoney(int pmoney) {
		this.gmoney = pmoney;
	}
}

class Father extends GrandFather{
	public int fmoney = 3000;
	public Father() {
		System.out.println("Father");
	}
}

class Child extends Father{
	public int cmoney = 1000;
	public Child() {
		System.out.println("Child");
	}
}


public class Ex01_Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);
		

		Car car = new Car();

	}

}
