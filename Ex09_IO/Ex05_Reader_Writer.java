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
			fr = new FileReader("Ex01_Stream.java");
			fw = new FileWriter("copy_Ex01.txt");
		}catch (Exception e) {
			
		}

	}

}
