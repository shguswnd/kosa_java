import kr.or.kosa.Emp;

class Test2{
	int x = 100;
	void print() {
		System.out.println("�θ��Լ� TEST2");
	}
}

class Test3 extends Test2{
	int x = 300; // �θ� �����ϱ�(c#)//�̷������ �������ÿ�.
	
	//������(����)
	@Override
	void print() {
		System.out.println("�ڽ��� �θ��� �Լ��� ������");
	}
	
	void print(String str) { //�����ε�
		System.out.println("���� �����ε� �Լ��� : " + str);
	}
	
}



public class Ex05_Override {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		System.out.println(t3.x);
		
		t3.print();
		
		
		
		
		Emp emp = new Emp(1000,"ȫ�浿");
		System.out.println(emp);//kr.or.kosa.Emp@cac736f
		System.out.println(emp.toString());//kr.or.kosa.Emp@cac736f
		//�ΰ����� �Ȱ���
		//emp�� ������ �ӿ� .toString()�� ������ �ִ�,
		//emp�� ��� emp.toString() ������.
		//toString() �� Object�� �ڿ� ....... �ּҰ� return;
		//�������ϰ� ����ϸ� emp == emp.toString�̹Ƿ�
		//Emp [empno=1000, ename=ȫ�浿]
		//Emp [empno=1000, ename=ȫ�浿]
		//�Ѵ� �̷��� ����
		//JAVA API �����ϴ� ������ Ŭ������ ObjectŬ������ toString() �������ϰ� �ִ�.
		
		//�׷��ٸ� �ּҰ��� ��������� �� ��� �ұ�??
		
	}
}
