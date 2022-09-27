package Book;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//도서 관리자 클래스

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookManager {
	private String filename = "C:\\KOSA_IT\\Temp\\Book\\BookData.txt";

	private FileOutputStream fos;
	private BufferedOutputStream bos;
	private ObjectOutputStream out;
	
	private FileInputStream fis;
	private BufferedInputStream bis;
	private ObjectInputStream in;
	
	Scanner scan = new Scanner(System.in);

	static Map<String, Book> book_dic = new HashMap<String, Book>();

	public void Run() {

		int key = 0;

		while ((key = selectMenu()) != 0) {

			switch (key) {

			case 1:
				addBook();
				break;

			case 2:
				removeBook();
				break;

			case 3:
				searchBook();
				break;

			case 4:
				listBook();
				//read();
				break;

			case 5:
				listISBN();
				break;
			case 6:
				save();
				break;
			case 7:
				read();
				break;
			default:
				System.out.println("잘못 선택하였습니다.");
				break;

			}

		}

		System.out.println("종료합니다...");

	}

	int selectMenu() {

		System.out.println("1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록0:종료");

		int key = scan.nextInt();

		scan.nextLine();

		return key;

	}

	void addBook() {

		String isbn;

		System.out.print("추가할 도서 ISBN:");

		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {

			System.out.println("이미 존재하는 ISBN입니다.");

			return;

		}

		String title;

		int price;

		System.out.print("도서 제목:");

		title = scan.nextLine();

		System.out.print("가격:");

		price = scan.nextInt();

		scan.nextLine();

		Book book = new Book(isbn, title, price);
		
		book_dic.put(isbn, book);
		//save(book_dic);
		
		System.out.println(book.toString() + " 생성하였습니다.");

	}
	
	void save()
	{		
		try {
			fos = new FileOutputStream(filename);
			bos = new BufferedOutputStream(fos);
			out = new ObjectOutputStream(bos);
			out.writeObject(book_dic);
		
		} catch (Exception e) {
			System.out.println("에러발생");
		}finally {
			try {
				out.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	void read() {
		try {
			System.out.println("도서 목록");
			
			fis = new FileInputStream(filename);
		    bis = new BufferedInputStream(fis);
			in = new ObjectInputStream(bis);
			
			book_dic = (HashMap)in.readObject();
			
			Set<String> set = book_dic.keySet();
			System.out.println();
			for(String value : set) {
				System.out.println(value);
				String isbn = book_dic.get(value).getIsbn();
				String title = book_dic.get(value).getTitle();
				int price = book_dic.get(value).getPrice();
				System.out.printf("[Key : %s,  ISBN : %s  NAME : %s    PRICE : %d]\n",value, isbn, title, price);
			}
			in.close();
			bis.close();
			fis.close();
				
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch (EOFException e) {
			System.out.println("끝 " + e.getMessage());
		}catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}catch (ClassNotFoundException e) {
			System.out.println("해당 객체가 존재하지 않습니다.");
		}catch (Exception e) {
			System.out.println("개발자가 예측하지 못한 나머지 예외 전부 : " + e.getMessage());
		}finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	void removeBook() {

		String isbn;

		System.out.print("삭제할 도서 ISBN:");

		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {

			book_dic.remove(isbn);

			System.out.println("삭제하였습니다.");

		}

		else {

			System.out.println("존재하지 않습니다.");

		}

	}

	void searchBook() {

		String isbn;

		System.out.print("검색할 도서 ISBN:");

		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {

			Book book = book_dic.get(isbn);
			System.out.println("검색 결과>>" + book.toString());

		}

		else {

			System.out.println("존재하지 않습니다.");

		}

	}

	void listBook() {

	
		int cnt = book_dic.size();

		System.out.println("도서 수:" + cnt);

		for (Book book : book_dic.values()) {

			System.out.println(book.toString());

		}

	}

	void listISBN() {

		System.out.println("ISBN 목록");

		int cnt = book_dic.size();

		System.out.println("도서 수:" + cnt);

		for (String isbn : book_dic.keySet()) {

			System.out.println(isbn);

		}

	}

}