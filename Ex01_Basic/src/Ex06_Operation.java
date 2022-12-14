//import java.lang.*; 해당의 코드는 생략되어있음. 기본적으로 제공 원래는 썻는데 이제는 기본 제공이라 안써도 안의 라이브러리들 사용가능.


public class Ex06_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 100/100;
	//	System.out.println(result);
		
		result = 13/2; //몫
		
		//System.out.println(result);
		
		//나머지를 구하는 연산자가 따로 있음. %
		
		result = 13%2;
		
//		System.out.println(result);
		
		//증가, 감소 (증가감 연산자 : ++ , --)
		
		int i = 10;
		++i; //전치증가
		System.out.println(i);
		i++; // 후치증가
		//혼자서는 후치 전치 의미 없음. 어차피 증가
		System.out.println(i);
		
		// Today Point (증가감 연산자 다른 연산자와 결합되면 전치, 후지가 살아남)
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2;
		System.out.println(result2);
		
		byte b = 100;
		byte c = 1;
		//byte d = b + c;
		//Type mismatch: cannot convert from int to byte 
		//자바는 연산을 할 경우 정수방을 사용함 그러므로 byte끼리 연산작업을 해도 정수방으로 작업을 함. 4바이트로 작업한다.
		// 해결
		// 1. casting (연산시 기본 값이 정수라 4바이트 공간을 사용함)
		byte d = (byte) (b + c); //손실이 나도 괜찮다.
		
		// 2. int 형으로 바꿈. 
		//int d = b + c ; //결과의 타입을 더 큰 방을 사용해서 (손실 발생하지 않음)
		
		//Today Point
		/*
		 1. 정수의 모든 연산은 [int] 타입 변환 후에 처리.
		 ex) byte + short => 컴파일러가 내부적으로 int + int
			 char + char => 컴파일러가 내부적으로 int + int
			 연산처리할때
			 정수의 연산에서 int 보다 작은 타입은 int로 변환 연산(long 제외)
			 byte, char, short 연산시에는 > int 방에 넣어서 계산 > int
			 
			 char + int >> int + int
			 int + long >> long + long 예외적으로(큰타입으로 따라감).

			 정수 + 실수 >> 타입의 크기와 상관없이 >> 실수 승!
			 
		*/
		
		long ln = 10000000000L;
		float fl = 1.2f;
		//long Inresult = ln + fl; 손실발생
//		long Inresult = (long)(ln + fl);
//		System.out.println(Inresult);
		float Inresult = ln + fl;
		System.out.println("Inresult : " + Inresult);
		float num2 = 10.45f;
		int num3 = 20;
		float result5 = num2 + num3;
		System.out.println("result5 : " + result5);
		
		char c2 = '!';
		char c3 = '!';
		
		int result6 = c2 + c3;
		
		System.out.println("result6 : " + result6);
		
		
		//제어문
		//중소기업 시험문제 (구구단 출력) >> 삼각형 별찍기 >> 연습.
		
		
		int sum = 0; //local variable;
		
		
		for(int j = 1 ; j<=100 ; j++)
		{
			sum += j;
//			System.out.println("sum : " + sum);
			if(j % 2 == 0)
			{
				sum += j;
			}
		}
		System.out.println("sum : " + sum);
		
		// == 연산자 (값을 비교하는 연산자)
		
		if (10 == 10.0f) { // 타입을 비교하지는 것이 아니고 가지고 있는 값을 비교
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		// ! 부정 연산자
		if('A' != 65) {
			System.out.println("같지 않음 : true");
		}
		else {
			System.out.println("같음 : false");
		}
		
		// 암기 (Today point)
		// 연산자중에서 제어문 역할
		// 삼항연산자
		
		int p = 10;
		int k = -10;
		int result8 = (p == k) ? p : k;
		
		//위 코드를 if문을 사용해서 처리하세요.
		System.out.println("result8 : " + result8);
		
		if(p == k)
		{
			result8 = p;
		}
		else {
			result8 = k;
		}
		
		//진리표
		//논리연산
		// 0 : false
		// 1 : true
		
		/* 		OR 연산, AND 연산
		 0 0	   0	   0
		 0 1	   1	   0
		 1 0	   1	   0
		 1 1	   1	   1
		 
		 
		 DB (Oracle) SQL언 자연어 (인간이 해석하기 쉽게 자연어도 만듬).
		 select *
		 from emp
		 where job = 'it' and sal > 2000
		 
		 
		 select *
		 from emp
		 where job = 'it' or sal > 2000
		 
		 
		 연산자(비트)
		 | or 연산
		 & and 연산
		 
		 논리연산
		 ||  or
		 &&  and
		 
		 */
		int x = 3;
		int y = 5;
		
		System.out.println("x|y : " + (x|y));
		System.out.println("x&y : " + (x&y));
		//		System.out.println("x|y : " + ());
		/*
		 십진수 -> 2진수(0,1)
		 
		 8bit
		 256 128 64 32 16 8 4 2 1
		  				0 0 1 1 > 10진수 3을 2진수로		 
		 				0 1 0 1 > 10진수 5를 2진수로
		 OR 			0 1 1 1 > | or 연산 > 4+2+1 > 7
		 AND 			0 0 0 1 > & and 연산 > 1				
		*/

		//Today Point ( && (and) , || (or))
		//if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1) { A } else { B } ******
		//거짓이 나오는 순간 처리 됩니다.
		//if(10 > 0 or -1 > 1 or 100 > 2 or 1 > -1) { A } else { B }
		
		
		int data = 80;

		switch (data) {
			case 100 :
				System.out.println("100입니다.");
				break;
			case 90 :
				System.out.println("90입니다.");
				break;
			case 80 : 
				System.out.println("80입니다.");
				break;
			default : 
				System.out.println("일치값이 없음.");
		}
		
		int month = 5;
		String res = "";
		switch (month) {
			case 1 :
			case 3 : 
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				res = "31";
				break;
			case 4 :
			case 6 :
			case 9 :
			case 11 :
				res = "30";
				break;
			case 2:
				res = "29";
				break;
			default :
				res = "!!";
		}
		System.out.println(month + "월은 " + res + "일입니다.");
		
		//난수 (랜덤값)
		//java (사용하고자 하는 다양한 자원을 미리 생성해 두었음 >> 찾아서 >> 사용 jaca api
		//도움말 ( 찾아서 ... 써라) api 문서
		//https://docs.oracle.com/javase/8/docs/api/index.html
		//원하는 자원을 찾아서 사용방법을 파악하고 처리 FM >> 대부분은 구글 네이버 사용
		//public static double random()
		// equal to 0.0 and less than 1.0. 범위의 난수를 얻을 수 있다. 
		// 결과 : double 실수 return 0.0 <= random < 1.0
		//원칙적인 방법
		//쓰고자 하는 자원이 있는 폴더를 open
		//import java.lang.* >> java 폴더안에 lang 폴더안에 있는 모든 자원은 사용가능.
		
		
		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.random() * 10 : " + (Math.random() * 10));
		System.out.println("(int)(Math.random() * 10) : " + (int)(Math.random() * 10)); //1~9 까지 난수
		System.out.println("((int)(Math.random() * 10) + 1) : " + ((int)(Math.random() *10) + 1));//1~10까지 난수.
		
	}
}