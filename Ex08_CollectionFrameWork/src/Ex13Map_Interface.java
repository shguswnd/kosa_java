import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 Map 인터페이스
 (key, value) 쌍의 구조를 같는 배열
 ex) 지역번호 (03, 서뤃), (031, 경기)
 조건)
 key 중복(x)    >> Set
 value 중복(O)  >> List
 
 Generic 지원
 
 Map 인터페이스 구현하는 클래스
 구버전 : HashTable (동기화) : 한강 화장실(lock) 자원 보호
 신버전 : HashMap (동기화 강제하지 않음.) 성능고려 (Thread 학습 .....) 
 */
public class Ex13Map_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("Tiger", "1004");
		map.put("Scott", "1004");
		map.put("Superman", "1007");
		
//		System.out.println(map.containsKey("tiger")); //대소문자 구별 (false)
//		System.out.println(map.containsKey("Scott"));
//		System.out.println(map.containsKey("1004"));
//		
//		System.out.println(map.get("Tiger"));
//		System.out.println(map.get("hong"));
		
		map.put("Tiger", "1008");
//		System.out.println(map.get("Tiger"));
//		
//		System.out.println(map.size()); //3
//		
//		System.out.println(map.toString());
		
		map.remove("Superman");
		System.out.println(map.toString());
	
		Set set = map.keySet();
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collection clist = map.values(); //value는 중복데이터가 있어서 순서가 있는 데이터 집합으로 관리
		
		System.out.println(clist.toString());
		
		
	}
	

}
