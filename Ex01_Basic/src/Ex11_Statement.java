import java.util.Scanner;


public class Ex11_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i =1;
//		int j = 1;
//		while(i >= 10)
//		{
//			//�ݵ��
//			//�������� ����
//			i--;
//			System.out.println("i : " + i);
//		}
//		
//		int sum = 0;
//		
//		while(j <= 100)
//		{
//			sum += j;
//			j++;
//		}
//		System.out.println("sum : " + sum);
//		
		//while �������� ����ϼ���.
		// for(int i = 1; j <= 9 ; j++)
		// for(int j = 1; j <=9 ; j++)
		
		// while 2��
//		int kal=0;
//		while(i<10)
//		{
//			
//			while(j<10)
//			{
//				kal = i * j;
//				System.out.print("������ " + i + "x" + j + " : " + kal + " ");
//				j++;
//			}
//			System.out.println();
//			j=1;
//			i++;
//		}
//		

		//do ~ while : ���� �޴� ���Ë� ���� (ex : ����ڰ� ��� �̻��� ȭ���� Ŭ���Ѵٸ� ó������ ��������)
		
		//���α׷� ����
		//����� ���ϴ� �޴� ��ȣ�� ���� >> do .. ���ð� �޾Ƽ�
		//while(input > 2) �ٽ��Է�.
		
		Scanner scan = new Scanner(System.in);
		int inputdata = 0;
		
		do {
			System.out.println("���� �Է� (0~9)");
			inputdata = Integer.parseInt(scan.nextLine());
		}while(inputdata >= 10);
		
		System.out.println("����� �Է��� ���ڴ� : " + inputdata);
		
	}

}