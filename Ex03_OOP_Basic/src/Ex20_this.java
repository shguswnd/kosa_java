/*
 ��Ģ : ��ü�� ���鶧 �����ڴ� 1���� ȣ�� ����(new Car() or new Car(10).....)
 
  this(��ü) : �������� �����ڸ� ȣ�� ����
  
  �ڵ差�� ����
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
		// default �� Zcar zcar = new Zcar(); ����ٸ�, �����ڸ� ���� this() �����ڸ� ���� �Ʒ��� �����ڸ� �� �׷��Ƿ� �⺻ �������� syso ����� ����.
		//������ �⺻ ������ ����, �����ε� ������ ���� ���������� ��ȯ�ϸ鼭 �⺻ �������� ���� �ڵ� ����.
		//����. �ݺ��Ǵ� �ڵ带 ����ó����.
		//�ڵ��� ������.
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

	Zcar2() { //�⺻�ɼ� (red, 1, auto)
		this.color = "red";
		this.geartype = "auto";
		this.door = 1;
		System.out.println("1");
	}
	
	Zcar2(String color, int door) { // �ɼ�) color door ���� (default auto)
		this(color, door, "auto");
		System.out.println("2");
	}
	
	Zcar2(String color, int door, String geartype) { //��
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
