import java.io.IOException;

/*
 try{
 
 }catch(Exception e){
 	
 }finally{
 	���������� ����Ǵ� ��
 }
 
 ���� ���ܰ� �߻��ϴ�, ���ܰ� �߻����� �ʴ� ���������� ����Ǿ�� �Ǵ� ������ ������ �ִ�.
 
 >>���� CD ��ġ PC
 >>1. ��ġ���� >> C:\Temp >> ����
 >>2. ������ ���� >> ���α׷� ��ġ
 >>3. ���� ��ġ >> C:\Temp ������ ���� ����
 >>4. ������ ��ġ >> ���� ���� >> ������ ���� ����
 */
public class Ex03_finaaly {
	
	static void startInstall() {
		System.out.println("copy files");
	}
	
	static void copyFiles() {
		System.out.println("install");
	}
	static void fileDelete() {
		System.out.println("file delete");
	}
	
	//������ ���ܴ� �ƴ�����
	//�����ڰ� �ʿ信 ���� � ��Ȳ�� ������ ��Ȳ�̶�� �����ϰ� ���ܸ� �߻�.
	//����� ���� ����ó��.
	//throw new IOException
	public static void main(String[] args) {
		try {
			copyFiles();
			startInstall();
			//throw new IOException("install ������ �߻�....."); 
		}catch(Exception e) {
			System.out.println("���� �޼��� ��� : " + e.getMessage());
		}finally { //���� ���� �� ���� �߻����� ����ǰ�, �������̿��� ����.
			//�Լ��� ���� ������ return ������ finally�� ���� ����Ǿ� ó����.
			//��� ��Ȳ�� ������ ������ �ȴ�.
			fileDelete();			
		}
			

	}

}
