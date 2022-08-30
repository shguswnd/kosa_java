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
		System.out.println("책이름 : " + this.name);
	}
	public void bookDollor() {
		System.out.println("가격 : " + this.dollor);
	}
	
	public String getBname() {
		return name;
	}
	public int getPrice()
	{
		return dollor;
	}
}
