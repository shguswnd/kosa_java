import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 DML(insert, update, delete)
 JDBC API 통해서 작업
 1. 결과 집합이 없다.(resultSet 필요없다)
 2. 반영결과(return 행의 수) >> update 5건 >> return 5
  
  
 java 코드
 update emp set sal = 0 > 실행 > update 14건 >> return 14
 update emp set sal = 100 where empno = 4444 > update 0건 >> return 0
 
 결과를 가지고 java코드로 로직처리
 key point
 1. oracle DML(developer, Cmd(sqlplus), tool) 하면 commit or rollback 강제
 2. jdbc api 사용해서 java 코드를 통해서 dml >> default >> autocommit; 자바 코드에서 진행하면 무조건 실반영 rollback 못함!!
 3. jdbc api 통해서 delete from emp >> 실행 >> 자동 commit >> 실반영
 4. 필요에 따라서 commit(), rollback 처리 코드
 
 begin
    A계좌 인출(update .....
    ......
    B계좌 입금(update .....
 end
 >>하나의 논리적인 단위 업무(transaction)
 >>전체가 commit 이거나 전체가 rollback
 >>둘다 성공 이거나 둘다 실패
 
 
 >>업무 처리 >> jdbc >> autocommit 옵션을 >> false 전환
 >> 반드시 java code 에서 dml 작업에 대해서 >> commit, rollback 강제 호출 

 
 
alter table dmlemp
add constraint pk_dmlemp_empno primary key(empno);


select * from user_constraints where table_name = 'dmlemp'


 */
public class Ex02_Oracle_DML {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//드라이브 로딩은  생략이 가능하다
			//Class.forName("oracle.jdbc.OracleDriver");//드라이브 이름을 사용
			
			//Connection 인터페이스를 구현하고 있는 객체의 주소가 리턴....
			//다형성을 통해서 Connection 타입의 conn 변수가 주소값을 받는다. 
	
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","KOSA","1004");
			stmt = conn.createStatement();//Statement 객체를 구현하고 있는 객체의 주소 리턴
			
			//INSERT
			int empno = 0;
			String ename = "";
			int deptno=0;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("사번입력");
			empno = Integer.parseInt(scan.nextLine());
			
			
			System.out.println("이름 입력하세요.");
			ename = scan.nextLine();
			
			System.out.println("부서입력");
			deptno = Integer.parseInt(scan.nextLine());
			
			//insert into dmlemp(empno, ename, deptno) values() 고전적인 방법
			String sql =  "insert into dmlemp(empno, ename, deptno) ";
			sql += "values(" + empno + ",'" + ename + "'," + deptno + ")"; 									
			
			
			//현재 방법
			//values(?,?,?) >> ? parameter 별도 설정
			//executeUpdate() >> insert, update, delete 모두 수행
			
			int resultrow = stmt.executeUpdate(sql);
			
			if(resultrow > 0) {
				System.out.println("반영된 행의 수 : " + resultrow);
			}else {
				System.out.println("예외가 발생된 것이 아니고 : 반영된 행이 없다.");
			}			
		}catch(Exception e) {
			//중복데이터 insert 해서 문제가 생기면 excuteUpdate() 예외 발생
			//코드 처리
			System.out.println("SQL 예외발생 : " + e.getMessage());
		}finally {
			//강제 수행 블럭
			//자원해제 
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
