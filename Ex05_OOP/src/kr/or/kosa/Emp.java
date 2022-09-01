package kr.or.kosa;

//�����͸� ���� �� �ִ� Ŭ���� (1��)
//DTO , VO , DOMAIN �̸�

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
	
	//Object >> toString() �Լ��� �Ϲ������� �����Ǹ� ���� ���� �Ѵ�.
	//���� �����Ǹ� ���� ������ .... �ּҰ��� ���.
	
	//toString������ �ʿ��Ѵ�� �ڵ� ... �Ϲ������� member field���� ����ϴ� ���·� ....
	
	
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
//	@Override
//	public String toString() {
//		return super.toString();
//	}
	
	//toString() ������ �ߴٸ� ����� ������ �� ���� ���.
	
}
