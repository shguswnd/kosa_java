package com.victoree2.system;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import com.victoree2.common.AccountData;
import com.victoree2.common.ActionInterface;
import com.victoree2.common.ReservationData;
import com.victoree2.common.ReturnMessage;
import com.victoree2.main.ReadingRoom;


public class AdminSystem extends ReturnMessage implements ActionInterface{
	Scanner scan = new Scanner(System.in);
	ReadingRoom room = new ReadingRoom();
	ReadingRoomFactory factory;
	HashMap<String, AccountData> userMap;
	List<AccountData> searchResult;
	AccountData user;
	AccountSystem userSystem;
	ReservationSystem  reservationSys;
	HashMap<String, ReservationData> reservationMap;
	static Set<String> set = new HashSet<>();
	
	SeatSystem seatSys;
	int discountRate;
	
	
	public AdminSystem(HashMap<String, AccountData> userMap2) {
		this.factory = new ReadingRoomFactory();
		this.userMap = userMap2;
		this.userSystem = factory.getUser();
		seatSys = factory.getSeatSystem();
		
		//결제내역
		reservationSys = factory.getReservationSystem();
		reservationSys.getReservation();//구독내역
		ReservationData reservationData;
		//
	}
	@Override
	public void run() {
		seatSys.init();
		reservationSys.load();
		ReservationData rd;
		reservationMap = reservationSys.getReservation();
		for(Object value : reservationMap.values()) {
			rd = (ReservationData) value;
			if(rd.getRoomarr()!=0)
			seatSys.update(rd.getRoomarr(), rd.getSeat());
		}
		
		System.out.println(message(room.language, "0021"));//"관리자 페이지에 접속하였습니다."
		
		//1:좌석현황 2:전체회원 목록 3:회원검색 4:매출현황 5:쿠폰관리 0:로그아웃 -1:종료
		int key=0;
		while ((key = selectMenu("0")) != -1) {
			
			switch (key) {
			case 1:
				System.out.println(message(room.language, "0104"));

				for (int i = 1; i <= seatSys.getRoomNum().size(); i++) {
					System.out.print(i + ": " + i + "열람실 \n");
				}
				int roomNum = Integer.parseInt(scan.nextLine());
				seatSys.print(roomNum);

				break;
			case 2:
				selectAccount();
				break;
			case 3:
				specificUser();
				break;
			case 4:
				showSales();
				break;
			case 5:
				//쿠폰관리
				coupon();
				break;
			case 6:
				//열람실 추가
				System.out.println("6: 룸만들기");
				System.out.print("가로 : ");
				int x = Integer.parseInt(scan.nextLine()); // 가로
				System.out.println("세로 : ");
				int y = Integer.parseInt(scan.nextLine()); // 세로
				seatSys.makeRoom(x, y);
				System.out.println("열람실을 추가했습니다.");
				break;
			case 0:
				System.out.println(message(room.language, "0018"));//종료
				return;
			default:
				System.out.println(message(room.language, "0020"));//관리자페이지에 접속하였습니다.
				break;
			}
		}

	}

	public void specificUser() {
		System.out.println(message(room.language, "0053"));
		String id = scan.nextLine();
		searchResult = selectAccount(id);
		Boolean searchResultCheck = searchResult.size()!=0 ? true : false;
		int key;// = selectMenu("03");
			
		if(searchResultCheck) {
			System.out.println("관리할 회원 선택"); //returnMessage에 추가
			int index = Integer.parseInt(scan.nextLine()) - 1;
			user = searchResult.get(index);
			System.out.println(user.toString());
			
			while((key = selectMenu("03"))!=-1){
				switch(key){
					case 1:	//거래내역확인
						//kor_message.put("0062","해당 회원의 결제내역입니다."); //3.회원 검색 -> 1.회원입퇴실내역조회
						
						inoutSeat();
						break;
					case 2:
						//분실계정 비밀번호 초기화
						pwdReset();
						break;
					case 3:						
						//회원관리(경고)
						userManager();
						break;
					case 4://회원정지
						bann();
						break;
					case 0:
						user = null;
						searchResult = null;
						return;
							//돌아가기
					default:
						System.out.println(message(room.language, "0020"));
						break;
				}
			}
				return;
			}else {
				//검색결과가 없으니 함수 종료
				return;
			}
	}
	public List<AccountData> selectAccount(String name) {
		List<AccountData> searchUsers = new ArrayList<>();
		for(AccountData ac : userMap.values()) {
			if(ac.getName().equals(name)) {
				searchUsers.add(ac);
			}
		}
		if(searchUsers.size() == 0) { //검색결과가 0일 때
			System.out.println("검색결과가 존재하지 않습니다."); //이거 나중에 returnMessage에 넣기
			return null;
		}else {
			int index = 1;
			System.out.println(message(room.language, "0058")); //"검색 결과"
			 for(int i = 0; i < searchUsers.size(); i++) {
		            System.out.println(index + " : " + searchUsers.get(i));
		            index++;
		      }
			 return searchUsers;
		}
	}
	
