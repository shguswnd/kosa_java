/*
	1. �ڹٰ� �����ϴ� �⺻ Ÿ��(�ý��� Ÿ�� : ����Ÿ��) >> 8����
	2. 8���� �⺻ Ÿ�� [���� ����]�ϴ� Ÿ��
	3. ���� > ���� > (���� ����, 0, ��������) byte (8bit) -128 ~ 127  ex) byte b = 10;
	 									char �ѹ��ڸ� ǥ���ϴ� �ڷ��� (������, Ư������, ����) 1byte
	 										 �ѱ� 1�� > 2����Ʈ
	 										 ����) char (2����Ʈ) : �ѱ�, ������, Ư������, ���� ������� 2����Ʈ�� �������.
	 										 ũ�⿡ ������� 2����Ʈ >> unicode >> �ƽ�Ű�ڵ�
	 										 
	 										 ex) char c = 'A', char c2 = '��'
	 									short (c��� ȣȯ��)
	 									int (-21 ~ 21 �� ���� : 4����Ʈ) *** ������ �⺻ Ÿ�� ***
	 									loag(8byte)
		   > �Ǽ�(�ε��Ҽ���) : 			float (4byte)
	 									double(8byte) >> ���е��� float ���� ����(ǥ���Ǵ� ���� ������ ũ��) *** �Ǽ��� �⺻Ÿ�� ***
		   ���� > ��, ���� > true, flase	boolean
	
	
** ���ڿ��� ǥ�� ** 
String name = "" ��� >> String �� ���� Ŭ���� (���� Ÿ��) ������ String str = new String()
��Ҵ� ��Ÿ�� ó�� �������.

�ڹ�Ÿ��
1. ��Ÿ�� : 8���� �⺻ > int i = 100; int j = 200;
2. ����Ÿ��(�ּҰ�) : Ŭ����, �迭 : ������ ���� ����Ǵ� ���� �ƴ϶� �ּҰ��� ���� ref type

 */

//class == ���赵 == Data Type

class Car2{
	//Car2�� ������ Ÿ��, Car2���赵 �̴� >> ��üȭ >> �޸� �ø�.(new)
	String color;
	int window;
}

public class Ex04_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = new String("asd");
//		System.out.print(str);
		String str = "ȫ�浿";
		int age = 100;
		
		Car2 c; //c�� main �Լ� �ȿ� �ִ� ���� �����̴�.
		c = new Car2(); // �������� �ʱ�ȭ ���� �Ұ���.
		//c��� ������ �ʱ�ȭ >> �ּҰ��� ������ �ϴ°� >> new �����ڸ� ���ؼ� �޸𸮿� �Ҵ� �ּ�.
		
		System.out.print(c);
		
		
		Car2 c2 = new Car2();
		
		c2.window = 100;
		c2.color = "gold";
		
		int i = 10;
		int j;
		j = 20;
		
		int k;
		k = j; //point (���Ҵ� j ������ ������ ���� k���� �Ҵ�)
		System.out.println("k : " + k); //20
		k = 300;
		System.out.println("k : " + k);
		System.out.println("j���� ��ȯ ���� : " + j);
		
//		int p, q, g; //�������� ����.
		//�̷� ���� Array : int[] arr = new int[3];
		
		//int (-21�� ~ 21��)
		int p = 100000000;
//		int p2 = 10000000000;
		//The literal 10000000000 of type int is out range
		//�����ڰ� ���� �Է��� �� ( ���ͳ�(�ִ±״��)�� �������� int��� �׸��� ��Ƽ� ó���Ѵ�.)
		//4����Ʈ �׸��ε�, �Է��� �迭���� �Ѿ� ����.
		//1. �ذ���
		//long p3 = 10000000000L;
		//long Ÿ������ ����Ʈ�ø��� �������� ���Ŀ� �°� L�� ���δ�.
		//�� ���ͷ����� long �׸����� ��Ƽ� �Ҵ�.
		
		long l = 100;
		//���� Ÿ�԰��� ū Ÿ�Կ� �ִ°��� ������ �ȵ�. ���� ����ȯ ��Ŵ.

		
