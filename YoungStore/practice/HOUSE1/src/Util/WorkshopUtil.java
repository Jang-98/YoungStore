package Util;

import java.util.Scanner;

public class WorkshopUtil {
	
	public static String getUserInput(String msg) {
		
		System.out.println(msg);
		Scanner sc = new Scanner(System.in); //객체를 생성하며 System.in은 입력한 값을 바이트 단위로 읽는 것을 뜻함		
		return sc.nextLine();
	}
	

	public static void printHeader() {

		System.out.println("======<< 춘 펜션 관리 시스템>>======");
		System.out.println("1. 전체 방 조회");
		System.out.println("2. 입실");
		System.out.println("3. 퇴실");
		System.out.println("0. 종료");
		System.out.println("===============================");

	}

  

}
