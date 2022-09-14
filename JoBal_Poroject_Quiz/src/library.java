import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class BookManager{
	Scanner sc = new Scanner(System.in);
    Map<String,Book> Book;
        
    
    BookManager(){
    Book = new HashMap<String,Book>();
    }
    
    void Menu() {
       	while(true) {
       		System.out.println("1:�߰� 2:���� 3:�˻� 4:���� ��� 5:ISBN ��� 0:����");
        	int number = Integer.parseInt(sc.nextLine()); 
		switch (number) {
	case 1:
		addBook();
		break;
	
	case 2:
		remove();
		break;
		
	case 3:
		search();
		break;
		
	case 4:
		list();
		break;
	
	case 5:
		showISBN();
		break;
		
	case 0:
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(1);

	default:
		System.out.println("�߸��� �Է°��Դϴ�.");
		}
	
	}
}
    
    void addBook() {
    	String ISBN;
    	String name;
    	int price = 0;
    	sc.nextLine();
    	System.out.print("�߰��� ���� ISBN:");
    	ISBN = sc.nextLine();
    	
    	System.out.print("���� ����:");
    	name = sc.nextLine();

    	while(true) {
    		
	    	try {
	    		System.out.print("����:");
	        	price = sc.nextInt();
	        	break;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println(e.getMessage());
				
			}
	    	
	    	
    	}
    	
    	Book.put(ISBN, new Book(name, price));
    	
    	
    	System.out.println("ISBN:" + ISBN + " �̸�:" + name + " ����:" + price + " �����Ͽ����ϴ�. \n");
    }
    
    void remove() {
    	String ISBN;
    	
    	System.out.println("������ ���� ISBN:");
    	ISBN = sc.next();
    	Object value = Book.remove(ISBN);
    	
    	System.out.println("�����Ͽ����ϴ�.");
    	System.out.println();
    }
    
    void list() {
    	System.out.println("���� ���");
    	System.out.println("���� ��:" + Book.size());
    	
    	for(Map.Entry m : Book.entrySet()) {
			System.out.println("ISBN:" + m.getKey()+ " " + m.getValue());
		}
    	System.out.println();
    }
    
    void search() {
    	String ISBN;
    	
    	
    	System.out.print("�˻��� ���� ISBN:");
    	ISBN = sc.next();
    	
    	System.out.println();
    	System.out.print("�˻� ���>>");
    	System.out.println("ISBN:" + ISBN + " " + Book.get(ISBN));
    	System.out.println();
    }
    
    void showISBN() {
    	System.out.println("ISBN ���");
    	System.out.println("���� ��:" + Book.size());
    	
    	for(Map.Entry m : Book.entrySet()) {
			System.out.println(m.getKey());
		}
    	System.out.println();
    }
    
    
    
    
    
    

}

class Book{
	String book;
	int price;
	
	
	public Book(String book, int price) {
		super();
		this.book = book;
		this.price = price;
	}


	@Override
	public String toString() {
		return "�̸�:" + book + " ����:" + price;
	}
	
	
}


public class library {
    public static void main(String[] args) {
    	BookManager book = new BookManager();
    	book.Menu();
    }
}