
/*
 this (�̰�) 
 1. ��ü �ڽ��� ����Ű�� this (������ ������ ��ü�� �ּҸ� ���� �� ����)
 �ν��Ͻ� �ڽ��� ����Ű�� ��������. �ν��Ͻ��� �ּҰ� ����Ǿ�����.
 ((( ��� �ν��Ͻ� �޼��忡 ���������� ������ ä�� ���� )))
 
 2. this ��ü�ڽ��� �ּ�(������ ȣ��) >> [��Ģ������ �����ڴ� ��ü ������] [�Ѱ��� ȣ��]
 �׷��� this�� �н��ϸ� ���������� this() ���ؼ� [�������� ������]�� ȣ�� �� �� �ִ�.
 static�� ��ü�ڿ��̶� this ��� �Ұ���.
 */

class Test{
	int i;
	int j;
	Test(){ //������
		
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
	
	Socar(){ //�⺻ ����
		this.color = "red"; //member field (instance variable) ���� �ݵ�� this 
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