
public class test {

	public static void main(String[] args) {
		String test[][] = { {"[     1     ]" , "[2]", "[3]"},
				{"[4]", "[5]", "[6]"}};
		
		String firstM = "[";
		String jungan = "  1  ";
		String lastM = "]";
		String a1 = "[1]";
		String sum = firstM + jungan + lastM;
		
		System.out.println(sum);
		
		jungan = "사용중";
		sum = firstM + jungan + lastM;
		
		System.out.println(sum);
	}
}
		
//		test[0][0] = firstM + jungan + lastM;
//		
//		
//		
//		for(int i = 0 ; i < 2 ; i++) {
//			for(int j = 0 ; j < 3 ; j++)
//			{
//				if(i==1&&j==1)
//					test[i][j] = "[사용중++]";
//				System.out.print("	"+test[i][j]+"	");
//			}
//			System.out.println();
//		}
//
//	}


