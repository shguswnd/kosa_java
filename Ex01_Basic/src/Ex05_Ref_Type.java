/*
  Ŭ������ ���赵�̴�, Ŭ���� ������ Ÿ��.
  Ŭ���� == ���赵 == Ÿ��
  
   Ŭ������ ��üȭ�� ���ؼ� ��� (���� ���� ����)
   ���α׷������� [new ������]�� ���ؼ� memory �� ���� ���´� >> ������� �� >> ��ü(�ν��Ͻ�)
   
   ���赵 ���� 2����
   1. ���������� ���� ���� >> 	public static void main(String[] args) {} ������ �ִ� Ŭ����
   2. ���������� ���� �Ұ��� >> main �Լ��� ���� ������ Ŭ���� >> ���� �����ִ� Ŭ���� >> ���̺귯��(LIB)
 */

class Apt2{
	int door = 10;
	int window = 20;	
}

/*
 * class Car{ int a; }
 * ���� �����ȿ� Ŭ������ �����ؼ��� �ȵ�.
 */

public class Ex05_Ref_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		num = 100;
		Apt2 apt2 = new Apt2(); //�ּҰ��� �������ϸ� �ּҰ��� �������� �޸𸮿� �ö󰡾��� �׷��� new ���
		//Apt2 ���赵�� ������� ����Ʈ�� ���� (JVM>>memory>>heap)
		System.out.println("apt2 : " + apt2); // �ּҰ��� �Ҵ� ... ssapt ������ apt2 ������ �ִ� �ּҰ����� �ʱ�ȭ.

		Apt2 ssapt = apt2; // �ּҰ��� �Ҵ� ... ssapt ������ apt2 ������ �ִ� �ּҰ����� �ʱ�ȭ
		
		int ssapt_Window = ssapt.window;
		System.out.println(ssapt_Window);
		//		apt2.
		
		
	}
}