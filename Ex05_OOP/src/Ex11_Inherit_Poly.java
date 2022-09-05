class Pbase{
	int p = 100;
	
}


class Cbase extends Pbase{
	int c = 200;
}

class Dbase extends Pbase{
	
}

//D, C 형제클래스

public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		System.out.println(cbase.toString());
		
		Pbase p = cbase;//다형성
		//부모타입은 자식타입의 주소를 가실 수 있다.
		
		Dbase dbase = new Dbase();
		
		p = dbase;//다형성.
		//P 부모 주소는 어떨때는 자식 C를 어떨떄는 자식 D의 주소를 받는다.
		System.out.println(p.toString());

		
		//부모가 자식으로 내릴때는 자식의 타입으로 바꿔야함.
		//downcating (부모 > 자식으로 할때)
		Cbase c = (Cbase)p;
		
	}

}
