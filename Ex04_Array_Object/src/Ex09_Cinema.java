
public class Ex09_Cinema {

	public static void main(String[] args) {
		String[][] seat = new String[3][5];
		
		for(int i = 0 ; i < seat.length ; i++)
		{
			for(int j = 0 ; j < seat[i].length ; j++)
			{
				seat[i][j] = "__";
			}
		}
		
		//예매
		seat[2][1] = "홍길동";
		seat[0][0] = "김유신";
			
		for(String[] hak_value : seat)
		{
			for(String value : hak_value)
				System.out.printf("[%s]",value.equals("__") ? "좌석" : "예매");
			System.out.println();
		}
		
		//예매를 할려고 ... 그 좌석 예매 가능한지 ... 예매가 되었는지 알려주세요.
		
		int row, col;
		row = 1;
		col = 0;
		
		if(seat[row][col].equals("__")){
			System.out.println("예약 가능한 좌석 입니다.");
		}
		else {
			System.out.println("이미 예약 되었습니다.");
		}
		
		//모든 좌석 초기화 "__"
		
		for(int i = 0 ; i < seat.length ; i++)
		{
			for(int j = 0 ; j < seat[i].length ; j++)
			{
				seat[i][j] = "__";
			}
		}
		
	}
}
