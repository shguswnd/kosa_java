import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.JobKOctets;

import kr.or.kosa.Emp;

public class Ex03_ArrayList_Object {

	public static void main(String[] args) {
		Emp emp = new Emp(1000, "������", "�屺");
		
		List empList = new ArrayList();
		empList.add(emp);
		
		//System.out.println(empList);
		
		Emp[] empArr = {new Emp(100, "�达", "����"), new Emp(200,"�ھ�","IT")};
		

		for(Emp value : empArr)
		{
			//empList.add(value);
		}
//		for(int i=0; i<empList.size();i++)
//		{
//		   	System.out.println(empList.get(i));
//		}
		//Emp e = (Emp)elist.get(i); �� �ٿ�ĳ�����ؾ���.
//		for(Object value : empList) {
//			System.out.println(value);
//		}
		
		//toString() ����������� 4���� ����� ���, �̸�, ���� ���.
		
		
//		for(int i=0; i<empList.size(); i++) {
//			JobKOctets empList.get(i);
//			System.out.println(empList);
//		}
		
		//���� ������ ....(Object Ÿ��) ... downcasting ... �ڽ� ��� ����
		//Object ���� ���� ... ���
		//Ÿ�� ����( ��Ÿ�� ���� ����) �ϳ��� Ÿ�Ը��� ������ ������ ����
		//���ʸ�(��ü ������ Ÿ�� ���� ���)
		List<Emp> list2 = new ArrayList<Emp>();
		list2.add(new Emp(1,"A","IT"));
		
		Emp test= (Emp)list2.get(0);
	
		for(Emp e : list2)
			System.out.println(e.getEmpno());
		
		
	}

}
