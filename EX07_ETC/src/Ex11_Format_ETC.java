import java.text.DecimalFormat;
import java.text.MessageFormat;

public class Ex11_Format_ETC {

	public static void main(String[] args) {
		double money = 123456.5678;
		//숫자형식을 포맷팅
		DecimalFormat df = new DecimalFormat("0.0"); //123456.6 으로 반올림됨
		System.out.println(df.format(money));
		
		DecimalFormat df2 = new DecimalFormat("0"); //123456 으로 반올림됨 
		System.out.println(df2.format(money));
		
		DecimalFormat df3 = new DecimalFormat("0.000000000"); //.이후로 빈 값들을 0으로 채워줌 
		System.out.println(df3.format(money));
		
		DecimalFormat df4 = new DecimalFormat("#.#############"); //위와 다르게 아래값 채우지 않음.
		System.out.println(df4.format(money));
		
		
		
		String userId="kglim";
		String userName="홍길동";
		String userTel="010-111-1111";
		String message = "회원 Id :{0} \n회원 이름 : {1} \n회원 전화번호 : {2}"; // printf 처럼 사용가능
		String result = MessageFormat.format(message, userId, userName, userTel);
		
		System.out.println(result);
	}

}
