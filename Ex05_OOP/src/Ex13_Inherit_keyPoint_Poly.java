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


//구매자

class Buyer2{
	int money = 10000;
	int bonusPoint;
	//장바구니(카트) 생성하기 (모든 전자제품을 담을 수 있다) : 10개
	
	Product2[] cart;
	int index=0;
	//////////////////////////////////
	public Buyer2() {
		this(1000,0);
	}
	public Buyer2(int money, int bonuspoint)
	{
		//초기화
		cart = new Product2[10]; //카드 초기화
		this.money = money;
		this.bonusPoint = bonuspoint;
	}
	
	void buy(Product2 p) { //함수의 parameter 제품 객체의 주소를 받아서...
		if(this.money < p.price)
		{
			System.out.println("잔액이 부족합니다.");
			return;
		}
		//cart 담기
		//방어적인 코드 작성,
		if(this.index >=10)
		{
			System.out.println("그만사세요.");
			return;
		}
		
		cart[index++] = p; // 0번쨰 인덱스에 담고 후치 증가......
		/////////////////////////////////////////////////////////////////////
		
		
		//실구매
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		System.out.println("구매한 물건은 : " + p.toString());
		System.out.println("잔액 : " + this.money);
		System.out.println("포인트 : " + this.bonusPoint);
	}
	
	//계산대(장바구니)
	//물건을 계산
	//물건의 가격, 이름
	//총 구매가격 표시
	void summery(Product2[] p) {
		int totalprice=0;
		int totalbonuspoint=0;
		String productlist=""; //누적
				
/*		for(int i=0; i< cart.length; i++) {//물건이 없으면 null 연산 예외
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
		System.out.println("구매한 물건 총액: " + totalprice);
		System.out.println("포인트 총액: " + totalbonuspoint);
		System.out.println("구매한 물건 목록: " + productlist);
	}
	
}


public class Ex13_Inherit_keyPoint_Poly {

	public static void main(String[] args) {
		final int size = 10;
		
		Buyer2 buy = new Buyer2();
		KtTv2 kttv = new KtTv2();
		
		
		

	}

}
