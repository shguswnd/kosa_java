import kr.or.kosa.Pclass;

/*
 ��Ӱ��迡�� ... ������ : protected
 
 public 
 private
 default(��������)
 protected : ��鼺(����) >> default, public 
 >> ����� ���� Ŭ���� �ȿ��� protected�� default�� ����
 >> �ᱹ ��Ӱ��迡���� �ǹ̸� ������. >> ��Ӱ��迡���� public�̴�.
 
 
 */

class Dclass{
	public int i;
	private int p;
	int s; //default 
	protected int k; //default (�� ����? �Ϲ������� ������ �����Ѵ�.)
}

class Child2 extends Pclass{
	void method() {
		this.k = 100; //��Ӱ��� >> �ڽ��� �θ��� protected �ڿ��� public ó�� ���
		System.out.println(this.k);
	}
}


public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pclass p = new Pclass();
		//p.i
		//p.k
		Child2 ch = new Child2();
		ch.method();

	}

}
