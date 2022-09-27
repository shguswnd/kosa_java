import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex14_DataInputStream {

	public static void main(String[] args) {
		//파일 학생 점수 기록
		//read 합계, 평균
		FileInputStream fis = null;
		DataInputStream dis = null;
		String path = "C:\\KOSA_IT\\Temp\\score.txt";
		int sum=0;
		Double average=0.0;
		try {
			fis = new FileInputStream(path);
			dis = new DataInputStream(fis);
			
			int data;
			
			
			int cnt=0;
			while((data = dis.readInt()) != -1) {
				sum +=data;
				cnt++;
				System.out.println("asd");
			}
			System.out.println("data");
//			average = (double)sum/cnt;
			System.out.printf("합계 : %d 평균 : %f", sum, average);
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않아요");
		}catch (EOFException e) {
			System.out.println("끝 " + e.getMessage());
		}catch (IOException e) {
			System.out.println("파일을 읽을 수 없어요.");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			try {
				System.out.printf("합계 : %d 평균 : %f", sum, average);
				dis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
