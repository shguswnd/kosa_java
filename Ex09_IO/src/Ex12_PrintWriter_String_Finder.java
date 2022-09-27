import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex12_PrintWriter_String_Finder {
	String baseDir = "C:\\KOSA_IT\\Temp"; //검색할 디렉토리
	String word = "Hello"; //검색할 단어
	String savetxt = "C:\\KOSA_IT\\Temp\\result.txt"; //Hello단어가 들어있는 파일 정보 저장
	
	void Find() throws IOException{ //Find 함수 사용시 try ... 예외처리 강제
		File dir = new File(baseDir);
		if(!dir.isDirectory()) {
			System.out.println("유효한 폴더 아니예요.");
			System.exit(0);
		}
		
		PrintWriter writer = new PrintWriter(new FileWriter(savetxt));
		BufferedReader br = null;
		
		File[] files = dir.listFiles();
		for(int i = 0 ; i < files.length ; i++) {
			if(!files[i].isFile()) { //파일이 아니라면
				continue; //skip 아래 코드 무시.......
			}//파일이면
			br = new BufferedReader(new FileReader(files[i]));
			
			//a.txt
			//a.txt 한문장씩 read (한줄)
			String line = "";
			while((line = br.readLine()) != null) {
				//단어검색
				if(line.indexOf(word) != -1) {
					//a.txt가 한줄씩 읽으면서 그문장안에 hello 단어가 하나라도 있다면
					writer.write("word = " + files[i].getAbsolutePath() + "\n");
					//경로를 저장할꺼임.
				}
			}
			writer.flush();
		}
		br.close();
		writer.close();
	}
	public static void main(String[] args) {
		Ex12_PrintWriter_String_Finder finder = new Ex12_PrintWriter_String_Finder();
		//finder.Find();//그냥쓰면 예외처리땜에 try~ catch를 쓰도록 강제 시킨다.
		
		try {
			finder.Find();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
