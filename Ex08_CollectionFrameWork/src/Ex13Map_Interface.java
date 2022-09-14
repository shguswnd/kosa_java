import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 Map �������̽�
 (key, value) ���� ������ ���� �迭
 ex) ������ȣ (03, ����), (031, ���)
 ����)
 key �ߺ�(x)    >> Set
 value �ߺ�(O)  >> List
 
 Generic ����
 
 Map �������̽� �����ϴ� Ŭ����
 ������ : HashTable (����ȭ) : �Ѱ� ȭ���(lock) �ڿ� ��ȣ
 �Ź��� : HashMap (����ȭ �������� ����.) ���ɰ�� (Thread �н� .....) 
 */
public class Ex13Map_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("Tiger", "1004");
		map.put("Scott", "1004");
		map.put("Superman", "1007");
		
//		System.out.println(map.containsKey("tiger")); //��ҹ��� ���� (false)
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
		
		Collection clist = map.values(); //value�� �ߺ������Ͱ� �־ ������ �ִ� ������ �������� ����
		
		System.out.println(clist.toString());
		
		
	}
	

}