//		int p2 = 10000000000L;
		// ���ͷ� ���� ���� ������ ������ ������Ÿ���� ���� ������ �ȴ�.

		int p2 = (int) 10000000000L;
		//ĳ���� >>Ÿ�� ��ȯ
		//��ó�� �� ��� ���� ���� ������ �����Ͱ� ����ǹǷ� ������ �սǵ�.
		
		
		System.out.print(p2);
		
		
//		char 2byte ������
//		�ѹ��ڸ� ǥ���ϱ� ���ؼ� ���� �ڷ���.
//		������ Ư������ ���� �ѱ۱����� �ѹ��ڷ� ǥ���Ϸ�����.
//		���ڿ� (������ ����) : "������������" String name = "as";
// 		���� (�ѹ���) : '��'	char ch = 'a'

		char single = '��';
		System.out.println(single);
		char s = 'A';
		System.out.println(single);
		
		//char ���� Ÿ��
		//char ���ڸ� ���������� ���������� �������� ������ ����.
		//�������� �ƽ�Ű �ڵ�ǥ�� ������� ���.
		//���� ȣȯ
		
		
		int intch = 'A';
		// ���������� �ڵ� ����ȯ�� �Ͼ��.... �Ͻ���(������)
		char ch2 = 'a';
		System.out.println(ch2);
		int intch2 = (int)ch2; //���������� ó�������� ... casting ����ó��.
		
		System.out.println(intch2);
		
		int intch3 = 65;
		char ch3 = (char)intch3;
		System.out.println(ch3);
		
		//�������� (�Ҵ翡 �־�, ���� �������� �װ��� ����ִ� Ÿ���� ����)
		//������ ����ȯ�� �Ͻ��� ����ȯ ����.
		//����, ������ ����ȯ
		
		/*
		 Today point
		 1. �Ҵ翡�� ������ ������ �ִ� ���� �������� ������ Ÿ���� ����
		 2. ������ Ÿ�� ũ�⸦ Ȯ������
		 3. ūŸ�Կ��� ���� Ÿ���� ���� ������ �ִ�.
		 4. ���� Ÿ�Կ��� ū Ÿ���� �ְ��ʹٸ� ������ (casting)
		 å���� �츮��.
		 char << int ������ char << (char)int ������ �ս� �߻� ����. 
		 int << char ���������� �����Ϸ��� ģ���ϰ� int << (int)char ó����.
		 */
		
		//String ���ڿ��� ���� �� �ִ� Ÿ��
		//���¹� : int, double ó�� ���.
		
		
		String name = "hello world";
		
		System.out.println(name);
		
		String name2 = name + "�氡�氡";
		
		System.out.println(name2);
		//syso ctrl+Space
		
		// + >> �������, ���� ����
		//tip) Oracle �����ͺ��̽�(���) > + �������, || ���տ����� (ex '�ȳ�' ||'�氡')
		
		//tip) �ڹٿ��� Ư������ ó��.
		//�̽����������� : Ư������ �տ� \ ���̱�.
		char sing ='\''; // \���ؼ� ' ���������� ǥ��
		
		System.out.println(sing);
		
		String test1 = "ȫ\"��\"��";
		System.out.println(test1);
		
		String str3 = "1000";
		String str4 = "10";
		String result = str3 + str4;
		
		System.out.println(result);
		
		
		String path = "C:\\Temp";
		System.out.println(path);
		
		//�Ǽ��� Ÿ�� (�ε��Ҽ���)
		//float 4byte
		//double 8byte //�Ǽ� ���ͷ� �⺻���� double�̴�.
		
		float f = 3.14f;
		//���ͷ� ���� �⺻ double�̱� ������
		// float f = 3.14; �δ� ������ ��
		// ���� ������ ����� ������ �̷��� ���� double�� ���°� ����.
		
//		float f = 3.14; //������ ����(���� �׸��� ũ��); > double�� �ٲ�.
		
		
		byte q = (byte)129;
		System.out.println();
		
	}
}