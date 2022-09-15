import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
 IO
 
 Stream(통로) : xxxInputStream/xxxOutputStream >>> 이미지, 파일(바이너리 데이터) <> 문자
 
 Java API
 [Byte] 단위의 데이터 IO 
 
 추상클래스
 InputStream, OutputStream
 
 당신이 Byte 데이버 작업을 할때
 [입력 InputStream] 상속받는 클래스 사용 : 대상
 [출력 OutputStream]
 대상
 1. Memory : ByteArrayInputStream/ByteArrayOutStream...... 
 2. File : FileInputStream/FileOutPutStream
 
 xxxReader/xxWriter
 */
public class Ex01_Stream {

	public static void main(String[] args) {
		//byte (-128 ~ 127) 정수 저장 타입
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null; // 현재 메모리를 가지고 있지 않다.
		
		//데이터 read, write 하는 대상 memory
		ByteArrayInputStream input = null; //빨대 (통로) 입력
		ByteArrayOutputStream output = null; //빨대 (통로) 출력
		
		input = new ByteArrayInputStream(inSrc); //inSrc 대상(배열의메모리를)으로 부터 data > read >> 대상을 빨겠다 메모리로부터
		output = new ByteArrayOutputStream(); // outSrc 아직 대상이 안 정해짐.
		
		System.out.println("outSrc before : " + Arrays.toString(outSrc));
		
		//공식같은 로직(암기하기)
		
		int data = 0;
		while((data = input.read()) != -1) { // 더 이상 read 할 데이터가 없으면 -1 
			//System.out.println("data : " + data);
//			System.out.println("input.read() : " + input.read());
			//왜 1,3,5,7,9 만 나올까?
			//read() 자체가 내부에 next 가 있어서 커서가 자동으로 이동이 된다.
			
			//read 한 데이터를 write
			output.write(data); //출력 통로안에 데이터를 가지고 있는다.
			//출력은 내부적으로 데이터를 가지고 있을 수 있다.
			//write 대상이 data가 아니고 ByteArrayOutputStream 자신의 통로에 data 가지고 .....
		}
		
		outSrc = output.toByteArray(); //Byte[] 로 값을 전환...(주소값)
		System.out.println("outSrc after : " + Arrays.toString(outSrc));
		
	}

}
