package kr.or.kosa.common;

public class Car {
		int i;	//�����Ϸ��� �ڵ����� default �� ����. (���� ��Ű���ȿ����� ��밡��) �տ� Ŭ������ public �̴�? 
		//default package �� Ex01_Main���� i�� ���Ұ�(default ���� ���� ����)
		public int window; // ���� ���� �ٸ� ������ ������� �� ��� �����ϴ�.
		private int door; // get(�б�),set(����)���� ��� >> ĸ��ȭ �� ���� ���ϰ� ���µ� �־���?
		
		//���������� ������ �������� �������� ���ٰ����ϰ�
		//setter, getter�� ����Ѵ�.
		
		public void setDoor(int d) {
			this.door = d; //����(������ �ڿ���)
		}
		public int getDoor() {
			return this.door;
		}

}
