package sec2;

public class LombokExam1 {
	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("cwj");
		mem1.setPw("1212");
		mem1.setPoint(20);
		System.out.println(mem1.toString());
		
		Board b1 = new Board();
		b1.setBno(1);
		b1.setTitle("java11");
		b1.setContent("eclipse");
		b1.setViewCnt(11);
	}
}
