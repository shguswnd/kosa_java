import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 Collection FramWork
 (�� ���� �������̽��� �װ��� �����ϰ� �ִ� �� ���� Ŭ������ ����.)
 
 Iterator �������̽�
 (�ݺ���)
 [������ �ڿ��� ���� ���������� �����ؼ� ���� �����ϴ� ǥ���� ����]
 �߻��Լ��� �����ϰ� �ִ� >> ��������(ArrayList) >> �߻��Լ��� ����(ǥ��ȭ��)
 
 
 Iterator �������̽� ������ �ִ� �߻��Լ���
 >>hasNext(), Next(), remove() �߻��ڿ�
 >>ArrayList implements Iterator { hasNext()�� ������ �����ϰ� �ִ�}
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
		
		//ǥ��ȭ�� ��� ��� (������� ������ �����Ϳ� ���ؼ�)
		Iterator it = list.iterator(); //ȣ���ϸ� �Լ��ȿ��� �������̽��� �����ϴ� ��ü�� ������
// 		list.iterator(); //ȣ���ϸ� �Լ��ȿ��� �������̽��� �����ϴ� ��ü�� �����ǰ� �� �ּҸ� ������
		while(it.hasNext()) { //���� �ڵ� �������(ǥ��ȭ)
			System.out.println(it.next());
		}
		
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		
		
		//�������̽��� generic ��� (����)
		Iterator<Integer> it2 = intlist.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		//���� �������� ����.
		System.out.println("*********************************************");
		for(int i = intlist.size()-1 ; i>=0 ; i--) {
			System.out.println(intlist.get(i));
		}
		
		//ListIterator : ������ ��밡�� 
		//�������̶�� �ص� �ϴ� ������ �ѹ������� ���� ���� Ȯ���ϴ� hasPrevious �� Ȯ���Ͽ� �ٽ� �ڷ� ����.
		ListIterator<Integer> it3 = intlist.listIterator();
		
		//������
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		while(it3.hasPrevious()) {
			System.out.println(it3.previous());
		}
	}
}
