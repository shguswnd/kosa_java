import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex02_ArrayList {

	public static void main(String[] args) {
		//ArrayList : List �������̽� ���� (��������, �ߺ������� ���)
		
		ArrayList arrayList = new ArrayList();
		//Object Ÿ������
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println(arrayList.toString());
		
		//add �Լ��� ���������� ������ �ֱ�
		arrayList.add(0,111); //**�ڸ��̵�**
		System.out.println(arrayList.toString());
		arrayList.add(4,444);
		System.out.println(arrayList.toString());
		
		//��������� ������ �߰�, ���� >> ArrayList �������� ����. //Ư����ġ�� �����Ͽ� �߰�/���� ���.
		//**�������� ������ �߰�, ����
		
//		arrayList.remove(111); //���� �߻� �ֳ�? 111�� object�� �����ͷ� �ϱ� �������� ���α׷������� index�� �о���� �̷��� ���ʸ��� ����ؾ��Ѵ�.
		
		System.out.println(arrayList.contains(200)); //200�� �����ϰ� �ִ�?
		System.out.println(arrayList.contains(2000));
		
		arrayList.clear(); //������ ���� (������ ���� �ִ�).
		System.out.println(arrayList.size());
		System.out.println(arrayList.isEmpty()); //������ �ִ� ����?>>�����Ͱ� ���°� �´�??? //������ true
	
		arrayList.add(101);
		arrayList.add(102);
		arrayList.add(103);
		
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.size());
		Object value = arrayList.remove(0); //101���� ... �ڸ��ٲ� �а� �ö�
		System.out.println(arrayList.toString());
		
		
		//POINT
		//�������̽� �θ� Ÿ��
		//������ ���������� .. ������ (Ȯ�强, ������)
		
		
		List li = new ArrayList(); //���������� �θ�Ÿ�� ����
		//List�� �������̽��̹Ƿ� ������ �޼ҵ�� ����� �������̵�� ArrayList���� ����Ѵ�.
		//ArrayList li = new ArrayList();
		//List li = new ArrayList(); �� List�� ������ �ִ� �ֻ����� ��..
		
		li.add("��");
		li.add("��");
		li.add("��");
		li.add("��");
		
		
		//li.subList(0, 0) return�� ���� List�� �ȴ� �ֳ�? ���������� �θ�Ÿ������ �ް� ListŸ������ ������ �Ѵ�.
		
		List li2 = li.subList(0, 2); //subList�Լ��� ���������� new ArrayList() ����
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
		System.out.println(alist); //���������� ���� >> �ʱް����� ������Ʈ �� ���� ����...........
		
		Collections.reverse(alist);
		System.out.println(alist);
		
		
	}

}
