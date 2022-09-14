import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 Set 인터페이스(원 안에 들어가세여) : 순서보장(x), 중복을 허락하지 않음
 순서가 없고 중복을 허락하지 않는 데이터 집합
 구현하는 클래스
 HashSet , TreeSet
 */
public class Ex10_Set {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		//순서가 없는 중복되지 않은 데이터 집합.
		hs.add(1);
		hs.add(100);
		boolean bo = hs.add(55);
		//System.out.println("정상 : " + bo);
		
		bo = hs.add(1);
		//System.out.println("결과 : " + bo); //이미 원안에는 1이라 데이터가 존재
		
		//중복 ..... 로또, 차량번호
		//System.out.println(hs.toString());
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("c");
		hs2.add("Z");
		hs2.add("A");
		hs2.add("H");
		hs2.add("b");
		hs2.add("C");
		hs2.add("b");
		
	//	System.out.println(hs2.toString());
		//출력순서 보장안됨
		
		String[] strobj = {"A","B","C","D","B","A"}; //1000 (1건씩 중복)
		HashSet<String> hs3 = new HashSet<String>();
		for(int i = 0 ; i < strobj.length ; i++) {
			hs3.add(strobj[i]); //중복데이터은 add하지 않는다.
		}
		
//		System.out.println(hs3.toString());
		
		//Quiz
		//HashSet 사용해서 1~45까지의 난수 6개를 넣으세요~.
		
//		int[] lottor = new int[6];
//
//		for (int i = 0; i < lottor.length; i++) {
//			lottor[i] = (int)(Math.random()*45 + 1);
//			for(int j = 0 ; j < i ; j++) {
//				if(lottor[i] == lottor[j]) {
//					i--;
//					break;
//				}
//			}
//		}
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		while(lotto.size()<6) {
			lotto.add((int)(Math.random()*45 + 1));
		}
		System.out.println(lotto.toString());
		
		//HashSet 다형성 >> 부모 >> Set
		
		Set set2 = new HashSet();
		
		int index = 0;
		
		
		Set<String> set3 = new HashSet<String>();
		set3.add("\"\"");
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFF");
		System.out.println(set3.toString());
		
		Iterator<String> st = set3.iterator();
		while(st.hasNext()) {
			System.out.println(st.next());
		}
		Set<Integer> set4 = new TreeSet<Integer>();
		while(set4.size()<6) {
			set4.add((int)(Math.random()*45+1));			
		}
		System.out.println(set4.toString());

	}

}
