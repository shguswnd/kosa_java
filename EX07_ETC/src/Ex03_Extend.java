class Money{
	int price;	
}

class Check extends Money{
	String Contract; //계약
	String signature;//서명
}

class Paper extends Money{
	int simbol;//그림(신사임당, 세종대왕...)
	int color;//(노란, 초록...)
}

class Coin extends Money{
	int size;//크기
	String materials; //(구리, 동,실버...)
}

public class Ex03_Extend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
