import java.util.Vector;

/*
 Collection FrameWork
 다수의 데이터를 다루는 표준화된 인터페이스를 구현하고 있는 클래스의 집합
 
 Collection 인터페이스 -> 상속 List (구현 : ArrayList....), Set ( 구현 : HashSet, TreeSet....)
 
 >>ArrayList 부모타입은 List 이다 (OK) >> 다형성
 >>Collection 는 ArrayList 부모 타입이다 (OK) >> 다형성
 
 Map인터페이스(key, value) 쌍의 배열 -> (구현:HashMap)
 
 1. List(줄을 서시오)
 순서(번호표), 중복(허용) > 내부적으로 데이터 (자료) > 배열(Array)관리 > [홍길동][홍길동][홍길동] 

 																[0]    [1]    [2]

 1.1 Vector(구버전) -> 동기화 보장. (멀티 스레드 사용.) -> Lock(장치)보호 -> 성능은 떨어짐.
 하나의 자원을 여러사람이 쓰려고 했을때, 한명이 점유한다면 lock걸어 자원을 보호하는 행위. >> 나머지는 대기상태로 나둠.
 
 1.2 ArrayList(신버전) -> 동기화 보장(멀티 스레드) -> Lock 옵션(기본 Lock(x)) -> 성능우선
 
 기존 다수의 데이터를 다루는 방법 : Array(정적, 고정)
 --방의 개수가 한번 정해지면 (방의 크기는 변경 불가)
 배열 
 int[] arr = new int[5];
 arr[0] = 100;
 int[] arr2 = {10,20,30}
 데이터가 많아지면 새로운 크기의 배열 만들고 데이터 이동 (코드로 직접 구현)***
 
 Array
 1. 배열의 크기가 고정 : Car[] cars = {new Car(), new Car(), new Car()}; 방이 3개 만들어짐.
 2. 접근 방법 (index 첨자) 방번호 접근 : cars[0] ,,,, n(length-1) 방

 List 인터페이스를 구현하고 있는 (Vector, ArrayList)
 1. 배열의 크기를 동적으로 확정 or 축소 가능 >> 진실은 컴파일러가 새로운 배열은 만들고 데이터 이동을 알아서
 2. 순서를 유지 (내부적으로 Array 사용) , 중복값 사용
 3. 데이터 저장 공간 : Array 사용
 */


public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		
		System.out.println("초기 default 용량 : " + v.capacity()); //용량
		System.out.println("size : " + v.size()); //실데이터
		
		v.add(1);
		v.add(2);
		v.add(3);
//		System.out.println(v.elementAt(0));
//		System.out.println(v.toString()); //[1,2,3] 재정의 데이터 출력
		//Array >> length >> 편법적으로 index 개념을 만들어서 마치 사이즈(size) 처럼
		//Collection >> size
		for(int i=0; i<v.size(); i++) {
//			System.out.println(v.get(i)); //get(index) 값을 return : 정적 array[index]
		}
		
		
		//개선된 포문
		//**Object로 값을 받았으므로 return 값도 Object이다 그런데 오브젝트는 큰값이다 그래서 제너릭을 써서 문자, 숫자형으로 값을 전달하고 받아야한다.
		//단점 : 작은 데이터 (같은 타입의 데이터) .... 가장 큰타입을 사용하는것 불합리
		//제너릭 >> 타입을 강제 >> 추후 별도 학습(POINT)
//		
// 		for(Object value : v) {
//			System.out.println(value);
//		}
//
// 		
// 		Vector<Integer> v2 = new Vector<Integer>();
// 		v2.add(11);
// 		v2.add(22);
// 		v2.add(33);
// 		for(int value : v2) {
// 			System.out.println(value);
// 		}
// 		

		Vector v3 = new Vector();
 		System.out.println(v3.capacity());
 		for(int i=0; i<11; i++)
 			v3.add("A");
 		System.out.println(v3.capacity());
	}

}
