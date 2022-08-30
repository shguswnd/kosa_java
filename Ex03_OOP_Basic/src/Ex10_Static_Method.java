/*
 static member field : 객체간 공유자원.....
 static method : why : 첫날 첫 시간 했던 코드...
 
 
 1. 객체 생성 없이.......
 2. 많이 사용함.
 3. 설계도를 만들때 고려해야함. (당신이 그 자원을 (기능) 많이 사용한다면)
 4. 설계도를 만들때 이 자원 많이 쓰니깐 편하게 쓰기 위해 .... 굳이 new 쓰지않고 사용가능하게함. (static 함수) 설계
 5. 객체생성없이 많이 쓰는 자원을 스태틱으로 쓰기 좋다. 
  
  
 */

class StaticClass{
	int iv;
	
	static int cv;
	
	void m() {
		//new heap > 사용.
		//1. iv 제어 가능
		
		cv = 1000;
		
		//why : 생성시점 (static 자원은 객체 생성 이전에 memory 로드)
	}
	
	static void print() {
		//static 함수
		//1. cv 제어가능
		//2. 일반변수 iv를 제어 가능 할까?, 안될까?
		//3. static 메소드는 무조건 static 변수만 접근이 가능하다.
		//iv = 10000; 생성시점 (static 자원은 일반 자원보다 우선한다)
		//가비지 컬렉터가 static은 건들이지 않음!!!!!!!!!!!!!
		
		//결과 : static 자원만 가지고 놈.
		cv = 100000;
	}
}


public class Ex10_Static_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();

		System.out.println(StaticClass.cv);
		//일반자원(객체생성)
		
		StaticClass sc = new StaticClass();
		sc.m();
		sc.print(); // 
		
		//		StaticClass.print();
//		StaticClass.cv = 1;
//		System.out.println(StaticClass.cv);

		
		
		//		StaticClass test = new StaticClass();
//		
//
//		test.cv = 99;
//		System.out.println(test.cv);
//		test.m();
//		System.out.println(test.cv);
//		///////////////////////////////
//		test.print();
		
	}

}
