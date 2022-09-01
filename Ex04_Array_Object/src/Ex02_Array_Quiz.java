
public class Ex02_Array_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//국문과 학생들의 기말고자 시험점수입니다.
		
		int[] score = new int[] {79,88,97,54,56,95};
		int max = score[0];//max < 79
		int min = score[0];//min < 79
		/*
			제어문을 통해서 max 하는 변수에 시험 점수중에 최대값을 담고
			min라는 변수에 시험점수중 최소값을 담아라.
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
	
		//어느 학생의 기말고사 시험점수(5과목)
		int[] jumsu = {100,55,90,60,78};
		int sum = 0;
		float avg = 0f;
		
		
		for(int i = 0 ; i < jumsu.length ; i++)
			sum += jumsu[i];
		avg = sum/(float)jumsu.length;
		System.out.printf("총 과목수 : %d, 과목 합 : %d 과목평균 : %.2f", jumsu.length, sum, avg);
	
	
	}

}
