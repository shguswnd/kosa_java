import kr.or.kosa.Emp;

public class Ex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello"); 
		//Emp 설계도를 구체화(객체 생성);
		Emp emp = new Emp();
		emp.setEmpno(-1000);
		int empno = emp.getEmpno();
		System.out.println(empno);
		
		emp.number = -100;
		emp.print();
	}
}