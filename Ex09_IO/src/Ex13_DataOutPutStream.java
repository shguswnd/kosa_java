import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 ������Ʈ�� >> Ÿ���� �����Ͽ� ������ ����� �ִ�.
 
 DataOutPutStream
 DataInputStream
 
 java 8���� �⺻Ÿ��(Ÿ�Ժ��� write, read)
 �� �������� �ѳ��� ���� ����ؾߵȴ� >> ���� ���̽�ߵȴ�!!!!!!@!@!@!
 
 ����)
 ����.txt
 100, 20, 60, 88 >> ���ڿ� > split > �迭 > �����Ϸ��� ���������� �ٲ�ߵ�
 
 
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
				dos.writeInt(score[i]); //���������� �״�� write �ϴµ� ������.
				//���� read�� ��� �ݵ�� DataInputStream�� ���!!!
				//dos.writeUTF(null); //ä�ö� �Ҳ���. �ѱۿ��� �Է�/���
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
