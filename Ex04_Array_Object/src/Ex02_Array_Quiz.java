
public class Ex02_Array_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �л����� �⸻���� ���������Դϴ�.
		
		int[] score = new int[] {79,88,97,54,56,95};
		int max = score[0];//max < 79
		int min = score[0];//min < 79
		/*
			����� ���ؼ� max �ϴ� ������ ���� �����߿� �ִ밪�� ���
			min��� ������ ���������� �ּҰ��� ��ƶ�.
		 */
		
		for(int i = 0 ; i < score.length ; i++)
		{
			if(max < score[i])
				max = score[i];
			if(min > score[i])
				min = score[i];
		}
		System.out.println("min : " + min + " max : " + max);
	}

}
