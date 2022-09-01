import kr.or.kosa.Emp;

class Test2{
	int x = 100;
	void print() {
		System.out.println("부모함수 TEST2");
	}
}

class Test3 extends Test2{
	int x = 300; // 부모 무시하기(c#)//이런방식은 쓰지마시오.
	
	//재정의(검증)
	@Override
	void print() {
		System.out.println("자식이 부모의 함수를 재정의");
	}
	
	void print(String str) { //오버로딩
		System.out.println("나는 오버로딩 함수야 : " + str);
	}
	
}



public class Ex05_Override {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		System.out.println(t3.x);
		
		t3.print();
		
		
		
		
		Emp emp = new Emp(1000,"홍길동");
		System.out.println(emp);//kr.or.kosa.Emp@cac736f
		System.out.println(emp.toString());//kr.or.kosa.Emp@cac736f
		//두개값이 똑같음
		//emp를 찍으면 속에 .toString()가 숨겨져 있다,
		//emp는 사실 emp.toString() 동일함.
		//toString() 은 Object의 자원 ....... 주소값 return;
		//재정의하고 출력하면 emp == emp.toString이므로
		//Emp [empno=1000, ename=홍길동]
		//Emp [empno=1000, ename=홍길동]
		//둘다 이렇게 나옴
		//JAVA API 제공하는 수많은 클래스가 Object클래스의 toString() 재정의하고 있다.
		
		//그렇다면 주소값을 보고싶을땐 또 어떻게 할까??
		
	}
}
