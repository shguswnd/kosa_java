package kr.or.kosa;

public class Bi extends Bird{
	
	@Override
	public void moveFast() {
		
	}
}

class Ostrich extends Bird{
	//구체화, 특수화
	
	void run()
	{
		System.out.println("flying");
	}
	
	//설계자 고민 : Bird [상속]하는 당신은 moveFast
	protected void moveFast() {
		fly();
	}
}
