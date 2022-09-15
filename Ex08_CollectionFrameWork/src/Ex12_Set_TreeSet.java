import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex12_Set_TreeSet {

	public static void main(String[] args) {
		//Set : ����(x) , �ߺ�(x)
		
		//TreeSet
		//����(x), �ߺ�(x), ���ı��(O)
		//�˻��ϰų� ���� �ʿ�� �ϴ� �ڷᱸ���� ���(������ ����)
		//�ζ�
		//�ߺ� ������ .... ��� ����(���� ������)
		
		//Ư¡
		//1. ����Ʈ������ (���� �Ųٷ� ��� ������) : root > leaf
		//2. ������ ����� ���ı�� ����
	
//		HashSet<String> hs = new HashSet<String>();
//		hs.add("A");
//		hs.add("B");
//		hs.add("A");
//		hs.add("F");
//		hs.add("K");
//		hs.add("G");
//		hs.add("D");
//		hs.add("P");
//		System.out.println(hs.toString());
		
		Set<Integer> lotto = new TreeSet<Integer>();
		for(int i = 0 ; lotto.size() < 6 ; i++) {
			lotto.add((int)(Math.random()*45 + 1));
		}
		
		System.out.println(lotto.toString());
	}

}
