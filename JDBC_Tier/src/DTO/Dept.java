package DTO;

//DTO(VO), DOMAIN
//데이터를 담을수 있는 클래스
//DB 테이블과 1:1 매핑구조
//DB에 dept 테이블의 1건의 row를 담을 수 있는 클래스
//create table dept()
/*
 CREATE TABLE DEPT
 (DEPTNO number,
 DNAME VARCHAR2(14),
 LOC VARCHAR2(13) );
 
 Dept dept = new Dept();
 List<Dept> deptlist = new ArrayList<Dept>(); 여러건
 */


public class Dept {
	private int deptno;
	private String dname;
	private String loc;
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
}
