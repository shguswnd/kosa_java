
public class Ex02_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		int num = 100;
		int result = 0;
		
		//���� �м�(�ڵ� ������)
		try {
			for(int i = 0 ; i < 100 ; i++)
			{
				result = num / (int)(Math.random() * 10); // 0 ~ 9
				System.out.println("result : " + result + " i : " + i);
			}
		}catch(Exception e) {
			//������ �߻��Ǹ� �߻���ü�� �ּҸ� �޾Ƽ� ���� �м� .....
			System.out.println("������ �߻� �����ڿ��� �������� ���� �߼�");
			System.out.println("���� : " + e.getMessage());
			//catch(Exception e) ���ٴ� ��ü���� ��ü ����ϴ� �������� �����Ѵ�.
		}
		
		System.out.println("main end");
	}

}
