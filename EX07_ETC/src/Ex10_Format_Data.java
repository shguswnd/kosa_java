import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_Format_Data {

	public static void main(String[] args) {
			Date currdate = new Date();
			Calendar cal = Calendar.getInstance();
			//System.out.println("date : " + currdate);
			//Thu Sep 15 09:19:07 KST 2022  ��¥����
			
			//System.out.println("cal : " + cal); //���ڿ��� ����
			//java.util.GregorianCalendar[time=1663201147867,areFieldsSet=true

			System.out.println("cal getTime() �Լ� : " + cal.getTime());
			//Thu Sep 15 09:20:58 KST 2022
			
			SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmm");
			
		    String s =	dateformat.format(currdate);
			String s2 = dateformat.format(cal.getTime());
			System.out.println(s);
			System.out.println(s2);
			
			//����Ʈ � ������ �Է�
			//���ڿ� >> ��¥ ��������
			//"202209150925"
			String StringDate = "202209150925";  //���Ŀ� ���� ���ٸ�
			Date stringdate = null; //�ʱ�ȭ (��������)
			try {
				stringdate = dateformat.parse(StringDate);
				//parse ���� ������ (���� �߻� ���) throws ... ����ڴ� ����ó�� ...
				
				//Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT
				long datelong = stringdate.getTime();
				System.out.println(datelong);
			} catch (ParseException e) {
				
				e.printStackTrace();
			}finally {
				System.out.println(stringdate);
			}
			System.out.println();
			//�׳ɾ��� ������ �߻��Ҽ� ������ ������ try catch ������� �������� ����� ����.			
		}		

		
	}

