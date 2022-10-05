import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
JDBC
1. �ڹ� ���(app)�� ���ؼ� ����Ŭ(����Ʈ����) �����ؼ� CRUD �۾�
2. �ڹ� app : ����Ŭ, my-sql, ms-sql ��� �����ϰ� �۾�(CRUD)
2.1 ������ ��ǰ�� �´� ����̹��� ������ �־�� �Ѵ�.
CASE 1: �Ｚ ��Ʈ�� >> hp ������ ���� >> hp������ ����Ʈ���� ����̹� �ٿ� >> �Ｚ ��ġ
CASE 2: hp������ ���� ȸ��� ... �Ｚ, lg ȸ�縶�� ������ �� �ִ� ����̺긦 ���� ����

�� �� �´� ����̹��� �ٿ�ε� �ؼ� ��ǰ�� �°� ��ġ... ����

Oracle(C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib)
Mysql (https://dev.mysql.com/downloads/connector/j/)

���� PC : C:\KOSA_IT\DataBase\JDBC\ConnectionUtils\Oracle >> ojdbc6.jar


3. ����̹��� �����ؼ� (���� ������Ʈ���� ���) >> java project -> �Ӽ� -> build path ->
jar ������ �߰�.

3.1 ����̹� ��� �غ� �Ϸ� >> �޸𸮿� load ���...
3.2 Class.forName("oracle.jdbc.OracleDriver") ..... new ��ü ���� ..... 



4. java code (crud) >> jdbc api ���� �޴´�
4.1 import java.sql.* >> interface, class ����
4.2 �����ڴ� interface�� ���ؼ� ǥ��ȭ�� db �۾� ����.

�� interface ���·� ���� >> jdbc api >> oracle, mysql, ....
jdbc�� ����Ŭ�̵� ����sql�̵� �Ȱ��� �۾��� �ϸ� ���ڴ�.

		//�������̽��εǾ� ���������� �����
		//OracleConnection >> Connection ����
		//MysqlConnection >> Connection ����
		//������ Connection �θ�Ÿ�� : ������ ���α׷��� �ۼ�

>>�������� ���� (�������̽� Ȱ��(
import java.sql.Connection
import java.sql.ResultSet
import java.sql.Statement ���

5. �۾�����
5.1 DB���� -> ��ɻ��� -> ��ɽ��� -> ó�� -> �ڿ�����
5.1 ��� : DDL (create, alter, drop)
 		  CRUD (insert, select, update, delete)
    ���� : �������� DB�������� ����
    
    ó�� : ����� �޾Ƽ� ȭ�� ���, �Ǵ� �ٸ� ���α׷��� ���� ���
    �ڿ����� : ��������

 */



public class Ex01_Oracle_Connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//DB���� -> ��ɻ��� -> ���� -> ó��
		Class.forName("oracle.jdbc.OracleDriver");//����̺� �̸��� ���
		System.out.println("����Ŭ ����̹� �ε�");
		
		//loading �� ����̹��� ���ؼ� oracle ����
		//url, user, pw
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","KOSA","1004");
		System.out.println(conn.isClosed()+"���� false");
		
		Statement stmt = conn.createStatement();
	
		//CRUD
		String sql = "select empno, ename, sal from emp";
		
		//ResultSet rs = stmt.executeQuery(sql); //DB������ �޸� ��ȸ
		//rs�� ���ؼ� DB���� memory�� ������ ������ ��ȸ
		//ó��(ȭ����ȸ)
		//���࿡ �߰��� DB������ ��������(close()) �����͸� �� ���� >> ��������
	
		
		String sql1="select empno , ename , sal from emp";
		
		ResultSet rs = stmt.executeQuery(sql1);//��� ����.... 
		
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
		System.out.println("DB ���� : " + conn.isClosed());
	}
	
}
