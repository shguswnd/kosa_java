package kr.or.kosa;

import java.io.IOException;



/*
 설계도를 작성 ...
 설계도를 사용하는 개발자에게 어떤 상황에 대해서 반드시 예외를 처리하도록 강제 ...
 
 생성자나 함수 만들었는데 .... 반드시 예외를 처리하는 코드를 생성.
 */
public class ExClass {
	//생성자를 만들때 Io, nullpoint 관련해서 오류가 발생할 수 있으니 예외처리 하겠다.
	public ExClass(String path) throws IOException, NullPointerException {
		System.out.println();
	}
}
