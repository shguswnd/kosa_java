package kr.or.kosa;

public class Emp {
	//member field (instance variable)
	private int empno;
	private String ename;
	private String job;
	private int sal;
	
	
	//setter, getter method(read, write) ���
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	//method (���)
	public void empDataPrint() {
		System.out.println("������̺�");
		//���� �޼��忡�� ���������� ������ main�� ����.....
		int data = 0;
		int input = 0;
		
	}
}