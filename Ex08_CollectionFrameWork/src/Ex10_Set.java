import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 Set �������̽�(�� �ȿ� ������) : ��������(x), �ߺ��� ������� ����
 ������ ���� �ߺ��� ������� �ʴ� ������ ����
 �����ϴ� Ŭ����
 HashSet , TreeSet
 */
public class Ex10_Set {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		//������ ���� �ߺ����� ���� ������ ����.
		hs.add(1);
		hs.add(100);
		boolean bo = hs.add(55);
		//System.out.println("���� : " + bo);
		
		bo = hs.add(1);
		//System.out.println("��� : " + bo); //�̹� ���ȿ��� 1�̶� �����Ͱ� ����
		
		//�ߺ� ..... �ζ�, ������ȣ
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
		//��¼��� ����ȵ�
		
		String[] strobj = {"A","B","C","D","B","A"}; //1000 (1�Ǿ� �ߺ�)
		HashSet<String> hs3 = new HashSet<String>();
		for(int i = 0 ; i < strobj.length ; i++) {
			hs3.add(strobj[i]); //�ߺ��������� add���� �ʴ´�.
		}
		
//		System.out.println(hs3.toString());
		
		//Quiz
		//HashSet ����ؼ� 1~45������ ���� 6���� ��������~.
		
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
		
		//HashSet ������ >> �θ� >> Set
		
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
