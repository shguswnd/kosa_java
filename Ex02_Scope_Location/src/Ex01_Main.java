import kr.or.kosa.common.Car;

//import kr.or.kosa.common.Car;
//import kr.or.kosa.common.;
/*
 Ŭ���� == ���赵 == Ÿ��
 
 Ŭ���� ���� ���( ���赵��� �Ǵ��ҷ��� �ּ��� ������ ������ �־�� �Ѵ�.
 �ʵ� + �Լ� + ������ �Լ�
 
 �ʵ�(field) >> ������, ���� ��ƾ� �Ѵ�. >> ��������, �������� ,��ǰ���� >> field >> variable
 �Լ�(method) >> ��� (����) >> �ڵ��� >> �޸���, �����, �Ҹ��� ����.
 + �߰������� ������ >> Ư���� ������ �Լ� >> ��ü�� ������ member field �ʱ�ȭ �������� ......

 Ŭ����, �ʵ�, ������, �Լ� : ����(����) >> ������, ������, ������
 
 >>public, private, default, protected
 
 
 >>kr.or.kosa.common �ȿ� Car Ŭ���� ���� >> public class CarP{} // ������ ����� �� �ִ� ���赵 // �ٿ���
 
  >>kr.or.kosa.common �ȿ� AirPlane >> class AirPlane { >> �ƹ��͵� �Ⱦ��� ������ default class AirPlane ���� ǥ��}
  >>default ���� ���������� ���� �ϰڴ�. : ���� package �ȿ����� �����Ҳ���, �ٸ� ��Ű������ �ٸ���Ű�������� ������ �Ұ����ϰ� �ϰڴ�.
  >>default �����ڴ� : ���� ����(package) ������ ���� ������......
  
  
  �ϳ��� �������� java ������ �������� Ŭ������ ���� �� �ִ�.
  >> Ex01_Main.java ������ �׾ȿ� Ex01_Main�̶�� Ŭ������ �ϳ� ������ �ִ�.
  >> �Ϲ������� �ʿ��� Ŭ������ ������ ���Ϸ� �����ؼ� ��� .... Apt.java
  >> �׳� ���� ... �غ� ���� ���������� ���� ���� �ʿ� ������??
  >>�ϳ��� ������ ������ �������� Ŭ������ ������ ���� �� ������, public�� �ϳ��� Ŭ������ ������ (��ǥ)
  
 */

class Emp { //�����ϰų� �ǽ��Ҷ� �ٷ� Ȯ��........
	
}


class Test{ // �����Ϸ��� default class Test �ؼ�
	int data; //instance variable // �����Ϸ��� default int data �� �ؼ���.
	public int p_data; //������ �ƴ����� �ٸ� �������� ��� �Ұ� ... public �ǹ̾���.
	private int pri_data; //���ߴ�, �����, ĸ��ȭ(����ȭ)
}

public class Ex01_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();//ctrl + shift + o (�ٸ� ��� �ҽ��� �޾����� ���� import�� �ڵ����� ��������.)
		//AirPlane air = new AirPlane(); �̷� Ŭ���� ���µ� �ؼ�... ������ ����.
//		car.
		Emp e = new Emp();
		
		Test t = new Test();
		//t.pri_data �̳༮�� ���Ұ����̴�.
		
	}

}