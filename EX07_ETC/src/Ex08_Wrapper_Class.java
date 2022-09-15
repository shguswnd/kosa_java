import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 �ڹ� 8���� �⺻ Ÿ��(��Ÿ��) : JAVA API ����
 
  8���� �⺻ Ÿ�Կ� ���ؼ� ��ü ���·� ��� �����ϵ��� ���� Ŭ����(wpapper class)
  [���]
  
  1. �Ű����� ��ü �䱸�ɶ�
  2. �⺻�� ���� �ƴ� ��ü ���·� ������ �ʿ��
  3. ��ü�� ���� ���Ҷ�
  4. Ÿ�� ��ȯ�� ó��
  
  >> generic ���� (��ü ����) > int > Integer
 */
public class Ex08_Wrapper_Class {

	public static void main(String[] args) {
//		Integer n = new Integer(500);
//		System.out.println("n :" + n);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		
		//parameter Ȱ��
		//���ʸ�(generic) : ��ü�� ���鶧 Ÿ���� �����ϴ� ������� >> wrapper class
		
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(100);
		//li.add("a"); ����Ÿ�� x
		
		for(int value : li) {
			System.out.println(value);
		}
		
		Iterator<Integer>t = li.iterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		
		System.out.println(i2 == i3); // false // �ּҰ��� ��
		System.out.println(i2.equals(i3)); // true // �ּҸ� ã�ư��� �� ���� ��
		
		//String >> ���ڿ��� �� >> equals (������ �Ǿ�����)
		
		int i4 = 100;
		int i5 = 100;
		//�� �ΰ��� �� Ÿ���̶� i4==i5 �񱳰� �����ϴ�.
	}

	static void iMethod(Integer i) {
		
	}
}
