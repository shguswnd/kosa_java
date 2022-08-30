import java.util.Scanner;

public class Ex13_Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int UNIT = 10000;//화폐단위
		int NUM = 0;//화폐매수
		int MONEY = 0;//입력받는 금액
		boolean SW = true;
		
		Scanner scan = new Scanner(System.in);
		MONEY = scan.nextInt();
		
		System.out.println("금액을 입력하세요.");
		while(UNIT>1)
		{
			NUM = MONEY/UNIT;
			MONEY -= (UNIT*NUM);
			System.out.println(UNIT + " " + NUM + "개");
			
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
