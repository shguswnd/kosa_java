import java.util.Scanner;
class Lotto{
	Scanner scanner = new Scanner(System.in);
	private int [] lotto = new int[6];

	/*=============================���α׷� ����=============================*/
	void start() {
		switch(displayMenu()) {
		case 1 : draw();
		break;
		case 2 : exemptionNum();
		break;
		case 3 : exemptionEvenNum();
		break;
		case 4 : System.out.println("���α׷��� �����մϴ�.");
		 System.exit(0);
		}
	}
	
//	public static void throwExample() throw Exception{
//		throw new Exception("test");
//	}
	
	
	/*=============================�ʱ�޴�=============================*/
	int displayMenu() {
		scanner = new Scanner(System.in);
		
		int input = 0;
		do {
			try {
				System.out.println("**************************************");
				System.out.println("**************************************");
				System.out.println("***  *******    ****       ***       ***      ***");
				System.out.println("***  ******  **  ****  ******  ****  **  ***");
				System.out.println("***  ******   *   ****  ******  ****   *  ***");
				System.out.println("***       ****    *****  ******  *****    ****");
				System.out.println("**************************************");
				System.out.println("******�ζ� ��÷ ���α׷��� ���Ű� ȯ���մϴ�.******");
				System.out.println("**********���Ͻô� �޴��� ������************");
				System.out.println("***************************************");
				System.out.println("1. ��÷����");
				System.out.println();
				System.out.println("2. ���� ��ȣ ����");
				System.out.println();
				System.out.println("3. ¦�� ��ȣ ���� ");
				System.out.println();
				System.out.println("4. ���α׷� ����");
				
				input = Integer.parseInt(scanner.nextLine()); //1 or 2 �Է� 
				if(input >= 1 && input <= 4) {
					break; //do~while Ż��
				}else {
					//1���� �۰�  4 ���� ū�� 
					//���� ���� ������ �ƴ����� (���ܰ� �ƴ�����) 
					//�̷� ��Ȳ�� ���ܸ� ���� �� �־��
					throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
				}
			}catch (Exception e) {
				System.out.println(e);
				System.out.println("�������� : " + e.getMessage());
				System.out.println("�޴� ���� ���� �߻�");
				System.out.println("1~4���� ��ȣ�� �Է����ּ���");
			}
		}while(true);
		
		//1~4���� �� �ϳ��� �����ߴٸ�
		//scanner.close();
		return input;
	}
	
	
		//��� ����
	void draw() {
		System.out.println("��÷");
		this.lotto = distinct();
		print(lotto);
	}
	void exemptionNum() {
		System.out.println("���ܹ�ȣ ����");
		this.lotto = event2();
		print(lotto);
	}
	
	void exemptionEvenNum() {
		System.out.println("Ȧ�� ��ȣ �ζ� ����");
		this.lotto = event_number();
		print(lotto);
	}
	

	
	void print(int [] lotto) {
		for(int value : lotto)
			System.out.printf("[%d] ", value);
	}
	
	// �����Լ�
	int randomnum() { //���� ���� �޼ҵ�
		return (int) (Math.random() *(45 - 1 + 1))+1;
	}
	
	
	// �ߺ�����
	boolean verify(int[] copy, int num) { //Checking overlapped value method verify
		for (int i = 0; i < copy.length ; i ++) { //Repeating uppor checking until the 6 randomnumber is out
			if (num == copy[i] ) {
				return false;
			} 
		} return true;
	}
	 
	// �ߺ�����
	int [] distinct() {
		// Checking randomnum 1~45
		int num = randomnum(); 
		// Creating array object having length of 6
		int[] lottery = new int[6];
		
		for (int i = 0; i <lottery.length ; i++) {
			while (true) { //Just reaptigng without any conditions(Infinite loop)
				num = randomnum();
				
				if (verify(lottery, num)) { //if this condition is true, conducting code proceeds.
					lottery[i] = num;
					break;}
					// if upper condition is false, out of this conducting code is proceeded.
				}
			} 
			
		return 	lottery;
	}					
	
	/*=============================EVENT=============================*/
	
	////// ��ȣ ����.

	boolean event2Verify(int a, int b, int[] arr) { //���� �Է��� 2�� ��ȣ�� �������� �ʴ´�
		
		boolean flag = true;
		for(int value : arr) {
			if(value == a || value == b) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	//////��ȣ ����.
	public int[] event2() {
		scanner = new Scanner(System.in);
		System.out.print("������ ��ȣ�� �� �� �Է��ϼ��� >>");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int[] arr = new int[6];
		while(true) {
			arr = distinct();
			if(event2Verify(a, b, arr))
				break;
		}
		return arr;
	}

	
	// Ȧ�� �ζ� ��ȣ
	
	int [] event_number(){
		int cnt = randomnum();
		int i = 0;
		while(i<lotto.length) {			// while(1 < 6)
			if(cnt % 2 != 0) {		// �ʱ갪�� Ȧ����
				lotto[i] = cnt;			// Ȧ�� �־��ְ�
				i++;				// �� �������� �Ѿ��
				cnt = randomnum();	//���� ������ �����ֱ�
				}
			else {
				cnt = randomnum();	//¦���� �ʱ갪 �缳�� �� while ������
				}
		}
		return lotto;
	}
	
	 
	
	
}


public class Lotto_EXCUTE {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.start();
	}
}