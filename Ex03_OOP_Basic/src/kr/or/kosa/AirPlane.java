package kr.or.kosa;
/*
 �츮 ȸ��� ����⸦ �ֹ� ���� �Ǹ� �ϴ� ȸ���Դϴ�.
 �츮 ȸ��� ����⸦ �����ϴ� ���赵�� ������� �մϴ�.
 
  
  �䱸����
  1. ����⸦ �����ϰ� ������� �̸��� ��ȣ�� �ο��ؾ��Ѵ�.
  2. ����Ⱑ ����Ǹ� ������� �̸��� ��ȣ�� �°� �ο��Ǿ����� Ȯ���ϴ� �۾� �ʿ�.
  3. �������� ������� ������� ���ر��� �� ��������� Ȯ���� �� �ִ�.
  AirPlane air101 = new AirPlane();
  
  air101 �̸� >> �����װ�
  air101 ��ȣ >> 707
  
  ���Ȯ�� ..
  ....5��
  ������ ����� ���� ��� Ȯ�� ..... 5�� ���۵Ǿ����ϴ�.
*/

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AirPlane {
//	private String name;
//	private int number;
//	
//	public static int cnt;
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getNumber() {
//		return number;
//	}
//	public void setNumber(int number) {
//		this.number = number;
//	}
//	
//	public void print() {
//		System.out.println("�̸� : " + name + "�ѹ� : " + cnt + "����");
//	}
	
	private int airnum;
	private String airname;
	private static int airtotalcount;
	
	public void AirPlane(int airnum, String airname)
	{
		this.airnum = airnum;
		this.airname = airname;
		airtotalcount++;
		
		AirDisplay();
	}

	private void AirDisplay() {
		// TODO Auto-generated method stub
		System.out.printf("��ȣ[%d], �̸�[%s] \n", airnum, airname);
	}
	
	public void airPlaneTotalCount() {
		System.out.printf("��[%d] \n", airtotalcount);
	}
	
}