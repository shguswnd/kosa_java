import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class DosProject {
	static boolean delete(File newfile) {
			File[] files = newfile.listFiles();
			if(files != null) {
				for(File file : files) {
					delete(file);
					System.out.println(newfile);
				}
			}
		return newfile.delete();
	}
	public static void main(String[] args) throws Exception {

		//java ExDos C:\Temp mkdir newDir
		//java ExDos C:\Temp rename file.txt file2.txt
		//java ExDos C:\Temp delete new.txt

		if(args.length != 3 && args.length != 4 && args.length != 2) {

		System.out.println("���� : [java���ϸ�] [���丮���] mkdir [�������丮��]");

		System.out.println("���� : [java���ϸ�] [���丮���] rename [���ϸ�] [���ο� ���ϸ�]");

		System.out.println("���� : [java���ϸ�] [���丮���] delete [���ϸ�]");
		
		System.out.println("���� : [java���ϸ�] [���丮���] hidden [���ϸ�]");
		
		System.out.println("���� : [java���ϸ�] [���丮���] dir");

		System.exit(0);

		}

		File f = new File(args[0]);

		if(!f.exists() || !f.isDirectory()) { //�������� �ʰų� ���丮 �ƴ϶��

		System.out.println("��ȿ���� ���� ���丮�Դϴ�");

		System.exit(0);

		}

		if(args[1].equals("mkdir")) 

		{

		String path = "";

		path = f + "\\" + args[2];

		File newfile = new File(path);

		if(newfile.exists()) {

		System.out.println("�̹� �����ϴ� ���丮�Դϴ�");

		}

		else {

		newfile.mkdir();
	
		}

		}
		
		else if(args[1].equals("hidden")) {
			String path = "";
			
			path = f + "\\" + args[2];
			System.out.println(path);
			File newfile = new File(path);
			System.out.println(newfile);
			
			if(!newfile.exists()) {
				Runtime rt = Runtime.getRuntime();
				newfile.createNewFile();
				Process ps = rt.exec("attrib +h " + path);
				BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
			}
			else {
				System.out.println("�̹� ������ �����մϴ�.");	
			}

		}
		else if(args[1].equals("rename")) {
			try {
				File originFileName = new File(f + "\\" + args[2]);
				File newFileName = new File(f + "\\" + args[3]);
				
				if(!originFileName.exists()) {
					System.out.println("�������� �ʽ��ϴ�.");
					System.exit(0);
				}
				if(newFileName.exists()) {
					System.out.println("�̹� �����ϴ� �̸��Դϴ�");
					System.exit(0);
				}
				
				boolean scc = originFileName.renameTo(newFileName);
				if(scc) {
					System.out.println("���� �Ϸ�");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("rename �� ���� �߻� : " + e.getMessage());
			}

		}
		else if (args[1].equals("delete")) { //args[1] ��° ���� delete��? (equals: boolean)
			String path = "";
			path = f + "\\" + args[2];
			File newfile = new File(path);
			if(!newfile.exists()) {
				System.out.println(newfile.isDirectory());
				if(newfile.isDirectory()) {
					System.out.println("������ �������� �ʽ��ϴ�.");
				}
				else {
					System.out.println("������ �������� �ʽ��ϴ�.");
				}
			}
			delete(newfile);
			
			
			
		
		}
		else if (args[1].equals("dir")) { //��� ��ȸ
			File[] file = f.listFiles();
			for (int i=0; i<file.length; i++) {
				System.out.println(file[i]);
			}			
		}

	}

}
