package kr.or.kosa.common;

public class Car {
		int i;	//컴파일러가 자동으로 default 을 붙힘. (같은 패키지안에서만 사용가능) 앞에 클래스가 public 이다? 
		//default package 에 Ex01_Main에서 i는 사용불가(default 같은 폴더 한정)
		public int window; // 같은 폴더 다른 폴더와 상관없이 다 사용 가능하다.
		private int door; // get(읽기),set(쓰기)으로 사용 >> 캡슐화 너 쓰기 못하게 막는데 왜쓰냐?
		
		//직접적으로 놀지는 못하지만 간접적을 접근가능하게
		//setter, getter를 사용한다.
		
		public void setDoor(int d) {
			this.door = d; //쓰기(숨겨진 자원에)
		}
		public int getDoor() {
			return this.door;
		}

}
