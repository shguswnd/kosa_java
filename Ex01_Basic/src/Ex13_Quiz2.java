import java.util.Scanner;

public class Ex13_Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int UNIT = 10000;//ȭ�����
		int NUM = 0;//ȭ��ż�
		int MONEY = 0;//�Է¹޴� �ݾ�
		boolean SW = true;
		
		Scanner scan = new Scanner(System.in);
		MONEY = scan.nextInt();
		
		System.out.println("�ݾ��� �Է��ϼ���.");
		while(UNIT>1)
		{
			NUM = MONEY/UNIT;
			MONEY -= (UNIT*NUM);
			System.out.println(UNIT + " " + NUM + "��");
			
			if(SW == true)
			{	
				SW = false;
				UNIT /= 2;
			}
			else 
			{
				SW = true;
				UNIT /= 5;
			}
		}
	}
}
