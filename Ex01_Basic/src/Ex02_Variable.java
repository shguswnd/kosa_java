//�����ּ�
/*
 �����ּ�
 Ex02_Variable >> Ŭ���� >> ���赵 >> ������ Ÿ��
 
 Ŭ������ ����
 1. class Car {} >> ���������� ������ �Ұ���. >> �ٸ� Ŭ���� (���赵) �����ϴ� Ŭ���� >> main �Լ�(x) >> Lib 
 2. class Car { public static void main(String[] args){   }} >> ���������� ���� ������ Ŭ����
 2.1 static void main(String[] args) >> main �̸��� ������ �Լ� >> ���α׷� ������, ������ > ����(���).

 Tip)
 C# ��� >> public static void Main(String[] args)
 
 ���� : variable
 ������(�ڷ�)�� ������ �ִ� �޸�.
 ����(ũ��) : ������ Ÿ��(�ڷ���) >> �޸��� ������ �����Ǿ� �ִ�. >> �ּ����� �������� �ִ��� ������
 ������ Ÿ�� ������ >> int i = 100 
 
 public class Ŭ���� �̸�{
 	public static void main(String[] args){
 		�ȿ��ִ� ������ ��������.
 		int num = 100; //�ʱ�ȭ ���
 	}
 }


������ ����Ǵ� ��ġ (scope : ��ȿ����)
1. instance variable : ��ü���� >> class Car { int number = 2000; }
2. local variable : ��������(�Լ��ȿ�) >> class Car { public void run(){ int speed : 0; } }
3. �Լ��ȿ� �������(if, for) �ȿ� �ִ� ����(����) class Car { public void run(){ for(int i = 0;......... ) }}
4. static variable : �����ڿ�(��ü��) >> class Car { public static num = 100; }
 

*/

//class ���赵�̴� == class Type�̴� (�������� �ǹ��ִ� ���� Ÿ���� ������ ū Ÿ��) : ����� ���� Ÿ��.


// �ڹٴ� �ϳ��� �������� ���Ͼȿ� �������� Ŭ������ ��밡��. (������ ���� ����������.)
// ���� �����Ҷ��� �ϳ��� ���Ͽ� �ϳ��� Ŭ���� ��� �Ϲ���.



class Car { // ���赵�� ����ϱ� ���ؼ��� ��üȭ .......... �޸� �����ٰ� ����. (������ new)
	int iv = 100;
	int window; //instance variable�� �ʱ�ȭ�� ���� �ʾƵ� �ȴ�.
				//���������� �⺻��(defualt) : 0

	/*
	  �ʱ�ȭ : ������ ó�� ���� ���°�(�Ҵ��� ���ؼ�) ���� :
	  ���� : why int window �̷� ��ü������ �ʱ�ȭ�� ���� �ʾƵ� ������ ������ ����.
	  �ڵ����� ���鶧 int window = 4�� â�� 4��......
	  
	  
	  Car ��� ���赵�� ������ ���� ���� ����.
	  
	  Car sscar = new Car();  �ڵ����� ����� ����. >> â���� 0��
	  sscar.window = 10;
	  
	  Car �Ｚ�� = new Car();
	  �Ｚ��.window = 2;
	  ����Ǵ� �ڵ������� â���� ������ �޸� �� �� ����.
	 */
	public void stop()
	{
		//������ ����.
		window = 100; //
//		int speed = 200; ����� �������� �ľ��� �� �ִ� .. �˾ƾ� �� ��.........
	}
	public void start() {
		int speed = 100; //��������
	}
}

public class Ex02_Variable {

	public static void main(String[] args) {
		// ������
		//main �Լ��ȿ� �ڵ尡 �־�� ����� ����� �� �� �ִ�.
		int lv = 100;
		System.out.println("lv �������� : " + lv);
		
		int number = 0;
		number = 100;
		number = 200;
		System.out.println("number : " + number);
		
		int a;
		int b;
		
//		System.out.println(a);
		//main �Լ� �ȿ� �ִ� ������ ���������̸�, �ʱ�ȭ�� ���ϸ� ��� �Ұ���.
		b = 200;
		System.out.println("b ���� �ʱ�ȭ : " + b);
		
		int c, d; //��ȣ x >> ������ >> Array()�� ��
		
		//key point
		//local variable (�Լ��ȿ� �ִ� ����) 
		//�ݵ�� �ʱ�ȭ �ʿ�.
		int k = 100; //���������� ����� ���ÿ� �ʱ�ȭ�� �ϰ� ����ϴ� ����.
		
		Car scar = new Car(); //scar ��� �ڵ����� ���� ....(���� ����Ʈ�� ���� ��)
							  //java�� os�� �Ҵ���� �޸� ������ ����� �� ��.
		
//		int k = 500; ���� ���������� ���� �������� ������ �� ����.
		int f = 101; //f ��� ������ 100�̶�� ���� ������ ����.
		

		int f2 = f; //�Ҵ�
				
		//f2 = 200;

		System.out.print("f : " + f + "\n");
		System.out.print("f2 : " + f2);
		
//		double result2 = d3 + i5;
//		today point
//		1. ūŸ�� + ���� Ÿ�� >> ūŸ��
//		2. Ÿ�԰� ��ȯ >> ������ ������ ���� ���� ���� ������ Ÿ���� ���� �Ǵܤ���.
//		3. ������ ����ȯ�� �սǵ����� ����

		int i6 = 100;
		byte b3 = 20;
		int i7 = b3; //�����Ϸ��� ���������� �ڵ� ����ȯ int i7 = (int)b3;
	}
}