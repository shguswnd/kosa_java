import java.util.ArrayList;
import java.util.List;

class EmpData{
	private String name; //default >> null
	private int[] numbers; // default >> null
	private List elist; // default >> null
	
	//초기화
	public EmpData() {
		this.name = "아무개";
		//사용자가 만든 타입, Array, ArrayList >> 초기화 > 메모리 (new)
		this.numbers = new int[10];
		this.elist = new ArrayList();
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getNumbers()
	{
		return this.numbers;
	}
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public List getElist() {
		return this.elist;
	}
	public void setElist(List elist) {
		this.elist = elist;
	}
	
}

public class Ex04_ArrayList {

	public static void main(String[] args) {
		EmpData empdata = new EmpData();
		System.out.println(empdata.toString());
		System.out.println(empdata.getElist().toString());
		List li = new ArrayList();
		li.add(100);
		li.add(200);
		
		empdata.setElist(li);
		System.out.println(empdata.getElist().toString());
		
		List<String> slist = new ArrayList<String>();
		slist.add("superman");
		slist.add("Hulk");
		slist.add("Captain");
		empdata.setElist(slist);
		System.out.println(empdata.getElist().toString());
		
		
		List<Integer> intList = new ArrayList<Integer>(20);
		System.out.println(intList.size());
		System.out.println(intList.add(100));
		System.out.println(intList.size());
	}

}
