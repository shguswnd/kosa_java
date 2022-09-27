import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex14_DataInputStream {

	public static void main(String[] args) {
		//���� �л� ���� ���
		//read �հ�, ���
		FileInputStream fis = null;
		DataInputStream dis = null;
		String path = "C:\\KOSA_IT\\Temp\\score.txt";
		int sum=0;
		Double average=0.0;
		try {
			fis = new FileInputStream(path);
			dis = new DataInputStream(fis);
			
			int data;
			
			
			int cnt=0;
			while((data = dis.readInt()) != -1) {
				sum +=data;
				cnt++;
				System.out.println("asd");
			}
			System.out.println("data");
//			average = (double)sum/cnt;
			System.out.printf("�հ� : %d ��� : %f", sum, average);
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʾƿ�");
		}catch (EOFException e) {
			System.out.println("�� " + e.getMessage());
		}catch (IOException e) {
			System.out.println("������ ���� �� �����.");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			try {
				System.out.printf("�հ� : %d ��� : %f", sum, average);
				dis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
