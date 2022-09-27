import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 보조스트림 >> 타입을 지정하여 파일을 만들수 있다.
 
 DataOutPutStream
 DataInputStream
 
 java 8가지 기본타입(타입별로 write, read)
 단 조건으로 둘끼리 묶어 사용해야된다 >> 둘이 같이써야된다!!!!!!@!@!@!
 
 만약)
 성적.txt
 100, 20, 60, 88 >> 문자열 > split > 배열 > 연산하려면 숫자형으로 바꿔야됨
 
 
 */
public class Ex13_DataOutPutStream {

	public static void main(String[] args) {
		int[] score = {100,60,55,95,55};
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream("C:\\KOSA_IT\\Temp\\score.txt");
			dos = new DataOutputStream(fos);
			fis = new FileInputStream("C:\\KOSA_IT\\Temp\\score.txt");
			dis = new DataInputStream(fis);
			for(int i = 0 ; i < score.length ; i++) {
				dos.writeInt(score[i]); //정수값으로 그대로 write 하는데 깨진다.
				//조건 read할 경우 반드시 DataInputStream을 써라!!!
				//dos.writeUTF(null); //채팅때 할꺼다. 한글영어 입력/출력
			}
			for(int i = 0 ; i < score.length ; i++) {
				System.out.println(dis.readInt());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			try {
				dos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
