import java.awt.GradientPaint;

import javax.swing.text.AsyncBoxView.ChildLocator;

/*
 OOPƯ¡ (�������� ����(Ŭ����)���� �����ؼ� �ϳ��� ū ��ǰ�� ����� ����)
 1. ���.
 2. ĸ��ȭ(����ȭ) >>> private
 3. ������(��Ӱ��迡�� �θ� Ÿ���� �ڽ� Ÿ���� �ּҸ� ���� �� �ִ�.
  
  
 ���
 java : child extends Base
 C# : child : Base
 
 Ư¡
 1. ���� ����� �Ұ� ( ���ϻ�� (������ ��Ӱ���))
 2. ���� ��� (������ ���) ���� (�������� Ŭ������ ���)
 3. ���� ����� ���� (interface)
 
 
 ���
 1. ������ �ǹ� : ���뼺
 2. ���� : �ʱ� ���� ���
 3. ���뼺 >> ���� >> �ð� (�������� ���赵 ���� ... �θ�, �ڽ� ����)

 ��Ӱ��迡����
 �θ���� �޸𸮿� �ö󰣴� .... �ڽļ�����
 
 
 GrandFather >> Father >> Child < heap �޸𸮿� 3��ü>
 
 //�����ڰ� ����� ��� Ŭ������ default�� Object�� Ŭ������ ��� �޴´�.
 // class Car extends Object ��� �ؼ�.
 // Object�� ��� Ŭ������ root : ��� Ŭ������ �θ� 
 */

/*
 �ǹ�(����) ȯ��
 �Ѱ��� Ŭ������ ���� ����� (x)
 
 ���赵 1�� ��� ������ ���� ���������� �Ұ���.
 ���赵 �������� ������ .... �����߻� .... (����, ����)
 
 ���θ� : �������, ��۰���, �Ǹ�ó, ȸ������, ��ǰ����..............
 ����
 
 �������� ���赵�� ���� .... �̾��ִ� ����
 
 1.���(is ~ a : ���) ��(��) ~�̴�(�θ� �ڿ�)
 2. ���� (has ~ a : ����) ��(��) ~ ������ �ִ�.
 
 
 ��)
 ���� �����̴�
 �� extends ����
 �ﰢ���� �����̴�
 �ﰢ�� extends ����
 
 �� �� �� ����
 ���� ���̴�? No
 ���� ���� ������ �ִ� (O)
 has ~ a (��ǰ����)
 >> class �� {���̶�� ��ǰ�� member field}
 
 ���� ����
 ������ �����̴� (x)
 ������ ������ ������ �ִ� (O)
 >> class ���� {}  
 >> class ���� {���� member field}
 
 
 ���� �����̴�.
 �ﰢ���� �����̴�.
 �簢���� �����̴�.
 
 ������ �и� (������) �����ڿ� : �߻�ȭ, �Ϲ�ȭ (�׸���, ����)
 ���� ��üȭ, Ư��ȭ (���θ��� ������ Ư¡) (������, ����)
 
 �� : ��ǥ�� (x, y) 
 ���� ���� ������ �ִ�.
 �ﰢ���� ���� ������ �ִ�.
 �簢���� ���� ������ �ִ�.
 
 class Shapre{�׸���, ����} >> ��Ӱ��� �θ� (��, �ﰢ��, �簢��)
 class Point{��ǥ��} >> ���԰��� (��ǰ)
 
 ��üȭ, Ư��ȭ : Circle, Triangle
 
 
 */

class Car{
	
}

class GrandFather{
	public int gmoney = 5000;
	private int pmoney = 10000; //(��Ӱ��迩�� ���� �Ұ�)
	public GrandFather() {
		System.out.println("GrandFather");
	}
	
	public int getMoney() {
		return 0;
	}
	public void getMoney(int pmoney) {
		this.gmoney = pmoney;
	}
}

class Father extends GrandFather{
	public int fmoney = 3000;
	public Father() {
		System.out.println("Father");
	}
}

class Child extends Father{
	public int cmoney = 1000;
	public Child() {
		System.out.println("Child");
	}
}


public class Ex01_Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);
		

		Car car = new Car();

	}

}
