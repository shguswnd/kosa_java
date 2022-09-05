
import java.util.Scanner;
import java.io.FileInputStream;
public class Solution {

	static int AnswerN;
	static int N = 10;

	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		char[][] arr = null;
		int indexX=0;
		int indexY=0;
		int cnt=0;
		
		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			arr = new char[N][N];
			for(int x=0;x<N;x++)
			{
				for(int y=0;y<N;y++)
				{
					arr[x][y] = sc.next().charAt(0);
					if(arr[x][y] == 'X')
					{
						indexX = x;
						indexY = y;
					}
				}
			}
			//3 2 , 4 5, 2 3
			
			int X = indexX;
			int Y = indexY;
			cnt = 0 ;
//			X = 3;
//			Y = 2;
			while(Y+1<N) {  //오른쪽
				if(arr[X][Y+1]=='H')
				{
					Y++;
					cnt++;
				}
				else
					break;
			}
			X = indexX;
			Y = indexY;
//			X = 3;
//			Y = 2;
			while(Y-1>=0) { //왼쪽
				if(arr[X][Y-1]=='H')
				{
					Y--;
					cnt++;
				}
				else
					break;
			}
			
			X = indexX;
			Y = indexY;
//			X = 3;
//			Y = 2;
//			
			while(X-1>=0) { //위
				if(arr[X+1][Y]=='H')
				{
					X++;
					cnt++;
				}
				else
					break;
			}
			X = indexX;
			Y = indexY;
//			X = 3;
//			Y = 2;
			while(X+1<N) {//아래
				if(arr[X-1][Y]=='H')
				{
					X--;
					cnt++;
				}
				else
					break;
			}
			AnswerN = cnt;
			
			System.out.println("#"+test_case+" "+AnswerN);
		}
	}
}





