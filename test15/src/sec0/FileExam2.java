package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam2 {
	public static void main(String[] args) throws IOException {
		//파일의 상대 경로 지정
		File f1 = new File("a.txt");					//현재 디렉토리에 파일이 있든 없든 파일 객체 생성
		File f2 = new File("../sec1/a.txt");					//현재 디렉토리 sec0에서 상위 디렉토리로 이동한 후 sec1 디렉토리의 a.txt의 파일 객체를 생성 
		
		//파일의 절대 경로 지정
		//d:\\cho\\java2\\a.txt
		File f3 = new File("d:"+File.separator+"cho"+File.separator+"java2"+File.separator+"a.txt");
		String path = "d:\\cho\\java2\\";
		File f4 = new File(path, "a.txt");
		File f5 = new File("d:\\cho\\java\\", "a.txt");
		
		if(f1==null) {
			System.out.println("현재 파일이 존재하지 않습니다.");
		} else {
			System.out.println("현재 파일이 존재합니다.");
		}
	}
}
