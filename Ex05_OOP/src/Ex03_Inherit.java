
class Tv{
	boolean power;
	int ch;
	
	void power() {
		this.power = !this.power;//��۸�(���� ����ġ ó��)
		//�ΰ��� ����� �ϳ��� �Լ��� ó�� ����.
		//boolean�� �⺻���� true �ε� �θ������� ! ó���� false/treu �� ����������.
	}
	
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}


class Vcr{ //���� �÷��̾�, Tv�÷��̾�
	boolean power;
	void power(){
		this.power = this.power;
	}
	void play() {
		System.out.println("����ϱ�.");
	}
	void stop() {
		System.out.println("�����ϱ�");
	}
	void rew() {}
	void ff() {}
}



//Tv���赵
//��������

//TvVcr ��ǰ �����

//class TvVcr extends Tv, Vcr (x) ���� ��� ����
//������ ��� �̻� (�ڿ��̸� ���� ... ��� �Ұ�)

//�ѳ��� ����ϰ� �ѳ��� ����..... 2������ �ߴ���ó��.


//���� Tv(���) , Vcr(����) >> Tv ���� ���, Tv �ֱ��.
//�Ϲ������� �ֱ��(Tv)�� ��ӹް�, ������ ����� �ȾƳִ� ���·� ���.


class TvVcr extends Tv{
	Vcr vcr;
	
	public TvVcr() {
		vcr = new Vcr();
	}
}

//class TvVcr{
//	Tv t;
//	Vcr v;
//	
//	public TvVcr() {
//		this.t = new Tv();
//		this.v = new Vcr();
//	}
//}

public class Ex03_Inherit {
	
	public static void main(String[] args) {
		TvVcr tv = new TvVcr();
//		tv.t.power;
//		tv.v.power;
		tv.power();
		System.out.println("Tv���� : " + tv.power);
		tv.chUp();
		tv.vcr.power();
		tv.vcr.power();
		System.out.println("���� ���� : " + tv.vcr.power);
		tv.vcr.play();
	}

}
