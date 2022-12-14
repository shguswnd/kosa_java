/*
  클래스는 설계도이다, 클래스 데이터 타입.
  클래스 == 설계도 == 타입
  
   클래스는 구체화를 통해서 사용 (집을 짓는 행위)
   프로그램에서는 [new 연산자]를 통해서 memory 에 집을 짓는다 >> 만들어진 것 >> 객체(인스턴스)
   
   설계도 종류 2가지
   1. 독자적으로 실행 가능 >> 	public static void main(String[] args) {} 가지고 있는 클래스
   2. 독자적으로 실행 불가능 >> main 함수가 없는 나머지 클래스 >> 남을 도와주는 클래스 >> 라이브러리(LIB)
 */

class Apt2{
	int door = 10;
	int window = 20;	
}

/*
 * class Car{ int a; }
 * 같은 폴더안에 클래스가 동일해서도 안됨.
 */

public class Ex05_Ref_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		num = 100;
		Apt2 apt2 = new Apt2(); //주소값을 받으려하며 주소값을 받으려면 메모리에 올라가야함 그래서 new 사용
		//Apt2 설계도를 기반으로 아파트를 지음 (JVM>>memory>>heap)
		System.out.println("apt2 : " + apt2); // 주소값을 할당 ... ssapt 변수는 apt2 가지고 있는 주소값으로 초기화.

		Apt2 ssapt = apt2; // 주소값을 할당 ... ssapt 변수는 apt2 가지고 있는 주소값으로 초기화
		
		int ssapt_Window = ssapt.window;
		System.out.println(ssapt_Window);
		//		apt2.
		
		
	}
}
