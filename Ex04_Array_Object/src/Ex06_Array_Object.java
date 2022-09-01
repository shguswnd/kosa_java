import kr.or.bit.Emp;

public class Ex06_Array_Object {

	public static void main(String[] args) {
		//사원 3명을 만드시오.
		
		//Emp[] emp = new Emp[3];
		//Emp[] emp = new Emp[]{};
		//Emp[] emp = {new Emp(),....};
		
		Emp[] emp = new Emp[3];
		
		emp[0] = new Emp(1000,"홍길동");
		emp[1] = new Emp(2000,"김유신");
		emp[2] = new Emp(1000,"유관순");
		
//		for(int i = 0 ; i < 3 ; i++)
//			emp[i].empInfoPrint();
		
		
		
//		Emp[] emp2 = new Emp[] {new Emp(1000,"홍길동"), new Emp(2000,"김유신"), new Emp(1000,"유관순")};
//		Emp[] emp3 = {new Emp(1000,"홍길동"), new Emp(2000,"김유신"), new Emp(1000,"유관순")};
		
		
		for(Emp value : emp)
			value.empInfoPrint();
	}

}
