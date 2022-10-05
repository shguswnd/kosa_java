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

 
 JDBC >> default(dml) >> autocommit >> 실반영
 
 JDBC >> autocommit >> 개발자 >> false >> 반드시 >> commit, rollback
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
			conn.setAutoCommit(false);//JDBC 개발자는 이제 (commit, rollback)을 강제해야된다.
			//begin tran
			pstmt = conn.prepareStatement(sql);
			pstmt.executeQuery();
			
			
			pstmt2 = conn.prepareStatement(sql1);
			pstmt2.executeQuery();
			//end tran
			conn.commit(); //둘다 정상적으로 실행되고 예외가 발생되지 않으면 둘다 : commit 하겠다.
		} catch (Exception e) {
			System.out.println("문제발생 : " + e.getMessage());
			try {
				conn.rollback();//둘다 취소
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}finally {
			SingletonHelper.close(pstmt);
		}
		
	}

}
