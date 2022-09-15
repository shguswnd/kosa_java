import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 자바 8가지 기본 타입(값타입) : JAVA API 제공
 
  8가지 기본 타입에 대해서 객체 형태로 사용 가능하도록 만든 클래스(wpapper class)
  [사용]
  
  1. 매개변수 객체 요구될때
  2. 기본형 값이 아닌 객체 형태로 저장이 필요시
  3. 객체간 값을 비교할때
  4. 타입 변환시 처리
  
  >> generic 설계 (객체 형태) > int > Integer
 */
public class Ex08_Wrapper_Class {

	public static void main(String[] args) {
//		Integer n = new Integer(500);
//		System.out.println("n :" + n);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		
		//parameter 활용
		//제너릭(generic) : 객체를 만들때 타입을 강제하는 방식으로 >> wrapper class
		
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(100);
		//li.add("a"); 정수타입 x
		
		for(int value : li) {
			System.out.println(value);
		}
		
		Iterator<Integer>t = li.iterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		
		System.out.println(i2 == i3); // false // 주소값을 비교
		System.out.println(i2.equals(i3)); // true // 주소를 찾아가서 그 값을 비교
		
		//String >> 문자열값 비교 >> equals (재정의 되어있음)
		
		int i4 = 100;
		int i5 = 100;
		//위 두개는 값 타입이라 i4==i5 비교가 가능하다.
	}

	static void iMethod(Integer i) {
		
	}
}
