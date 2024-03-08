package sec1;

import java.time.LocalDate;
import java.util.Date;

public class DateExam {
	public static void main(String[] args) {
		Date date1 = new Date();
		
		@SuppressWarnings("deprecation")
		Date date2 = new Date(1996,11,12,01,53, 55);
		
		@SuppressWarnings("deprecation")
		Date date3 = new Date("Thu, 12 Dec 1996 01:53:12 +0900");					//+0900 : 타임존
		//지역 이름(Global/Local) : KST, RFC822 : +0900
		//국가 코드: KR, 언어 코드 : KO => KO_KR
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		System.out.println("**** LocalDate ****");
		
		LocalDate now1 = LocalDate.now();
		System.out.println(now1);					//날짜 데이터
		//날짜 데이터 => 문자열 데이터
		String now2 = now1.toString();
		//문자열 데이터 => 날짜 데이터
		LocalDate now3 = LocalDate.parse(now2);
		System.out.println(now3);
	}
}
