
class Tv{
	boolean power;
	int ch;
	
	void power() {
		this.power = !this.power;//토글링(전원 스위치 처럼)
		//두개의 기능을 하나의 함수로 처리 가능.
		//boolean의 기본값이 true 인데 부를때마다 ! 처리로 false/treu 가 가능해진다.
	}
	
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}


class Vcr{ //비디어 플레이어, Tv플레이어
	boolean power;
	void power(){
		this.power = this.power;
	}
	void play() {
		System.out.println("재생하기.");
	}
	void stop() {
		System.out.println("정지하기");
	}
	void rew() {}
	void ff() {}
}



//Tv설계도
//비디오설계

//TvVcr 제품 만들기

//class TvVcr extends Tv, Vcr (x) 다중 상속 금지
//계층적 상속 이상 (자원이름 동일 ... 사용 불가)

//한놈은 상속하고 한놈은 포함..... 2번에서 했던것처럼.


//기준 Tv(상속) , Vcr(포함) >> Tv 많이 사용, Tv 주기능.
//일반적으로 주기능(Tv)를 상속받고, 나머지 기능을 꽂아넣는 형태로 사용.


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
		System.out.println("Tv전원 : " + tv.power);
		tv.chUp();
		tv.vcr.power();
		tv.vcr.power();
		System.out.println("비디오 전원 : " + tv.vcr.power);
		tv.vcr.play();
	}

}
