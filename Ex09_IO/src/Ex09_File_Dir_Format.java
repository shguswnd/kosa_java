import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_File_Dir_Format {

	public static void main(String[] args) {
		File dir = new File("C:\\KOSA_IT\\Temp");
		File[] files = dir.listFiles();
		
		for(int i = 0 ; i < files.length ; i++) {
			File file = files[i];
			
			String name = file.getName(); //폴더명일수도 파일명일수도.
			SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH-mma");
			String attribute = "";
			String size = "";
			
			if(files[i].isDirectory()) { //폴더니 질문
				attribute="< DIR >";
			}else { // 다 파일 (1.jpg, data.txt ....
				size = file.length() + "byte";
				attribute = file.canRead() ? "R" : ""; //읽을수 있냐
				attribute += file.canWrite() ? "W" :""; //쓸수있냐
				attribute += file.isHidden() ? "H" : ""; //숨겨졌냐?
			
			}
			System.out.printf("%s  %3s  %10s  %s \n", 
					dt.format(new Date(file.lastModified())),
					attribute,
					size,
					name);
		}

	}

}
