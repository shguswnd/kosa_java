import java.io.FileReader;
import java.io.FileWriter;

/*
 ���� ����� ������ ó�� (char[])
 String Ŭ���� : String str = "ABC" : ���������� char[] >> [A][B][C]
 
 �ѱ� 1��, ���� 1�� >> 2Byte >> Reader, Writer(�߻�Ŭ����) 
 
 ��� ����
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
				if(data != '\n' && data != '\r' && data != ' ' && data != '\t') { //���Ͽ� ����, ��, ���ڴ� ���Ͽ� ���� �ʰڴ�. >> �������� ����
					fw.write(data);
					//����, ��, ���ڴ� ���� ���� �ʰڴ�.
					//�������� ����
				
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
