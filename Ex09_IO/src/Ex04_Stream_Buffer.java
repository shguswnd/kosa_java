import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 File 처리 (DISK) : 입력 출력은 Byte 단위 (한 Byte) read, write >> 백명의 학생이 있는데 목적지에 버스에 한명씩 태워서 가는 비효율적방식
 
 여러 학생을 모아서 하나의 버스에 태워서 목적지에 데려감
 버스 : buffer
 
 1. I/O 성능 개선 (접근 횟수)(한번에 읽고 씀)
 2. Line 단위 (엔터)
 
 
 BufferedInputStream (보조 스트림) >> 주 클래스에 의존한다.
 
 */

public class Ex04_Stream_Buffer {

	public static void main(String[] args) {
		String path = "C:\\KOSA_IT\\Temp";
		String targetfile = "fileName.txt";
		OutputStream fos = null;
//		fos = new FileOutputStream(targetfile);
		
		BufferedOutputStream bos = null;
		
		
		try {
			fos = new FileOutputStream("data.txt"); //파일이 없으면 파일 자동생성
			bos = new BufferedOutputStream(fos); //FileOutputStream 버퍼 사용
			//8kbyte 기본 크기값
			/*
			 자바의 버퍼의 크기는 (8kbyte : 8192byte)
			 1. buffer 안에 내용이 채워지면 스스로 출발 (8바이트를 넘어 버리면 버퍼를 비우는 작업)
			 2. 강제로 출발(buffer 강제로 비움) : flush() or close()
			 3. close() 자원해제 >> close는 내부적으로 flush() 호출 후 >> 자원해제
			 */
			
			for(int i = 0 ; i < 10 ; i++) {
				bos.write('A'); //data.txt 파일에 쓰겠다.
				//close or flush를 안하면 8바이트가 다 안찼기 때문에 파일에 데이터가 저장이 안된다.
			}

		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
