/*
 1. 1~45 까지의 난수를 발생시켜 6개의 정수값을 배열에 담기.
 2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안됨(중복값 검증 코드)
 3. 배열에 있는 6개의 값은 낮은 순으로 정렬하기(정렬 : 자리바꿈 : swap)
 4. 위 결과를 담고있는 배열을 출력

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
		//Math.random()*(최대값-최소값+1)+최소값
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
