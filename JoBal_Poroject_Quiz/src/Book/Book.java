package Book;

import java.io.Serializable;

//���� Ŭ����

public class Book implements Serializable {

      final String isbn;
      public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	String title;
      int price;

      public Book(String isbn, String title,int price){
             this.isbn = isbn;
             this.title = title;
             this.price = price;
      }

      public String ISBN(){
             return isbn;
      }

      public String toString(){
             return String.format("ISBN:%s �̸�:%s ����:%d", isbn, title,price);        }
}
