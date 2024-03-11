package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//예외 떠넘기기
public class ThrowsExam {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fis = null;
		String absolutePath = "d:\\cho\\java2\\test14\\bin\\sec2\\a.txt";					//절대경로
		String relativaPath = "./a.txt";					//상대경로 -> 현재 디렉토리
		String relativaPath2 = "../a.txt";					//상대경로 -> 상위 디렉토리
		String relativaPath3 = "../../a.txt";					//상대경로 -> test14 디렉토리 안에 
		fis = new FileInputStream(absolutePath);
		if(fis!=null) {
			fis.close();
		}
	}
}
