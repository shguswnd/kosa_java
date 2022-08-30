import java.util.Scanner;


public class Ex11_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i =1;
//		int j = 1;
//		while(i >= 10)
//		{
//			//반드시
//			//증가감을 명시
//			i--;
//			System.out.println("i : " + i);
//		}
//		
//		int sum = 0;
//		
//		while(j <= 100)
//		{
//			sum += j;
//			j++;
//		}
//		System.out.println("sum : " + sum);
//		
		//while 구구단을 출력하세요.
		// for(int i = 1; j <= 9 ; j++)
		// for(int j = 1; j <=9 ; j++)
		
		// while 2개
//		int kal=0;
//		while(i<10)
//		{
//			
//			while(j<10)
//			{
//				kal = i * j;
//				System.out.print("구구단 " + i + "x" + j + " : " + kal + " ");
//				j++;
//			}
//			System.out.println();
//			j=1;
//			i++;
//		}
//		

		//do ~ while : 보통 메뉴 선택떄 사용됨 (ex : 사용자가 계속 이상한 화면을 클릭한다면 처음으로 돌리게함)
		
		//프로그램 동작
		//당신이 원하는 메뉴 번호를 선택 >> do .. 선택값 받아서
		//while(input > 2) 다시입력.
		
		Scanner scan = new Scanner(System.in);
		int inputdata = 0;
		
		do {
			System.out.println("숫자 입력 (0~9)");
			inputdata = Integer.parseInt(scan.nextLine());
		}while(inputdata >= 10);
		
		System.out.println("당신이 입력한 숫자는 : " + inputdata);
		
	}

}
