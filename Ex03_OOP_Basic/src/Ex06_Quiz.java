import kr.or.kosa.AirPlane;
import kr.or.kosa.Card;

public class Ex06_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		AirPlane.cnt = 1;
//		
//		AirPlane air101 = new AirPlane();
//		
//		air101.setName("�����װ�1");
//		air101.setNumber(707);
//		
//		AirPlane air102 = new AirPlane();
//		air102.setName("�����װ�2");
//		air102.setNumber(7072);
//		air102.cnt++;
//		
//		AirPlane air103 = new AirPlane();
//		air103.setName("�����װ�3");
//		air103.setNumber(7073);
//		AirPlane.cnt++;
//		
//		AirPlane air104 = new AirPlane();
//		air104.setName("�����װ�4");
//		air104.setNumber(7074);
//		air104.cnt++;
//		
//		AirPlane air105 = new AirPlane();
//		air105.setName("�����װ�5");
//		air105.setNumber(7075);
//		air105.cnt++;
//		
//		air101.print();
//		air102.print();
//		air103.print();
//		air104.print();
//		air105.print();
//		
//		System.out.println(AirPlane.cnt+"�� ���������");
	
	AirPlane air1 = new AirPlane();
	air1.AirPlane(101, "�����װ�");
	air1.airPlaneTotalCount();

	AirPlane air2 = new AirPlane();
	air1.AirPlane(707, "�����װ�");
	air1.airPlaneTotalCount();
	
	AirPlane air3 = new AirPlane();
	air1.AirPlane(808, "�ƽþƳ�");
	air1.airPlaneTotalCount();
	
	Card card = new Card();
//	int a= card.getHight();
//	int b= card.getWeight();
//	System.out.printf("[%d], [%d] : ", a,b);
	}

}