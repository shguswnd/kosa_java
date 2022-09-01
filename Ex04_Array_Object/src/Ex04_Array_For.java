
public class Ex04_Array_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			Today Point
			for 문 >> 향상된 for문 , 개선된 forans
			JAVA : for(Type 변수명 : 배열 or Collection) {실행블럭}
			C# : for(Type 변수명 in 배열 or Collection) {실행블럭}
			JavaScript : for(Type 변수명 in Collection) {실행블럭}
		*/
		
		int[] arr = {5,6,7,8,9};
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
//		개선된..
		
		for(int value : arr) {
			System.out.println(value);
		}
		
		String[] strarr = {"A", "B", "C", "D", "FFFFF"};
		
		for(String value : strarr)
			System.out.println(value);
		
		
		
		}
	}

