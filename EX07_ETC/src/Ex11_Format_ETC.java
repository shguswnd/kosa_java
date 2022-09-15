import java.text.DecimalFormat;
import java.text.MessageFormat;

public class Ex11_Format_ETC {

	public static void main(String[] args) {
		double money = 123456.5678;
		//���������� ������
		DecimalFormat df = new DecimalFormat("0.0"); //123456.6 ���� �ݿø���
		System.out.println(df.format(money));
		
		DecimalFormat df2 = new DecimalFormat("0"); //123456 ���� �ݿø��� 
		System.out.println(df2.format(money));
		
		DecimalFormat df3 = new DecimalFormat("0.000000000"); //.���ķ� �� ������ 0���� ä���� 
		System.out.println(df3.format(money));
		
		DecimalFormat df4 = new DecimalFormat("#.#############"); //���� �ٸ��� �Ʒ��� ä���� ����.
		System.out.println(df4.format(money));
		
		
		
		String userId="kglim";
		String userName="ȫ�浿";
		String userTel="010-111-1111";
		String message = "ȸ�� Id :{0} \nȸ�� �̸� : {1} \nȸ�� ��ȭ��ȣ : {2}"; // printf ó�� ��밡��
		String result = MessageFormat.format(message, userId, userName, userTel);
		
		System.out.println(result);
	}

}
