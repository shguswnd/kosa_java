class Money{
	int price;	
}

class Check extends Money{
	String Contract; //���
	String signature;//����
}

class Paper extends Money{
	int simbol;//�׸�(�Ż��Ӵ�, �������...)
	int color;//(���, �ʷ�...)
}

class Coin extends Money{
	int size;//ũ��
	String materials; //(����, ��,�ǹ�...)
}

public class Ex03_Extend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
