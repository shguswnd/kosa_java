package kr.or.kosa;
/*
 우리 회사는 비행기를 주문 제작 판매 하는 회사입니다.
 우리 회사는 비행기를 생산하는 설계도를 만들려고 합니다.
 
  
  요구사항
  1. 비행기를 생산하고 비행기의 이름과 번호를 부여해야한다.
  2. 비행기가 생산되면 비행기의 이름과 번호가 맞게 부여되었는지 확인하는 작업 필요.
  3. 공장장은 현재까지 만들어진 비해기의 총 누적대수를 확인할 수 있다.
  AirPlane air101 = new AirPlane();
  
  air101 이름 >> 대한항공
  air101 번호 >> 707
  
  출력확인 ..
  ....5대
  관리자 비행기 누적 대수 확인 ..... 5대 제작되었습니다.
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
//		System.out.println("이름 : " + name + "넘버 : " + cnt + "개수");
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
		System.out.printf("번호[%d], 이름[%s] \n", airnum, airname);
	}
	
	public void airPlaneTotalCount() {
		System.out.printf("총[%d] \n", airtotalcount);
	}
	
}
