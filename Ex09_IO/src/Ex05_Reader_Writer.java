import java.io.FileReader;
import java.io.FileWriter;

/*
 문자 기반의 데이터 처리 (char[])
 String 클래스 : String str = "ABC" : 내부적으로 char[] >> [A][B][C]
 
 한글 1자, 영문 1자 >> 2Byte >> Reader, Writer(추상클래스) 
 
 대상 파일
 FileReader
 FileWriter
 */
public class Ex05_Reader_Writer {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex05_Reader_Writer.java");
			fw = new FileWriter("copy_Ex01.txt");
			
			int data = 0;
			while((data = fr.read()) != -1) {
//				System.out.println(data);
				if(data != '\n' && data != '\r' && data != ' ' && data != '\t') { //파일에 엔터, 탭, 빈문자는 파일에 쓰지 않겠다. >> 압축파일 버전
					fw.write(data);
					//엔터, 탭, 빈문자는 파일 쓰지 않겠다.
					//압축파일 버전
				
				}
					
			}
		}catch (Exception e) {
			
		}finally {
			try {
				fr.close();
				fw.close();
			} catch (Exception e2) {

			}
		}

	}

}
