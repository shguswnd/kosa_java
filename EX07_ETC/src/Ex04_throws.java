import java.io.IOException;

import kr.or.kosa.ExClass;

public class Ex04_throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//내가 이전 클래스에서 강제로 예외걸라고 만드었으니 그냥 생성시 불가능하므로 예외처리를 만들어서 생성자를 만들어라....
		//다중 exception 시 무조건 catch 부분 마지막은 Exception 해주는게 좋으면 맨위는 절대로 못간다!!!!!!!!!!!!
//		try {
//		  ExClass ex = new ExClass("Temp");
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		} catch(IOException e) { //상위예외가 하위예외보다 뒤로.................
//			e.printStackTrace();
//		}
		
		//다중 catch를 아래와 같이 NullPointerException | IOException e 가능!!
//		try {
//			ExClass ex = new ExClass("Temp");
//		} catch (NullPointerException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}
}
