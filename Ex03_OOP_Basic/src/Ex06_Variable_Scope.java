/*
  
 
 instance variable >> class Car {private String color;}
>> �����Ǵ� ��ü���� �ٸ� ������ ���� �� �ִ�.


 local variable >> class Car { public void move() { int speed =0; } }
 main �Լ� >> local variable ���ú����� �ݵ�� �ʱ�ȭ �������. ����� ���� �߻�.
 
 block variable >> class Car { public void move() { for(int i; i<10...}}
 //��� ������ ����

static variable >> �����ڿ� (��ü��), ��ü���� ������ memory �ö󰡴� �ڿ� ( ���� : class area, mem

��ü�� ����� ������ ��� : new �޸𸮿� .....

static new ���̵� �޸𸮿� �ö�. 
 
 
 
 */


class Variable{
	int iv;
	/*
	 1. member field , instance variable
	 2. iv ���� ��밡�� �ұ�(�޸𸮿� ���� �ö� ����?)
	 Ŭ���� new �Ҷ� �޸𸮿� ����. >> heap �޸𸮿� ��ü�� ������. >> �� ��ü�ȿ� iv ����.
	 
	 2-1. new�� �ѹ��� ����Ͽ� ���ο� ��ü�� ����� >> heap �޸� ��ü ���� >> ��ü�ȿ� iv ����. iv�� ��ü���� �����ǰ� 
	 �̷��� instance variable �̶�� �Ѵ�.
	
	 3. ���� : ������ (����), �ڷḦ ���� ����
	 3.1 ���� : ����, ���� ,��ǰ(class)
	 ex) �ڵ��� -> ����(�ڵ�����ȣ, ����ȸ��....) ����(����Ʈ, rpm....), ��ǰ(����, �׺�....)
	 - �����Ǵ� ��ü���� �ٸ� ���� ���� �� �ִ�.
	 - �׷��� �ʱ�ȭ�� �ؼ� ���� �������� �ʴ´�.
	 - default ���� ������ �ִ�. (int > 0, double > 0.0, char > ����'\u0000', 
	   boolean > false, String > null, Car > null
	 
	 -iv ������ ���� ���� : new ��� �����ڸ� ���ؼ� heap Variable �̸��� ��ü�� ��������� ���� �ٷ� ����(�� �ȿ�)
	  
	  
	  *********
	  �޸������� ���� 
	  Car car = new Car()�� ����ٰ� �����ϸ�,
	  new�� ������ heap ������ Car ��ü�� �����̵ǰ� ��Ʈ�Ͻ������� ����.
	  �׸��� main�� car ������ stack �޸𸮿� ������ �ȴ�. �ֳ�? static �̸� main�� ���� ������ ���ڸ��� �ٷ� ������ ������ �Ǳ� ������
	  �ᱸ car��� stack ������ ������ heap������ Car ��ü�� �ּҸ� �޴´�.
	
	*/
	static int cv;
	/*
	  1. class variable (Ŭ���� ����) >> ��ü���� �Ѵܰ� ���� ����, �Ϲ������δ� static variable (��ü�� �����ڿ�) 
	  2. ���� : ������ ��� �� (�����Ǵ� ��� ��ü�� �����ϴ� �ڿ�)
	     >> �����Ǵ� ��� ��ü (heap ������ ������ ��ü���� �����ϴ� �ڿ�)
	  3. ���ٹ�� 
	     1. class �̸�.static ������. ��ü �ּҰ� ���� ��� ����. >> Variable.cv 
	     >> why(��ü�� �����Ǳ� ���� �޸𸮿� �ö󰡴ϱ� �� ���� ����� Ŭ������ �̸��� ���ؼ� ����)
	     2. Variable v = new Variable(); >> v.cv  
	        Variable v2 = new Variable(); >> v2.cv
	        >> v.cv == v2.cv(���� �ּҸ� �ٶ󺻴� : static ���� �ּ�)
	        
	  4. ��������.
	  	 Hello.java >> javac Hello.java > Hello.class �� �����ؾ��� ����.
	  	 > java.exe Hello ���� ����.
	  	 > jvm�� os���� �޸� ����. > ����(������ ����) > �����Ϸ��ȿ� class Loader System (Ŭ�����δ� : �ؼ���)
	  	 > Ŭ���� ������ ����(metadata : ��� Ŭ������ ����) >> class area(method area) �޸𸮿� �ø�.(����, � �ڿ�, ����..)
	  	 > �� Ŭ���� �ȿ� static�� ���̸�, static variable �Ǵ� static method �ִٸ�,
	  	 > �� �༮�� class area(method area) ������ �Ҵ�
	  	 > �׷��� �Լ��� �̸� ���࿡ main() �̶�� ������ ��Ģ�� ���� �����մϴ�(Stack ����) �ڿ��Ҵ�.
	  	 
	  	 Variable sort
	  	 static > instance > local > block	  	 
	 */
	
	void method() {
		int iv=0;
		
		/*
		 local variable ( �Լ� �ȿ� : �������� : ������� �ݵ�� �ʱ�ȭ)
		 �����ֱ�) �Լ��� ȣ��Ǹ� �׶� ���� (stack �����Ǿ��ٰ� �Լ��� ������, ���� return��)
		 
		 
		 !! ����
		 ���ÿ��� main�Լ��� ���� >> ���� heap������ ��ü�� �ִٸ� ��ü���� �޼ҵ带 heap�� ���� �׷��Ƿ�
		 �޼ҵ� ���� ���� �������� ���� ������ �ȵȰ� �׷����� iv = 0 ���� ���� ������ �ǳĸ�,
		 ���ÿ����� main ���� �޼ҵ带 ȣ���ϰ� �޼ҵ带 ���ÿ��� �ް� �ű⼭ iv =0 �� �ʱ�ȭ �Ѵ�. �׸��� ȣ���� ������ ������ ����������
		 ���������� ��ȯ�� �ϰ� ������ main���� ������ ������ ���Ḧ �Ѵ�.
		
		  */
	}
	
}

public class Ex06_Variable_Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable.cv = 100;
		//Ex06_Variable_Scope.test();
		Ex06_Variable_Scope ex06 = new Ex06_Variable_Scope();
		
		ex06.method();
		
		Variable v = new Variable();
		System.out.println("v.cv : " + v.cv);
		
		
		
	}
	public void method(){
		System.out.println("�� �Ϲ��Լ�");
	}
	public static void test() {
		
	}

}