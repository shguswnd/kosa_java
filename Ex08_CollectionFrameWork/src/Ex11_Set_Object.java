import java.util.HashSet;
import java.util.Iterator;

class Myclass{
	private int id;
	private String name;
	
	public Myclass() {}
	public Myclass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Myclass [�й�=" + id + ", �̸�=" + name + "]";
	}
	
}

public class Ex11_Set_Object {

	public static void main(String[] args) {
		HashSet<Myclass> hset = new HashSet<Myclass>();
		Myclass mc1 = new Myclass(1, "Abc");
		Myclass mc2 = new Myclass(2, "Def");
		Myclass mc3 = new Myclass(3, "Asdf");
		Myclass mc4 = new Myclass(3, "Asdf");
		
		hset.add(mc1);
		hset.add(mc2);
		hset.add(mc3);
		hset.add(mc4);
		//�̷��� ���� �����Ͱ��� ���Ƶ� �ּҰ��� �ޱ⶧���� �ּҰ��� �޶��� hashset �ȿ� ����.
//		System.out.println(hset.toString());
		
//		for(Myclass myclass : hset)
//		{
//			System.out.println(myclass.toString());
//		}
		
		Iterator<Myclass> itr = hset.iterator();
		while(itr.hasNext()) {
//			System.out.println(itr.next());
			Myclass mc = itr.next();
			System.out.println(mc.getId() + ", " + mc.getName() + ", " + mc.getClass());
		}
	}

}
