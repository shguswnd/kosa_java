import java.util.List;

import DAO.DeptDao;
import DTO.Dept;

/*
 MVC����
 >> ���ϴ°Ÿ���
 
 Model : ������ java
 View : ȭ��  >>> jsp
 Controller : ���� (����) >> servlet
 

 jsp, servlet, java ....
 
 Model : dto(vo), dao  >>> java �ڵ尡 ����
 View : java (console) 
 .....
  
 */public class Program {

		public static void main(String[] args) {
			//main �Լ� (View) ����
			
			//DAO��ü ��û
			DeptDao dao = new DeptDao(); //6���� �Լ�
			
			System.out.println("[��ü��ȸ]*******");
			List<Dept> deptlist = dao.getDeptAllList();
//			//ȭ�鱸��
			if(deptlist != null) {
				deptPrint(deptlist);
			}
			//������ȸ
			System.out.println("[������ȸ]*******");
			Dept dept =dao.getDeptListByDeptNo(10);
			if(dept != null) {
				deptPrint(dept);
			}else {
				//.....
			}
			System.out.println("[������ ����]*******");
			Dept insertdept = new Dept();
			insertdept.setDeptno(100);
			insertdept.setDname("IT");
			insertdept.setLoc("SEOUL");
			
			int row = dao.insertDept(insertdept);
			if(row > 0) {
				System.out.println("insert rowcount : " + row);
			}
			
			System.out.println("[����� insert ������ ��ü��ȸ]*******");
			deptlist =dao.getDeptAllList();
			//ȭ�鱸��
			if(deptlist != null) {
				deptPrint(deptlist);
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
			
			System.out.println("[����� delete ������ ��ü��ȸ]*******");
			deptlist =dao.getDeptAllList();
			//ȭ�鱸��
			if(deptlist != null) {
				deptPrint(deptlist);
			}
		}
		public static void deptPrint(Dept dept) {
			System.out.println(dept.toString());
		}
		public static void deptPrint(List<Dept> list) {
			for(Dept data : list) {
				System.out.println(data.toString());
			}
		}

	}