import java.util.Scanner;

public class Ex05_String_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strarr = {"aaa", "bbb", "ccc"};
	
		
		for(String s : strarr) {
			System.out.println(s);
		}
		//����� : int, double ��Ÿ�� ó�� ���
		
		String st = "ȫ�浿";
		System.out.println(st.length());
		System.out.println(st); //st.toString()
		System.out.println(st.toString());//�ּҷ� ���� �����͸� ���� ����(������)
		//String Ŭ������ Object �θ� Ŭ���� toString() ��Ӱ��� ������ ........
		
		//���� String ���
		String sdata = new String("������");
		System.out.println(sdata);
		
		String name = "�����ٶ󸶹�";
		//String ���������� char[] member field >> [��][��][��][��][��] �迭�� �ּҰ�
		//class String extends Object {private char[] str ... @Override toString()}
		
		String str1 = "AAA";
		String str2 = "AAA";
		
		//���ڿ��� ��
		System.out.println(str1);
		System.out.println(str2.toString()); //toString() ������ �ּҰ��� �ƴϰ� ���� ���´�.
		System.out.println(str1 == str2);
		//System.out.println(str1 == str3);
		// == ������ ���� �� str1(�ּҰ�), str2(�ּҰ�)
		// ���� str.toString�̶� �����Ͽ� true�� �������� �׷��� .toString ������ �ּҰ��� �޴°� �´� �絥 �� true�� ���ñ�???
		// 1. str1, str2�� ���� �ּҿ� ����ִ�
		// 2. **�޸𸮿� ������ ���� ���ڿ��� ������ ������ �Ѵ� �� ���� �ּ��� ���� �־��ش�.
		//Point 
		System.out.println(str1.equals(str2)); //�ּҸ� ã�ư��� �׾��� ���� ��
		//equals ��� ���� : �Ʒ� �Ѵ�(new, scan)�� ����ع����� ���� ���� �ʴ� ������ �ּҸ� ����� ����
//		
//		String str3 = new String("BBB");
//		String str4 = new String("BBB");
//		System.out.println(str3==str4);
//		Scanner scan = new Scanner(System.in);
//		String test = scan.next();
//				
//		System.out.println(str1==test);
		
		String s = "A";
		s+="B";
		s+="C";
		System.out.println(s);
		
		s = "A";
//		System.out.println(s);
	}

}
