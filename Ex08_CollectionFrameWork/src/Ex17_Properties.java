import java.util.Properties;

/*
 Map �������̽��� ������ Ŭ����
 
 (Properties)Ư���� ���� : <String><String> : Ű�� ��� Ÿ���� ����.........
 Properties prop = new Properties();
 
 ������
 1. App ��ü�� ���Ǵ� �ڿ� ����
 2. ȯ�溯��
 3. ���α׷� ����
 4. ���� ���
 5. ���뺯��
 
 */

public class Ex17_Properties {

	public static void main(String[] args) {
		Properties prop = new Properties(); 
		prop.setProperty("admin", "kosa@or.kr");
		prop.setProperty("version", "2.x.x.x");
		prop.setProperty("downpath", "C:\\Temp\\images");
		//������ ���� ����������
		//�������� ������ �κ��� �����Ѵ�.
		System.out.println(prop.getProperty("admin"));
		System.out.println(prop.getProperty("version"));
		System.out.println(prop.getProperty("downpath"));
	}

}
