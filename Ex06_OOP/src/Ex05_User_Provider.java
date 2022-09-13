

/*
 user ����� <> provider ������
 
  class A{}
  class B{}
  
  ���� : A�� B�� ����Ѵ�.
  
  1. ��� : A extends B
  2. ���� : A��� Ŭ������ Member field B�� ��� class A {}
  	2.1 �κ�
  	2.2 ��ü
  	
  public class B{}
  public class A{
  	public int i;
  	public B b;  //A�� B�� ����մϴ� (����)
  	public A(){
  		b = new B(); //�����ڸ� ���ؼ� �ʱ�ȭ(�ּҰ�)
  	}
  }
  
  >> ���Ͱ��� ���԰���� ����
  >> B�� ���ڻ��� �Ұ��� >> A��� ��ü�� ��������� B�� ����.
  >> A a = new A() �ؾ߸� B��ü�� ������ �ȴ�.
  >> A, B ���� ��� ����ü (��ü����)
  >> �ڵ����� ����, ��Ʈ�ϰ� CPU
  ---------------------------------------------------------------------------
  class B{}
  class A{
  	int i;
  	B b; //A�� B�� ����մϴ�.
  	A(){}
  	
  	//method
  	void m(B b){
  		this.b = b;
  	}
  }
  >> main �Լ� ����
  >> A a = new A();
  >> B b = new B();
  >> a.m(b);
  >> ���� ����� �ƴϴ�.
  >> �б� �л����� ���� (�������ü�� �ƴ�)
  
  class A{}
  class B{}
  ���� : A�� B�� ����մϴ�.
  
  
  A�� B�� �����մϴ�. (����)
  B�� member field ���
  
 */

interface Icall{
	void m();
}

class D implements Icall{
	@Override
	public void m() {
		System.out.println("D Icall �������̽��� m()��� �Լ��� ������");
	}	
}

class F implements Icall{
	@Override
	public void m() {
		System.out.println("F Icall �������̽��� m()��� �Լ��� ������");
	}	
}
//�������� ���α׷��� ��� (interface �� �뼼�̴�) >> ������ Ȯ��. >> ���� ���� ���� ���°�......
//>> �����ϰ� ..... >> interface 

class C{
	void method(Icall ic) { //Icall�� �����ϴ� ��� ��ü�� �ּҸ� �� �� �ִ�.
		ic.m();
	}
	/*
	 Ȯ�强 ��ȯ ���� ...
	 void method(D d){}
	 void m(F f){}
	 */
}

public class Ex05_User_Provider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		D d = new D();//implements Icall 
		F f = new F();//F implements Icall
		c.method(d);
		c.method(f);
	}

}
