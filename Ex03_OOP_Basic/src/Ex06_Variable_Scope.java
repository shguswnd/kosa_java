/*
  
 
 instance variable >> class Car {private String color;}
>> 생성되는 객체마다 다른 색상을 가질 수 있다.


 local variable >> class Car { public void move() { int speed =0; } }
 main 함수 >> local variable 로컬변수는 반드시 초기화 해줘야함. 실행시 문제 발생.
 
 block variable >> class Car { public void move() { for(int i; i<10...}}
 //제어문 끝나면 리셋

static variable >> 공유자원 (객체간), 객체생성 이전에 memory 올라가는 자원 ( 영역 : class area, mem

객체를 만드는 유일한 방법 : new 메모리에 .....

static new 없이도 메모리에 올라감. 
 
 
 
 */


class Variable{
	int iv;
	/*
	 1. member field , instance variable
	 2. iv 언제 사용가능 할까(메모리에 언제 올라 갈까?)
	 클래스 new 할때 메모리에 생성. >> heap 메모리에 객체가 생성됨. >> 그 객체안에 iv 생성.
	 
	 2-1. new를 한번더 사용하여 새로운 객체가 만들면 >> heap 메모리 객체 생성 >> 객체안에 iv 생성. iv는 객체마다 생성되고 
	 이런걸 instance variable 이라고 한다.
	
	 3. 목적 : 데이터 (정보), 자료를 담을 목적
	 3.1 정보 : 고유, 상태 ,부품(class)
	 ex) 자동차 -> 고유(자동차번호, 제조회사....) 상태(스피트, rpm....), 부품(엔진, 네비....)
	 - 생성되는 객체마다 다른 값을 가질 수 있다.
	 - 그래서 초기화를 해서 값을 강제하지 않는다.
	 - default 값을 가지고 있다. (int > 0, double > 0.0, char > 빈문자'\u0000', 
	   boolean > false, String > null, Car > null
	 
	 -iv 변수의 생성 시점 : new 라는 연산자를 통해서 heap Variable 이름의 객체가 만들어지고 나서 바로 생성(그 안에)
	  
	  
	  *********
	  메모리접근을 보면 
	  Car car = new Car()를 만들다고 생각하면,
	  new를 했을때 heap 영역에 Car 객체가 생성이되고 인트턴스변수가 생김.
	  그리고 main의 car 변수는 stack 메모리에 생성이 된다. 왜냐? static 이며 main을 보고 컴파일 하자마다 바로 변수가 생성이 되기 때문에
	  결구 car라는 stack 영역의 변수는 heap영역의 Car 객체의 주소를 받는다.
	
	*/
	static int cv;
	/*
	  1. class variable (클래스 변수) >> 객체보다 한단계 위의 변수, 일반적으로는 static variable (객체간 공유자원) 
	  2. 목적 : 정보를 담는 것 (생성되는 모든 객체가 공유하는 자원)
	     >> 생성되는 모든 객체 (heap 영역에 생성된 객체들이 공유하는 자원)
	  3. 접근방법 
	     1. class 이름.static 변수명. 객체 주소값 없이 사용 가능. >> Variable.cv 
	     >> why(객체가 생성되기 전에 메모리에 올라가니깐 그 접근 방법도 클래스란 이름을 통해서 접근)
	     2. Variable v = new Variable(); >> v.cv  
	        Variable v2 = new Variable(); >> v2.cv
	        >> v.cv == v2.cv(같은 주소를 바라본다 : static 변수 주소)
	        
	  4. 생성시점.
	  	 Hello.java >> javac Hello.java > Hello.class 란 저수준언어로 만듬.
	  	 > java.exe Hello 엔터 실행.
	  	 > jvm이 os에게 메모리 빌림. > 정리(영역을 나눔) > 컴퍼일러안에 class Loader System (클래스로더 : 해석기)
	  	 > 클래스 정보를 읽음(metadata : 어떠한 클래스의 정보) >> class area(method area) 메모리에 올림.(언제, 어떤 자원, 버전..)
	  	 > 그 클래스 안에 static이 보이면, static variable 또는 static method 있다면,
	  	 > 두 녀석을 class area(method area) 영역에 할당
	  	 > 그런데 함수의 이름 만약에 main() 이라면 정해진 규칙에 따라서 실행합니다(Stack 영역) 자원할당.
	  	 
	  	 Variable sort
	  	 static > instance > local > block	  	 
	 */
	
	void method() {
		int iv=0;
		
		/*
		 local variable ( 함수 안에 : 지역변수 : 사용전에 반드시 초기화)
		 생명주기) 함수가 호출되면 그때 생성 (stack 생성되었다고 함수가 끝나면, 강제 return함)
		 
		 
		 !! 순서
		 스택영역 main함수가 쌓임 >> 만약 heap영역의 객체가 있다면 객체안의 메소드를 heap에 있음 그러므로
		 메소드 안의 지역 변수들은 아직 생성이 안된것 그렇가면 iv = 0 값은 언제 생성이 되냐면,
		 스택영역의 main 에서 메소드를 호출하고 메소드를 스택에서 받고 거기서 iv =0 값 초기화 한다. 그리고 호출이 끝나면 스택은 위에서부터
		 순차적으로 반환을 하고 마지막 main에서 실행이 끝나면 종료를 한다.
		
		  */
	}
	
}

public class Ex06_Variable_Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable.cv = 100;
		//Ex06_Variable_Scope.test();
		Ex06_Variable_Scope ex06 = new Ex06_Variable_Scope();
		
		ex06.method();
		
		Variable v = new Variable();
		System.out.println("v.cv : " + v.cv);
		
		
		
	}
	public void method(){
		System.out.println("나 일반함수");
	}
	public static void test() {
		
	}

}
