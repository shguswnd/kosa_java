import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
JDBC
1. 자바 언어(app)를 통해서 오라클(소프트웨어) 연결해서 CRUD 작업
2. 자바 app : 오라클, my-sql, ms-sql 등등 연결하고 작업(CRUD)
2.1 각각의 제품에 맞는 드라이버를 가지고 있어야 한다.
CASE 1: 삼성 노트북 >> hp 프린터 연결 >> hp프린터 사이트에서 드라이버 다운 >> 삼성 설치
CASE 2: hp프린터 제조 회사는 ... 삼성, lg 회사마다 적용할 수 있는 드라이브를 별도 제작

각 언어에 맞는 드라이버를 다운로드 해서 제품에 맞게 설치... 접속

Oracle(C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib)
Mysql (https://dev.mysql.com/downloads/connector/j/)

강사 PC : C:\KOSA_IT\DataBase\JDBC\ConnectionUtils\Oracle >> ojdbc6.jar


3. 드라이버를 참조해서 (현재 프로젝트에서 사용) >> java project -> 속성 -> build path ->
jar 파일을 추가.

3.1 드라이버 사용 준비 완료 >> 메모리에 load 사용...
3.2 Class.forName("oracle.jdbc.OracleDriver") ..... new 객체 생성 ..... 



4. java code (crud) >> jdbc api 제공 받는다
4.1 import java.sql.* >> interface, class 제공
4.2 개발자는 interface를 통해서 표준화된 db 작업 수행.

왜 interface 형태로 제공 >> jdbc api >> oracle, mysql, ....
jdbc가 오라클이든 마이sql이든 똑같은 작업을 하면 좋겠다.

		//인터페이스로되어 다형성으로 연결됨
		//OracleConnection >> Connection 구현
		//MysqlConnection >> Connection 구현
		//다형성 Connection 부모타입 : 유연한 프로그래밍 작성

>>다형성을 구현 (인터페이스 활용(
import java.sql.Connection
import java.sql.ResultSet
import java.sql.Statement 등등

5. 작업순서
5.1 DB연결 -> 명령생성 -> 명령실행 -> 처리 -> 자원해제
5.1 명령 : DDL (create, alter, drop)
 		  CRUD (insert, select, update, delete)
    실행 : 쿼리문을 DB서버에게 전달
    
    처리 : 결과를 받아서 화면 출력, 또는 다른 프로그램에 전달 등등
    자원해제 : 연결해제

 */



public class Ex01_Oracle_Connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//DB연결 -> 명령생성 -> 실행 -> 처리
		Class.forName("oracle.jdbc.OracleDriver");//드라이브 이름을 사용
		System.out.println("오라클 드라이버 로딩");
		
		//loading 된 드라이버를 통해서 oracle 연결
		//url, user, pw
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","KOSA","1004");
		System.out.println(conn.isClosed()+"정상 false");
		
		Statement stmt = conn.createStatement();
	
		//CRUD
		String sql = "select empno, ename, sal from emp";
		
		//ResultSet rs = stmt.executeQuery(sql); //DB서버의 메모리 조회
		//rs를 통해서 DB서버 memory에 생성된 정보를 조회
		//처리(화면조회)
		//만약에 중간에 DB연결이 끊어지면(close()) 데이터를 못 읽음 >> 연결지향
	
		
		String sql1="select empno , ename , sal from emp";
		
		ResultSet rs = stmt.executeQuery(sql1);//명령 실행.... 
		
		ResultSetMetaData rsmd=rs.getMetaData();  
		  
		System.out.println("Total columns: "+rsmd.getColumnCount());  
		System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
		System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  	
		
		
		
		
		
		
		
		
		
		while(rs.next()) {
			System.out.println(rs.getInt("empno") + "/" 
			+ rs.getString("ename") 
			+ rs.getInt("sal"));
		}
		stmt.close();
		rs.close();
		conn.close();
		System.out.println("DB 연결 : " + conn.isClosed());
	}
	
}
