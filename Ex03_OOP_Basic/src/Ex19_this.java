
/*
 this (이것) 
 1. 객체 자신을 가르키는 this (앞으로 생성될 객체의 주소를 담을 곳 가정)
 인스턴스 자신을 가리키는 참조변수. 인스턴스의 주소가 저장되어있음.
 ((( 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재 )))
 
 2. this 객체자신의 주소(생성자 호출) >> [원칙적으로 생성자는 객체 생성시] [한개만 호출]
 그런데 this를 학습하면 예외적으로 this() 통해서 [여러개의 생성자]를 호출 할 수 있다.
 static은 객체자원이라 this 사용 불가능.
 */

class Test{
	int i;
	int j;
	Test(){ //생성자
		
	}
	Test(int i, int j){
		this.i = i;
		this.j = j;
	}
}


class Book2{
	String bookname;
	Book2(String bookname){
		this.bookname = bookname;
	}
}

//Today Point

class Socar{
	String color;
	String geartype;
	int door;
	
	Socar(){ //기본 설정
		this.color = "red"; //member field (instance variable) 사용시 반드시 this 
		this.geartype = "auto";
		this.door = 2;
	}
	
	Socar(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
	
	void print() {
		System.out.println(this.color + " , " + this.geartype + " , " + this.door);
	}
	
}


public class Ex19_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test(100,200);
		System.out.println(t.i);
	
		Socar socar = new Socar();
		socar.print();
		Socar socar2 = new Socar("gold", "auto", 6);
		socar2.print();
	}

}
