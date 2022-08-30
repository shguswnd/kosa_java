/*
 OOP ��ü ���� ���α׷��� (�������� ��������(���赵) ���� �����ϴ� ����)
 >> �������� ���赵�� �����ϴ� ���.
 
 1. ��� (���뼺)
 2. ĸ��ȭ(����ȭ) : private   ....setter, getter (�����Ҵ��� ���� �����Ҵ��� ���ؼ� ������ ��ȣ)
 3. ������ : �ϳ��� Ÿ������ ������ ��ü�� �ּҸ� ���� �� �ִ� ��.
 
 >> method overloading (�����ε�)
 1. �ϳ��� �̸����� �������� ����� �ϴ� �Լ�.
 
 1. �����ε��� �������.
 2. ���ϰ� ����϶�� .... �����ڰ� �����ڸ� ��� ...... 
 3. �����ε��� ������� �ʾƵ� �������� �ʴ´� .... 
 
 
 ����) �Լ� �̸��� ���� parameter [����] �� [Ÿ��] �� �ٸ���.
1. �Լ� �̸��� ����.
2. parameter ���� �Ǵ� Ÿ���� �޶�� �Ѵ�.
3. return Ÿ���� �����ε��� �Ǵܱ����� �ƴϴ�.
4. parameter �� ������ �ٸ��� ����(����)   
 */

class Human{
	String name;
	int age;
}

class OverTest{ //Ŭ���� ����
	int add(int i) {
		return 100+i;
	}
	
	/*
	  int add(int s) { return s; } �̸� �浹
	 */
	
	int add(int i, int j) {
		System.out.println("�����ε� : " + i + "," + j);
		return i + j;
	}
	
	String add(String s) {
		System.out.println("�����ε� : " + s);
		return "hello" +s;
	}
	String add(String s, int i) {
		return "�����ε�";
	}
	
	void add(Human human) { //�����ε� ����. �޸��̶� Ÿ���� ��ü �ּҰ� ���;���.
		human.name = "ȫ�浿";
		human.age = 100;
		System.out.println(human.name + " , " + human.age);
	}
	/*
	 * String add(int i, String s) { return ""; } //�̰͵� �Ķ���� ������ �ٸ��� �����ϹǷ� �����ε��̴�.
	 */
}


public class Ex13_Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("A"); //�ڵ����� parameter String ȣ��
		System.out.println('a'); //�ڵ����� parameter char ȣ��

		System.out.println();

		/*
			System.out.println();
			System.out.printlnString("A");
			System.out.printlnChar('a');
			����� �Լ��� �ϱ��ؼ� ��� .... �̸��� �� Ʋ���ϱ�.
					 
		 */
		
		OverTest ot = new OverTest();
		int result = ot.add(100);
		System.out.println(result);
		result = ot.add(300, 400);
		System.out.println(result);
		
		System.out.println();
	}

}