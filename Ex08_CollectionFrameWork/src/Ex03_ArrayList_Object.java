import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.JobKOctets;

import kr.or.kosa.Emp;

public class Ex03_ArrayList_Object {

	public static void main(String[] args) {
		Emp emp = new Emp(1000, "김유신", "장군");
		
		List empList = new ArrayList();
		empList.add(emp);
		
		//System.out.println(empList);
		
		Emp[] empArr = {new Emp(100, "김씨", "영업"), new Emp(200,"박씨","IT")};
		

		for(Emp value : empArr)
		{
			//empList.add(value);
		}
//		for(int i=0; i<empList.size();i++)
//		{
//		   	System.out.println(empList.get(i));
//		}
		//Emp e = (Emp)elist.get(i); 은 다운캐스팅해야함.
//		for(Object value : empList) {
//			System.out.println(value);
//		}
		
		//toString() 사용하지말고 4명의 사원의 사번, 이름, 직종 출력.
		
		
//		for(int i=0; i<empList.size(); i++) {
//			JobKOctets empList.get(i);
//			System.out.println(empList);
//		}
		
		//현업 개발자 ....(Object 타입) ... downcasting ... 자식 요소 접근
		//Object 쓰지 말자 ... 대안
		//타입 강제( 그타입 쓰게 하자) 하나의 타입만을 가지고 데이터 관리
		//제너릭(객체 생성시 타입 강제 방법)
		List<Emp> list2 = new ArrayList<Emp>();
		list2.add(new Emp(1,"A","IT"));
		
		Emp test= (Emp)list2.get(0);
	
		for(Emp e : list2)
			System.out.println(e.getEmpno());
		
		
	}

}
