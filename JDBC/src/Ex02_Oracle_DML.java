import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 DML(insert, update, delete)
 JDBC API ���ؼ� �۾�
 1. ��� ������ ����.(resultSet �ʿ����)
 2. �ݿ����(return ���� ��) >> update 5�� >> return 5
  
  
 java �ڵ�
 update emp set sal = 0 > ���� > update 14�� >> return 14
 update emp set sal = 100 where empno = 4444 > update 0�� >> return 0
 
 ����� ������ java�ڵ�� ����ó��
 key point
 1. oracle DML(developer, Cmd(sqlplus), tool) �ϸ� commit or rollback ����
 2. jdbc api ����ؼ� java �ڵ带 ���ؼ� dml >> default >> autocommit; �ڹ� �ڵ忡�� �����ϸ� ������ �ǹݿ� rollback ����!!
 3. jdbc api ���ؼ� delete from emp >> ���� >> �ڵ� commit >> �ǹݿ�
 4. �ʿ信 ���� commit(), rollback ó�� �ڵ�
 
 begin
    A���� ����(update .....
    ......
    B���� �Ա�(update .....
 end
 >>�ϳ��� ������ ���� ����(transaction)
 >>��ü�� commit �̰ų� ��ü�� rollback
 >>�Ѵ� ���� �̰ų� �Ѵ� ����
 
 
 >>���� ó�� >> jdbc >> autocommit �ɼ��� >> false ��ȯ
 >> �ݵ�� java code ���� dml �۾��� ���ؼ� >> commit, rollback ���� ȣ�� 

 
 
alter table dmlemp
add constraint pk_dmlemp_empno primary key(empno);


select * from user_constraints where table_name = 'dmlemp'


 */
public class Ex02_Oracle_DML {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//����̺� �ε���  ������ �����ϴ�
			//Class.forName("oracle.jdbc.OracleDriver");//����̺� �̸��� ���
			
			//Connection �������̽��� �����ϰ� �ִ� ��ü�� �ּҰ� ����....
			//�������� ���ؼ� Connection Ÿ���� conn ������ �ּҰ��� �޴´�. 
	
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","KOSA","1004");
			stmt = conn.createStatement();//Statement ��ü�� �����ϰ� �ִ� ��ü�� �ּ� ����
			
			//INSERT
			int empno = 0;
			String ename = "";
			int deptno=0;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("����Է�");
			empno = Integer.parseInt(scan.nextLine());
			
			
			System.out.println("�̸� �Է��ϼ���.");
			ename = scan.nextLine();
			
			System.out.println("�μ��Է�");
			deptno = Integer.parseInt(scan.nextLine());
			
			//insert into dmlemp(empno, ename, deptno) values() �������� ���
			String sql =  "insert into dmlemp(empno, ename, deptno) ";
			sql += "values(" + empno + ",'" + ename + "'," + deptno + ")"; 									
			
			
			//���� ���
			//values(?,?,?) >> ? parameter ���� ����
			//executeUpdate() >> insert, update, delete ��� ����
			
			int resultrow = stmt.executeUpdate(sql);
			
			if(resultrow > 0) {
				System.out.println("�ݿ��� ���� �� : " + resultrow);
			}else {
				System.out.println("���ܰ� �߻��� ���� �ƴϰ� : �ݿ��� ���� ����.");
			}			
		}catch(Exception e) {
			//�ߺ������� insert �ؼ� ������ ����� excuteUpdate() ���� �߻�
			//�ڵ� ó��
			System.out.println("SQL ���ܹ߻� : " + e.getMessage());
		}finally {
			//���� ���� ��
			//�ڿ����� 
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		}
		
	}

}
