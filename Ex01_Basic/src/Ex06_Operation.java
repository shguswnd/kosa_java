//import java.lang.*; �ش��� �ڵ�� �����Ǿ�����. �⺻������ ���� ������ ���µ� ������ �⺻ �����̶� �Ƚᵵ ���� ���̺귯���� ��밡��.


public class Ex06_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 100/100;
	//	System.out.println(result);
		
		result = 13/2; //��
		
		//System.out.println(result);
		
		//�������� ���ϴ� �����ڰ� ���� ����. %
		
		result = 13%2;
		
//		System.out.println(result);
		
		//����, ���� (������ ������ : ++ , --)
		
		int i = 10;
		++i; //��ġ����
		System.out.println(i);
		i++; // ��ġ����
		//ȥ�ڼ��� ��ġ ��ġ �ǹ� ����. ������ ����
		System.out.println(i);
		
		// Today Point (������ ������ �ٸ� �����ڿ� ���յǸ� ��ġ, ������ ��Ƴ�)
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2;
		System.out.println(result2);
		
		byte b = 100;
		byte c = 1;
		//byte d = b + c;
		//Type mismatch: cannot convert from int to byte 
		//�ڹٴ� ������ �� ��� �������� ����� �׷��Ƿ� byte���� �����۾��� �ص� ���������� �۾��� ��. 4����Ʈ�� �۾��Ѵ�.
		// �ذ�
		// 1. casting (����� �⺻ ���� ������ 4����Ʈ ������ �����)
		byte d = (byte) (b + c); //�ս��� ���� ������.
		
		// 2. int ������ �ٲ�. 
		//int d = b + c ; //����� Ÿ���� �� ū ���� ����ؼ� (�ս� �߻����� ����)
		
		//Today Point
		/*
		 1. ������ ��� ������ [int] Ÿ�� ��ȯ �Ŀ� ó��.
		 ex) byte + short => �����Ϸ��� ���������� int + int
			 char + char => �����Ϸ��� ���������� int + int
			 ����ó���Ҷ�
			 ������ ���꿡�� int ���� ���� Ÿ���� int�� ��ȯ ����(long ����)
			 byte, char, short ����ÿ��� > int �濡 �־ ��� > int
			 
			 char + int >> int + int
			 int + long >> long + long ����������(ūŸ������ ����).

			 ���� + �Ǽ� >> Ÿ���� ũ��� ������� >> �Ǽ� ��!
			 
		*/
		
		long ln = 10000000000L;
		float fl = 1.2f;
		//long Inresult = ln + fl; �սǹ߻�
//		long Inresult = (long)(ln + fl);
//		System.out.println(Inresult);
		float Inresult = ln + fl;
		System.out.println("Inresult : " + Inresult);
		float num2 = 10.45f;
		int num3 = 20;
		float result5 = num2 + num3;
		System.out.println("result5 : " + result5);
		
		char c2 = '!';
		char c3 = '!';
		
		int result6 = c2 + c3;
		
		System.out.println("result6 : " + result6);
		
		
		//���
		//�߼ұ�� ���蹮�� (������ ���) >> �ﰢ�� ����� >> ����.
		
		
		int sum = 0; //local variable;
		
		
		for(int j = 1 ; j<=100 ; j++)
		{
			sum += j;
//			System.out.println("sum : " + sum);
			if(j % 2 == 0)
			{
				sum += j;
			}
		}
		System.out.println("sum : " + sum);
		
		// == ������ (���� ���ϴ� ������)
		
		if (10 == 10.0f) { // Ÿ���� �������� ���� �ƴϰ� ������ �ִ� ���� ��
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		// ! ���� ������
		if('A' != 65) {
			System.out.println("���� ���� : true");
		}
		else {
			System.out.println("���� : false");
		}
		
		// �ϱ� (Today point)
		// �������߿��� ��� ����
		// ���׿�����
		
		int p = 10;
		int k = -10;
		int result8 = (p == k) ? p : k;
		
		//�� �ڵ带 if���� ����ؼ� ó���ϼ���.
		System.out.println("result8 : " + result8);
		
		if(p == k)
		{
			result8 = p;
		}
		else {
			result8 = k;
		}
		
		//����ǥ
		//��������
		// 0 : false
		// 1 : true
		
		/* 		OR ����, AND ����
		 0 0	   0	   0
		 0 1	   1	   0
		 1 0	   1	   0
		 1 1	   1	   1
		 
		 
		 DB (Oracle) SQL�� �ڿ��� (�ΰ��� �ؼ��ϱ� ���� �ڿ�� ����).
		 select *
		 from emp
		 where job = 'it' and sal > 2000
		 
		 
		 select *
		 from emp
		 where job = 'it' or sal > 2000
		 
		 
		 ������(��Ʈ)
		 | or ����
		 & and ����
		 
		 ��������
		 ||  or
		 &&  and
		 
		 */
		int x = 3;
		int y = 5;
		
		System.out.println("x|y : " + (x|y));
		System.out.println("x&y : " + (x&y));
		//		System.out.println("x|y : " + ());
		/*
		 ������ -> 2����(0,1)
		 
		 8bit
		 256 128 64 32 16 8 4 2 1
		  				0 0 1 1 > 10���� 3�� 2������		 
		 				0 1 0 1 > 10���� 5�� 2������
		 OR 			0 1 1 1 > | or ���� > 4+2+1 > 7
		 AND 			0 0 0 1 > & and ���� > 1				
		*/

		//Today Point ( && (and) , || (or))
		//if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1) { A } else { B } ******
		//������ ������ ���� ó�� �˴ϴ�.
		//if(10 > 0 or -1 > 1 or 100 > 2 or 1 > -1) { A } else { B }
		
		
		int data = 80;

		switch (data) {
			case 100 :
				System.out.println("100�Դϴ�.");
				break;
			case 90 :
				System.out.println("90�Դϴ�.");
				break;
			case 80 : 
				System.out.println("80�Դϴ�.");
				break;
			default : 
				System.out.println("��ġ���� ����.");
		}
		
		int month = 5;
		String res = "";
		switch (month) {
			case 1 :
			case 3 : 
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				res = "31";
				break;
			case 4 :
			case 6 :
			case 9 :
			case 11 :
				res = "30";
				break;
			case 2:
				res = "29";
				break;
			default :
				res = "!!";
		}
		System.out.println(month + "���� " + res + "���Դϴ�.");
		
		//���� (������)
		//java (����ϰ��� �ϴ� �پ��� �ڿ��� �̸� ������ �ξ��� >> ã�Ƽ� >> ��� jaca api
		//���� ( ã�Ƽ� ... ���) api ����
		//https://docs.oracle.com/javase/8/docs/api/index.html
		//���ϴ� �ڿ��� ã�Ƽ� ������� �ľ��ϰ� ó�� FM >> ��κ��� ���� ���̹� ���
		//public static double random()
		// equal to 0.0 and less than 1.0. ������ ������ ���� �� �ִ�. 
		// ��� : double �Ǽ� return 0.0 <= random < 1.0
		//��Ģ���� ���
		//������ �ϴ� �ڿ��� �ִ� ������ open
		//import java.lang.* >> java �����ȿ� lang �����ȿ� �ִ� ��� �ڿ��� ��밡��.
		
		
		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.random() * 10 : " + (Math.random() * 10));
		System.out.println("(int)(Math.random() * 10) : " + (int)(Math.random() * 10)); //1~9 ���� ����
		System.out.println("((int)(Math.random() * 10) + 1) : " + ((int)(Math.random() *10) + 1));//1~10���� ����.
		
	}
}