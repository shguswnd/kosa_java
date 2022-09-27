import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.FileSystemNotFoundException;

import kr.or.kosa.UserInfo;

//UserData.txt ����ȭ�� ��ü�� 2��
//�� ��ü���� read �����·� ����(������ȭ)

public class Ex16_ObjectDataInputStream {
	
	public static void main(String[] args) {
		String filename = "C:\\KOSA_IT\\Temp\\UserData.txt";
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream in = null;
		
		try {
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			in = new ObjectInputStream(bis);//������ �ڵ尡 ������ȭ
			
			//����
//			UserInfo r1 = (UserInfo)in.readObject();
//			UserInfo r2 = (UserInfo)in.readObject();
//			
//			System.out.println(r1.toString());
//			System.out.println(r2.toString());

			
			//������ ���� �����???
			
			Object users = null;
			
			while((users = in.readObject()) != null) {
				System.out.println(users);
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʾƿ�");
		}catch (EOFException e) {
			System.out.println("�� " + e.getMessage());
		}catch (IOException e) {
			System.out.println("������ ���� �� �����.");
		}catch (ClassNotFoundException e) {
			System.out.println("�ش� ��ü�� �������� �ʾƿ�.");
		}catch (Exception e) {
			System.out.println("�����ڰ� �������� ���� ������ ���� ���� : "+e.getMessage());
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