	public void userManager() {//회원관리(경고)
		if(user.getStatus() == 0) {
			System.out.println("해당 회원은 이미 정지된 회원입니다.");
			return;
		}
		System.out.println(message(room.language, "0060"));
		int warnCheck = Integer.parseInt(scan.nextLine());
		if(warnCheck == 1) {
			System.out.println(message(room.language, "0061"));  //3.경고 "경고를 주었습니다"
			//AccountData.java에서 getCnt, setCnt 만들어야함
			user.setCnt(); //경고 누적
			System.out.println("해당 회원의 현재 누적 경고 수 : " + user.getCnt());
			if(user.getCnt() > 2) {
				//System.out.println("해당 회원은 경구 3회 누적으로 정지됩니다.");
				System.out.println(message(room.language, "0067"));  //4. 정지 "회원의 권한을 정지하였습니다"
				user.setStatus(0);
			}
			userSystem.update(user);
		}
	}
	
	public void bann() { //회원 정지
//		System.out.println("해당 회원을 정지시키겠습니까? 1:예 2:뒤로가기");
		if(user.getStatus()==0) {
			System.out.println("이미 정지된 회원입니다.");
			return;
		}
		System.out.println(message(room.language, "0066"));
		int bannCheck = Integer.parseInt(scan.nextLine());
		if(bannCheck == 1) {
//			user.setCnt();
			user.setStatus(0);
			System.out.println("정지시켰습니다.");
		}
	}
	
	public void inoutSeat() { // 회원결제내역조회
		reservationMap = reservationSys.getReservation();//구독내역
		if(reservationMap.get(user.getId()) != null){//키값이 존재할경우.
			System.out.println(message(room.language, "0062"));
			System.out.println(reservationMap.get(user.getId()).toString());
		}
		else {
			System.out.println("해당 회원의 결제내역이 존재하지 않습니다.");
		}
	}
	@Override
	public void pwdReset(/*AccountData user*/) { //패스워드 초기화 유저 객체를 받아와서 바꾸려고 했는데 interface에 설계가 다름
		//회원 검색 후
		//비밀번호 초기화

		System.out.println(message(room.language, "0063")); //정말 비밀번호를 초기화하겠습니까? 0000으로 초기화됩니다. 1:예 2:뒤로가기
		int resetCheck = Integer.parseInt(scan.nextLine());
		if(resetCheck == 1) {//리셋
			user.setPassword("0000");
			userSystem.update(user);
			System.out.println(message(room.language, "0064"));
		}
	}
	
	public void showSales() {
		//매출확인
		System.out.println("매출현황입니다.");
		int sum = 0;
		 for(Entry<String, ReservationData> elem : reservationMap.entrySet()){
             sum += elem.getValue().getPrice();
         }
		 System.out.println("총합 " + sum);
	}
	
	public void coupon() {//쿠폰
		int key;
		while((key = selectMenu("05"))!=-1) {
			switch(key) {
			case 1://현재 발행된 쿠폰
				listCoupon();
				break;
			case 2://쿠폰 추가
				addCoupon();
				break;
			case 3://쿠폰 삭제
				delCoupon();
				break;
			case 0://뒤로 가기
				return;
			default:
				System.out.println(message(room.language, "0020"));
				break;
			}
		}
	}
	//쿠폰의 하위 함수들
	public void listCoupon() {
		//현재 발행된 쿠폰 출력
		if(set.size() ==0) {
			System.out.println("현재 발행된 쿠폰이 없습니다.");
			System.out.println();
		} else if(set.size() !=0) {
		System.out.println(message(room.language, "0055"));
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		System.out.println();
		}
	}

