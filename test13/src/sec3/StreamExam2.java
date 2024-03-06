package sec3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//String 타입의 List Stream 방식 활용
//stream.메소드();
public class StreamExam2 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("김민영");
		lst.add("송지현");
		lst.add("김두현");
		lst.add("최찬규");
		lst.add("김광철");
		lst.add("류희용");
		lst.add("류하은");
		lst.add("강수현");
		lst.add("최성대");
		lst.add("박태준");
		lst.add("김민재");
	
		//ArrayList의 Stream화
		Stream<String> stream = lst.stream();
		System.out.println("정렬 전");
		lst.stream().forEach(s -> System.out.println(s));
		System.out.println("\n정렬 후");
		lst.stream().sorted().forEach(s -> System.out.println(s));
		
		//요소의 수 계산하여 출력
		System.out.println("\n인원수");
		System.out.println(lst.stream().count());
	}
}
