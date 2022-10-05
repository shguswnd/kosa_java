import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.or.kosa.SingletonHelper;

/*
 create table trans_A(
    num number,
    name varchar2(20)
);

create table trans_B(
    num number constraint pk_trans_B_num primary key ,
    name varchar2(20)
);

 
 JDBC >> default(dml) >> autocommit >> �ǹݿ�
 
 JDBC >> autocommit >> ������ >> false >> �ݵ�� >> commit, rollback
 */
public class Ex07_Transaction {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		
		conn = SingletonHelper.getConnection("oracle");
		
		String sql = "insert into trans_A(num,name) values(100,'A')";
		String sql1 = "insert into trans_B(num,name) values(100,'B')";
		
		try {
			conn.setAutoCommit(false);//JDBC �����ڴ� ���� (commit, rollback)�� �����ؾߵȴ�.
			//begin tran
			pstmt = conn.prepareStatement(sql);
			pstmt.executeQuery();
			
			
			pstmt2 = conn.prepareStatement(sql1);
			pstmt2.executeQuery();
			//end tran
			conn.commit(); //�Ѵ� ���������� ����ǰ� ���ܰ� �߻����� ������ �Ѵ� : commit �ϰڴ�.
		} catch (Exception e) {
			System.out.println("�����߻� : " + e.getMessage());
			try {
				conn.rollback();//�Ѵ� ���
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}finally {
			SingletonHelper.close(pstmt);
		}
		
	}

}
