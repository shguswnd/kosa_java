
public class Ex07_Operation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ������.
		// +=, -=, *=, /=
		/*
		 * int sum = 0; sum+=1;//sum = sum + 1; sum-=1; System.out.println("sum : " +
		 * sum);
		 */
		// ������ ���� ����.

		// ���� : A+, A-, B+, B-, .....F
		// ���� : 94��

		// �Ǵܱ��� 90 �̻����� >> A �ο�
		// �Ǵ� 95�� �̻� >> A+
		// �ƴ϶�� >> A-
		// 84 �ϴ� 80�� �̻� > B
		// �Ǵ� 85�� �̻� >> B++
		// �ƴ϶�� >> B-

		
		
		  int score = 78;
		  
		  String grade=""; //A+, A- �� ��� ����. System.out.println("����� ������ : " + score);
		  
		  if(score>=95) grade = "A+";
		  else if(score>=90) grade = "A-";
		  else if(score>=85) grade = "B+"; 
		  else if(score>=80) grade = "B-"; 
		  else grade = "B-"; 
		  System.out.println("������ : " + grade);
		 		  		
		
/*		double jumsu = (Math.random() * 100 + (double) 1);

		System.out.println(String.format("%.2f",jumsu));
		String grade=""; //A+, A- �� ��� ����. System.out.println("����� ������ : " + score);
		 
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
		System.out.println("������ : " + grade);
		*/
//		double jumsu = (Math.random() * 100 + (double) 1);

	}
}