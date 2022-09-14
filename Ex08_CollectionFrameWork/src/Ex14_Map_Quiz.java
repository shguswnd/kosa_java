import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex14_Map_Quiz {

	public static void main(String[] args) {
		/*
		 Map 사용 구현하는 데이터 집합
		 지역번호, 우편번호, 회원가입(id, pwd) 정보
		 */

		
		/*
		 우리 시스템은 회원가입한 회원의 id, pwd 정보를 가지고 있다.
		 로그린시 아이디와 비번을 확인해서 회원이라면 사이트 접속 가능
		 
		 id(0), pwd(0) >> 회원님 방가방가
		 id(0), pwd(X) >> 비밀번호 입력 추가.....
		 
		 */
//		System.out.println(loginmap.containsKey("kim"));
//		System.out.println(loginmap.get("kim"));
		
		Scanner scan = new Scanner(System.in);
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("kim", "kim1004");
		while(true)
		{
			System.out.println("id : ");
			String id = scan.nextLine();
			System.out.println("pwd : ");
			String pwd = scan.nextLine();
			
			id = id.replace(" ", "");
			id = id.toLowerCase();
			pwd = pwd.replace(" ", "");
			if(loginmap.containsKey(id) && loginmap.get(id).equals(pwd)) {
					System.out.println("방가방가");
					return;
			}
			else if(loginmap.containsKey(id) && !loginmap.get(id).equals(pwd))
			{
					System.out.println("비밀번호 확인해 주세요.");
			}
			else {
					System.out.println("id 재입력 하세요.");
			}
		}
		
		
	}

}
