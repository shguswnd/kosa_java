/*
 시나리오(요구사항)
 저희는 가전제품 매장 솔루션을 개발하는 사업팀.
 A라는 전자제품 매장이 오픈되면 
 
 [클라이언트 요구사항]
 가전제품은 제품의 가격, 제품의 포인트 정보를 모든 제품이 가지고 있습니다.
 각각의 가전제품은 제품별 고유한 이름정보를 가지고 있다.
 
 ex)
 각각의 전자제품은 이름을 가지고 있다 (ex) Tv, Audio, Computer
 각각의 전자제품은 다른 가격정보를 가지고 있다. (Tv:5000, Audio : 6000...)
 제품의 포인트는 가격의 10%적용한다.
 
 
 시뮬레이션 시나리오
 구매자 : 제품을 구매하기 위한 금액정보, 포인트 정보를 가지고 있다.
 ex)10만원, 포인트 0
 

 >> 변화에 대응하는 코드를 짜야된다.
 >> 만약에 메스드마다 하나는 Tv, Audio, Computer 메소드를 하나하나 만드는것 보다, 하나의 메소드로 파라미터를 Product로 하여 다형성으로 만든다.
 
 >>
 1. 함수의 paramter 를 부모 (Product) (다형성)
 
 
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
	
	//이름
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
	
	//이름
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
	
	//이름
	@Override
	public String toString() {
		return "NoteBook";
	}
}


//구매자

class Buyer{
	int money = 10000;
	int bonusPoint;
	
	//구매자는 구매행위 (기능 : method)
	//구매행위 (구매자의 잔액에서 - 제품의 가격, 포인트 정보 갱신 +)
	//*구매자는 매장에 있는 모든 전자제품을 구매할 수 있다. ****
	

	void buy(Product p) {
		if(this.money < p.price)
		{
			System.out.println("잔액이 부족합니다.");
			return;
		}
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		System.out.println("구매한 물건은 : " + p.toString());
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
		
		///buy 메소드의 파라미터값을 부모클래스로 나둔다면 모든 자식클래스의 값들을 받아 buyer 클래스를 공통값으로 사용할 수 있음.
		//이럴때 다형성의 장점이 된다.
		
		
		
		

//		System.out.println(kt.price);
//		System.out.println(kt.bonusPoint);
//		System.out.println(kt);
		
	}
}
