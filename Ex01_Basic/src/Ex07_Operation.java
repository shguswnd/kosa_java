
public class Ex07_Operation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 대입 연산자.
		// +=, -=, *=, /=
		/*
		 * int sum = 0; sum+=1;//sum = sum + 1; sum-=1; System.out.println("sum : " +
		 * sum);
		 */
		// 간단한 학점 계산기.

		// 학점 : A+, A-, B+, B-, .....F
		// 점수 : 94점

		// 판단기준 90 이상인지 >> A 부여
		// 판단 95점 이상 >> A+
		// 아니라면 >> A-
		// 84 일단 80점 이상 > B
		// 판단 85점 이상 >> B++
		// 아니라면 >> B-

		
		
		  int score = 78;
		  
		  String grade=""; //A+, A- 를 담는 변수. System.out.println("당신의 점수는 : " + score);
		  
		  if(score>=95) grade = "A+";
		  else if(score>=90) grade = "A-";
		  else if(score>=85) grade = "B+"; 
		  else if(score>=80) grade = "B-"; 
		  else grade = "B-"; 
		  System.out.println("학점은 : " + grade);
		 		  		
		
/*		double jumsu = (Math.random() * 100 + (double) 1);

		System.out.println(String.format("%.2f",jumsu));
		String grade=""; //A+, A- 를 담는 변수. System.out.println("당신의 점수는 : " + score);
		 
		if(jumsu>=95) 
			grade = "A+"; 
		else if(jumsu>=90) 
			grade = "A"; 
		else if(jumsu>=85) 
			grade = "B+"; 
		else if(jumsu>=80) 
			grade = "B"; 
		else 
			grade ="B-"; 
		System.out.println("학점은 : " + grade);
		*/
//		double jumsu = (Math.random() * 100 + (double) 1);

	}
}
