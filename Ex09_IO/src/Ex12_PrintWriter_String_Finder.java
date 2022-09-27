import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex12_PrintWriter_String_Finder {
	String baseDir = "C:\\KOSA_IT\\Temp"; //�˻��� ���丮
	String word = "Hello"; //�˻��� �ܾ�
	String savetxt = "C:\\KOSA_IT\\Temp\\result.txt"; //Hello�ܾ ����ִ� ���� ���� ����
	
	void Find() throws IOException{ //Find �Լ� ���� try ... ����ó�� ����
		File dir = new File(baseDir);
		if(!dir.isDirectory()) {
			System.out.println("��ȿ�� ���� �ƴϿ���.");
			System.exit(0);
		}
		
		PrintWriter writer = new PrintWriter(new FileWriter(savetxt));
		BufferedReader br = null;
		
		File[] files = dir.listFiles();
		for(int i = 0 ; i < files.length ; i++) {
			if(!files[i].isFile()) { //������ �ƴ϶��
				continue; //skip �Ʒ� �ڵ� ����.......
			}//�����̸�
			br = new BufferedReader(new FileReader(files[i]));
			
			//a.txt
			//a.txt �ѹ��徿 read (����)
			String line = "";
			while((line = br.readLine()) != null) {
				//�ܾ�˻�
				if(line.indexOf(word) != -1) {
					//a.txt�� ���پ� �����鼭 �׹���ȿ� hello �ܾ �ϳ��� �ִٸ�
					writer.write("word = " + files[i].getAbsolutePath() + "\n");
					//��θ� �����Ҳ���.
				}
			}
			writer.flush();
		}
		br.close();
		writer.close();
	}
	public static void main(String[] args) {
		Ex12_PrintWriter_String_Finder finder = new Ex12_PrintWriter_String_Finder();
		//finder.Find();//�׳ɾ��� ����ó������ try~ catch�� ������ ���� ��Ų��.
		
		try {
			finder.Find();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
