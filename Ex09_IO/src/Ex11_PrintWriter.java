import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/*
 ��� ���� ����
 1. printf
 2. String.format
 3. PrintWriter (������)
 4. ���� : ������ ����Ʈ���� (����� : ��ǥ, ���ݰ�꼭, �λ�(�ް�������))
 4.1 ũ����Ż ����Ʈ, ���� (�����)
 
 �ζ� ��� ....PrintWriter
 */
public class Ex11_PrintWriter {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
//			PrintWriter pw = new PrintWriter("C:\\KOSA_IT\\Temp\\homework.txt");
//			pw.println("*********************************************************");
//			pw.println("*                      HOMEWORK                         *");
//			pw.println("*********************************************************");
//			pw.printf("%3s : %5d %5d %5d %5.1f", "�ƹ���",100,99,80,(float)((100+99+80)/3));
//			pw.println();
//			pw.close();

			//read�Ҷ� ���δ����� >> ���ۻ��
			fr = new FileReader("C:\\KOSA_IT\\Temp\\homework.txt");
			br = new BufferedReader(fr);
			
			String s="";
			
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fr.close();
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
