import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 Collection FramWork
 (수 많은 인터페이스와 그것을 구현하고 있는 수 많은 클래스가 있음.)
 
 Iterator 인터페이스
 (반복자)
 [나열된 자원에 대해 순차적으로 접근해서 값을 리턴하는 표준을 정의]
 추상함수로 정의하고 있다 >> 누군가는(ArrayList) >> 추상함수를 구현(표준화된)
 
 
 Iterator 인터페이스 가지고 있는 추상함수는
 >>hasNext(), Next(), remove() 추상자원
 >>ArrayList implements Iterator { hasNext()을 재정의 구현하고 있다}
 */
public class Ex09_Collection_Iterator {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		
//		for(int i = 0 ; i < list.size() ; i++) {
//			System.out.println(list.get(i));
//		}
		
		//표준화된 출력 방식 (순서대로 나열된 데이터에 대해서)
		Iterator it = list.iterator(); //호출하면 함수안에서 인터페이스를 구현하는 객체가 생성됨
// 		list.iterator(); //호출하면 함수안에서 인터페이스를 구현하는 객체가 생성되고 그 주소를 리턴함
		while(it.hasNext()) { //현업 코드 권장사항(표준화)
			System.out.println(it.next());
		}
		
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		
		
		//인터페이스도 generic 명시 (주의)
		Iterator<Integer> it2 = intlist.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		//단점 유연성이 없다.
		System.out.println("*********************************************");
		for(int i = intlist.size()-1 ; i>=0 ; i--) {
			System.out.println(intlist.get(i));
		}
		
		//ListIterator : 역방향 사용가능 
		//역방향이라고 해도 일단 순방향 한바퀴가고 이전 값을 확인하는 hasPrevious 를 확인하여 다시 뒤로 간다.
		ListIterator<Integer> it3 = intlist.listIterator();
		
		//순방향
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		while(it3.hasPrevious()) {
			System.out.println(it3.previous());
		}
	}
}
