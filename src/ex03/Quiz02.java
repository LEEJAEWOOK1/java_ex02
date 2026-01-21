package ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> tell = new ArrayList<String>();
		
		String inputName, inputTell;
		int num;
		
		while(true) {
			System.out.println("1.연락처 등록");
			System.out.println("2.이름 검색");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print(">>> : ");
			num = input.nextInt();
			
			switch(num) {
			case 1: {
				System.out.println("이름 입력 : ");
				inputName = input.next();
				System.out.println("연락처 입력 : ");
				inputTell = input.next();
				int i = 0;
				if(name.contains(inputName)) {
					System.out.println("이름 중복");
				} else if(tell.contains(inputTell)) {
					System.out.println("전화번호 중복");
				} else {
					name.add(inputName);
					name.add(inputTell);
					System.out.println("등록성공");
				}
				break;
			}
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			}
		}
		
	}
}
