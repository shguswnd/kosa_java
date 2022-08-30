/*
 �Լ� ���� parameter ���� ���� , �ּ� ����
 void m(int x) {}  >>>>> x������ ���� �޴´�.
 ȣ�� m(100);
 
 y = 1000; ���� ...
 
 call by value
 -------------------------------------------------
 void m2(Car c) {} >>>>> c������ �ּҰ��� �޴´�.
 
 
 Car c2 = new Car();
 ȣ�� m2(c2); // ���� Ÿ���� �ּҰ��� �����Ѵ�.
 
 call by ref
*/

class Data{
	int i;	
}

public class Ex12_Method_Call {

	static void scall(Data sdata) { //default static
		System.out.println("�Լ� : " + sdata.i);
		sdata.i = 111;//0xA���� i ���� 111�� �ٲ�.
	}
	
	static void vcall(int x) { //default static 
		System.out.println("before x : " + x);
		x = 8888;
		System.out.println("after x : " + x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data(); //d�� �ּҰ� 0xA����
		d.i = 100;
		System.out.println("d.i : " + d.i);
		
		scall(d); //�ּҰ� ���� 0xA����
		System.out.println("d.i : " + d.i);
		///////////////////////////////////////////////////////////////////////////////////////
		
		vcall(d.i); //���� ����(100)
		
		System.out.println("d.i : " + d.i);
	}

}