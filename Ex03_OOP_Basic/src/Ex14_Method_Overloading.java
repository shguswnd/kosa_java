
class Human2{
	String name;
	int age;
}

class Test2{
	Human2 add(Human2 h) {
		//�ڵ�� �������.
		h.name = "asd";
		h.age = 200;
		
		return h;
		//return null; //Human2�� �ּҸ� ������ ���� �ʾ�.
	}
	Human2 add(Human2 h, Human2 h2)
	{
		h2.name = h.name;
		h2.age = h.age;
		
		
		return h2;
	}
}
public class Ex14_Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2();
		Human2 man = new Human2();
		Human2 man3 = new Human2();
		Human2 man2 = t.add(man);
		
	}

}