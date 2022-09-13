/*
 �߻�Ŭ����
 >> �̿ϼ� Ŭ����(�̿ϼ� ���赵)
 1. �ϼ��� �ڵ� + �̿ϼ� �ڵ�
 2. �ϼ�(�Լ�) ������� �ִ� �Լ� + �̿ϼ�(�Լ�) ������� ���� �Լ� >> public void run();
 �����Լ�) public void run() {�����;}
 3. �ϼ��� Ŭ����(new ����) >> �̿ϼ� Ŭ���� (������ ��ü�� ������ ��ü ���� �Ұ�)
 
 ������ ���忡��
 >> �ǵ� >> �ݵ�� ������ �ض� >> ������ ������ ����(���ΰ��� ������ �����ϱ�, ������ ���ϴϱ�!!!!)
 
 
 
 */
class Car{
	void run() {} //�����Ͼȿ� ��� ������ ��� ������� ������ �ϼ��� �ڵ�
}

class Hcar extends Car{
	//����
	@Override
	void run() {
		System.out.println("������");
	}
}
//Car ���� ����� run() ������ �ؼ� ������ �ٲپ��.
//�׷��� ������ ����. Hcar ����� ����� �ǹ������� �ƴ�.
//������ ���� abstract �������.
//���ڵ�� �������� ����.

abstract class Abclass{ //Ŭ���� �ȿ� �ּ� 1�� �̻��� �߻��Լ��� ������ �ִ� Ŭ����
	//�ϼ��� �ڵ�
	int pos;
	void run() {
		pos++;
	}
	
	//�̿ϼ� �ڵ� �߰� (�̿ϼ� �Լ� : �߻��Լ�)
	abstract void stop(); //�߻�޼ҵ� : ������� ����. >> ������ ����
	
}

class Child extends Abclass{

	@Override
	void stop() { // ������� ����� ����(������)
		this.pos = 0;
		System.out.println("stop : " + this.pos);		
	}
	
}

class Child2 extends Abclass{

	@Override
	void stop() { // ������� ����� ����(������)
		this.pos = 0;
		System.out.println("stop : " + -1);		
	}
	
}
public class Ex01_abstract_class {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.run();
		ch.run();
		ch.stop();
		
		Child2 ch2 = new Child2();
		ch2.stop();
		
		Abclass ab = ch; //������
		//��Ӱ��迡�� �θ�Ÿ���� ���������� �ڽ�Ÿ�԰�ü���� �ּҸ� ���� �� �ִ� (������)
		//�� �θ�� �ڽ��� �͸� �� �� �ִ�.
		//�� ������ ... �ڽ��� �ڿ��� ����
		ab.run();
		ab.stop();  //�ڽ��� �޼ҵ带 �����Ѵ�. >> �������� �����غ��� �������� �����ε��� �θ��µ� �ڽ��Լ��� ������ �Ǿ��ְ� �θ�� ������������.
		
		
	}

}
