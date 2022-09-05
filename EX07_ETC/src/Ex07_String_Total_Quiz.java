// 주민번호 : 뒷번호 첫자리 : 1,3 남자, 2,4 여자 라고 출력 ... 하는 문제
//main 함수 Scanner 사용 주민번호 입력받고
//앞:6자리 뒷: 7자리

//입력값 : 123456-1234567

//static
//1.자리수 체크(기능)함수 (14 ok) return true, false
//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능 함수 return true, false
//3. 뒷번호 첫번쨰 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능 함수 void 출력

import java.util.Scanner;






public class Ex07_String_Total_Quiz {

	static boolean Check(String fullNumber) {
		fullNumber.replace("-", "");
		if(fullNumber.length()==14)
			return false;
		else
			return true;
	}
	
	static boolean lastNumber_Check(String fullNumber) {
	
		String numberArr[] = fullNumber.split("-");
		if(numberArr[1].charAt(0)>='1' && numberArr[1].charAt(0)<='4')
		{
			return true;
		}
		else {
			return false;
		}
			
	}
	static void Print(String fullNumber) {
		String numberArr[] = fullNumber.split("-");
		if(numberArr[1].charAt(0)=='1' || numberArr[1].charAt(0)=='3')
		{
			System.out.println("남자입니다.");
			
		}
		else {
			System.out.println("여자입니다.");

		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		String acount;
		
		
		do{
			System.out.println("주민등록번호 입력해주세요(xxxxxx-xxxxxxx)");
			acount = scan.next();
			lastNumber_Check(acount);
			if(!lastNumber_Check(acount))
			{
				acount = "";
				System.out.println("잘못입력되었습니다.");
			}
			else {
				System.out.println("주민등록번호가 정상적으로 입력되었습니다.");
			}
			
		}while(Check(acount));
		
		Print(acount);
		
	
		
		
	}

}
