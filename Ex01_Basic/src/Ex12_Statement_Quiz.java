import java.util.Scanner;
//���� : 1 ���� : 2 �� : 3
public class Ex12_Statement_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �޴��� �����ְ� ����ڿ��� ���� .....
		// �ٸ����� �����ϸ� �ٽ� �����ϵ��� �����ϴ� �޴�
		// while(true)
		// do~while()
		int random = 0;
		boolean auto = true;
		
		

		Scanner scan = new Scanner(System.in);
				
		while(true) {
			random = (int)(Math.random()*3) + 1;
			
			System.out.println("**************************************");
			System.out.println("��������������");
			System.out.println("**************************************");
			
			System.out.println("�����ϼ���");
			
//			
//			int input = Integer.parseInt(scan.nex)
//			
//			
//			//�Ǵ�.
//			
//			System.out.println("�� : " +random+  "���� : " + computer + "  �� : " + input);
//			
//			if(input.equals(computer)){
//				System.out.println("�����ϴ�.");
//				auto = false;
//			}
//			else
//			{
//				if(input.equals("����"))
//				{
//					if(computer.equals("����"))
//					{
//						System.out.println("�����ϴ�.");
//					}
//					else
//					{
//						System.out.println("�̰���ϴ�.");
//					}
//					
//				}
//				else if(input.equals("����"))
//				{
//					if(computer.equals("��"))
//					{
//						System.out.println("�����ϴ�.");
//					}
//					else
//					{
//						System.out.println("�̰���ϴ�.");
//					}
//				}
//				else if(input.equals("��"))
//				{
//					if(computer.equals("����"))
//					{
//						System.out.println("�����ϴ�.");
//					}
//					else
//					{
//						System.out.println("�̰���ϴ�.");
//					}
//				}
//						
//			}
//			
//			
//				
			
		
		}
//		switch(input)
//		{
//			case 1 : System.out.println("����ó��..");
//					 balance += Integer.parseInt(scan.nextLine());
//					 break;
//			case 2 : System.out.println("���ó��..");
//					 balance -= Integer.parseInt(scan.nextLine());
//					 break;
//			case 3 : System.out.println("�ܰ�...");
//					 break;
//			case 4 : System.out.println("�����մϴ�.");
//			  		 auto = false;
//			  		 break;
//			default : System.out.println("�ùٸ� �޴��� �����ϼ���.");
//		}

	}

}