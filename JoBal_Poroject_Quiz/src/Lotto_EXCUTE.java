import java.util.Scanner;
class Lotto{
	Scanner scanner = new Scanner(System.in);
	private int [] lotto = new int[6];

	/*=============================프로그램 시작=============================*/
	void start() {
		switch(displayMenu()) {
		case 1 : draw();
		break;
		case 2 : exemptionNum();
		break;
		case 3 : exemptionEvenNum();
		break;
		case 4 : System.out.println("프로그램을 종료합니다.");
		 System.exit(0);
		}
	}
	
//	public static void throwExample() throw Exception{
//		throw new Exception("test");
//	}
	
	
	/*=============================초기메뉴=============================*/
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
				System.out.println("******로또 추첨 프로그램에 오신걸 환영합니다.******");
				System.out.println("**********원하시는 메뉴를 고르세요************");
				System.out.println("***************************************");
				System.out.println("1. 추첨시작");
				System.out.println();
				System.out.println("2. 제외 번호 설정");
				System.out.println();
				System.out.println("3. 짝수 번호 제외 ");
				System.out.println();
				System.out.println("4. 프로그램 종료");
				
				input = Integer.parseInt(scanner.nextLine()); //1 or 2 입력 
				if(input >= 1 && input <= 4) {
					break; //do~while 탈출
				}else {
					//1보다 작고  4 보다 큰값 
					//나는 실제 오류가 아니지만 (예외가 아니지만) 
					//이런 상황을 예외를 만들 수 있어요
					throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
				}
			}catch (Exception e) {
				System.out.println(e);
				System.out.println("원인파일 : " + e.getMessage());
				System.out.println("메뉴 선택 문제 발생");
				System.out.println("1~4까지 번호만 입력해주세요");
			}
		}while(true);
		
		//1~4까지 중 하나를 선택했다면
		//scanner.close();
		return input;
	}
	
	
		//기능 정의
	void draw() {
		System.out.println("추첨");
		this.lotto = distinct();
		print(lotto);
	}
	void exemptionNum() {
		System.out.println("제외번호 설정");
		this.lotto = event2();
		print(lotto);
	}
	
	void exemptionEvenNum() {
		System.out.println("홀수 번호 로또 설정");
		this.lotto = event_number();
		print(lotto);
	}
	

	
	void print(int [] lotto) {
		for(int value : lotto)
			System.out.printf("[%d] ", value);
	}
	
	// 랜덤함수
	int randomnum() { //난수 생성 메소드
		return (int) (Math.random() *(45 - 1 + 1))+1;
	}
	
	
	// 중복제거
	boolean verify(int[] copy, int num) { //Checking overlapped value method verify
		for (int i = 0; i < copy.length ; i ++) { //Repeating uppor checking until the 6 randomnumber is out
			if (num == copy[i] ) {
				return false;
			} 
		} return true;
	}
	static int[] bubbleSort(int[] arr) {
		int length = arr.length;
		int temp = 0;
//		System.out.print("초기값");
//		System.out.println(Arrays.toString(arr));
		for(int i = 0; i<length; i++) {
			for(int j = 0; j<length-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
//				System.out.println("정렬중..." + Arrays.toString(arr) + " ["+j+"]");
			}
//			System.out.println(Arrays.toString(arr));
		}
		
		return arr;
	}
	 
	// 중복제거
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
					break;
					}
					// if upper condition is false, out of this conducting code is proceeded.
				}
			} 
		bubbleSort(lottery);	
		return 	lottery;
	}					
	
	/*=============================EVENT=============================*/
	
	////// 번호 제외.

	boolean event2Verify(int a, int b, int[] arr) { //내가 입력한 2개 번호는 추출하지 않는다
		
		boolean flag = true;
		for(int value : arr) {
			if(value == a || value == b) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	//////번호 제외.
	public int[] event2() {
		scanner = new Scanner(System.in);
		System.out.print("제외할 번호를 두 개 입력하세요 >>");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int[] arr = new int[6];
		while(true) {
			arr = distinct();
			if(event2Verify(a, b, arr))
				break;
		}
		bubbleSort(arr);
		return arr;
	}

	
	// 홀수 로또 번호
	
	int [] event_number(){
		int cnt = randomnum();
		int i = 0;
		while(i<lotto.length) {			// while(1 < 6)
			if(cnt % 2 != 0) {		// 초깃값이 홀수면
				lotto[i] = cnt;			// 홀수 넣어주고
				i++;				// 그 다음으로 넘어가고
				cnt = randomnum();	//다음 랜덤수 돌려주기
				}
			else {
				cnt = randomnum();	//짝수면 초깃값 재설정 후 while 돌리기
				}
		}
		bubbleSort(lotto);
		return lotto;
	}
	
	
	//[2020년08월11일 14:23]
	void Read() {
		
	}
	void Write() {
		
	}
	
	
}


public class Lotto_EXCUTE {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.start();
	}
}