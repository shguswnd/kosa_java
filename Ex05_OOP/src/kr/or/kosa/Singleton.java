package kr.or.kosa;
// 디자인 패턴(생성 패턴) >> new

//싱글톤 ...(객체 하나를 만들어 공유)
//의도 : 하나의 객체를 공유하는 보장 코드...

//공유IP
//공유프린터
//설계할때



/*
 싱글톤 패턴
 1. 생성자가 접근 못하게 해야한다. 생성자를 직접 private 로 접근제한한다.
 2. 메모리에 올리는 방법을 생각하는데 static을 사용한다.
 3. 메모리에 올라온 객체를 메서드를 통해 만들며 객체의 값이 null일때만 new를 해놓은다.
 */


public class Singleton {
	private static Singleton p;//static으로 메모리에 먼저올림.
	//p라는 변수가 주소를 가지게..... new 
	private Singleton() {
		//생성자에서 접근자를 private 해버리는 생성자 함수 호출 못하니 객체 생성 불가 new....
	}
	public static Singleton getInstance() {
		if(p==null) {
			p = new Singleton(); //같은 클래스 내부에서는 public, private 보인다.
		}
		return p;
	}
}
