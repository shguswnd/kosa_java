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
 
 class Student{ //Ŭ������ ������ Ÿ���̴� �� �� �ִ�.}
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
		//key���� Ÿ�� value�� ���� Ÿ��
		HashMap<String, String> sts = new HashMap<String, String>();
		sts.put("A", "AAA");
		//System.out.println(sts.get("A"));
		
		//�ǹ����� Map
		//�л����� ����������
		//kim, [����, ����, ����] >> Array, Collection(ArrayList (o))
		//value ������ ��ü�� ���̿�
		
		Map<String, Student> smap = new HashMap<String, Student>();
		smap.put("hong", new Student(100, 80, 50, "ȫ�浿"));
		smap.put("kim", new Student(50, 30, 60, "������"));
		
		Student sd = smap.get("hong");
		System.out.println(sd.kor);
		System.out.println(sd.math);
		
		
		//���ʸ� Ÿ������ �迭�� �����ϴ�.
		ArrayTest at = new ArrayTest();
		String[] starr = {"A","B","C"};
		at.al.add(starr);
		
		//Tip
		Set set = smap.entrySet(); //map �ȿ� �ִ� Ű�� ������� �����Ͽ� >> key+"="+value �� �����Ѵ�.
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Tip key, value �и��Ǽ� ����� ���� ����.
		//class Entry{Object key, Object value}
		//Map {Entry[] element} >> Map.Entry
		
		for(Map.Entry m : smap.entrySet()) {
			System.out.println(m.getKey() + "/" + m.getValue()); //�ٿ�ĳ���� �ؾ���.
		}
 	}
}
