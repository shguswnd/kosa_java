class Pbase{
	int p = 100;
	
}


class Cbase extends Pbase{
	int c = 200;
}

class Dbase extends Pbase{
	
}

//D, C ����Ŭ����

public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		System.out.println(cbase.toString());
		
		Pbase p = cbase;//������
		//�θ�Ÿ���� �ڽ�Ÿ���� �ּҸ� ���� �� �ִ�.
		
		Dbase dbase = new Dbase();
		
		p = dbase;//������.
		//P �θ� �ּҴ� ����� �ڽ� C�� ����� �ڽ� D�� �ּҸ� �޴´�.
		System.out.println(p.toString());

		
		//�θ� �ڽ����� �������� �ڽ��� Ÿ������ �ٲ����.
		//downcating (�θ� > �ڽ����� �Ҷ�)
		Cbase c = (Cbase)p;
		
	}

}
