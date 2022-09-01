import java.io.IOException;

/*
 try{
 
 }catch(Exception e){
 	
 }finally{
 	강제적으로 실행되는 블럭
 }
 
 나는 예외가 발생하던, 예외가 발생하지 않던 강제적으로 실행되어야 되는 구문을 가지고 있다.
 
 >>게임 CD 설치 PC
 >>1. 설치파일 >> C:\Temp >> 복사
 >>2. 복사한 파일 >> 프로그램 설치
 >>3. 정상 설치 >> C:\Temp 복사한 파일 삭제
 >>4. 비정상 설치 >> 강제 종료 >> 복사한 파일 삭제
 */
public class Ex03_finaaly {
	
	static void startInstall() {
		System.out.println("copy files");
	}
	
	static void copyFiles() {
		System.out.println("install");
	}
	static void fileDelete() {
		System.out.println("file delete");
	}
	
	//실제로 예외는 아니지만
	//개발자가 필요에 따라서 어떤 상황을 예외적 상황이라고 정의하고 예외를 발생.
	//사용자 정의 예외처리.
	//throw new IOException
	public static void main(String[] args) {
		try {
			copyFiles();
			startInstall();
			//throw new IOException("install 문제가 발생....."); 
		}catch(Exception e) {
			System.out.println("예외 메세지 출력 : " + e.getMessage());
		}finally { //강제 실행 블럭 예외 발생떄도 실행되고, 정상적이여도 실행.
			//함수의 강제 종료인 return 만나도 finally가 먼저 실행되어 처리함.
			//어떠한 상황도 무조건 실행이 된다.
			fileDelete();			
		}
			

	}

}
