import java.util.Scanner;
//가위 : 1 바위 : 2 보 : 3
public class Ex12_Statement_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메뉴를 보여주고 사용자에게 선택 .....
		// 다른것을 선택하면 다시 선택하도록 강제하는 메뉴
		// while(true)
		// do~while()
		int random = 0;
		boolean auto = true;
		
		

		Scanner scan = new Scanner(System.in);
				
		while(true) {
			random = (int)(Math.random()*3) + 1;
			
			System.out.println("**************************************");
			System.out.println("가위바위보게임");
			System.out.println("**************************************");
			
			System.out.println("선택하세요");
			
//			
//			int input = Integer.parseInt(scan.nex)
//			
//			
//			//판단.
//			
//			System.out.println("값 : " +random+  "컴터 : " + computer + "  나 : " + input);
//			
//			if(input.equals(computer)){
//				System.out.println("비겼습니다.");
//				auto = false;
//			}
//			else
//			{
//				if(input.equals("가위"))
//				{
//					if(computer.equals("바위"))
//					{
//						System.out.println("졌습니다.");
//					}
//					else
//					{
//						System.out.println("이겼습니다.");
//					}
//					
//				}
//				else if(input.equals("바위"))
//				{
//					if(computer.equals("보"))
//					{
//						System.out.println("졌습니다.");
//					}
//					else
//					{
//						System.out.println("이겼습니다.");
//					}
//				}
//				else if(input.equals("보"))
//				{
//					if(computer.equals("가위"))
//					{
//						System.out.println("졌습니다.");
//					}
//					else
//					{
//						System.out.println("이겼습니다.");
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
//			case 1 : System.out.println("예금처리..");
//					 balance += Integer.parseInt(scan.nextLine());
//					 break;
//			case 2 : System.out.println("출금처리..");
//					 balance -= Integer.parseInt(scan.nextLine());
//					 break;
//			case 3 : System.out.println("잔고...");
//					 break;
//			case 4 : System.out.println("종료합니다.");
//			  		 auto = false;
//			  		 break;
//			default : System.out.println("올바른 메뉴를 선택하세요.");
//		}

	}

}
