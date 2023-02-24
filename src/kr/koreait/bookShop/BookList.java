package kr.koreait.bookShop;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class BookList {

	private ArrayList<BookVO> bookList = new ArrayList<>(); // ���� ���� å ������ ����� ArrayList

	public ArrayList<BookVO> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<BookVO> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		String str = "";
		str += "========================================\n";
		str += " ������ ���ڸ� ���ǻ�� ������ ���� \n";
		str += "========================================\n";

		double total = 0.0;
////		ArrayList�� ����� �������� ������ŭ �ݺ��Ѵ�
//		for (int i = 0; i < bookList.size(); i++) {
//			str += bookList.get(i) + "\n";
//			total += bookList.get(i).getPrice();
//		}
		
//		���� for : �迭�̳� ArrayList�� ����� ������ 0��° ������ ������ ������ ��ü�� ó���� �� ����ϸ� ȿ����
//		for(�迭�̳� ArrayList�� �ڷ��� ������ : �迭�̳� ArrayList �̸�) {
//			�ݺ��ؼ� ������ ����;
//			...
//		}
		
		for(BookVO book : bookList) {
			str += book + "\n";
			total += book.getPrice();
		}
		str += "========================================\n";
		DecimalFormat df = new DecimalFormat("#,##0��");
		str += "�հ� �ݾ� : " + df.format(total) + "\n";
		str += "========================================\n";
		return str;
	}

//	bookList�� BookVO Ŭ���� ��ü�� �����ϴ� �޼ҵ�
	public void addBook(BookVO book) {
		bookList.add(book);
	}
}
