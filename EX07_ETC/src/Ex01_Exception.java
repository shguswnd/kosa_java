import java.lang.ArithmeticException;
/*
 오류
 1. 에러(error) : 네트워크 장애, 메모리, 하드웨어 용량부족...... >> 개발자가 코드적으로 해결 불가. 
 2. 예외(exception) : 개발자가 코드의 실수에 의해서 발생 >> 문제 코드 찾아서 >> 수정 >> 배포
 	>> 프로그램 실행 시 발생. >> 개발자는 알 수 없음.(테스트....) 
 	>> 문제가 발생하면 (exception) 프로그램 강제 종료 . (웹이란 500번)
 	 
 3. 예외처리 >> 예외 발생에 대한 코드 수정이 아니고 >> 일반 임시방편으로 >> 문제가 생기더라도 >> 프로그램이 안정적으로 종료 ......
 >> 결국 예외처리를 통해서 문제가 생긴 부분을 찾아서 >> 다시 코드 수정 >> 배포 작업.
 
 try{
 	>> 문제가 의심되는 코드 실행
 	>> 문제가 발생(exception)
 }
 catch(Exception e){
    >> 문제가 발생한 예외 부분을 파악...
    >> 처리 (코드를 수정하는것이 아닌 로그정도 쌓음).
    >> 1. 관리자에 email 보내기.
    >> 2. 로그파일 남기기. (장애 발생 기록)
    >> 3. 강제로 프로그램 종료되는것 막음.
    >> 결국 개발자가 연락을 받고 수정하는것이 답.
 }
 finally{
 	>> 문제가 발생하던, 발생하진 않던 강제적으로 실행해야 될 코드
 	>> DB작업 문제(특정 자원에 종료) 강제 (DB는 강제로 종료해야됨)
 }
 
 */
public class Ex01_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		try {
			System.out.println(0/0); //당신은 연산예외가 발생 0으로 나눴군요.
			//연산 예외가 발생... try{}catch() 처리 프로그램이 강제 종료되진 않음.
			//Exception 클래스 사용 (예외 클래스의 최상위 부모)
			//e 라고 변수는 무엇을 받는것일까?
			//Exception e >> Exception 객체의 주소값....
			//ArithmeticException 문제가 발생.
			//컴파이러에 의해서 ArithmeticException 객체가 생성되고
			//그 객체에게 문제가되는 메세지, 코드 전달.
			//
		}catch(Exception e) { //부모타입의 변수는 자식 타입의 주소값을 받을 수 있다(다형성)
			//어떤 문제인지를 파악하고 그 정보를 전달.
			//관리자 , email, log write 작업.
			System.out.println(e.getMessage());
		}finally {
			
		}
		

		
		System.out.println("main end");
	}

}
