import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

/*
 Byte 데이터를 read, write >> 그 대상이 >> File
 FileInputStream
 FileOutputStream
 
 (이미지, 엑셀파일) read, write
 File >> 1.txt, data.txt (데이터를 파일에 기록)
 
 I/O 클래스 예외를 강제  try......
 
 I/O 자원은 개발자가 직접적으로 자원에 해제 (여러 사용자들이 접근 사용 가능)
 >> 그래서 쓰는 자원이 close() 함수
 */
public class Ex02_Point_FileStream {

	public static void main(String[] args) {
		FileInputStream fs = null;
		FileOutputStream fos = null;
		File test;
		
		try {
			String path = "C:\\KOSA_IT\\Temp\\hidden.txt";
			test = new File(path);
			Runtime rt = Runtime.getRuntime();
			test.createNewFile();
			Process ps = rt.exec("attrib +h " + path);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(ps.getInputStream()));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		String path = "C:\\KOSA_IT\\Temp\\a.txt";
		
		try {
			fs = new FileInputStream(path);
			fos = new FileOutputStream("C:\\KOSA_IT\\Temp\\new.txt");
			//FileOutputStream(File file, boolean append) 파라미터의 append 값을 이름지어 오버라이드로 덮어쓸지, 추가해서 쓸지를 정한다는 의미이다.
			/*
			 FileOutputStream
			 1. write 파일이 존재하지 않으면 >> 자동파일 생성(create)
			 
			 2. FileOutputStream("C:\\KOSA_IT\\Temp\\new.txt",false");
			 	true >> append
			 	false >> Override
			 */
			
			int data = 0;
			while((data = fs.read()) != -1) {
//				System.out.println("정수 : " + data + " : " + (char)data);
//				//문자값 char c = (char)data
				//read한 데이터를 이제 new.txt에 써보자
				
				fos.write((char)data);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			//정상, 비정상
			//함수가 return 해도 finally 실행
			//자원해제
			//I/O 가비지 컬렉터가 관리하지 않음.
			//close() 명시적 >> 소멸자 호출
			
			//파일처리는 실수 경향이 많아 다시 예외처리해줌 
			try {
				fs.close();
				fos.close();
			}catch (Exception e) {

			}
		}
	}

}
