/*
 static member field : ��ü�� �����ڿ�.....
 static method : why : ù�� ù �ð� �ߴ� �ڵ�...
 
 
 1. ��ü ���� ����.......
 2. ���� �����.
 3. ���赵�� ���鶧 �����ؾ���. (����� �� �ڿ��� (���) ���� ����Ѵٸ�)
 4. ���赵�� ���鶧 �� �ڿ� ���� ���ϱ� ���ϰ� ���� ���� .... ���� new �����ʰ� ��밡���ϰ���. (static �Լ�) ����
 5. ��ü�������� ���� ���� �ڿ��� ����ƽ���� ���� ����. 
  
  
 */

class StaticClass{
	int iv;
	
	static int cv;
	
	void m() {
		//new heap > ���.
		//1. iv ���� ����
		
		cv = 1000;
		
		//why : �������� (static �ڿ��� ��ü ���� ������ memory �ε�)
	}
	
	static void print() {
		//static �Լ�
		//1. cv �����
		//2. �Ϲݺ��� iv�� ���� ���� �ұ�?, �ȵɱ�?
		//3. static �޼ҵ�� ������ static ������ ������ �����ϴ�.
		//iv = 10000; �������� (static �ڿ��� �Ϲ� �ڿ����� �켱�Ѵ�)
		//������ �÷��Ͱ� static�� �ǵ����� ����!!!!!!!!!!!!!
		
		//��� : static �ڿ��� ������ ��.
		cv = 100000;
	}
}


public class Ex10_Static_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();

		System.out.println(StaticClass.cv);
		//�Ϲ��ڿ�(��ü����)
		
		StaticClass sc = new StaticClass();
		sc.m();
		sc.print(); // 
		
		//		StaticClass.print();
//		StaticClass.cv = 1;
//		System.out.println(StaticClass.cv);

		
		
		//		StaticClass test = new StaticClass();
//		
//
//		test.cv = 99;
//		System.out.println(test.cv);
//		test.m();
//		System.out.println(test.cv);
//		///////////////////////////////
//		test.print();
		
	}

}