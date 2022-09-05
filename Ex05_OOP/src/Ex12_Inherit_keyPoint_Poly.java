/*
 �ó�����(�䱸����)
 ����� ������ǰ ���� �ַ���� �����ϴ� �����.
 A��� ������ǰ ������ ���µǸ� 
 
 [Ŭ���̾�Ʈ �䱸����]
 ������ǰ�� ��ǰ�� ����, ��ǰ�� ����Ʈ ������ ��� ��ǰ�� ������ �ֽ��ϴ�.
 ������ ������ǰ�� ��ǰ�� ������ �̸������� ������ �ִ�.
 
 ex)
 ������ ������ǰ�� �̸��� ������ �ִ� (ex) Tv, Audio, Computer
 ������ ������ǰ�� �ٸ� ���������� ������ �ִ�. (Tv:5000, Audio : 6000...)
 ��ǰ�� ����Ʈ�� ������ 10%�����Ѵ�.
 
 
 �ùķ��̼� �ó�����
 ������ : ��ǰ�� �����ϱ� ���� �ݾ�����, ����Ʈ ������ ������ �ִ�.
 ex)10����, ����Ʈ 0
 

 >> ��ȭ�� �����ϴ� �ڵ带 ¥�ߵȴ�.
 >> ���࿡ �޽��帶�� �ϳ��� Tv, Audio, Computer �޼ҵ带 �ϳ��ϳ� ����°� ����, �ϳ��� �޼ҵ�� �Ķ���͸� Product�� �Ͽ� ���������� �����.
 
 >>
 1. �Լ��� paramter �� �θ� (Product) (������)
 
 
 */
class Product{
	int price;
	int bonusPoint;
	//Product(){}
	
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(this.price/10.0);
	}
}

class KtTv extends Product{
	KtTv(){
		super(5000);
	}
	KtTv(int price){
		super(price);
	}
	
	//�̸�
	@Override
	public String toString() {
		return "KtTv";
	}
}


class Audio extends Product{
	Audio(){
		super(1000);
	}
//	Audio(int price){
//		super(price);
//	}
	
	//�̸�
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product{
	NoteBook(){
		super(1500);
	}
//	Audio(int price){
//		super(price);
//	}
	
	//�̸�
	@Override
	public String toString() {
		return "NoteBook";
	}
}


//������

class Buyer{
	int money = 10000;
	int bonusPoint;
	
	//�����ڴ� �������� (��� : method)
	//�������� (�������� �ܾ׿��� - ��ǰ�� ����, ����Ʈ ���� ���� +)
	//*�����ڴ� ���忡 �ִ� ��� ������ǰ�� ������ �� �ִ�. ****
	

	void buy(Product p) {
		if(this.money < p.price)
		{
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		System.out.println("������ ������ : " + p.toString());
	}
	
}

public class Ex12_Inherit_keyPoint_Poly {

	public static void main(String[] args) {
		KtTv kt = new KtTv();
		Audio audio = new Audio();
		NoteBook noteboot = new NoteBook();
		Buyer buyer = new Buyer();
		
		
		buyer.buy(kt);
		System.out.println(buyer.money);
		buyer.buy(audio);
		System.out.println(buyer.money);
		buyer.buy(noteboot);
		System.out.println(buyer.money);
		
		///buy �޼ҵ��� �Ķ���Ͱ��� �θ�Ŭ������ ���дٸ� ��� �ڽ�Ŭ������ ������ �޾� buyer Ŭ������ ���밪���� ����� �� ����.
		//�̷��� �������� ������ �ȴ�.
		
		
		
		

//		System.out.println(kt.price);
//		System.out.println(kt.bonusPoint);
//		System.out.println(kt);
		
	}
}
