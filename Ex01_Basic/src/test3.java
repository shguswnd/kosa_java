
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(int i=1; i<101; i++) { System.out.print(i + " "); if((i%10)==0)
		 * System.out.println("\n"); // System.out.println("i : " + i + "\n");
		 * 
		 * }
		 */
		
		/*
		 * int i=0; while(true) { ++i; System.out.print(i+" "); if((i%10)==0)
		 * System.out.println("\n"); if(i==100) break; }
		 */
		/*
		 * int number = 1;
		 * 
		 * for(int i=0;i<10;i++) { for(int j=0; j<10; j++) { System.out.print(number +
		 * " "); number++; } System.out.println(); }
		 */
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				System.out.print((i*10)+ (j+1) + " ");
			}
			System.out.println();
		}
	}

}
