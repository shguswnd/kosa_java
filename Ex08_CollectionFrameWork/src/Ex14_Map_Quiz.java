import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex14_Map_Quiz {

	public static void main(String[] args) {
		/*
		 Map ��� �����ϴ� ������ ����
		 ������ȣ, �����ȣ, ȸ������(id, pwd) ����
		 */

		
		/*
		 �츮 �ý����� ȸ�������� ȸ���� id, pwd ������ ������ �ִ�.
		 �α׸��� ���̵�� ����� Ȯ���ؼ� ȸ���̶�� ����Ʈ ���� ����
		 
		 id(0), pwd(0) >> ȸ���� �氡�氡
		 id(0), pwd(X) >> ��й�ȣ �Է� �߰�.....
		 
		 */
//		System.out.println(loginmap.containsKey("kim"));
//		System.out.println(loginmap.get("kim"));
		
		Scanner scan = new Scanner(System.in);
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("kim", "kim1004");
		while(true)
		{
			System.out.println("id : ");
			String id = scan.nextLine();
			System.out.println("pwd : ");
			String pwd = scan.nextLine();
			
			id = id.replace(" ", "");
			id = id.toLowerCase();
			pwd = pwd.replace(" ", "");
			if(loginmap.containsKey(id) && loginmap.get(id).equals(pwd)) {
					System.out.println("�氡�氡");
					return;
			}
			else if(loginmap.containsKey(id) && !loginmap.get(id).equals(pwd))
			{
					System.out.println("��й�ȣ Ȯ���� �ּ���.");
			}
			else {
					System.out.println("id ���Է� �ϼ���.");
			}
		}
		
		
	}

}
