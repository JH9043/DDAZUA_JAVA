package day23;

public class MemoTest {
	public static void main(String[] args) {
		MemoVO vo1 = new MemoVO();
		MemoVO vo2 = new MemoVO("홍길동", true, "1등 입니다.");
		
		System.out.println(vo1);
		System.out.println(vo2.toString());
	}
}
