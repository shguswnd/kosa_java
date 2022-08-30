import java.util.Scanner;

public class Ex17_do_while_Menu {

	static Scanner sc = new Scanner(System.in);
	
	//��� ����
	static void inputRecord() {
		System.out.println("���� ������ �Է�");
	}
	static void deleteRecord() {
		System.out.println("���� ������ ����");
	}
	static void sortRecord() {
		System.out.println("���� ������ ����");
	}
	static int displayMenu() {
		System.out.println("************");
		System.out.println("***��������***");
		System.out.println("1.�л����� �Է�");
		System.out.println();
		System.out.println("2.�л����� ����");
		System.out.println();
		System.out.println("3.�л����� �̸��� ����");
		System.out.println();
		System.out.println("4.���α׷� ����");
		System.out.println();
		
		int menu = 0;
		do {
			try {
				menu = Integer.parseInt(sc.nextLine()); //1 or 2 �Է� 
				if(menu >= 1 && menu <= 4) {
					break; //do~while Ż��
				}else {
					//1���� �۰�  4 ���� ū�� 
					//���� ���� ������ �ƴ����� (���ܰ� �ƴ�����) 
					//�̷� ��Ȳ�� ���ܸ� ���� �� �־��
					throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
				}
			}catch (Exception e) {
				System.out.println("�������� : " + e.getMessage());
				System.out.println("�޴� ���� ���� �߻�");
				System.out.println("1~4���� ��ȣ�� �Է���");
			}
		}while(true);
		
		//1~4���� �� �ϳ��� �����ߴٸ�
		return menu;
	}
	
	
	public static void main(String[] args) {
		
		//Ex17_do_while_Menu ex17 = new Ex17_do_while_Menu(); static �� ��������ϱ� new �Լ� �����.
		while(true) {
			switch (displayMenu()) {
			case 1: inputRecord();
				break;
			case 2: deleteRecord();
				break;
			case 3: sortRecord();	
			    break;
			case 4: System.out.println("���α׷� ����");
			    //return;  >> main �Լ� ����
			    System.exit(0); //���α׷� ����(kill)
//			switch (ex17.displayMenu()) {
//			case 1: ex17.inputRecord();
//				break;
//			case 2: ex17.deleteRecord();
//				break;
//			case 3: ex17.sortRecord();	
//			    break;
//			case 4: System.out.println("���α׷� ����");
//			    //return;  >> main �Լ� ����
//			    System.exit(0); //���α׷� ����(kill)
			}
		}

	}

}