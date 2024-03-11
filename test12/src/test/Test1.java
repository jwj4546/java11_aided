package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<IPInfo> ipInfoList = new ArrayList<IPInfo>();					//1. List 선언
		
		ipInfoList.add(new IPInfo("123.123.123.123", "홍길동"));
		ipInfoList.add(new IPInfo("212.133.7.8", "조우진"));					//2. 생성자 함수
		ipInfoList.add(new IPInfo("177.233.111.222", "고길순"));
		
		System.out.println("ip 입력 : ");
		String ip = sc.next();
		
		for(int i=0;i<ipInfoList.size();i++) {
			if(ipInfoList.get(i).getIp().equals(ip)) {					//3. ipInfoList.equals(i) 특정 번째의 IPInfo 클래스의 객체이고, ip는 String 변수이므로, 
				System.out.println(ipInfoList.get(i).toString());
				break;
			} else {
				System.out.println("일치하는 ip 사용자가 없습니다.");						//4.
			}
		}
	}
}
