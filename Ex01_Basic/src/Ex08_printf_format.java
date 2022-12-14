import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;
// 코드의 가독성으로 하나씩만 쓰자!!!



public class Ex08_printf_format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//system.out.println();
		System.out.println(); //출력하고 줄바꿈 (엔터)
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		System.out.println();
		System.out.print("D");
		System.out.println();
		int num = 100;
		System.out.println(num);
		
		System.out.println("num 값은 " + num + " 입니다.");
		
		// 형식 format
		System.out.printf("num 값은 %d 입니다.", num);
		System.out.printf("num 값은 [%d] 입니다. 또 [%d] 도 있습니다. \n", num, 12345);
		//format 형식문자
		/*
		 %d (10진수 형식의 정수)
		 %f (실수)
		 %s (String)
		 %c (char)
		 \t tab, \n 줄바꿈
		 
		 */
		
		
		//입력받기 (cmd) 사용자가 입력한 값을 받을수 있음.
		Scanner scan = new Scanner(System.in);
		//String value = scan.nextLine(); //입력하고 엔터를 칠때까지 대기(프로그램이 종료되지 않고 계속 대기)
		//입력한 값을 문자열로 전달.
		//System.out.println(value);
		
		//float number = scan.nextFloat();
//		System.out.println("number : " + number);
		
		//권장사항 : nextInt, nextFloat 보다는 nextLine() read 타입을 바꾸자.
		//Today Point
		
		//[문자를] => 숫자로 (정수,실수)
		//Integer.parseInt("11111") ->> 정수 ->> 11111
		//Float.parseFloat("3.14") ->> 실수 -> 3.14
		
//		try {
//			int number = scan.nextInt();
//			System.out.println("number : " + number);
//		}
//		catch(InputMismatchException e){
//			System.out.println("잘못입력되었다 " + e);
//		}
		System.out.println("숫자를 입력하세요");
		int number = 0;
		try {
			 number = Integer.parseInt(scan.nextLine());			
		}
		catch(NumberFormatException e)
		{
			System.out.println(e + " 잘못되었습니다");
		}


		System.out.println(number);
		
		scan.close();
		
	}

}
