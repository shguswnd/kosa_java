import java.lang.reflect.Method;

public class Ex11_Static_Method {

	public void method() { //heap�̶� �޸𸮿� �ε� �ǰ� ���� ��밡��(new ...)
		System.out.println("�� �Ϲ��Լ���");
	}
	
	public static void smethod() {
		System.out.println("�� static �Լ���");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ȿ��� smethod�� �ٷ� ����� �� �ֳ�??
		// ����.....
		//������ Ŭ����.static �޼��带 ����ؾߵ�����,
		//smethod�� ��� ���� Ŭ���� �ȿ� �����Ƿ� �׳� smethod()�� ��밡��.
		
		smethod();
		
		Ex11_Static_Method ex11 = new Ex11_Static_Method(); //static�� �ƴϴ� ����� heap �޸𸮿� �ε�Ǿ����.
		//ex11 �������� ( �ּҸ� ������ ����) �� static ����, �Ϲ� ���� ����
		ex11.method();
	}

}