	public String creatCouponNum() { // 쿠폰 추가

		// Scanner scan = new Scanner(System.in);

		// System.out.println("발행할 쿠폰의 개수를 입력하세요");
		// int couponNum = scan.nextInt(); // 쿠폰 개수만큼 for문 돌릴 거다

		// System.out.println("발행할 쿠폰의 할인율을 입력하세요 (두 자리 수로 입력하세요 / 예: 07, 15)");
		// int discountRate = scan.nextInt(); //쿠폰 맨 뒷자리 두 개는 할인율(두 자리 수)이 된다.

		int[] codeDigit = { 1, 2, 3, 4, 4, 6, 7, 8, 9, 0 };

		Random rdn = new Random();

		StringBuilder sb = new StringBuilder();

		for (int j = 0; j <= 6; j++) {

			int tmp = codeDigit[rdn.nextInt(codeDigit.length)];
			sb.append(tmp);
		}
		return sb.toString() + String.valueOf(this.discountRate);
	}
	public void addCoupon() {
		//쿠폰 추가
		Scanner scan = new Scanner(System.in);
		//Set<String> set = new HashSet<>();
		System.out.println("발행할 쿠폰의 개수를 입력하세요");
		int couponNum = scan.nextInt(); // 쿠폰 개수만큼 for문 돌릴 거다
		System.out.println("발행할 쿠폰의 할인율을 입력하세요 (두 자리 수로 입력하세요 / 예: 07, 15)");
		 discountRate = scan.nextInt();
		 int size = set.size();
		 
		while(set.size()<couponNum) {
			set.add(creatCouponNum());
		}	
		
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String element = iterator.next();
			System.out.println("\t" + element);
		}		
		System.out.println("쿠폰이 발행되었습니다");
	}
	public void delCoupon() {
		//쿠폰 삭제
		System.out.println("Delete coupon...");
	}
	
	@Override
	public void selectAccount() {
		//회원 전부 조회
		for(Object value : userMap.values()) {
			System.out.print(value);
			user = (AccountData) value;
			String bannnn="";
			if(user.getStatus()==0) {
				bannnn =  "정지상태";
			}
			System.out.println("  경고" + user.getCnt() + " " + bannnn);
		}
	}
	
	@Override
	public void paymentCancel() {
		//관리자는 회원 환불.
		
	}

	@Override
	public void checkSeat() {
		//전체좌석을 확인할 수 있다.
		
	}
	@Override
	public int selectMenu(String index) { //선택메뉴만 여기서 출력하고 메소드 안에서 필요한 프린트는 메소드내에서 바로 syso해도됨
		if(index == "0")
			System.out.println(message(room.language, "0003"));
		else if(index == "01")
			System.out.println("양식");
//		else if(index == "03")
//			System.out.println(message(room.language, "0053"));//"0053", "회원검색합니다. \n검색할 회원의 이름을 입력하세요."
		else if(index == "03") //검색결과가 존재할 경우
			System.out.println(message(room.language, "0059"));//"0059","1:회원 관리 2:회원입퇴실내역조회 3:분실계정 비밀번호 초기화 0:뒤로가기"
		else if(index == "031")
			System.out.println(message(room.language, "0060"));//kor_message.put("0060","이 회원에게 경고를 줍니까? 1:예 2:뒤로가기");//1눌렀을 때
		else if(index == "0311")
			System.out.println(message(room.language, "0061"));//kor_message.put("0061","경고를 주었습니다.");
		else if(index == "032")
			System.out.println(message(room.language, "0062"));//kor_message.put("0062","해당 회원의 입퇴실내역입니다.");//회원검색결과 2번옵션
		else if(index == "033")
			System.out.println(message(room.language, "0063"));//kor_message.put("0063","정말 비밀번호를 초기화하겠습니까? 0000으로 초기화됩니다. 1:예 2:뒤로가기");//회원검색결과3번옵션
		else if(index == "0331")
			System.out.println(message(room.language, "0064"));//kor_message.put("0064","비밀번호가 초기화되었습니다.");//회원검색결과3번옵션-2
		else if(index == "05")
			System.out.println(message(room.language, "0054"));//쿠폰을 관리합니다.\n 1:현재 발행된 쿠폰 확인  2:쿠폰 추가  3:쿠폰 삭제  0:뒤로가기 -1:종료
		return Integer.parseInt(scan.nextLine());
	}





	
	
}
