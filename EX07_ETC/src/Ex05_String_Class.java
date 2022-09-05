import java.util.Scanner;

public class Ex05_String_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strarr = {"aaa", "bbb", "ccc"};
	
		
		for(String s : strarr) {
			System.out.println(s);
		}
		//사용방법 : int, double 값타입 처럼 사용
		
		String st = "홍길동";
		System.out.println(st.length());
		System.out.println(st); //st.toString()
		System.out.println(st.toString());//주소로 가서 데이터를 리턴 설계(재정의)
		//String 클래스는 Object 부모 클래스 toString() 상속관계 재정의 ........
		
		//정식 String 방법
		String sdata = new String("김유신");
		System.out.println(sdata);
		
		String name = "가나다라마바";
		//String 내부적으로 char[] member field >> [가][나][다][라][마] 배열의 주소값
		//class String extends Object {private char[] str ... @Override toString()}
		
		String str1 = "AAA";
		String str2 = "AAA";
		
		//문자열의 비교
		System.out.println(str1);
		System.out.println(str2.toString()); //toString() 재정의 주소값이 아니고 값이 나온다.
		System.out.println(str1 == str2);
		//System.out.println(str1 == str3);
		// == 연산자 값을 비교 str1(주소값), str2(주소값)
		// 값이 str.toString이랑 동일하여 true가 나오지만 그래도 .toString 없으면 주소값을 받는게 맞다 든데 왜 true가 나올까???
		// 1. str1, str2는 같은 주소에 들어있다
		// 2. **메모리에 실제로 같은 문자열이 있으면 재사용을 한다 즉 같은 주소의 값을 넣어준다.
		//Point 
		System.out.println(str1.equals(str2)); //주소를 찾아가서 그안의 값을 비교
		//equals 사용 이유 : 아래 둘다(new, scan)을 사용해버리면 둘이 같이 않다 무조건 주소를 만들기 때문
//		
//		String str3 = new String("BBB");
//		String str4 = new String("BBB");
//		System.out.println(str3==str4);
//		Scanner scan = new Scanner(System.in);
//		String test = scan.next();
//				
//		System.out.println(str1==test);
		
		String s = "A";
		s+="B";
		s+="C";
		System.out.println(s);
		
		s = "A";
//		System.out.println(s);
	}

}
