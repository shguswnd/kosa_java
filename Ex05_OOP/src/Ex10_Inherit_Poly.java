/*
 다형성(상속관계에서 존재)
 다형성 : 여러가지 성질(형태) 가질 수 있는 능력.
 
 C# : 다형성(overloading, override) 
 
 JAVA : [상속관계]에서 [하나의 참조변수]가 [여러개의 타입]을 가질 수 있는것.
 >> 하나의 참조변수 >> [부모타입]
 >> 여러개의 타입 >> 부모를 상속받은 자식타입
 
 다형성 : 현실 >> 부모는 자식에게 모든걸 줌.... 
 		 프로그램 >> 자식이 부모에게 조건없이 준다
 */

class Tv2{  //부모(분모:공통사항>> 일반화, 추상화)
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
	String captionText() { //자막기능
		return "현재 자막 처리중.....";
	}
	
}

class CapTv extends Tv2{ //CapTv 특수화, 구체화, 고유한
	String text;
	String captionText() { //자막기능
		return this.text = "현재 자막 처리중.....";
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
		
		//[상속관계]에서 [부모타입]은 [자식타입]의 주소를 가질 수 있다.
		//단 부모는 자신의 자원만 접근 가능하다.
		//단 재정의는 제외하고 ......
		
		System.out.println(ct.toString());
		System.out.println(tv2.toString());
		//두개의 주소가 같음.....
		
		System.out.println(tv2.captionText());
		//재정의가능
	}

}
