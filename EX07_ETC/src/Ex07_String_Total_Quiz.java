// �ֹι�ȣ : �޹�ȣ ù�ڸ� : 1,3 ����, 2,4 ���� ��� ��� ... �ϴ� ����
//main �Լ� Scanner ��� �ֹι�ȣ �Է¹ް�
//��:6�ڸ� ��: 7�ڸ�

//�Է°� : 123456-1234567

//static
//1.�ڸ��� üũ(���)�Լ� (14 ok) return true, false
//2. �޹�ȣ ù��° �ڸ��� 1~4������ ���� ��� ��� �Լ� return true, false
//3. �޹�ȣ ù���� �ڸ����� ������ 1,3 ���� , 2,4 ���� ��� ��� �Լ� void ���

import java.util.Scanner;






public class Ex07_String_Total_Quiz {

	static boolean Check(String fullNumber) {
		fullNumber.replace("-", "");
		if(fullNumber.length()==14)
			return false;
		else
			return true;
	}
	
	static boolean lastNumber_Check(String fullNumber) {
	
		String numberArr[] = fullNumber.split("-");
		if(numberArr[1].charAt(0)>='1' && numberArr[1].charAt(0)<='4')
		{
			return true;
		}
		else {
			return false;
		}
			
	}
	static void Print(String fullNumber) {
		String numberArr[] = fullNumber.split("-");
		if(numberArr[1].charAt(0)=='1' || numberArr[1].charAt(0)=='3')
		{
			System.out.println("�����Դϴ�.");
			
		}
		else {
			System.out.println("�����Դϴ�.");

		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		String acount;
		
		
		do{
			System.out.println("�ֹε�Ϲ�ȣ �Է����ּ���(xxxxxx-xxxxxxx)");
			acount = scan.next();
			lastNumber_Check(acount);
			if(!lastNumber_Check(acount))
			{
				acount = "";
				System.out.println("�߸��ԷµǾ����ϴ�.");
			}
			else {
				System.out.println("�ֹε�Ϲ�ȣ�� ���������� �ԷµǾ����ϴ�.");
			}
			
		}while(Check(acount));
		
		Print(acount);
		
	
		
		
	}

}
