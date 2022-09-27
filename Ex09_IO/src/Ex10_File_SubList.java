import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex10_File_SubList {
	static int totalfiles=0; //파일개수
	static int totaldirs=0; //폴더개수
	
	static void printFileList(File dir) {
		System.out.println("Full Path : " + dir.getAbsolutePath());
		
		//코드 .... 자유......
		List<Integer> subdir = new ArrayList<Integer>();
		File[] files = dir.listFiles(); //하위 자원 정보 전부를 받음
		//[0] > a.txt  >> 각 방의 타입은 File 타입
		//[1] > aaa폴더
		//[2] > bbb폴더
		//[3] > java.jpg
		
		for(int i = 0 ; i < files.length ; i++) {
			System.out.println("무엇이 출력이될까???");
			System.out.println(files[i]);
			String filename = files[i].getName(); //폴더명 or 파일명
			if(files[i].isDirectory()) { //폴더라면
				filename = "[ DIR ]" + filename;
				//폴더의 위치값을 넣을꺼다??
				subdir.add(i); 
			}else {
				filename = filename + " / " + files[i].length() + "byte";
			}
		}
		
		//폴더의 개수
		int dirnum = subdir.size(); //현재 주어진 폴더의 하위 폴더 개수
		int filenum = files.length - dirnum;
		
		//누적개수 (하위 폴더 안에 자원)
		totaldirs+=dirnum; //총 누적 폴더 개수(하위 하위까지)
		totalfiles+=filenum; //총 누적 파일 개수(하위 하위까지)
		
		System.out.println("[Current DirNum] : " + dirnum);
		System.out.println("[Current FileNum] : " + filenum);
		System.out.println("*****************************************");
		
		//하위 폴더의 다시 하위를 쭉 조회
		for(int i = 0 ; i < subdir.size() ; i++) {
			int index = subdir.get(i); // 폴더의 방 위치값
			//한줄의 코드
			printFileList(files[index]);
		}
	}
	
	public static void main(String[] args) {
		if(args.length != 1) { //어떠한값도 입력된게 없음 ....>>>경로같은.....
			System.out.println("사용법:java [실행할파일명] [경로명]");
			System.out.println("예시 : java Ex10_File_Sub C:\\KOSA_IT\\Temp");
			System.exit(0);
		}
		File f = new File(args[0]); // parameter를 준다면 args[0]에  C:\KOSA_IT\Temp 가 있다.
		
		if(!f.exists() || !f.isDirectory()) {
			//존재하지 않거나 또는 디렉토리가 아니라면
			System.out.println("유효하지 않은 디렉토리");
			System.exit(0);
		}
		//정상적인 경로 그리고 폴더구나 ....
		printFileList(f); //재귀중....
		//하위 폴더 안까지의 폴더 개수, 파일 개수 누적
		System.out.println("누적 총 파일수 : " + totalfiles);
		System.out.println("누적 총 폴더수 : " + totaldirs);
	}

}
