package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Board;

public class BoardExam {
	public static void main(String[] args) {
		List<Board> boardList = new ArrayList<>();
		for(int i=0;i<10;i++) {
			Board bd = new Board(i, "title"+i, "content"+i, "author"+i, "2024.03.15", i*10);
			boardList.add(bd);
		}
		for(Board b:boardList) {
			System.out.println(b.toString());
		}
		
	}
}
