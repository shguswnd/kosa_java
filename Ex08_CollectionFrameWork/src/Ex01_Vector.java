import java.util.Vector;

/*
 Collection FrameWork
 �ټ��� �����͸� �ٷ�� ǥ��ȭ�� �������̽��� �����ϰ� �ִ� Ŭ������ ����
 
 Collection �������̽� -> ��� List (���� : ArrayList....), Set ( ���� : HashSet, TreeSet....)
 
 >>ArrayList �θ�Ÿ���� List �̴� (OK) >> ������
 >>Collection �� ArrayList �θ� Ÿ���̴� (OK) >> ������
 
 Map�������̽�(key, value) ���� �迭 -> (����:HashMap)
 
 1. List(���� ���ÿ�)
 ����(��ȣǥ), �ߺ�(���) > ���������� ������ (�ڷ�) > �迭(Array)���� > [ȫ�浿][ȫ�浿][ȫ�浿] 

 																[0]    [1]    [2]

 1.1 Vector(������) -> ����ȭ ����. (��Ƽ ������ ���.) -> Lock(��ġ)��ȣ -> ������ ������.
 �ϳ��� �ڿ��� ��������� ������ ������, �Ѹ��� �����Ѵٸ� lock�ɾ� �ڿ��� ��ȣ�ϴ� ����. >> �������� �����·� ����.
 
 1.2 ArrayList(�Ź���) -> ����ȭ ����(��Ƽ ������) -> Lock �ɼ�(�⺻ Lock(x)) -> ���ɿ켱
 
 ���� �ټ��� �����͸� �ٷ�� ��� : Array(����, ����)
 --���� ������ �ѹ� �������� (���� ũ��� ���� �Ұ�)
 �迭 
 int[] arr = new int[5];
 arr[0] = 100;
 int[] arr2 = {10,20,30}
 �����Ͱ� �������� ���ο� ũ���� �迭 ����� ������ �̵� (�ڵ�� ���� ����)***
 
 Array
 1. �迭�� ũ�Ⱑ ���� : Car[] cars = {new Car(), new Car(), new Car()}; ���� 3�� �������.
 2. ���� ��� (index ÷��) ���ȣ ���� : cars[0] ,,,, n(length-1) ��

 List �������̽��� �����ϰ� �ִ� (Vector, ArrayList)
 1. �迭�� ũ�⸦ �������� Ȯ�� or ��� ���� >> ������ �����Ϸ��� ���ο� �迭�� ����� ������ �̵��� �˾Ƽ�
 2. ������ ���� (���������� Array ���) , �ߺ��� ���
 3. ������ ���� ���� : Array ���
 */


public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		
		System.out.println("�ʱ� default �뷮 : " + v.capacity()); //�뷮
		System.out.println("size : " + v.size()); //�ǵ�����
		
		v.add(1);
		v.add(2);
		v.add(3);
//		System.out.println(v.elementAt(0));
//		System.out.println(v.toString()); //[1,2,3] ������ ������ ���
		//Array >> length >> ��������� index ������ ���� ��ġ ������(size) ó��
		//Collection >> size
		for(int i=0; i<v.size(); i++) {
//			System.out.println(v.get(i)); //get(index) ���� return : ���� array[index]
		}
		
		
		//������ ����
		//**Object�� ���� �޾����Ƿ� return ���� Object�̴� �׷��� ������Ʈ�� ū���̴� �׷��� ���ʸ��� �Ἥ ����, ���������� ���� �����ϰ� �޾ƾ��Ѵ�.
		//���� : ���� ������ (���� Ÿ���� ������) .... ���� ūŸ���� ����ϴ°� ���ո�
		//���ʸ� >> Ÿ���� ���� >> ���� ���� �н�(POINT)
//		
// 		for(Object value : v) {
//			System.out.println(value);
//		}
//
// 		
// 		Vector<Integer> v2 = new Vector<Integer>();
// 		v2.add(11);
// 		v2.add(22);
// 		v2.add(33);
// 		for(int value : v2) {
// 			System.out.println(value);
// 		}
// 		

		Vector v3 = new Vector();
 		System.out.println(v3.capacity());
 		for(int i=0; i<11; i++)
 			v3.add("A");
 		System.out.println(v3.capacity());
	}

}
