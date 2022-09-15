package kr.or.kosa.utils;

import java.util.Calendar;

//���赵
//��¥�� �����ϴ� �Լ��� ���� ��� .... ���ϰ� ���� ����.
//static ..... �̸�??? Overloading
public class Edu_Date {
	public static String DateString(Calendar date) {
		return date.get(Calendar.YEAR) + "��" + 
				(date.get(Calendar.MONDAY)+1) + "��" +
				date.get(Calendar.DATE) + "��";
	}
	
	public static String DateString(Calendar date, String opr) {
		return date.get(Calendar.YEAR) + opr + 
				(date.get(Calendar.MONDAY)+1) + opr +
				date.get(Calendar.DATE);
	}
	
	//�䱸����
	//2020-9-14
	//1~9�� >> 01, 02 .... 09
	//10 ,11 12 >> �״��
	public static String monthFormat_DateString(Calendar date) {
		return date.get(Calendar.YEAR) + "-" + ((date.get(Calendar.MONDAY)+1) > 10 ? (date.get(Calendar.MONDAY)+1) : "0"+(date.get(Calendar.MONDAY)+1))
				+"-" + date.get(Calendar.DATE);
	}
}
