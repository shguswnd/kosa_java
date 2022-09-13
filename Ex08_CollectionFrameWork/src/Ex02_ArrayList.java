import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex02_ArrayList {

	public static void main(String[] args) {
		//ArrayList : List 인터페이스 구현 (순서보장, 중복데이터 허락)
		
		ArrayList arrayList = new ArrayList();
		//Object 타입으로
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println(arrayList.toString());
		
		//add 함수는 순차적으로 데이터 넣기
		arrayList.add(0,111); //**자리이동**
		System.out.println(arrayList.toString());
		arrayList.add(4,444);
		System.out.println(arrayList.toString());
		
		//비순차적인 데이터 추가, 삭제 >> ArrayList 적합하지 않음. //특정위치를 지정하여 추가/삭제 방법.
		//**순차적인 데이터 추가, 삭제
		
//		arrayList.remove(111); //에러 발생 왜냐? 111을 object의 데이터로 하길 원했지만 프로그램에서는 index로 읽어버림 이래서 제너릭을 사용해야한다.
		
		System.out.println(arrayList.contains(200)); //200을 포함하고 있니?
		System.out.println(arrayList.contains(2000));
		
		arrayList.clear(); //데이터 삭제 (공간은 남아 있다).
		System.out.println(arrayList.size());
		System.out.println(arrayList.isEmpty()); //데이터 있니 없니?>>데이터가 없는게 맞니??? //없으면 true
	
		arrayList.add(101);
		arrayList.add(102);
		arrayList.add(103);
		
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.size());
		Object value = arrayList.remove(0); //101삭제 ... 자리바꿈 밀고 올라감
		System.out.println(arrayList.toString());
		
		
		//POINT
		//인터페이스 부모 타입
		//개발자 습관적으로 .. 다형성 (확장성, 유연성)
		
		
		List li = new ArrayList(); //습관적으로 부모타입 쓰자
		//List는 인터페이스이므로 실제로 메소드들 사용은 오버라이드된 ArrayList꺼는 사용한다.
		//ArrayList li = new ArrayList();
		//List li = new ArrayList(); 는 List를 받을수 있는 최상위를 둠..
		
		li.add("가");
		li.add("나");
		li.add("다");
		li.add("라");
		
		
		//li.subList(0, 0) return을 보면 List가 된다 왜냐? 다형성으로 부모타입으로 받고 List타입으로 리턴을 한다.
		
		List li2 = li.subList(0, 2); //subList함수는 내부적으로 new ArrayList() 생성
		System.out.println(li2);
		System.out.println(li2.toString());
		
		
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(7);
		alist.add(40);
		alist.add(46);
		alist.add(3);
		alist.add(15);
		
		System.out.println(alist.toString());
		Collections.sort(alist);
		System.out.println(alist); //내부적으로 정렬 >> 초급개발자 프로젝트 시 쓰면 감점...........
		
		Collections.reverse(alist);
		System.out.println(alist);
		
		
	}

}
