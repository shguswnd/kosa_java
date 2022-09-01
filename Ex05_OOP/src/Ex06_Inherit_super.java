/*
 this : 객체 자신을 가르키는 this(this.empno, this.ename)
 this : 생성자를 호출하는 this (this(100, "red"))
 
 상속관계
 부모, 자식
 
 super(현재 자식이 부모의 접근할 수 있는 주소값을 가질 수 있다.) : 상속관계에서의 부모에 접근(super 부모객체의 주소값)
 
 1. super >> 상속관계에서 부모자원에 접근
 2. super >> 상속관계에서 부모의 생성자를 호출(명시적으로)

 Tip)
 C# : base()
 java : super()
 
 */

class Base{
	String basename;
	Base(){
		System.out.println("Base 기본 생성자 함수");
	}
	Base(String basename){
		this.basename = basename;
		System.out.println("basename : " + this.basename);
	}
	void method() {
		System.out.println("부모 method");
	}
}


class Derived extends Base{
	String dname;
	public Derived() {
		// super(); 기본값. 
		System.out.println("Derived 기본 생성자 함수");
	}
	
	Derived(String dname){
		//부모 생성자 호출
		super(dname);
		this.dname = dname;
		System.out.println("dname : " + this.dname);
	}
	
	   @Override
	    void method() {
	    	System.out.println("부모자원 재정의");
	    }
		//어느날 부모님 그리워요  ...(자원이 그리워요)
	    //유일한 방법 ... super
	    void pmethod() {
	    	super.method(); //부모 함수
	    	//재정의 상태에서 부모 자원을 부를 수 있는 유일한 방법 : super
	    }
//	@Override
//	public method() {
//		System.out.println("부모자원 재정의");
//	}
	//위로 올라가는 유일한 방법....super
//	void pmethod() {
//		super.method(); //부모 함수
//		//재정의 상테에서 부모 자원을 부를 수 있는 유일한 방법 : super
//	}
}

public class Ex06_Inherit_super {

	public static void main(String[] args) {
		Derived d = new Derived("홍길동");
		d.method(); //정의를 안하면 

	}

}
