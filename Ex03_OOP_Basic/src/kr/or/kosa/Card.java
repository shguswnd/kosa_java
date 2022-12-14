package kr.or.kosa;
/*
 우리는 카드를 만들어 판매하는 회사 입니다.
 고객의 요청에 따라 카드 53장을 제작하게 되었습니다.
 요구사항)
 카드는 카드의 번호를 가지고 있고 모양을 가지고 있다.
 카드는 크기를 가지고 있고 크기는 높이와 너비를 가지고 있다.
 카드의 크기는 h = 50, w = 20 
 그리고 제작되는 카드의 높이와 너비는 동일
 -------------------------------------------------------
 제작해서 고객 전달.
 갑자기 고객이 카드 크기를 줄여달라함.
 
 
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
		System.out.printf("번호 %d, 카드모양 %s, h:%d, w:%d \n", number, kind, hight, weight);
	}
	
}
