import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/*
 배열은 객체다 (Array)
 1. new 를 통해서 생성
 2. heap 메모리 생성(관리자원).
 3. 고정배열(정적배열) : 배열을 한번 선언하면 (크기가 정해지면) 변경이 불가능. <=> collection (동적배열)
 4. 자료구조(알고리즘) 기초적인 학습.
 
 
 
 */

public class Ex01_Array_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//같은 타입의 변수 여러개를 선언해서 데이터 처리하세요.
		int s;
		int s1;
		int s2;
		int s3;
		
		int a, a1, a2, a3;
		//.......................
		//배열
		int[] score = new int[4];
		
//		System.out.println(score[0]);
		score[0] = 101;
		score[1] = 20;
		score[2] = 300;
		score[3] = 500;
		//score[4] = 111;
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		//배열범위를 넘어섯다.
		
//		for(int i = 0 ; i <4; i++) {
//			System.out.printf("[%d]=%d\t", i, score[i]);
//		}
//		System.out.println();
//		
//		for(int i = 0; i < score.length ; i++) {
//			System.out.printf("[%d]=%d\t", i, score[i]);
//		}
//		System.out.println();
//		
//		String resultArray = Arrays.toString(score);
//		System.out.println(resultArray);
//		
//		Arrays.sort(score);
//		resultArray = Arrays.toString(score);
//		System.out.println(resultArray);
//		
		//정렬 알고리즘 (최소 버블정렬)

		//Today point
		//배열을 만드는 세가지 방법.
		
		int[] arr = new int[5]; //기본
		int[] arr2 = new int[] {100,200,300};
		int[] arr3 = {11,22,33}; //컴파일러에게 자동으로 new 부분을 부탁.
		int n=0;
		//int[] arr4 = null;
//		Scanner scan = new Scanner(System.in);
//		n = scan.nextInt();
//		arr4 = new int[n];
//		
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
		
		int[] arr4;
		arr4 = new int[] {21,22,23,24,25};
		System.out.println(arr4);
		
		int[] arr5 = arr4;
		
		System.out.println(arr5);
		
		System.out.println(arr5==arr4);
		
		String[] strarr = new String[] {"가", "나", "다라마"};
		
		for(int i = 0 ; i < strarr.length; i++) {
			System.out.println(strarr[i]);
		}
		
		char[] carr = new char[5];
		float[] farr = new float[5];
		
		/*
		 class Car(){}
		
		*/
		
//		Car[] CarArr = new Car[5];
		
		
	}	
	

}
