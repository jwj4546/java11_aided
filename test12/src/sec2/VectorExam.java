package sec2;

import java.util.List;
import java.util.Vector;

public class VectorExam {
	public static void main(String[] args) {
		List<Notice> nVector = new Vector<>();
		
		//글쓰기
		nVector.add(new Notice("제목1", "내용1", "정도준"));					//추가
		nVector.add(new Notice("제목2", "내용2", "조우진"));					//
		nVector.add(new Notice("제목3", "내용3", "김응원"));
		nVector.add(new Notice("제목4", "내용4", "한태역"));
		nVector.add(new Notice("제목5", "내용5", "관리자"));
		nVector.add(new Notice("제목6", "내용6", "최태영"));
		
		//글 목록
		System.out.println("제목\t내용\t작성자");
			for(Notice n:nVector) {
				System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
			}
		nVector.remove(2);					//인덱스 2인 인스턴스 제거 => 글 제거
		Notice no = new Notice("제목", "내용", "유정환");
		nVector.set(3, no);					//인스턴스를 인덱스가 3인 중간에 삽입 
	
		System.out.println();
		System.out.println("제목\t내용\t작성자");
		for(int i=0;i<nVector.size();i++) {
			Notice n = nVector.get(i);
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
		}
	}
}
