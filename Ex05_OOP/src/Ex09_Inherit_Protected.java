import kr.or.kosa.Bird;

//������ 

class Bi extends Bird {
	
	@Override
	public void moveFast() {
		//������� ...
		super.moveFast(); // 
	}
}

class Ostrich extends Bird {
	//��üȭ , Ư��ȭ
	void run() {
		System.out.println("run ...");
	}
	
	@Override
	public void moveFast() {
		run();
	}
}

public class Ex09_Inherit_Protected {

	public static void main(String[] args) {
		Bi b = new Bi();
		b.fly();
		b.moveFast();
		//moveFast() ��Ӱ��迡�� ������ ���� ������  ����� ��� �ȵ� (����)

		Ostrich o = new Ostrich();
		o.run();
		o.moveFast();
	}

}