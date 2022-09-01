//클래스 == 타입 == 설계도

class Person{
	String name;
	int age;
	//사람을 만들때 반드시 이름, 나이를 가지게 할려면 (생성자 입력 강제)
	//Person(String name, int age){this.name = name; this.age=age;}
	
	void print() {
		System.out.println(this.name + "." + this.age);
	}
}




public class Ex05_Array_Object {

	public static void main(String[] args) {
		int[] intarr = new int[10]; //값 타입 배열(8가지)
		Person[] person = new Person[10]; //참조변수 ( person 라는 변수는 주소값) 
		Person[] arr;
		
		System.out.println("persons : " + person);
		System.out.println("persons[0] : " + person[0]); //각각의 방은 null default값 이라고 한다.
		//객체배열은 방을 만들고 방에 객체를 넣어주는 작업을 해야된다.
		//person[0] 은 person 객체의 주소를 가진다.
		person[0] = new Person(); 
		
		for(int i = 0 ; i < 10 ; i++)
		{
			person[i] = new Person();
			System.out.println(person[i]);
		}
		
		//2. int[] arr = new int[] {10, 20, 30}
		Person[] parray2 = new Person[] {new Person(), new Person(), new Person()};
		
		//3. int[] arr = new int {10, 20, 30}
				Person[] parray3 = {new Person(), new Person(), new Person()};
				
	}

}
