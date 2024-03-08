package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExam2 {
	public static void main(String[] args) {

		String[] email = {"jwj4546", "jwj4546@naver", "wooji0607@gmail.com", "woojincho@abbott.com"};
		Pattern p1 = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-z]+$");					//이메일 패턴
		for(int i=0;i<email.length;i++) {
			Matcher m = p1.matcher(email[i]);
			if(m.matches()) {
				System.out.println("이메일 형식이 맞습니다.");
				System.out.println(email[i]);
			}
		}
		System.out.println();
		String[] phone = {"01033479535", "010-3347-9535", "010-3982-4154", "01097350234", "010-8836-9535"};
		Pattern p2 = Pattern.compile("010-\\d{3,4}-\\d{4}");					//휴대폰 번호 패턴
		for(int i=0;i<phone.length;i++) {
			Matcher m = p2.matcher(phone[i]);
			if(m.matches()) {
				System.out.println("휴대폰 번호 형식이 맞습니다.");
				System.out.println(phone[i]);
			}
		}
		System.out.println();
		String[] no = {"961212-1223456", "020411-4321234", "990324-1224568", "710223254867", "6503031225467"};
		Pattern p3 = Pattern.compile("\\d{6}\\-[1,4]\\d{6}");					//주민등록 번호 패턴
		for(int i=0;i<no.length;i++) {
			Matcher m = p3.matcher(no[i]);
			if(m.matches()) {
				System.out.println("맞는 주민등록 번호입니다.");
				System.out.println(no[i]);
			}
		}
		System.out.println();
		String[] mail = {"145-33", "051-77", "354-87", "078-45", "122358"};
		Pattern p4 = Pattern.compile("^[1-7]\\d{2}-\\d{2}$");					//우편 번호 패턴 : 100번대(1xx-yy) ~ 700번대(7xx-yy)
		for(int i=0;i<mail.length;i++) {
			Matcher m = p4.matcher(mail[i]);
			if(m.matches()) {
				System.out.println("맞는 우편 번호입니다.");
				System.out.println(mail[i]);
			}
		}
		System.out.println();
		//비밀번호 패턴 : 4~10 글자로 영문 대/소문자와 특수문자(!@#$%^&*?_) 그리고 숫자를 모두 최소 1문자를 포함
		//() 반드시 포함
		//? 한문자
		//=. 이상
		//* 뒤에 나오는 조건으로
		//(?=.*[a-z])(?=.*[A-Z])(?=/*[0-9])(?=.*[!@#$%^&*?_]).{4,10}$
		String[] pw = {"abcd1234", "A123a", "1234", "ABCD!123456", "Abc!432", "CHO#1004"};
		Pattern p5 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10}$");					//비밀 번호 패턴
		for(int i=0;i<pw.length;i++) {
			Matcher m = p5.matcher(pw[i]);
			if(m.matches()) {
				System.out.println("영문 대문자, 소문자, 특수문자, 숫자가 모두 포함된 맞는 비밀번호입니다.");
				System.out.println(pw[i]);
			}
		}
	}
}
