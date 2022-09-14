import java.util.HashMap;
import java.util.Set;

class QuizInfo{
	String question;
	String anwer;
	String result;
	public QuizInfo(String question, String anwer, String result) {
		super();
		this.question = question;
		this.anwer = anwer;
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "QuizInfo [문제=" + question + ", 답안=" + anwer + ", 결과=" + result + "]";
	}
	
	
}

public class Ex16_Map_Generic {

	public static void main(String[] args) {
		HashMap<String, String> quiz = new HashMap<String, String>();
		quiz.put("1+1", "2");
		quiz.put("1+2", "3");
		quiz.put("1+3", "4");
		
		for(int i = 0 ; i < quiz.size(); i++) {
			Set set = quiz.keySet();
			Object[] obj = set.toArray(); //key 집합을 배열로 바꾸어서 처리
			System.out.println("문제 : " + obj[i]);
			System.out.println(quiz.get(obj[i]));
			System.out.println(quiz.toString());
		}
	}

}
