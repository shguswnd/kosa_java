
//아파트 설계도
class Apt{ //설계도 == 데이터 타입(작은 타입을 모아 넣은 큰 타입)
	int window;
}

//데이터 타입 변수명 ex) int number; >> number 라는 변수는 타입에 맞는 값을 가진다. 
//Apt apt


public class Ex03_Object_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 100;
		Apt apt = new Apt();
		Apt apt2 = new Apt();
		//선언 Apt 타입 apt 변수
		//apt 변수는 Apt 타입의 값을 가져야 하는 주소값.
		//실제로 아파트를 메모리에 올려야 아파트가 생성되고 그 주소가 만드러 짐.
		//유일한 방법 : new (연산자)
		
		//heap이라는 메모리에 아파트가 만들어지고 주소가 생성되고
		//생성된 주소값을 apt 변수가 가진다.
		
		System.out.println("apt : " + apt);
		System.out.println("apt2 : " + apt2);
		//apt 를 출력했을때 쓰레기 값이 생기는데 이건 조작된 값이다.(주소가 애초에 없으니깐?으로 생각됨)
		//Apt + @ + 626b2d4a >> 설계도의이름 + @ + 주소값
		//. 은 주소를 찾아가는 연산자
		// 힙영역은 객체들이 있고, 스택에는 변수가 있다.
		// 그러면 힙에 객체가 만들어진걸 apt 변수가 스택메모리를 통해 주소값을 가지고 있고,
		// 주소를 스택에서 찾아 힙영역으로 가 실제 객체들을 사용할 것.
		// . 연산자는 주소를 찾아가는 연산자로 주소 찾고 나머지 메소드, 변수들 사용가능.
		
		System.out.println(apt == apt2); //두 변수의 주소가 같음?, 틀리므로 false 나옴.
		apt2.window = 20;
		
		Apt apt3 = apt2; 
		System.out.println("apt3 : 창문의 수 : " + apt3.window);

		// 값타입과 주소타입 증명하기.
		/*
			Ex03_Object_Variable 소스 파일
			javac Ex03_Object_Variable.java >> Ex03_Object_Variable.class 실행파일
			java Ex03_Object_Variable 엔터
			
			JVM 동작 >> OS >> JAVA 메모리 구성. (구획정리) >> 자원할당 (메모리) >> 프로그램 종료.
			>> 사용했던 메모리 OS 반환 ... end
			>>>>>>>>>>>>
			이클립스 통합 개발 툴 CTRL + f11
			
			1. main 함수안에 지역변수는 반드시 초기화하고 사용.
			2. 약속 >> main 함수 >> 시작점 >> 영역이 제일 먼저 실행.			
		*/
		
	}
}
