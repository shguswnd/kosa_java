import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/*
 �迭�� ��ü�� (Array)
 1. new �� ���ؼ� ����
 2. heap �޸� ����(�����ڿ�).
 3. �����迭(�����迭) : �迭�� �ѹ� �����ϸ� (ũ�Ⱑ ��������) ������ �Ұ���. <=> collection (�����迭)
 4. �ڷᱸ��(�˰�����) �������� �н�.
 
 
 
 */

public class Ex01_Array_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� Ÿ���� ���� �������� �����ؼ� ������ ó���ϼ���.
		int s;
		int s1;
		int s2;
		int s3;
		
		int a, a1, a2, a3;
		//.......................
		//�迭
		int[] score = new int[4];
		
//		System.out.println(score[0]);
		score[0] = 101;
		score[1] = 20;
		score[2] = 300;
		score[3] = 500;
		//score[4] = 111;
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		//�迭������ �Ѿ��.
		
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
		//���� �˰����� (�ּ� ��������)

		//Today point
		//�迭�� ����� ������ ���.
		
		int[] arr = new int[5]; //�⺻
		int[] arr2 = new int[] {100,200,300};
		int[] arr3 = {11,22,33}; //�����Ϸ����� �ڵ����� new �κ��� ��Ź.
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
		
		String[] strarr = new String[] {"��", "��", "�ٶ�"};
		
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