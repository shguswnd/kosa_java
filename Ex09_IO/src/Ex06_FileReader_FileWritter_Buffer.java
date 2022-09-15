import java.io.BufferedReader;
import java.io.FileReader;

public class Ex06_FileReader_FileWritter_Buffer {

	public static void main(String[] args) {
		/*
		FileWriter fw = new FileWriter("Lotto.txt",true); //true >>append
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("�ζ�");
		bw.newLine(); //����ó��
		bw.write("1,3,5,7,9,10");
		bw.newLine();
		bw.flush();
		*/
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");
			br = new BufferedReader(fr);
			//line ���� ������ ó��
			String line="";
			for(int i = 0 ; (line = br.readLine()) != null ; i++) {
				//System.out.println(line);
				if(line.indexOf(";") != -1) {
					System.out.println(line);
					//������ read �ߴµ� ; ������ �� ���� ����ϰڴ�
				}
			}
			
		} catch (Exception e) {
			
		}finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
