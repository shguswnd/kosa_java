import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.or.kosa.SingletonHelper;

/*
 (1) ���� 

�̸� SQL���� ���õ� Statement �� DB�� ���۵Ǿ����� �����ϵǾ�����, SQL���� ?�� ���߿� �߰� �����ؼ� ���� 

�� �Ǿ����� �غ�� Statement 


ex) select * from emp where empno=? -> �����м� -> �����ȹ -> �޸�...
    select * from emp where EMPNO=? -> �����м� -> �����ȹ -> �޸�...

(2) ����

<1> Statement �� ���ؼ� �ݺ����� SQL���� ����� ��쿡 �� ������. ( Ư��, �˻��� )

<2> DB�÷�Ÿ�԰� ������� ?�ϳ��� ǥ���ϸ� �ǹǷ� �����ڰ� ����� �ʰ� ����. ( Ư��, INSERT�� )

(����: ?�� ������ SQL���� DB���� �̸� �����ϵǾ����� ���)

(3) ����

SQL������ PreparedStatement ��ü�� ���� �����ؾ� �ϹǷ� ����Ұ�

(but, Statement ��ü�� SQL���� �޶������� �� ���� �����ؼ� ������ �����ϴ�. )

(4) Ư¡

<1> Statement stmt = con.createStatement(); //���� stmt.execute(sql);//����

<2> PreparedStatement pstmt = con.prepareStatement(sql); //���� pstmt.execute(); //����

(5) ����

DB ��ü��(table, ..)�� ����( ���̺�� or �÷��� or �������� ���� ��ü�� �Ӽ���)��

?�� ǥ���� �� ����.

��, data �ڸ����� ?�� ǥ���� �� �ִ�.

cf) �׷���, DDL�������� PreparedStatement�� ������� �ʴ´�.

���� : ���� (��ü ������ DB�� ������ �ʾƿ�) ����� ����.... sql�� ������ ������ .... �� �������� parameter �� ����
��Ŀ���忡�� ��Ȯ�Ѱ� �ľ��ϱ� ����.

�̸� ������ ������ (�������� DB�������� ����) >> �� ���Ŀ� ������ >> parameter ���� ����. >> ��Ʈ��ũ Ʈ���� ����

���� : �������� �ٲ�� �ٽ� �������ؾߵȴ�. (���� ������ �ٲ��ϵ� ����)



4. CallableStatement ( ȣ���� �� �ִ� Statement )

(1) ����

DataBase �� �̸� �����ϵǾ� �ִ� Stored Procedure ��

ȣ���ϱ� ���� Statement

(2) ���� / ȣ��

String sql = "{call incre(?,?)}";

CallableStatement cstmt = con.prepareCall(sql);

(ex: day3/JDBC12.java )

5. ���� Ŀ�� �̵�

(1) ����

JDBC 2.0 ���ʹ� ResultSet �� Ŀ���� ���ϴ� ��ġ���

�̵� ���� ��

-> �̿��Ϸ��� stmt ������ �Ʒ��� ������� �ɼ��� ��

(2) ���

-> con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,

ResultSet.CONCUR_UPDATABLE);

 Statement createStatement(int resultSetType,

int resultSetConcurrency)

throws SQLException

1.resultSetType

(1) ResultSet.TYPE_FORWARD_ONLY,

(2) ResultSet.TYPE_SCROLL_INSENSITIVE,

(3) ResultSet.TYPE_SCROLL_SENSITIVE

2.resultSetConcurrency

(1) ResultSet.CONCUR_READ_ONLY

(2) ResultSet.CONCUR_UPDATABLE 

(3) �ֿ� ResultSet �� Ŀ�� �̵� �޼ҵ�

<1> rs.next(); //Ŀ���� ��ĭ�� ����

<2> rs.previous(); //Ŀ���� ��ĭ�� �ø�

<3> rs.beforeFirst(); //Ŀ���� BOF�� ��ġ

<4> rs.afterLast(); // Ŀ���� EOF�� ��ġ 
  */

public class Ex05_Oracle_PrepareStatement {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			conn = SingletonHelper.getConnection("oracle");
			//System.out.println(conn.toString());
			String sql ="select empno, ename from emp where deptno=?";
			//where id=? and name=? and job=?
			// ? parameter
		    pstmt = conn.prepareStatement(sql);//�غ�� ������ �ϴ� db�� ����.
		    
		    //���Ŀ��� parameter �����ؼ� db������ ������ �ȴ�.
		    
		    pstmt.setInt(1, 30); // where deptno=30
		    //ResultSet rs = stmt.executeQuery(sql);//��� ����....
		    rs = pstmt.executeQuery();
		    
		    if(rs.next()) { //�ּ� �Ѱ��� �ִ�.
		    	do {
		    		System.out.println(rs.getInt(1) + "/" + rs.getString(2));
		    	}while(rs.next());
		    }else {
		    	System.out.println("��ȸ�� �����Ͱ� �����ϴ�.");
		    }
		} catch (Exception e) {
		
		}finally {
			SingletonHelper.close(rs);
			SingletonHelper.close(pstmt);
			//�̱����� close() ���� ���� app�� �����ϴ� ��....
		}

	}

}
