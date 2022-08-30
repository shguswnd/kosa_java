import java.lang.reflect.Method;

public class Ex11_Static_Method {

	public void method() { //heap이란 메모리에 로드 되고 나서 사용가능(new ...)
		System.out.println("나 일반함수야");
	}
	
	public static void smethod() {
		System.out.println("나 static 함수야");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 안에서 smethod를 바로 사용할 수 있나??
		// 있음.....
		//보통은 클래스.static 메서드를 사용해야되지만,
		//smethod의 경우 현재 클래스 안에 있으므로 그냥 smethod()로 사용가능.
		
		smethod();
		
		Ex11_Static_Method ex11 = new Ex11_Static_Method(); //static이 아니니 만드시 heap 메모리에 로드되어야함.
		//ex11 참조변수 ( 주소를 가지고 변수) 는 static 접근, 일반 접근 가능
		ex11.method();
	}

}
