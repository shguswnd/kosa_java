/*
 OOP 객체 지향 프로그램밍 (여러개의 조각들을(설계도) 만들어서 조합하는 행위)
 >> 여러개의 설계도를 재사용하는 방법.
 
 1. 상속 (재사용성)
 2. 캡슐화(은닉화) : private   ....setter, getter (직접할당을 막고 간접할당을 통해서 데이터 보호)
 3. 다형성 : 하나의 타입으로 여러개 객체의 주소를 가질 수 있는 것.
 
 >> method overloading (오버로딩)
 1. 하나의 이름으로 여러가지 기능을 하는 함수.
 
 1. 오버로딩은 성능향상.
 2. 편하게 사용하라고 .... 설계자가 개발자를 배려 ...... 
 3. 오버로딩을 사용하지 않아도 문제되지 않는다 .... 
 
 
 문법) 함수 이름은 같고 parameter [개수] 와 [타입] 을 다르게.
1. 함수 이름은 동일.
2. parameter 개수 또는 타입을 달라야 한다.
3. return 타입은 오버로딩의 판단기준이 아니다.
4. parameter 의 순서가 다름을 인정(주의)   
 */

class Human{
	String name;
	int age;
}

class OverTest{ //클래스 설계
	int add(int i) {
		return 100+i;
	}
	
	/*
	  int add(int s) { return s; } 이름 충돌
	 */
	
	int add(int i, int j) {
		System.out.println("오버로딩 : " + i + "," + j);
		return i + j;
	}
	
	String add(String s) {
		System.out.println("오버로딩 : " + s);
		return "hello" +s;
	}
	String add(String s, int i) {
		return "오버로딩";
	}
	
	void add(Human human) { //오버로딩 인정. 휴먼이란 타입의 객체 주소가 들어와야함.
		human.name = "홍길동";
		human.age = 100;
		System.out.println(human.name + " , " + human.age);
	}
	/*
	 * String add(int i, String s) { return ""; } //이것도 파라미터 순서가 다름을 인정하므로 오버로딩이다.
	 */
}


public class Ex13_Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("A"); //자동으로 parameter String 호출
		System.out.println('a'); //자동으로 parameter char 호출

		System.out.println();

		/*
			System.out.println();
			System.out.printlnString("A");
			System.out.printlnChar('a');
			당신은 함수를 암기해서 사용 .... 이름이 다 틀리니깐.
					 
		 */
		
		OverTest ot = new OverTest();
		int result = ot.add(100);
		System.out.println(result);
		result = ot.add(300, 400);
		System.out.println(result);
		
		System.out.println();
	}

}
