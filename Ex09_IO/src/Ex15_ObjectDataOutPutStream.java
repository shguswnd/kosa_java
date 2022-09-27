import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.or.kosa.UserInfo;

public class Ex15_ObjectDataOutPutStream {

	public static void main(String[] args) {
		String filename = "C:\\KOSA_IT\\Temp\\UserData.txt";
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream out = null; //��ü���
		
		try {
			fos = new FileOutputStream(filename, true);
			bos = new BufferedOutputStream(fos);
			//����ȭ
			out = new ObjectOutputStream(bos);
			
			UserInfo u1 = new UserInfo("�浿��", "super", 500);
			UserInfo u2 = new UserInfo("scoot", "tiger", 50);
			
			//����ȭ ���� ....
			out.writeObject(u1); //UserInfo �����ؼ� ���ٷ� ������ ���� ���
			out.writeObject(u2);
			//���Ͽ� UserInfo ��ü 2�� ����ȭ write
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
