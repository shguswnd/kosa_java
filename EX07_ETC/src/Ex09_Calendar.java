import java.util.Calendar;

import javax.xml.crypto.Data;

import kr.or.kosa.utils.Edu_Date;

/*

* Calendar �� ��ӹ޾� ������ ������ Ŭ������ 

* GregorianCalendar

buddhisCalendar �ִµ� getInstance()�� [�ý����� ������ ��������]�� [Ȯ��]�ؼ�

�±��� ��� buddhisCalendar �� �ν��Ͻ��� ��ȯ�ϰ� �� �ܿ��� GregorianCalendar

�� �ν��Ͻ��� ��ȯ�Ѵ�

GregorianCalendar �� Calendar�� ��ӹ޾� ���ó� ������ �������� ����ϰ� �ִ� 

�׷����¿� �°� ������ ������ �±��� ������ ������ ���������� GregorianCalendar ���

�׷��� �ν��Ͻ��� ���� �����ؼ� ������� �ʰ� �޼��带 ���ؼ� �ν��Ͻ��� ��ȯ�ް��ϴ�

������ �ּ��� �������� ���α׷� ������ �ϵ��� �ϱ� ����

class MyApp{
static void main(){
Calendar cal = new GregorianCalendar();
�ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����...... } }

class MyApp{
static void main(){
Calendar cal = new getInstance();

�ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����...... } }

API : ������ Protected Calendar() 

*/


public class Ex09_Calendar {

	public static void main(String[] args) {
//		Data dt = new Date(); // ��¥�� ǥ���ϴ� ��ü >> ������
		Calendar cal = Calendar.getInstance(); // �̱��� ���� �޼ҵ�� ����ϴ�? (�̱����� �ƴϴ� !!! ���� ��ü�� �����ϴ°� �ƴ�.)
		// new �� �� ���ұ�? >> �߻�Ŭ���� �̹Ƿ�
		// Calendar �߻�Ŭ������ �Ǿ����� >> �߻�Ŭ������� ���������� Calnedar�� extends�ϰ� �ִ� ��� �� new ��.
		// �ý����� getInstance ��� ���ٸ� �±��� �ƴ϶�� GregorianCalendar ����� ����Ҳ���.
		// ���������� Ķ������ GregorianCalendar, buddhisCalendar �ΰ��� �ִ�.
		// ���α׷��� ���� os ���� ��� \, / �� ����� �ٸ��� �װ� �����ϱ� ���� Ķ������ ��� getInstance �� ����ϹǷ� �±��� �ƴϸ� �׷����� new �Ҽ� �ְ� �Ѵ�.
		//System.out.println(cal.toString());
		//����� �ʿ��� ������ �����ؼ� �����ϼ���
		
		System.out.println("�⵵ : " + cal.get(Calendar.YEAR));
		System.out.println("�� : " + (cal.get(Calendar.MONTH)+1)); //���� 0~11�� ��
		System.out.println("�� : " + cal.get(Calendar.DATE));
		
		System.out.println("�� ���� ��°�� : " + cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(" : " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(" : " + cal.get(Calendar.DAY_OF_MONTH));
		
		//��, ��, ��
		
		
		System.out.println("�� : " + cal.get(Calendar.HOUR));
		System.out.println("�� : " + cal.get(Calendar.MINUTE));
		System.out.println("�� : " + cal.get(Calendar.SECOND));
		System.out.println("���� ���� : " + cal.get(Calendar.AM_PM));
		
		//�л� ���� �ý���
		//�� : ������ ���� : 200page
		//150 page ��¥ ���� �� ������ �ϴ� ��� (2022��09��14��)
		System.out.println(Edu_Date.DateString(Calendar.getInstance()));
		System.out.println(Edu_Date.DateString(Calendar.getInstance(),"-"));
		System.out.println(Edu_Date.DateString(Calendar.getInstance(),"/"));
		System.out.println(Edu_Date.monthFormat_DateString(Calendar.getInstance()));
	}

}
