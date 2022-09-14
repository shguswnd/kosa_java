package kr.or.kosa;

public class CopyEmp {
	private int empno;
	private String ename;
	private int sal;
	
	public CopyEmp(int empno, String ename, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	
	
	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}


	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return ename;
	}
	public void setName(String name) {
		this.ename = name;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + ename + ", sal=" + sal + "]";
	}

	
}
