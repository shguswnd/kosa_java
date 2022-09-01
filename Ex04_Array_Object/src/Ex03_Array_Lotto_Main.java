/*
 1. 1~45 ������ ������ �߻����� 6���� �������� �迭�� ���.
 2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵ�(�ߺ��� ���� �ڵ�)
 3. �迭�� �ִ� 6���� ���� ���� ������ �����ϱ�(���� : �ڸ��ٲ� : swap)
 4. �� ����� ����ִ� �迭�� ���

*/


public class Ex03_Array_Lotto_Main {
	
	
	
	public static int distinct(int lottor[], int length) {
		int i = 0;
		int random = (int)((Math.random()*45)+1);
		while(i<=length)
			{
				if(lottor[i] == random)
					random = (int)((Math.random()*45)+1);
				else
					i++;					
			}		
		return random;
	}
	
	public static void sort(int [] lotter) {
		for(int i = 0 ; i < lotter.length; i++)
		{
			for(int j = i+1 ; j<lotter.length ; j++)
			{
				if(lotter[i] > lotter[j])
				{
					swap(lotter, i,j);
				}
			}
		}
	}
	
	public static void swap(int lotter[], int first, int last) {
		int tmp = lotter[first];
		lotter[first] = lotter[last];
		lotter[last] = tmp;
	}
	
	public static void main(String[] args) {
		//Math.random()*(�ִ밪-�ּҰ�+1)+�ּҰ�
		int[] lottor = new int[6];
		
		for(int i = 0 ; i < lottor.length ; i++)
		{
			lottor[i] = distinct(lottor, i);
		}
		sort(lottor);
		for(int i = 0 ; i < lottor.length ; i++)
			System.out.println(lottor[i]);
		
	}

}
