package kr.or.kosa;
/*
 �츮�� ī�带 ����� �Ǹ��ϴ� ȸ�� �Դϴ�.
 ���� ��û�� ���� ī�� 53���� �����ϰ� �Ǿ����ϴ�.
 �䱸����)
 ī��� ī���� ��ȣ�� ������ �ְ� ����� ������ �ִ�.
 ī��� ũ�⸦ ������ �ְ� ũ��� ���̿� �ʺ� ������ �ִ�.
 ī���� ũ��� h = 50, w = 20 
 �׸��� ���۵Ǵ� ī���� ���̿� �ʺ�� ����
 -------------------------------------------------------
 �����ؼ� �� ����.
 ���ڱ� ���� ī�� ũ�⸦ �ٿ��޶���.
 
 
 */
public class Card {
	private int number;
	private String kind;
	
	private static int hight = 50;
	private static int weight = 20;
	public static int getHight() {
		return hight;
	}
	
	public void makeCard(int num, String name)
	{
		number = num;
		kind = name;
	}
	public void cardDisplay() {
		System.out.printf("��ȣ %d, ī���� %s, h:%d, w:%d \n", number, kind, hight, weight);
	}
	
}
