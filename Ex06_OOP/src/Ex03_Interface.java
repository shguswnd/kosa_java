/*
 �߻�Ŭ������ �������̽�
 
 �߻�Ŭ������ �������̽� ������.
 1. ������ ��ü ���� �Ұ��� (new ������ ���Ұ�) >> ȥ�� �� �� �� ����. 
 2.���
 �߻�Ŭ���� extends
 �������̽� implements
 
 class Car extends Abclass{}
 �������̽��� ����Ѵٸ� ���(Ȯ���ض�)�� �ƴ� ������ ���� ������̴�.
 class Car implements Ia{}
 �Ѵ� �߻��ڿ��� ������ �ִ� >> extends, implement >> ������ ���� ����(������)
 
 
 �߻�Ŭ������ �������̽� ������.
 1. �߻�Ŭ����(�ϼ� + �̿ϼ�), �������̽� (������ �̿ϼ�)
 2. ��Ģ������ Ŭ������ ���߻��(���������)�� �ȵ����� �������̽��� ���߱����� ����.
 >>�������� ���� >> ��Ƹ�Ƽ� ū ��� >> �ʹ� ū ����� ����� ��뼺�� �׸��� ���뼺�� ������.
 Ia, Ib, Ic
 class Test extends Object implement Ia, Ib, Ic
 Tip) �������̽��� �������̽������� ��Ӱ��� (extends) >> ����� ũ�� ���� �� �ִ�.
 
 4. �������̽� (����� ������ �������� �̿ϼ� �߻�(�Լ�) >> JDK8 �������ʹ� (Default ��, static���� ����� ������ ���� �Ⱦ�.)
 
 
 �ʱް������� �ü�����
 1. �������̽��� [[[[������]]]] �������� ���� (�������̽��� �θ�Ÿ��) *************************************
 2. ���� �������� ���� Ŭ������ �ϳ��� �����ִ� ���(���� �θ� ��������)
 3. Java API �� ���� (�̸� �������) Interface ���� (�������� �ʾƵ�) 
 4. �������̽� (~able) : �����ִ�, ������ �� �ִ�, 
 5. ��ü�� ���� ��(��ü�� ����) >> [[[ ������ ]]] 
 
 

 �������̽� : ���, ǥ���� ����� �� (ǥ���� �����....) (��Ģ, �Ծ�)
 ����Ʈ���� ���� �ֻ��� �ܰ� ......(������ ���� â���� ���� �����)
 �ʱް����ڰ� �������̽� ����� ����........?
 �ʱް����ڴ� ������� �������̽��� ����ϴ� ����� ó�������� ������ �������.
 �������̽��� ������� >> �����ΰ� ����  
 
 
 
 ISO8859 : ���ΰ� ����� ǥ���� �־��ְ� ǥ���� ���߸� ����� ������
 
 Interface
 1. ���� �����θ� ������ ���� �ʴ� : ���� ���� ����. : ��Ģ(���)
 �ý��ۿ��� �̵��ϴ� ���� move ��� �̸��� ����ϰ� �̵��ÿ��� ��ǥ���� �޾ƾ� �Ѵ�.
 >> ���� >> void move(int x, int y); >> {������ �˾Ƽ�} Ŭ���� �˾Ƽ� ...... >> ������ >> ����
 >> JAVA API �������̽� �����ϰ� �����ϴ� Ŭ������ �̹� �� ����.
 >> Collection(�����迭) >> Vector, [[ArrayList]], HashSet, [[HashMap]]
 Collection Ŭ������ �� ���� �������̽� �����ϰ� �ִ� Ŭ����
 
 2. �������
 2.1 ���(final) : [public static final] int VERSION = 1 //���� �빮��!!! >> �ǻ��� (int VERSION=1;)
 				  �����ϸ� �����Ϸ��� �˾Ƽ� [public static final] ���.
 2.2 �߻��Լ�(method) : public abstract void run() ;///// *���������ڴ� ������ public �������
 					  �����ϸ� �����Ϸ��� �˾Ƽ� [public abstract] ���.
 					  
 interface Aa{
 	int VERSION=1;
 	void run();
 	String move(int x, int y);
 }
 
 
 ����
 interface Aable() // �ƹ� �ڿ��� ������ �ʾƵ� ��.
 interface Aable{int NUM=10;}
 interface Aable{void run();}
 
 class Test extends Object implements Ia, Ib, Ic{} //���� �������̽�
 class Test implements Ia, Ib, Ic
 
 
 */


interface Ia{
	int AGE=200; //��� //���� �ҽ� : public static final int AGE
	String GENDGER="��"; // public static final String GENDER
	String print(); //�߻��ڿ� public abstract String print();
	void meassage(String str);//�߻��Լ� //public abstract void meassage(String str);
}

interface Ib{
	int AGE=10;
	void info();
	String val(String s);
}


class Test2 implements Ia{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void meassage(String str) {
		// TODO Auto-generated method stub
		
	}
}

class Test3 implements Ia, Ib{ //���� ����

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String val(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void meassage(String str) {
		// TODO Auto-generated method stub
	
	}
	
}

public class Ex03_Interface {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		Ia ia = t2; //������ >> �θ�� �ڽİ�ü�� �ּҸ� ���� �� �ִ�(������)
		ia.meassage("������"); //�����ǵ� �ڿ�(�ڽ� �Լ�) ȣ��
		System.out.println(ia.GENDGER); //����� ������ ����.
		
		
		
		///////////////////////////////////////////
		
		Test3 t3 = new Test3();
		Ia ia2 = t3;
		Ib ib2 = t3;
		System.out.println();
	
	}

}
