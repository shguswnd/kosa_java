import java.io.File;

public class Ex08_File_Dir {

	public static void main(String[] args) {
		
		String test = "asd";
		for(int i =0 ; i < test.length() ; i++) {
			System.out.println(test.charAt(i));
		}
//		System.out.println(args[0]);
		if(args.length != 1) {
			System.out.println("사용법 : java 파일명 [디렉토리명]");
			System.exit(0); //강제종료
		}
		
		File f = new File(args[0]);
		//java Ex08_File_Dir C:\\Temp
		if(!f.exists()|| !f.isDirectory()) {
			//둘중에 하나라도 만족하지 않으면
			//존재하지 않거나 또는 디렉토리가 아니라면
			System.out.println("유효하지 않은 경로입니다.");
			System.exit(0);
		}
		
		// cmd 창에서 먼저 현재 열린 파일의 경로를 cd로 bin 폴더로 들어가 "파일경로 + 내가 보고싶은 경로"를 입력하면 된다.
		//ex) java Ex08_File_Dir C:\KOSA_IT\Temp
		
		//실제 존재하는 경로이고 제시한것이 폴더라면
		//POINT
		File[] files = f.listFiles();
		System.out.println(files.length);
		
		for(int i = 0 ; i < files.length ; i++) {
			String name = files[i].getName();
			System.out.println(files[i].isDirectory() ? "[DIR]" + name : name);
		}
	}

}
