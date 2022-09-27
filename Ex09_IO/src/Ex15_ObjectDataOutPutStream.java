import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.or.kosa.UserInfo;

public class Ex15_ObjectDataOutPutStream {

	public static void main(String[] args) {
		String filename = "C:\\KOSA_IT\\Temp\\UserData.txt";
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream out = null; //객체통신
		
		try {
			fos = new FileOutputStream(filename, true);
			bos = new BufferedOutputStream(fos);
			//직렬화
			out = new ObjectOutputStream(bos);
			
			UserInfo u1 = new UserInfo("길동이", "super", 500);
			UserInfo u2 = new UserInfo("scoot", "tiger", 50);
			
			//직렬화 과정 ....
			out.writeObject(u1); //UserInfo 분해해서 한줄로 세워서 파일 기록
			out.writeObject(u2);
			//파일에 UserInfo 객체 2개 직렬화 write
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				out.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
