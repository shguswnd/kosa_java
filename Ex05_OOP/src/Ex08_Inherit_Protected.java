import kr.or.kosa.Pclass;

/*
 상속관계에서 ... 접근자 : protected
 
 public 
 private
 default(같은폴더)
 protected : 양면성(박쥐) >> default, public 
 >> 상속이 없는 클래스 안에서 protected는 default랑 동일
 >> 결국 상속관계에서만 의미를 가진다. >> 상속관계에서는 public이다.
 
 
 */

class Dclass{
	public int i;
	private int p;
	int s; //default 
	protected int k; //default (왜 쓰냐? 일반적으로 쓸때는 사용안한다.)
}

class Child2 extends Pclass{
	void method() {
		this.k = 100; //상속관계 >> 자식은 부모의 protected 자원을 public 처럼 사용
		System.out.println(this.k);
	}
}


public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pclass p = new Pclass();
		//p.i
		//p.k
		Child2 ch = new Child2();
		ch.method();

	}

}
