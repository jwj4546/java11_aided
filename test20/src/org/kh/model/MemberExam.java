package org.kh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section.Member;


public class MemberExam {
	List<Member> memList = new ArrayList<>();
	boolean sw = true;
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		MemberExam app = new MemberExam();
		app.mainCall();
	}
	//메뉴를 반복 호출하고, 키보드에서 각 해당 번호를 누르면 
	public void mainCall() {					//1. 회원 가입, 2. 회원 목록, 3. 회원 삭제, 4. 프로그램 종료
		while(sw) {
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 목록");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 프로그램 종료");
			System.out.print("번호 입력 : ");
			int job = sc.nextInt();
			sc.nextLine();
			switch (job) {
			case 1 : 
				add();
				break;
			case 2 :
				list();
				break;
			case 3 : 
				delete();
				break;
			default: 
				sw = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
	}
	public void add() {
		System.out.print("회원 코드 입력 : ");
		int mcode = sc.nextInt();
		sc.nextLine();
		System.out.print("회원 id 입력 : ");
		String id = sc.nextLine();
		System.out.print("회원 pw 입력 : ");
		String pw = sc.nextLine();
		System.out.print("회원 이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("출생 연도  입력 : ");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.print("전화번호 입력 : ");
		String tel = sc.nextLine();
		
		Member mem = new Member(mcode, id, pw, name, year, tel);
		memList.add(mem);
		System.out.println("회원 가입이 완료되었습니다.");
	}
	public void list() {
		for(int i=0;i<memList.size();i++) {
			System.out.println(memList.get(i).toString());
		}
	}
	public void delete() {
		System.out.print("삭제하고 싶은 회원 아이디 입력 : ");
		String memDelete = sc.nextLine();
		
		boolean co = false;
		for(int i=0;i<memList.size();i++) {
			if(memList.get(i).getId().equals(memDelete)) {
				System.out.println(memList.get(i).toString()+"가 삭제되었습니다.");
				memList.remove(i);
				co = true;
				break;
			}	else {
				System.out.println("해당 회원을 찾을 수 없습니다.");
			}
		}
	}
}
