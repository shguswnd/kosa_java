/*
 원칙 : 객체를 만들때 생성자는 1개만 호출 가능(new Car() or new Car(10).....)
 
  this(객체) : 여러개의 생성자를 호출 가능
  
  코드량도 감소
 */

/*class Zcar{
	String color;
	String geartype;
	int door;
	
	Zcar() {
		
	}
	
	Zcar(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
	
	void print() {
		System.out.println(this.color + "," + this.geartype + "," + this.door);
	}
}*/


class Zcar{
	String color;
	String geartype;
	int door;
	
	Zcar() {
		// default 로 Zcar zcar = new Zcar(); 만든다면, 생성자를 보고 this() 생성자를 보고 아래의 생성자를 들어감 그러므로 기본 생성자의 syso 출력을 안함.
		//순서가 기본 생성자 접근, 오버로딩 생성자 접근 마지막으로 반환하면서 기본 생성자의 남은 코드 접근.
		//장점. 반복되는 코드를 예외처리함.
		//코드의 가독성.
		this("red", "auto", 2);
		System.out.println("default....");
	}
	
	Zcar(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading ...");
	}
	
	void print() {
		System.out.println(this.color + "," + this.geartype + "," + this.door);
	}
}




class Zcar2{
	String color;
	String geartype;
	int door;

	Zcar2() { //기본옵션 (red, 1, auto)
		this.color = "red";
		this.geartype = "auto";
		this.door = 1;
		System.out.println("1");
	}
	
	Zcar2(String color, int door) { // 옵션) color door 변경 (default auto)
		this(color, door, "auto");
		System.out.println("2");
	}
	
	Zcar2(String color, int door, String geartype) { //다
		this.color = color;
		this.door = door;
		this.geartype = geartype;
		System.out.println("3");
	}
	
	void print() {
		System.out.println(this.color + "," + this.door + "," + this.geartype);
	}
}



public class Ex20_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zcar zcar = new Zcar();
		Zcar2 zcar2 = new Zcar2("asd",5);
		
	}

}
