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
		return "QuizInfo [����=" + question + ", ���=" + anwer + ", ���=" + result + "]";
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
			Object[] obj = set.toArray(); //key ������ �迭�� �ٲپ ó��
			System.out.println("���� : " + obj[i]);
			System.out.println(quiz.get(obj[i]));
			System.out.println(quiz.toString());
		}
	}

}
