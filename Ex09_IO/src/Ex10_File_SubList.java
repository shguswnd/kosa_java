import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex10_File_SubList {
	static int totalfiles=0; //���ϰ���
	static int totaldirs=0; //��������
	
	static void printFileList(File dir) {
		System.out.println("Full Path : " + dir.getAbsolutePath());
		
		//�ڵ� .... ����......
		List<Integer> subdir = new ArrayList<Integer>();
		File[] files = dir.listFiles(); //���� �ڿ� ���� ���θ� ����
		//[0] > a.txt  >> �� ���� Ÿ���� File Ÿ��
		//[1] > aaa����
		//[2] > bbb����
		//[3] > java.jpg
		
		for(int i = 0 ; i < files.length ; i++) {
			System.out.println("������ ����̵ɱ�???");
			System.out.println(files[i]);
			String filename = files[i].getName(); //������ or ���ϸ�
			if(files[i].isDirectory()) { //�������
				filename = "[ DIR ]" + filename;
				//������ ��ġ���� ��������??
				subdir.add(i); 
			}else {
				filename = filename + " / " + files[i].length() + "byte";
			}
		}
		
		//������ ����
		int dirnum = subdir.size(); //���� �־��� ������ ���� ���� ����
		int filenum = files.length - dirnum;
		
		//�������� (���� ���� �ȿ� �ڿ�)
		totaldirs+=dirnum; //�� ���� ���� ����(���� ��������)
		totalfiles+=filenum; //�� ���� ���� ����(���� ��������)
		
		System.out.println("[Current DirNum] : " + dirnum);
		System.out.println("[Current FileNum] : " + filenum);
		System.out.println("*****************************************");
		
		//���� ������ �ٽ� ������ �� ��ȸ
		for(int i = 0 ; i < subdir.size() ; i++) {
			int index = subdir.get(i); // ������ �� ��ġ��
			//������ �ڵ�
			printFileList(files[index]);
		}
	}
	
	public static void main(String[] args) {
		if(args.length != 1) { //��Ѱ��� �ԷµȰ� ���� ....>>>��ΰ���.....
			System.out.println("����:java [���������ϸ�] [��θ�]");
			System.out.println("���� : java Ex10_File_Sub C:\\KOSA_IT\\Temp");
			System.exit(0);
		}
		File f = new File(args[0]); // parameter�� �شٸ� args[0]��  C:\KOSA_IT\Temp �� �ִ�.
		
		if(!f.exists() || !f.isDirectory()) {
			//�������� �ʰų� �Ǵ� ���丮�� �ƴ϶��
			System.out.println("��ȿ���� ���� ���丮");
			System.exit(0);
		}
		//�������� ��� �׸��� �������� ....
		printFileList(f); //�����....
		//���� ���� �ȱ����� ���� ����, ���� ���� ����
		System.out.println("���� �� ���ϼ� : " + totalfiles);
		System.out.println("���� �� ������ : " + totaldirs);
	}

}
