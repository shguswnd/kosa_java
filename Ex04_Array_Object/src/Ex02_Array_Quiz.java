
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
//			if(max < score[i])
//				max = score[i];
//			if(min > score[i])
//				min = score[i];
			max = (score[i] > max) ? score[i] : max;
			min = (score[i] < min) ? score[i] : min;
		}
		System.out.println("min : " + min + " max : " + max);
		
		int number[] = new int[10];
		for(int i = 0 ; i < 10 ; i++)
			number[i] = i+1;
		for(int i = 0 ; i < 10 ; i++)
			System.out.println(number[i]); 
	
		//��� �л��� �⸻��� ��������(5����)
		int[] jumsu = {100,55,90,60,78};
		int sum = 0;
		float avg = 0f;
		
		
		for(int i = 0 ; i < jumsu.length ; i++)
			sum += jumsu[i];
		avg = sum/(float)jumsu.length;
		System.out.printf("�� ����� : %d, ���� �� : %d ������� : %.2f", jumsu.length, sum, avg);
	
	
	}

}
