
public class Ex08_Array_Rank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ������ �迭 (2����)
		 [��][��]
		 ��ȭ�� �¼�, ������ ��ǥ��, ����, ����ǥ
		 
		 ��ȭ�� ���� ��� ... ���� ���α׷�.
		 
		 
		 */
		int[][] score = new int[3][2];
		
		score[0][0] = 100;
		score[0][1] = 200;
		
		score[1][0] = 300;
		score[1][1] = 400;
		
		score[2][0] = 500;
		score[2][1] = 600;
		
		//for��
		
		
		for(int[] hak_value : score)
		{
			for(int value : hak_value)
			{
				System.out.print(value + " ");
			}
			System.out.println();
		}
	
//		int[][] score3 = new int[][] {{0��},{1��},{2��}};
		
		int[][] score3 =new int[][] {{11,12},{13,14},{15,16}};
		
		for(int[] hak_value : score3)
		{
			for(int value : hak_value)
				System.out.print(value + " ");
			System.out.println();
		}
	
	}

}
