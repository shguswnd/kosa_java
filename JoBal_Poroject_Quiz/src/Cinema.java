import java.util.Scanner;
public class Cinema {
static Scanner scanner = new Scanner(System.in); 
static String[][] seatArr = new String[4][5];
private int Row, Column;


/*====================�¼� �ʱ�ȭ(������)====================*/
public void init() {
	for(int i=0;i<seatArr.length;i++) {
		for(int j=0;j<seatArr[i].length;j++) {
			seatArr[i][j] = i+1 + "-" + ((int)j+1);
		}
	}
}


/*====================����====================*/
	void start() {
		while(true)
		
			switch (displayMenu ()) {
			case 1: reservation ();
			break;
			case 2: checkReservation ();
			break;
			case 3: cancelReservation ();
			break;
			case 4:
				System.exit(0);
			break;
		}
		}
	

	/*====================��� ����====================*/
	void reservation () {
		System.out.println("�����ϱ�");
		booking();

	}
	
	void checkReservation () {
		System.out.println("������ȸ");
		showSeat();
	}
	
	void cancelReservation () {
		System.out.println("�������");
		delete();
	}
	
	int displayMenu (){

		int input = 0; 
			
					try {
						System.out.println("*****************************");
						System.out.println("******* ��ȭ ���� �ý��� *******");
						System.out.println("*****************************");
						System.out.println("******* �޴��� �����ϼ��� *******");
						System.out.println("*****************************");
						System.out.println("1. �����ϱ�");
						System.out.println();
						System.out.println("2. ������ȸ");
						System.out.println();
						System.out.println("3. �������");
						System.out.println();
						System.out.println("4. ���α׷�����");
						System.out.println();
						
						input = Integer.parseInt(scanner.next()); // ���ϴ� �޴���ȣ �Է�
						if (input >=1 && input <=4) //�Է��� �� input �� 1�� 6������ ���̸�
						{
							return input; //do~while�� Ż��
						}
						else { //input�� 1�� 6������ ���� �ƴϸ�
							//throw new Exception("�޴� ���� ��ȣ�� �߸��Ǿ����ϴ�"); // ���� ó�� Ŭ���� Exception
						}// else �� ��
					} // try �� ��
					catch (Exception e) { // try �ȿ��� ������ ����(������ ���� ��Ȳ: input �� 1~6 ������ int�� �ƴ� ���) �����߻� ������ �ּҸ� parameter 'e'�� ������
//						System.out.println("���� �߻� ����: " + e.getMessage()); // e.getMessage() : 
//						System.out.println("1~3������ �޴� ��ȣ �� �ϳ��� �Է��� �ּ���");
	
					}
			
	// 1~3�� �ϳ��� �����ߴٸ�
	 return input; 
	 
	}

	
	
	/*====================����====================*/
	
	public void booking() {
		while (true) {
			System.out.print("�����ϰ��� �ϴ� �¼� ��ȣ(��, ��)�� �Է��ϼ���...>>");
			int x = scanner.nextInt() - 1;
			int y = scanner.nextInt() - 1;
			
			if (seatArr[x][y] == "����") {
				System.out.println("�̹� ���ŵ� �ڸ��Դϴ�.");
				return;
			} else {
				System.out.print("�����Ͻðڽ��ϱ�? (1)�� (2)�ٸ��¼������ϱ� (3)�ʱ�ȭ������ ���ư���>>");
				int answer = scanner.nextInt();

				switch (answer) {
				case 1:
					seatArr[x][y] = "����";
					System.out.printf("���Ű� �Ϸ�Ǿ����ϴ�... [%d-%d]\n", x + 1, y + 1);
					//showSeat();
					return;

				case 2:
					continue;
				case 3:
					return;
				}
			}
		}
	}
	
	
	
	/*====================�������====================*/
	public void delete() {
		showSeat();
		checknumber();
		checkSeat();
		}
	
	public void checknumber() {
		System.out.println("����� �¼��� �˷��ּ��� (���� �߰� ����)");
			int Row = (scanner.nextInt()-1);
			int Column = (scanner.nextInt()-1);
			if(seatArr.length > Row && seatArr[0].length > Column) {
				this.Row = Row;
				this.Column = Column;
			}
			else {
				System.out.println("�����ڸ��Դϴ�. �ٽ� ���ּ���.");
				checknumber();
				return;
			}
	}
		
	public void checkSeat() {
		
			boolean i = seatArr[this.Row][this.Column].equals("����");
			if(i != true) {
				System.out.println("�� �¼��Դϴ�.");
			} else {
				System.out.println("������� �Ϸ� �Ǿ����ϴ�.");
				seatArr[this.Row][this.Column] = Row + 1 + "-" + ((int)Column+ 1);
			}
	}
	
	
	public void Init() {
		for(int i=0;i<seatArr.length;i++) {
			for(int j=0;j<seatArr[i].length;j++) {
				seatArr[i][j] = i+1 + "-" + ((int)j+1);
			}
		}
	}
	
	public void showSeat() {
		System.out.println("�� �¼� �����Դϴ�.");
		for(int i=0;i<seatArr.length;i++) {
			for(int j=0;j<seatArr[i].length;j++) {
				System.out.print("["+seatArr[i][j]+ "]");
			}
			System.out.println();
		}
	}
	
	
	


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cinema seatReservation = new Cinema();
		seatReservation.init();
		seatReservation.start();
	}

}
