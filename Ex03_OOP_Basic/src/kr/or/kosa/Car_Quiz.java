package kr.or.kosa;

public class Car_Quiz {
	private int door;
	private String color;
	
	public Car_Quiz() {
		this.door = 4;
		this.color = "red";
	}
	public Car_Quiz(int door) {
		this.door = door;
		this.color = "red";
	}
	public Car_Quiz(String color) {
		this.door = 4;
		this.color = color;
	}
	public Car_Quiz(int door, String color)
	{
		this.door = door;
		this.color = color;
	}
	public void print()
	{
		System.out.printf("�ڵ��� ������ : %s, �ڵ��� �� ������ %d �Դϴ�\n", color, door);
	}
}