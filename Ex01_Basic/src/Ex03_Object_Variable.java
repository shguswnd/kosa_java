
//����Ʈ ���赵
class Apt{ //���赵 == ������ Ÿ��(���� Ÿ���� ��� ���� ū Ÿ��)
	int window;
}

//������ Ÿ�� ������ ex) int number; >> number ��� ������ Ÿ�Կ� �´� ���� ������. 
//Apt apt


public class Ex03_Object_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 100;
		Apt apt = new Apt();
		Apt apt2 = new Apt();
		//���� Apt Ÿ�� apt ����
		//apt ������ Apt Ÿ���� ���� ������ �ϴ� �ּҰ�.
		//������ ����Ʈ�� �޸𸮿� �÷��� ����Ʈ�� �����ǰ� �� �ּҰ� ���巯 ��.
		//������ ��� : new (������)
		
		//heap�̶�� �޸𸮿� ����Ʈ�� ��������� �ּҰ� �����ǰ�
		//������ �ּҰ��� apt ������ ������.
		
		System.out.println("apt : " + apt);
		System.out.println("apt2 : " + apt2);
		//apt �� ��������� ������ ���� ����µ� �̰� ���۵� ���̴�.(�ּҰ� ���ʿ� �����ϱ�?���� ������)
		//Apt + @ + 626b2d4a >> ���赵���̸� + @ + �ּҰ�
		//. �� �ּҸ� ã�ư��� ������
		// �������� ��ü���� �ְ�, ���ÿ��� ������ �ִ�.
		// �׷��� ���� ��ü�� ��������� apt ������ ���ø޸𸮸� ���� �ּҰ��� ������ �ְ�,
		// �ּҸ� ���ÿ��� ã�� ���������� �� ���� ��ü���� ����� ��.
		// . �����ڴ� �ּҸ� ã�ư��� �����ڷ� �ּ� ã�� ������ �޼ҵ�, ������ ��밡��.
		
		System.out.println(apt == apt2); //�� ������ �ּҰ� ����?, Ʋ���Ƿ� false ����.
		apt2.window = 20;
		
		Apt apt3 = apt2; 
		System.out.println("apt3 : â���� �� : " + apt3.window);

		// ��Ÿ�԰� �ּ�Ÿ�� �����ϱ�.
		/*
			Ex03_Object_Variable �ҽ� ����
			javac Ex03_Object_Variable.java >> Ex03_Object_Variable.class ��������
			java Ex03_Object_Variable ����
			
			JVM ���� >> OS >> JAVA �޸� ����. (��ȹ����) >> �ڿ��Ҵ� (�޸�) >> ���α׷� ����.
			>> ����ߴ� �޸� OS ��ȯ ... end
			>>>>>>>>>>>>
			��Ŭ���� ���� ���� �� CTRL + f11
			
			1. main �Լ��ȿ� ���������� �ݵ�� �ʱ�ȭ�ϰ� ���.
			2. ��� >> main �Լ� >> ������ >> ������ ���� ���� ����.			
		*/
		
	}
}