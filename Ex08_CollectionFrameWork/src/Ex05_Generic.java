import java.util.ArrayList;
import java.util.List;

/*
  Generic jdk 1.5
  
  C#, Java (�ʼ� ���)
  
  Why)
  Collection Ÿ���� Ŭ�������� �۾��ϴµ� �⺻ �������� ��������� Ÿ���� object�� ����
  ���� : Object ����� �־ �� ��ȭ�� �ȴ�.(String, Emp, int....)
  ���� : ���� ��� ���� Ÿ���� �������� Ȯ���Ҷ� ������....  >> ūŸ�Կ� ���� ����, ���ϴ� ������ Ÿ������ �����Ϸ��� (downCasting)�ؾߵ� ���� ...
  
  �䱸����
  1. Ÿ���� ó������ ��������......
  2. Ÿ���� ������ (Ÿ�� ����)
  3. ���� ����ȯ �ʿ� ���� : (Car)Object (�ʿ����)

  ���ʸ� ������ ���ؼ��� ���赵���� ����.,....
  
  
  
 */


class MyGen<T>{ //T >> type parameter
	T obj;
	
	
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class Person{
	int age = 100;
}
public class Ex05_Generic {

	public static void main(String[] args) {
		MyGen<String> mygen = new MyGen<String>();
		mygen.add("Asd");
		System.out.println(mygen.get());
		
		List list = new ArrayList(); //Object
		list.add(10);
		list.add("ȫ�浿");
		list.add(new Person());
		
		//list ���� ����ϼ���
		//Person ��ü�� ���� ����ϰ� �������� ���� ���
		
//		for(Object obj : list) {
//			if(obj instanceof Person) {
//				Person p = (Person)obj;
//				System.out.println(p.age);
//			}
//			else {
//				System.out.println(obj);
//			}
//		}
		
		//Generic Ÿ�� ���� : �� ������ �������� (�� ������) >>
		List<Person> plist = new ArrayList<Person>();
		plist.add(new Person());
		plist.add(new Person());
		
		for(Person p : plist) {
			System.out.println(p.age);
		}
	}

}
