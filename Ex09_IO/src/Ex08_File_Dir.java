import java.io.File;

public class Ex08_File_Dir {

	public static void main(String[] args) {
		
		String test = "asd";
		for(int i =0 ; i < test.length() ; i++) {
			System.out.println(test.charAt(i));
		}
//		System.out.println(args[0]);
		if(args.length != 1) {
			System.out.println("���� : java ���ϸ� [���丮��]");
			System.exit(0); //��������
		}
		
		File f = new File(args[0]);
		//java Ex08_File_Dir C:\\Temp
		if(!f.exists()|| !f.isDirectory()) {
			//���߿� �ϳ��� �������� ������
			//�������� �ʰų� �Ǵ� ���丮�� �ƴ϶��
			System.out.println("��ȿ���� ���� ����Դϴ�.");
			System.exit(0);
		}
		
		// cmd â���� ���� ���� ���� ������ ��θ� cd�� bin ������ �� "���ϰ�� + ���� ������� ���"�� �Է��ϸ� �ȴ�.
		//ex) java Ex08_File_Dir C:\KOSA_IT\Temp
		
		//���� �����ϴ� ����̰� �����Ѱ��� �������
		//POINT
		File[] files = f.listFiles();
		System.out.println(files.length);
		
		for(int i = 0 ; i < files.length ; i++) {
			String name = files[i].getName();
			System.out.println(files[i].isDirectory() ? "[DIR]" + name : name);
		}
	}

}
