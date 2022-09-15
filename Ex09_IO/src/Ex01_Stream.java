import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
 IO
 
 Stream(���) : xxxInputStream/xxxOutputStream >>> �̹���, ����(���̳ʸ� ������) <> ����
 
 Java API
 [Byte] ������ ������ IO 
 
 �߻�Ŭ����
 InputStream, OutputStream
 
 ����� Byte ���̹� �۾��� �Ҷ�
 [�Է� InputStream] ��ӹ޴� Ŭ���� ��� : ���
 [��� OutputStream]
 ���
 1. Memory : ByteArrayInputStream/ByteArrayOutStream...... 
 2. File : FileInputStream/FileOutPutStream
 
 xxxReader/xxWriter
 */
public class Ex01_Stream {

	public static void main(String[] args) {
		//byte (-128 ~ 127) ���� ���� Ÿ��
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null; // ���� �޸𸮸� ������ ���� �ʴ�.
		
		//������ read, write �ϴ� ��� memory
		ByteArrayInputStream input = null; //���� (���) �Է�
		ByteArrayOutputStream output = null; //���� (���) ���
		
		input = new ByteArrayInputStream(inSrc); //inSrc ���(�迭�Ǹ޸𸮸�)���� ���� data > read >> ����� ���ڴ� �޸𸮷κ���
		output = new ByteArrayOutputStream(); // outSrc ���� ����� �� ������.
		
		System.out.println("outSrc before : " + Arrays.toString(outSrc));
		
		//���İ��� ����(�ϱ��ϱ�)
		
		int data = 0;
		while((data = input.read()) != -1) { // �� �̻� read �� �����Ͱ� ������ -1 
			//System.out.println("data : " + data);
//			System.out.println("input.read() : " + input.read());
			//�� 1,3,5,7,9 �� ���ñ�?
			//read() ��ü�� ���ο� next �� �־ Ŀ���� �ڵ����� �̵��� �ȴ�.
			
			//read �� �����͸� write
			output.write(data); //��� ��ξȿ� �����͸� ������ �ִ´�.
			//����� ���������� �����͸� ������ ���� �� �ִ�.
			//write ����� data�� �ƴϰ� ByteArrayOutputStream �ڽ��� ��ο� data ������ .....
		}
		
		outSrc = output.toByteArray(); //Byte[] �� ���� ��ȯ...(�ּҰ�)
		System.out.println("outSrc after : " + Arrays.toString(outSrc));
		
	}

}
