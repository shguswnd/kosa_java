import java.util.Scanner;
public class Ex09_Operation_Quiz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =0;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력값 : ");
		int number1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("입력값(기호) : ");
		
		String operation = scan.nextLine();
		
		System.out.println("입력값 : ");
		
		int number2 = Integer.parseInt(scan.nextLine());
		
		
		
		if(operation.equals("+"))
		{
			num = number1 + number2;
		}
		else if(operation.equals("-"))
		{
			num = number1 - number2;			
		}
		else if(operation.equals("*"))
		{
			num = number1 * number2;
		}
		else if(operation.equals("/"))
		{
			num = number1 / number2;
		}
		System.out.println(num);
		
		
		
	}
}


