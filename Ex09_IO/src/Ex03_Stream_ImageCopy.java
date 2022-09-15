import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_Stream_ImageCopy {

	public static void main(String[] args) {
		String orifile = "C:\\KOSA_IT\\Temp\\test.jpg";
		String targetfile = "copy.jpg";
		//defalut ��� : ���� ���� �ڵ� ���� java ������Ʈ �ִ� ������ 
		
		
		FileInputStream fs = null;
		FileOutputStream fos = null;
		
		try {
			fs = new FileInputStream(orifile);
			fos = new FileOutputStream(targetfile,false);
			
			int data = 0;
			while((data=fs.read()) != -1) {
				System.out.println(data);
				fos.write(data);
			}
		} catch (Exception e) {
		}finally {
			try {
				fs.close();
				fos.close();				
			} catch (Exception e2) {
			
			}
		}
	}

}
