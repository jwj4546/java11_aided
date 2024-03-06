package sec3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExam {
	public static void main(String[] args) {
		//TreeMap 선언
		Map map0 = new TreeMap<Integer, String>();
		TreeMap<Integer, String> map1 = new TreeMap();
		TreeMap<Integer, String> map2 = new TreeMap<>();
		TreeMap<Integer, String> map3 = new TreeMap<>(map1);
		TreeMap<Integer, String> map4 = new TreeMap<>() {{
			put(1, "조우진");
		}};
		map2.put(1, "조우진");					//요소(Entry) 추가
		map2.put(2, "송지현");
		map2.put(3, "김민영");
		map2.put(4, "김두현");
		map2.put(5, "강수현");
		map2.put(6, "유하은");
		
		//키가 4인 특정 요소 제거
		map2.remove(4);
		
		//TreeMap 비우기
		//map2.clear();
		
		//TreeMap 순회하여 출력
		for(Integer i:map2.keySet()) {
			System.out.println(i+" : "+map2.get(i));
		}
		System.out.println("\nmap2 : "+map2);
		System.out.println("\nmap2 에서 키가 5인 요소 : "+map2.get(5));
		System.out.println("\nmap2에서 가장 첫 엔트리 : "+map2.firstEntry());
		System.out.println("\nmap2에서 가장 첫 키 : "+map2.firstKey());
		System.out.println("\nmap2에서 마지막 엔트리 : "+map2.lastEntry());
		System.out.println("\nmap2에서 마지막 키 : "+map2.lastKey());
	}
}
