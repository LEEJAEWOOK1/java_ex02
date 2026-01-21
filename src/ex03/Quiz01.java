package ex03;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		String[] arr1 = new String[] {"aaa", "bbb"};
		String[] arr2 = new String[] {"111", "222"};
		
		String inputId = "bbb";
		
		int i=0;
		for(; i< arr1.length ; i++) {
			if(arr1[i].equals(inputId)) {
				System.out.println("i : "+i);
				System.out.println("arr1[i] : " + arr1[i]);
			}
		}
		System.out.println("다음 문장들 실행");
		*/
		
		Scanner input = new Scanner(System.in);
		
		String[] id = new String[5];
		String[] pwd = new String[5];
		String inputId, inputPwd;
		int num;
		
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.모든 회원보기");
			System.out.println("4.종료");
			System.out.print(">>> : ");
			num = input.nextInt();
			if(num == 4) {
				System.out.println("프로그램 종료!!!");
				break;
			}
			switch(num) {
			case 1: {
				System.out.println("로그인 할 id 입력");
				inputId = input.next();
				System.out.println("로그인 할 pwd 입력");
				inputPwd = input.next();
				int i = 0;
				for(; i < id.length; i++) {
					if(inputId.equals(id[i])) {
						if(inputPwd.equals(pwd[i]))
							System.out.println("인증 통과");
						else
							System.out.println("비밀번호 틀림");
						break;
					}
				}
				//System.out.println(i);
				//System.out.println(i==3);
				if(i == id.length) {
					System.out.println("아이디 없음!!!");
				}
				break;
			}
			case 2: {
				int k = 0;
				for(;k < id.length; k++) {
					if(id[k]==null)
						break;
				}
				System.out.println("k : "+k);
				if(k==id.length) {
					System.out.println("저장할 공간이 없습니다");
				}else {
					System.out.println("가입 id 입력 : ");
					inputId = input.next();
					System.out.println("가입 pwd 입력 : ");
					inputPwd = input.next();
					int i=0;
					for(; i < id.length;i++) {
						if(inputId.equals(id[i])) {
							System.out.println("동일 id 존재");
							break;
						}
					}
					if(i == id.length) {
						id[k] = inputId;
						pwd[k] = inputPwd;
						System.out.println("회원가입 성공");
					}
				}
				break;
			}
			case 3: 
				for(int j=0; j <id.length; j++) {
					System.out.println(id[j]+" : "+pwd[j]);
				}
				break;
			case 4: 
				break;
			}
		}
	}
}
