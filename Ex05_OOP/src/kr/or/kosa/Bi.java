package kr.or.kosa;

public class Bi extends Bird{
	
	@Override
	public void moveFast() {
		
	}
}

class Ostrich extends Bird{
	//��üȭ, Ư��ȭ
	
	void run()
	{
		System.out.println("flying");
	}
	
	//������ ��� : Bird [���]�ϴ� ����� moveFast
	protected void moveFast() {
		fly();
	}
}
