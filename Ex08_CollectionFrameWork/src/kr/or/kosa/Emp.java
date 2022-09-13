package kr.or.kosa;

public class Emp {
	private int empno;
	private String ename;
	private String job;
	public Emp(int empno, String ename, String job) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + ename + ", job=" + job + "]";
	}

	
}
