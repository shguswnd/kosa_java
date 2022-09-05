/*
 ������(��Ӱ��迡�� ����)
 ������ : �������� ����(����) ���� �� �ִ� �ɷ�.
 
 C# : ������(overloading, override) 
 
 JAVA : [��Ӱ���]���� [�ϳ��� ��������]�� [�������� Ÿ��]�� ���� �� �ִ°�.
 >> �ϳ��� �������� >> [�θ�Ÿ��]
 >> �������� Ÿ�� >> �θ� ��ӹ��� �ڽ�Ÿ��
 
 ������ : ���� >> �θ�� �ڽĿ��� ���� ��.... 
 		 ���α׷� >> �ڽ��� �θ𿡰� ���Ǿ��� �ش�
 */

class Tv2{  //�θ�(�и�:�������>> �Ϲ�ȭ, �߻�ȭ)
	boolean power;
	int ch;
	
	void power() {
		this.power = !this.power;
	}
	
	void chUp() {
		this.ch++;
	}
	
	void chDown() {
		this.ch--;
	}
	String captionText() { //�ڸ����
		return "���� �ڸ� ó����.....";
	}
	
}

class CapTv extends Tv2{ //CapTv Ư��ȭ, ��üȭ, ������
	String text;
	String captionText() { //�ڸ����
		return this.text = "���� �ڸ� ó����.....";
	}
}


public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		CapTv ct = new CapTv();
		ct.power();
		ct.chUp();
		System.out.println(ct.captionText());
		
		////////////////////////////////////////////////
		
		Tv2 tv2 = ct;
		
		//[��Ӱ���]���� [�θ�Ÿ��]�� [�ڽ�Ÿ��]�� �ּҸ� ���� �� �ִ�.
		//�� �θ�� �ڽ��� �ڿ��� ���� �����ϴ�.
		//�� �����Ǵ� �����ϰ� ......
		
		System.out.println(ct.toString());
		System.out.println(tv2.toString());
		//�ΰ��� �ּҰ� ����.....
		
		System.out.println(tv2.captionText());
		//�����ǰ���
	}

}
