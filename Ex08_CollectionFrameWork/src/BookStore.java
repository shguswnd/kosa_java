import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Book{
	private int bookNumber;
	private String bookName;
	private int price;
	public Book(int bookNumber, String bookName, int price) {
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.price = price;
	}
	public int getBookNumber() {
		return bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "ISBN :" + bookNumber + " 이름 : " + bookName + " 가격 : " + price;
	}
	
}

class BookManager{
	Scanner scan = new Scanner(System.in);
	private Map<Integer, Book> book;
	private int bookNumber;
	private String bookName;
	private int price;
	
	
	public BookManager() {
		book = new HashMap<Integer, Book>();
		book.put(bookNumber, new Book(1, "1111", 11111));
		book.put(bookNumber, new Book(2, "2222", 22222));
		System.out.println(book.size());
	}
	public void start() {
		while(true) {
			System.out.println("1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 0:종료");
			int input = Integer.parseInt(scan.nextLine());
			switch (input) {
			case 1:
				add();
				break;
			case 2:
				remove();	
				break;
			case 3:
				search();
				break;
			case 4:
				bookList();
				break;
			case 5:
				ISBNList();
				break;
			case 0 : 
				return;
			default:
				System.out.println("다시입력하시오.");
			}
		}
	}
	public void add() {
		book = new  HashMap<Integer, Book>();
		System.out.println("추가할 도서 ISBN : ");
		bookNumber = Integer.parseInt(scan.nextLine());
		System.out.println("도서 제목 : ");
		bookName = scan.nextLine();
		System.out.println("가격 : ");
		price = Integer.parseInt(scan.nextLine());
		
		book.put(bookNumber, new Book(bookNumber, bookName, price));
	}
	public void remove() {
		System.out.println("삭제할 도서 ISBN : ");
		System.out.println(book.remove(book));
	}
	public void search() {
		
	}
	public void bookList() {
		System.out.print("도서수 : ");
		System.out.println(book.size());
		for(Map.Entry m : book.entrySet()) {
			System.out.println(m.getValue());
			//System.out.println("ISBN:" + m.getKey() + "이름:" + m.getValue());
		}
//		Map.Entry m : smap.entrySet()
//		while(it.hasNext())
//		{
//			System.out.println(it.next().toString());
//		}
		
	}
	public void ISBNList() {
		
	}
	
}
public class BookStore {

	public static void main(String[] args) {
		BookManager test = new BookManager();
		test.start();

	}

}
