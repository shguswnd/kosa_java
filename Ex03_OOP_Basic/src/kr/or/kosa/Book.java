package kr.or.kosa;

public class Book {
	private String name;
	private int dollor;
	
	
	public Book(String name, int dollor){
		this.name = name;
		this.dollor = dollor;
	}
	
	public void print() {
		bookName();
		bookDollor();
	}
	public void bookName() {
		System.out.println("å�̸� : " + this.name);
	}
	public void bookDollor() {
		System.out.println("���� : " + this.dollor);
	}
	
	public String getBname() {
		return name;
	}
	public int getPrice()
	{
		return dollor;
	}
}
