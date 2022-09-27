
package com.victoree2.common;

import java.io.Serializable;

//계정정보

public class AccountData implements Serializable{
	private String id; //id
	private String name; //이름
	private String password; //패스워드
	private String birthday; //생일
	private String phoneNumber;
	private int status; //계정 상태 (1 : 사용자  0 : 계정 정지  9 : 관리자 2: 구매한사람 3:환불한사람)
	private boolean checkIn;// 입실/퇴실
	private int cnt;//경고횟수
	private int price;//결제금액
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	private static final long serialVersionUID = (long)5746694569156904189.0;
	//serialversionuid 값을 지정을 안하면 로컬과 클라이언트에서 자동으로 생성되는 hash값으로 에러 발생함.
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public AccountData(String id, String name, String password, String birthday, String phoneNumber) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
		this.status = 1;
		this.checkIn = false;
		this.price = 0;
	}
	public boolean getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}
	public AccountData(String id, String name, String password, String birthday, int status) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.birthday = birthday;
		this.status = status;
	}
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBirthday() {
		return birthday;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt() {
		cnt++;
	}
	@Override
	public String toString() {
		return "[ID:"+id+" 이름:" + name + "]";
//		return "Account [id=" + id + ", name=" + name + ", password=" + password + ", birthday=" + birthday
//				+ ", status=" + status + "]";
	}
	
	
	
	
}
