import java.util.List;

import DAO.DeptDao;
import DAO.EmpDao;
import DTO.Dept;
import DTO.Emp;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDao dao = new EmpDao();
		
	
		//System.out.println("[��ü��ȸ]*******");
		List<Emp> emplist = dao.getEmpAllList();
////		//ȭ�鱸��
		if(emplist != null) {
//			empPrint(emplist);
		}
		
		
		//������ȸ
		System.out.println("[������ȸ]*******");
		Emp emp = dao.getEmpListByDeptNo(7788);
		if(emp != null) {
			empPrint(emp);
		}else {
			//.....
		}
		System.out.println("[������ ����]*******");
		Dept insertdept = new Dept();
		insertdept.setDeptno(100);
		insertdept.setDname("IT");
		insertdept.setLoc("SEOUL");
		
		int row = emp.insertDept(insertdept);
		if(row > 0) {
			System.out.println("insert rowcount : " + row);
		}
		
		System.out.println("[����� insert ������ ��ü��ȸ]*******");
		emplist =dao.getEmpAllList();
		//ȭ�鱸��
		if(emplist != null) {
			empPrint(emplist);
		}

		
		
		
		
		
		System.out.println("[����� insert ������ �����ϱ�]*******");
		Dept updatedept = new Dept();
		updatedept.setDeptno(100);
		updatedept.setDname("IT_UP");
		updatedept.setLoc("SEOUL_UP");
		
		row = dao.updateDept(updatedept);
		if(row > 0) {
			System.out.println("update rowcount : " + row);
		}
		
		System.out.println("[����� update ������ ��ü��ȸ]*******");
		deptlist =dao.getDeptAllList();
		//ȭ�鱸��
		if(deptlist != null) {
			deptPrint(deptlist);
		}
		
		System.out.println("[����� update ������ �����ϱ�]*******");
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
