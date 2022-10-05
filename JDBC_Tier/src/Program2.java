import java.util.List;

import DAO.DeptDao;
import DAO.EmpDao;
import DTO.Dept;
import DTO.Emp;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDao dao = new EmpDao();
		
	
		//System.out.println("[전체조회]*******");
		List<Emp> emplist = dao.getEmpAllList();
////		//화면구성
		if(emplist != null) {
//			empPrint(emplist);
		}
		
		
		//조건조회
		System.out.println("[조건조회]*******");
		Emp emp = dao.getEmpListByDeptNo(7788);
		if(emp != null) {
			empPrint(emp);
		}else {
			//.....
		}
		System.out.println("[데이터 삽입]*******");
		Dept insertdept = new Dept();
		insertdept.setDeptno(100);
		insertdept.setDname("IT");
		insertdept.setLoc("SEOUL");
		
		int row = emp.insertDept(insertdept);
		if(row > 0) {
			System.out.println("insert rowcount : " + row);
		}
		
		System.out.println("[방금전 insert 데이터 전체조회]*******");
		emplist =dao.getEmpAllList();
		//화면구성
		if(emplist != null) {
			empPrint(emplist);
		}

		
		
		
		
		
		System.out.println("[방금전 insert 데이터 수정하기]*******");
		Dept updatedept = new Dept();
		updatedept.setDeptno(100);
		updatedept.setDname("IT_UP");
		updatedept.setLoc("SEOUL_UP");
		
		row = dao.updateDept(updatedept);
		if(row > 0) {
			System.out.println("update rowcount : " + row);
		}
		
		System.out.println("[방금전 update 데이터 전체조회]*******");
		deptlist =dao.getDeptAllList();
		//화면구성
		if(deptlist != null) {
			deptPrint(deptlist);
		}
		
		System.out.println("[방금전 update 데이터 삭제하기]*******");
		row = dao.deleteDept(100);
		if(row > 0) {
			System.out.println("delete rowcount : " + row);
		}
		
		
		

	}
	public static void empPrint(Emp emp) {
		System.out.println(emp.toString());
	}
	public static void empPrint(List<Emp> list) {
		for(Emp data : list) {
			System.out.println(data.toString());
		}
	}
}
