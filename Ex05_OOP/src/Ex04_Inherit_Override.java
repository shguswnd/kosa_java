/*
 Today Point
 [��Ӱ���]���� override : ��Ӱ��迡�� �ڽ��� �θ��� �Լ��� [������]
 [��Ӱ���]���� [�ڽ� Ŭ����]�� [�θ�Ŭ����]�� �޼���(�Լ�)�� ������(������ �ٲ�)
 ������ : Ʋ�� ��ȭ�� ���� (�Լ��� �̸�, Ÿ��) �ƴϰ� ���븸 ��ȭ {�߰�ȣ �� �ȿ� �͸� ����}
 
 ����)
 1. �θ� �Լ� �̸� ����
 2. �θ� �Լ��� ��͵� �ǵ�� �ȵ�(parameter����)
 3. �θ� �Լ� return type ����
 4. �ᱹ {�ȿ� ���� ���ȿ� �ڵ常 ���� ����}
 */


class Point2{
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x + "/" + this.y;
	}
}

class Point3D extends Point2{
	int z = 6;
	
	//���ο� �Լ� �߰�
	//�߰� ....
	//Annotation�� Java code������ ������ �� ���� �ΰ����� ������ �����Ϸ��� �������� ���� ����/
	//@Override �����Ϸ��� ���������� ���� �� �Լ��� ������(�������̵�) �Ǿ����� ���� ��Ų��.
	
	
	//Spring �� 70% Annotation
	@Override
	String getPosition() {
		return this.x+"/"+this.y+"/"+this.z;
	}
	
}

//class test{
//	test a;
//	test b;
//	test c;
//	test(){
//		
//	}
//	test(test a, test b, test c){
//		this.a = a;
//		this.b = b;
//		this.c = c;
//	}
//}
//
//class test_1 extends test{
//	test t = new test();
//	test t1= new test();
//	test t3 = new test();
//	test_1(){
//		super(t, t1, t2);
//	}
//}

public class Ex04_Inherit_Override {
	
	public static void main(String[] args) {
		Point3D p = new Point3D();
		System.out.println(p.getPosition());
	}

}
