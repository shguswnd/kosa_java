import java.util.Locale.Category;

class Product2{
	int price;
	int bonusPoint;
	//Product(){}
	
	Product2(int price){
		this.price = price;
		this.bonusPoint = (int)(this.price/10.0);
	}
}

class KtTv2 extends Product2{
	KtTv2(){
		super(5000);
	}
	KtTv2(int price){
		super(price);
	}
	
	@Override
	public String toString() {
		return "KtTv";
	}
}


class Audio2 extends Product2{
	Audio2(){
		super(1000);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook2 extends Product2{
	NoteBook2(){
		super(1500);
	}

	@Override
	public String toString() {
		return "NoteBook";
	}
}


//������

class Buyer2{
	int money = 10000;
	int bonusPoint;
	//��ٱ���(īƮ) �����ϱ� (��� ������ǰ�� ���� �� �ִ�) : 10��
	
	Product2[] cart;
	int index=0;
	//////////////////////////////////
	public Buyer2() {
		this(1000,0);
	}
	public Buyer2(int money, int bonuspoint)
	{
		//�ʱ�ȭ
		cart = new Product2[10]; //ī�� �ʱ�ȭ
		this.money = money;
		this.bonusPoint = bonuspoint;
	}
	
	void buy(Product2 p) { //�Լ��� parameter ��ǰ ��ü�� �ּҸ� �޾Ƽ�...
		if(this.money < p.price)
		{
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		//cart ���
		//������� �ڵ� �ۼ�,
		if(this.index >=10)
		{
			System.out.println("�׸��缼��.");
			return;
		}
		
		cart[index++] = p; // 0���� �ε����� ��� ��ġ ����......
		/////////////////////////////////////////////////////////////////////
		
		
		//�Ǳ���
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		System.out.println("������ ������ : " + p.toString());
		System.out.println("�ܾ� : " + this.money);
		System.out.println("����Ʈ : " + this.bonusPoint);
	}
	
	//����(��ٱ���)
	//������ ���
	//������ ����, �̸�
	//�� ���Ű��� ǥ��
	void summery(Product2[] p) {
		int totalprice=0;
		int totalbonuspoint=0;
		String productlist=""; //����
				
/*		for(int i=0; i< cart.length; i++) {//������ ������ null ���� ����
			if(cart[i] == null) break;
			totalprice += cart[i].price;
			totalbonuspoint += cart[i].bonusPoint;
			productlist += cart[i].toString()+" ";
		}
		*/
		
		for(int i=0; i< index; i++) {
			totalprice += cart[i].price;
			totalbonuspoint += cart[i].bonusPoint;
			productlist += cart[i].toString();
		}

		System.out.println("***********");
		System.out.println("������ ���� �Ѿ�: " + totalprice);
		System.out.println("����Ʈ �Ѿ�: " + totalbonuspoint);
		System.out.println("������ ���� ���: " + productlist);
	}
	
}


public class Ex13_Inherit_keyPoint_Poly {

	public static void main(String[] args) {
		final int size = 10;
		
		Buyer2 buy = new Buyer2();
		KtTv2 kttv = new KtTv2();
		
		
		

	}

}
