package kr.or.bit;

public class Lotto {

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
}
