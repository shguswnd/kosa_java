import java.util.Scanner;
public class Ex10_Statement {

	public static void main(String[] args) {
		
		int sum =0 ;
		
		for(int i=1; i<10;i++)
		{
			for(int j=(i-1);j<i;j++)
			{
				sum = i + j;
				System.out.print("i : " + i);
				System.out.print("j : " + j);
				System.out.println("sum : " + sum);
			}
			System.out.println();
		}
		
	}

}
