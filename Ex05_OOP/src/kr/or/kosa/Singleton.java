package kr.or.kosa;
// ������ ����(���� ����) >> new

//�̱��� ...(��ü �ϳ��� ����� ����)
//�ǵ� : �ϳ��� ��ü�� �����ϴ� ���� �ڵ�...

//����IP
//����������
//�����Ҷ�



/*
 �̱��� ����
 1. �����ڰ� ���� ���ϰ� �ؾ��Ѵ�. �����ڸ� ���� private �� ���������Ѵ�.
 2. �޸𸮿� �ø��� ����� �����ϴµ� static�� ����Ѵ�.
 3. �޸𸮿� �ö�� ��ü�� �޼��带 ���� ����� ��ü�� ���� null�϶��� new�� �س�����.
 */


public class Singleton {
	private static Singleton p;//static���� �޸𸮿� �����ø�.
	//p��� ������ �ּҸ� ������..... new 
	private Singleton() {
		//�����ڿ��� �����ڸ� private �ع����� ������ �Լ� ȣ�� ���ϴ� ��ü ���� �Ұ� new....
	}
	public static Singleton getInstance() {
		if(p==null) {
			p = new Singleton(); //���� Ŭ���� ���ο����� public, private ���δ�.
		}
		return p;
	}
}
