//static ������ ��ü���� ���� ���� ������ �Ұž߸� �������� ����
//instance ������ ��ü���� �ٸ� ���� ������ �Ұž߸� �������� ����


//�κ����� ���ؼ� �ʱ�ȭ....


class InitTest{
	static int cv = 10;
	static int cv2;
	int iv =11;
	//3���� ��� default ���� �ʱ�ȭ�� ���� �ʾƵ� ��.
	
	static{
		//static �ڿ��� ���� �ʱ�ȭ ����.
		//���� ���� : static int cv = 10; �� static int cv2; �� �޸𸮿� �ö� �� ��.....
		cv = 1111;
		cv2 = 2222;
	}
	
	{
		//�ʱ��� ���� (member field �ʱ�ȭ)
		//��ü�� �����ǰ� ���� int iv �޸𸮿� �ö󰡰� ���� �ٷ� ȣ�� { ���� }
		//�������� �ڵ� if(iv>10) iv = 100
		//
		System.out.println("�ʱ��� ����");
		if(iv > 10) iv = 1000;
	
		iv = 2222;
		cv = 100; //�ʱ�ȭ >> ��ü new ���� ������ ... �ʱ�ȭ�� �ȵǿ� (static)
	}
}


public class Ex09_Static_init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitTest t = new InitTest();
		//System.out.println(t.iv);
		
		System.out.println(InitTest.cv);
		System.out.println(InitTest.cv2);
		
	}

}