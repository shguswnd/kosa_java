//Ŭ���� == Ÿ�� == ���赵

class Person{
	String name;
	int age;
	//����� ���鶧 �ݵ�� �̸�, ���̸� ������ �ҷ��� (������ �Է� ����)
	//Person(String name, int age){this.name = name; this.age=age;}
	
	void print() {
		System.out.println(this.name + "." + this.age);
	}
}




public class Ex05_Array_Object {

	public static void main(String[] args) {
		int[] intarr = new int[10]; //�� Ÿ�� �迭(8����)
		Person[] person = new Person[10]; //�������� ( person ��� ������ �ּҰ�) 
		Person[] arr;
		
		System.out.println("persons : " + person);
		System.out.println("persons[0] : " + person[0]); //������ ���� null default�� �̶�� �Ѵ�.
		//��ü�迭�� ���� ����� �濡 ��ü�� �־��ִ� �۾��� �ؾߵȴ�.
		//person[0] �� person ��ü�� �ּҸ� ������.
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
