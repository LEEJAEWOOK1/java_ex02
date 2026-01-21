package ex01;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String office = null, home = null;
		int num;
		
		for( ; ; ) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			num = input.nextInt();
			switch (num) {
				case 1: 
					System.out.print("우리집 목적지 입력: ");
					home = input.next();
					System.out.println("등록 성공"); break;
				case 2:
					System.out.print("회사 목적지 입력: ");
					office = input.next();
					System.out.println("등록 성공"); break;
				case 3:
					if(home != null)
						System.out.println("우리집 : "+home);
					else
						System.out.println("집 주소가 없습니다");
					System.out.println("회사 : "+office);
					break;
			}
		}
		
	}
}
