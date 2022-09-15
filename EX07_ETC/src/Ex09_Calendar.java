import java.util.Calendar;

import javax.xml.crypto.Data;

import kr.or.kosa.utils.Edu_Date;

/*

* Calendar 를 상속받아 완전히 구현한 클래스는 

* GregorianCalendar

buddhisCalendar 있는데 getInstance()는 [시스템의 국가와 지역설정]을 [확인]해서

태국인 경우 buddhisCalendar 의 인스턴스를 반환하고 그 외에는 GregorianCalendar

의 인스턴스를 반환한다

GregorianCalendar 는 Calendar를 상속받아 오늘날 전세계 공통으로 사용하고 있는 

그레고리력에 맞게 구현한 것으로 태국을 제외한 나머지 국가에서는 GregorianCalendar 사용

그래서 인스턴스를 직접 생성해서 사용하지 않고 메서드를 통해서 인스턴스를 반환받게하는

이유는 최소의 변경으로 프로그램 동작을 하도록 하기 위함

class MyApp{
static void main(){
Calendar cal = new GregorianCalendar();
다른 종류의 역법의 사용하는 국가에서 실행하면 변경...... } }

class MyApp{
static void main(){
Calendar cal = new getInstance();

다른 종류의 역법의 사용하는 국가에서 실행하면 변경...... } }

API : 생성자 Protected Calendar() 

*/


public class Ex09_Calendar {

	public static void main(String[] args) {
//		Data dt = new Date(); // 날짜를 표현하는 객체 >> 구버전
		Calendar cal = Calendar.getInstance(); // 싱글톤 패턴 메소드랑 비슷하다? (싱글톤은 아니다 !!! 같은 객체를 리턴하는게 아님.)
		// new 를 왜 안할까? >> 추상클래스 이므로
		// Calendar 추상클래스로 되어있음 >> 추상클래스라면 내부적으로 Calnedar를 extends하고 있는 어떠한 걸 new 함.
		// 시스템이 getInstance 라고 쓴다면 태국이 아니라면 GregorianCalendar 방식을 사용할꺼다.
		// 세계적으로 캘린더는 GregorianCalendar, buddhisCalendar 두개가 있다.
		// 프로그램을 보면 os 마다 경로 \, / 등 방식이 다르다 그걸 구분하기 위해 캘린더의 경우 getInstance 를 사용하므로 태국이 아니면 그레고리를 new 할수 있게 한다.
		//System.out.println(cal.toString());
		//당신이 필요한 형식을 추출해서 조립하세요
		
		System.out.println("년도 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + (cal.get(Calendar.MONTH)+1)); //월을 0~11로 봄
		System.out.println("일 : " + cal.get(Calendar.DATE));
		
		System.out.println("이 달의 몇째주 : " + cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(" : " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(" : " + cal.get(Calendar.DAY_OF_MONTH));
		
		//시, 분, 초
		
		
		System.out.println("시 : " + cal.get(Calendar.HOUR));
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		System.out.println("오전 오후 : " + cal.get(Calendar.AM_PM));
		
		//학사 관리 시스템
		//웹 : 페이지 본수 : 200page
		//150 page 날짜 정보 각 페이지 하단 출력 (2022년09월14일)
		System.out.println(Edu_Date.DateString(Calendar.getInstance()));
		System.out.println(Edu_Date.DateString(Calendar.getInstance(),"-"));
		System.out.println(Edu_Date.DateString(Calendar.getInstance(),"/"));
		System.out.println(Edu_Date.monthFormat_DateString(Calendar.getInstance()));
	}

}
