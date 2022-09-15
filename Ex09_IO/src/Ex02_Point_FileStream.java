import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

/*
 Byte �����͸� read, write >> �� ����� >> File
 FileInputStream
 FileOutputStream
 
 (�̹���, ��������) read, write
 File >> 1.txt, data.txt (�����͸� ���Ͽ� ���)
 
 I/O Ŭ���� ���ܸ� ����  try......
 
 I/O �ڿ��� �����ڰ� ���������� �ڿ��� ���� (���� ����ڵ��� ���� ��� ����)
 >> �׷��� ���� �ڿ��� close() �Լ�
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
			//FileOutputStream(File file, boolean append) �Ķ������ append ���� �̸����� �������̵�� �����, �߰��ؼ� ������ ���Ѵٴ� �ǹ��̴�.
			/*
			 FileOutputStream
			 1. write ������ �������� ������ >> �ڵ����� ����(create)
			 
			 2. FileOutputStream("C:\\KOSA_IT\\Temp\\new.txt",false");
			 	true >> append
			 	false >> Override
			 */
			
			int data = 0;
			while((data = fs.read()) != -1) {
//				System.out.println("���� : " + data + " : " + (char)data);
//				//���ڰ� char c = (char)data
				//read�� �����͸� ���� new.txt�� �Ẹ��
				
				fos.write((char)data);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			//����, ������
			//�Լ��� return �ص� finally ����
			//�ڿ�����
			//I/O ������ �÷��Ͱ� �������� ����.
			//close() ����� >> �Ҹ��� ȣ��
			
			//����ó���� �Ǽ� ������ ���� �ٽ� ����ó������ 
			try {
				fs.close();
				fos.close();
			}catch (Exception e) {

			}
		}
	}

}
