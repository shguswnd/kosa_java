package kr.or.kosa;

public class Eggmayo {
	public int calories = 700;
	public int price = 3500;
	public int eggCount = 1;
	public int end = 0;
	
		public void printInfo() {
			System.out.println("���� ���׸��� ����");
			System.out.printf("Į�θ�: %d\n",calories);
			System.out.printf("���� : %d\n",price);
		}
	
		public void eggAdd(){
			if (calories <= 0) {
				System.out.println("�ߺ�! Į�θ��� 0�Դϴ�.");
			} else {
			calories += 100;
			price += 300;
			System.out.printf("���׸��� %d�� �߰��߽��ϴ�.\n",eggCount);
			eggCount++;
			eggWarning();
			}
		}
			
		public void eggSubtract(){
			if (calories <= 0) {
				System.out.println("�ߺ�! Į�θ��� 0�Դϴ�.");
			} else {
			calories -= 100;
			price -= 300;
			eggCount--;
			eggWarning();
			}
		}
		
		public void priceCheck(int User, int price) {
			if(User < price) {
				System.out.println("���� �� �߰����ּ���");
			} else {
				int a = Balance(User, price);
				System.out.printf("�ܵ� %d�� �Դϴ�.\n",a);
				System.out.println("�����մϴ�.");
				end = 1;
			}
		}
		
		public int Balance(int User, int price) {
			return User - price;
		}
		
		
		public void eggWarning() {
			if (eggCount >= 4) {
				eggCount--;
				System.out.println("�ִ� 3������ �Դϴ�.");
			}
			if (eggCount <= 0) {
				eggCount++;
				System.out.println("�ּ� 1���� �־���մϴ�.");
			}
		}
			
			
		
}
