package kr.or.kosa;

import java.io.Serializable;

/*
 객체 통신
 객체(Car, Tv, Tank) 네트워크, 파일간에(txt파일에 객체 write, 객체 read) ,
 프로세스 간에 통신 가능 
 
 이러한 과정을 직렬화
 
 직렬화 : 객체를 분해해서 줄을 세워 보내는 과정
 역직렬화 : 객체를 다시 조립하는 과정
 
 실습) 파일
 객체 write(파일):직렬화
 객체 read(파일):역질렬화
 
 모든 자원(class) 직렬화 불가능
 직렬화 가능 제품 만들어서....
 
 직렬화일떄
 implements Serializable  사용
 데이터는 없음 그냥 명칭같은 느낌.
 
 */
public class UserInfo implements Serializable{ //직렬화 가능
	private String name;
	private String pwd;
	private int age;
	
	public UserInfo() {
		
	}

	public UserInfo(String name, String pwd, int age) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public String getPwd() {
		return pwd;
	}

	public int getAge() {
		return age;
	}

}
