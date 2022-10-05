import java.sql.Connection;
import java.sql.SQLException;

import kr.or.kosa.SingletonHelper;

public class Ex04_SingletonHelper {

	public static void main(String[] args) throws Exception {
		//Singleton ���� 
		//�ϳ��� ��ü�� ����ϰڴ� ....
		//�ϳ��� ��ü�� �����ؼ� ����ϰڴ�
		
		//single ��ü�� �����ڿ��̱⿡ APP �� ����ɶ����� Close() ���� �ʴ� �� ��Ģ
		
		
		Connection conn = null;
		conn = SingletonHelper.getConnection("oracle");
		System.out.println(conn.toString());
		System.out.println(conn.getMetaData().getDatabaseProductName());
		System.out.println(conn.getMetaData().getDatabaseProductVersion());
		System.out.println(conn.isClosed());
		
		Connection conn2 = null;
		conn2 = SingletonHelper.getConnection("oracle");
		System.out.println(conn2.toString());
		System.out.println(conn2.getMetaData().getDatabaseProductName());
		System.out.println(conn2.getMetaData().getDatabaseProductVersion());
		System.out.println(conn2.isClosed());

	}

}