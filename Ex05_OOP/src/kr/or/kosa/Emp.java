package kr.or.kosa;

//데이터를 담을 수 있는 클래스 (1건)
//DTO , VO , DOMAIN 이름

public class Emp {
	private int empno;
	private String ename;
	
	public Emp(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
//	@Override
//	public String toString() {
//		return "Emp [empno=" + empno + ", ename=" + ename + "]";
//	}
	
	//Object >> toString() 함수는 일반적으로 재정의를 가장 많이 한다.
	//만약 재정의를 하지 않으면 .... 주소값을 출력.
	
	//toString재정의 필요한대로 코딩 ... 일반적으로 member field정보 출력하는 형태로 ....
	
	
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
//	@Override
//	public String toString() {
//		return super.toString();
//	}
	
	//toString() 재정의 했다면 결과는 재정의 된 내용 출력.
	
}
