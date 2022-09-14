import java.util.ArrayList;
import java.util.List;

/*
  Generic jdk 1.5
  
  C#, Java (필수 기능)
  
  Why)
  Collection 타입의 클래스들을 작업하는데 기본 데이터의 저장공간의 타입을 object로 만듬
  장점 : Object 어떤값을 넣어도 다 소화가 된다.(String, Emp, int....)
  단점 : 내가 방금 받은 타입이 무엇인지 확인할때 불편함....  >> 큰타입에 대한 문제, 원하는 데이터 타입으로 변경하려면 (downCasting)해야됨 불편 ...
  
  요구사항
  1. 타입을 처음부터 강제하자......
  2. 타입의 안정성 (타입 강제)
  3. 강제 형변환 필요 없다 : (Car)Object (필요없음)

  제너릭 적용을 위해서는 설계도부터 적용.,....
  
  
  
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
		list.add("홍길동");
		list.add(new Person());
		
		//list 값을 출력하세요
		//Person 객체는 나이 출력하고 나머지는 값을 출력
		
//		for(Object obj : list) {
//			if(obj instanceof Person) {
//				Person p = (Person)obj;
//				System.out.println(p.age);
//			}
//			else {
//				System.out.println(obj);
//			}
//		}
		
		//Generic 타입 강제 : 다 먹지는 못하지만 (한 종류만) >>
		List<Person> plist = new ArrayList<Person>();
		plist.add(new Person());
		plist.add(new Person());
		
		for(Person p : plist) {
			System.out.println(p.age);
		}
	}

}
