package kr.koreait.bookShop;

import java.util.Date;

public class BookShop {
	public static void main(String[] args) {
		
		BookList bookList = new BookList();
		
		BookVO book1 = new BookVO("자바", "홍길동", "코리아출판사", new Date(2015, 5, 15), 35000);
		BookVO book2 = new BookVO("자바", "홍길자", "코리아출판사", new Date(2015, 5, 15), 35000);
		BookVO book3 = new BookVO("자바", "홍길희", "코리아출판사", new Date(2015, 5, 15), 35000);
		BookVO book4 = new BookVO("자바", "홍길숙", "코리아출판사", new Date(2015, 5, 15), 35000);
		BookVO book5 = new BookVO("자바", "홍길영", "코리아출판사", new Date(2015, 5, 15), 35000);
		BookVO book6 = new BookVO("자바", "홍길수", "코리아출판사", new Date(2015, 5, 15), 35000);
		BookVO book7 = new BookVO("자바", "홍길현", "코리아출판사", new Date(2015, 5, 15), 35000);
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		bookList.addBook(book6);
		bookList.addBook(book7);
		
		System.out.println(bookList);
	}
}
