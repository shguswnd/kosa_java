import kr.or.bit.Emp;

public class Ex06_Array_Object {

	public static void main(String[] args) {
		//��� 3���� ����ÿ�.
		
		//Emp[] emp = new Emp[3];
		//Emp[] emp = new Emp[]{};
		//Emp[] emp = {new Emp(),....};
		
		Emp[] emp = new Emp[3];
		
		emp[0] = new Emp(1000,"ȫ�浿");
		emp[1] = new Emp(2000,"������");
		emp[2] = new Emp(1000,"������");
		
//		for(int i = 0 ; i < 3 ; i++)
//			emp[i].empInfoPrint();
		
		
		
//		Emp[] emp2 = new Emp[] {new Emp(1000,"ȫ�浿"), new Emp(2000,"������"), new Emp(1000,"������")};
//		Emp[] emp3 = {new Emp(1000,"ȫ�浿"), new Emp(2000,"������"), new Emp(1000,"������")};
		
		
		for(Emp value : emp)
			value.empInfoPrint();
	}

}
