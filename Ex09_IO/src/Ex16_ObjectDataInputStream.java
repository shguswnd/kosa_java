import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.FileSystemNotFoundException;

import kr.or.kosa.UserInfo;

//UserData.txt 직렬화된 객체가 2개
//이 객체들을 read 원상태로 복원(역직렬화)

public class Ex16_ObjectDataInputStream {
	
	public static void main(String[] args) {
		String filename = "C:\\KOSA_IT\\Temp\\UserData.txt";
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream in = null;
		
		try {
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			in = new ObjectInputStream(bis);//한줄의 코드가 역직렬화
			
			//복원
//			UserInfo r1 = (UserInfo)in.readObject();
//			UserInfo r2 = (UserInfo)in.readObject();
//			
//			System.out.println(r1.toString());
//			System.out.println(r2.toString());

			
			//개수를 세는 방법음???
			
			Object users = null;
			
			while((users = in.readObject()) != null) {
				System.out.println(users);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않아요");
		}catch (EOFException e) {
			System.out.println("끝 " + e.getMessage());
		}catch (IOException e) {
			System.out.println("파일을 읽을 수 없어요.");
		}catch (ClassNotFoundException e) {
			System.out.println("해당 객체가 존재하지 않아요.");
		}catch (Exception e) {
			System.out.println("개발자가 예측하지 못한 나머지 예외 전부 : "+e.getMessage());
		}finally {
			try {
				in.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
