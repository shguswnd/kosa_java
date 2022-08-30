import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;
// �ڵ��� ���������� �ϳ����� ����!!!



public class Ex08_printf_format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//system.out.println();
		System.out.println(); //����ϰ� �ٹٲ� (����)
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		System.out.println();
		System.out.print("D");
		System.out.println();
		int num = 100;
		System.out.println(num);
		
		System.out.println("num ���� " + num + " �Դϴ�.");
		
		// ���� format
		System.out.printf("num ���� %d �Դϴ�.", num);
		System.out.printf("num ���� [%d] �Դϴ�. �� [%d] �� �ֽ��ϴ�. \n", num, 12345);
		//format ���Ĺ���
		/*
		 %d (10���� ������ ����)
		 %f (�Ǽ�)
		 %s (String)
		 %c (char)
		 \t tab, \n �ٹٲ�
		 
		 */
		
		
		//�Է¹ޱ� (cmd) ����ڰ� �Է��� ���� ������ ����.
		Scanner scan = new Scanner(System.in);
		//String value = scan.nextLine(); //�Է��ϰ� ���͸� ĥ������ ���(���α׷��� ������� �ʰ� ��� ���)
		//�Է��� ���� ���ڿ��� ����.
		//System.out.println(value);
		
		//float number = scan.nextFloat();
//		System.out.println("number : " + number);
		
		//������� : nextInt, nextFloat ���ٴ� nextLine() read Ÿ���� �ٲ���.
		//Today Point
		
		//[���ڸ�] => ���ڷ� (����,�Ǽ�)
		//Integer.parseInt("11111") ->> ���� ->> 11111
		//Float.parseFloat("3.14") ->> �Ǽ� -> 3.14
		
//		try {
//			int number = scan.nextInt();
//			System.out.println("number : " + number);
//		}
//		catch(InputMismatchException e){
//			System.out.println("�߸��ԷµǾ��� " + e);
//		}
		System.out.println("���ڸ� �Է��ϼ���");
		int number = 0;
		try {
			 number = Integer.parseInt(scan.nextLine());			
		}
		catch(NumberFormatException e)
		{
			System.out.println(e + " �߸��Ǿ����ϴ�");
		}


		System.out.println(number);
		
		scan.close();
		
	}

}