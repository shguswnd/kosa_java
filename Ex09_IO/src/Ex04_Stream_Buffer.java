import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 File ó�� (DISK) : �Է� ����� Byte ���� (�� Byte) read, write >> ����� �л��� �ִµ� �������� ������ �Ѹ� �¿��� ���� ��ȿ�������
 
 ���� �л��� ��Ƽ� �ϳ��� ������ �¿��� �������� ������
 ���� : buffer
 
 1. I/O ���� ���� (���� Ƚ��)(�ѹ��� �а� ��)
 2. Line ���� (����)
 
 
 BufferedInputStream (���� ��Ʈ��) >> �� Ŭ������ �����Ѵ�.
 
 */

public class Ex04_Stream_Buffer {

	public static void main(String[] args) {
		String path = "C:\\KOSA_IT\\Temp";
		String targetfile = "fileName.txt";
		OutputStream fos = null;
//		fos = new FileOutputStream(targetfile);
		
		BufferedOutputStream bos = null;
		
		
		try {
			fos = new FileOutputStream("data.txt"); //������ ������ ���� �ڵ�����
			bos = new BufferedOutputStream(fos); //FileOutputStream ���� ���
			//8kbyte �⺻ ũ�Ⱚ
			/*
			 �ڹ��� ������ ũ��� (8kbyte : 8192byte)
			 1. buffer �ȿ� ������ ä������ ������ ��� (8����Ʈ�� �Ѿ� ������ ���۸� ���� �۾�)
			 2. ������ ���(buffer ������ ���) : flush() or close()
			 3. close() �ڿ����� >> close�� ���������� flush() ȣ�� �� >> �ڿ�����
			 */
			
			for(int i = 0 ; i < 10 ; i++) {
				bos.write('A'); //data.txt ���Ͽ� ���ڴ�.
				//close or flush�� ���ϸ� 8����Ʈ�� �� ��á�� ������ ���Ͽ� �����Ͱ� ������ �ȵȴ�.
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
