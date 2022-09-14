import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
 HashMap<k,v>
 
 HashMap<String, String>
 HashMap<Integer, String>
 HashMap<String, Student>
 
 >> put("kglim", new Student());
 Student st = new Student();
 >> put("kglim", st);
 
 class Student{ //클래스도 데이터 타입이니 올 수 있다.}
 */
class Student{
	int kor;
	int math;
	int eng;
	String name;
	
	public Student(int kor, int math, int eng, String name) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.name = name;
	}
}

class ArrayTest{
	ArrayList<String[]> al = new ArrayList<String[]>();
	
}
public class Ex15_Map_Generic {

	public static void main(String[] args) {
		//key대한 타입 value에 대한 타입
		HashMap<String, String> sts = new HashMap<String, String>();
		sts.put("A", "AAA");
		//System.out.println(sts.get("A"));
		
		//실무에서 Map
		//학생들의 성적데이터
		//kim, [국어, 영어, 수학] >> Array, Collection(ArrayList (o))
		//value 값으로 객체가 많이옴
		
		Map<String, Student> smap = new HashMap<String, Student>();
		smap.put("hong", new Student(100, 80, 50, "홍길동"));
		smap.put("kim", new Student(50, 30, 60, "김유신"));
		
		Student sd = smap.get("hong");
		System.out.println(sd.kor);
		System.out.println(sd.math);
		
		
		//제너릭 타입으로 배열도 가능하다.
		ArrayTest at = new ArrayTest();
		String[] starr = {"A","B","C"};
		at.al.add(starr);
		
		//Tip
		Set set = smap.entrySet(); //map 안에 있는 키와 밸류값을 가공하여 >> key+"="+value 로 가공한다.
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Tip key, value 분리되서 결과를 보고 싶음.
		//class Entry{Object key, Object value}
		//Map {Entry[] element} >> Map.Entry
		
		for(Map.Entry m : smap.entrySet()) {
			System.out.println(m.getKey() + "/" + m.getValue()); //다운캐스팅 해야함.
		}
 	}
}
