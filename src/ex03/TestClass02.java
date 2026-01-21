package ex03;

import java.util.ArrayList;

public class TestClass02 {
	public static void main(String[] args) {
		//int[] arr = new int[5];
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("안녕"); //데이터 추가
		arr.add("111");
		arr.add("222");
		
		String s = arr.get(2); // 데이터 가져옴
		System.out.println(s);
		
		for(int i=0; i < arr.size(); i++) {
			s = arr.get(i);
			System.out.println(s);
		}
		System.out.println("--- foreach ---");
		for(String a : arr) {
			System.out.println(a);
		}
		
		System.out.println(arr.contains("안녕")); //해당하는 값이 현재 저장되어 있는 공간(arr)에 존재하냐 알려준다.
		System.out.println(arr.contains("없는값"));
		
		boolean bool = arr.contains("안녕111");
		if(bool) {
			System.out.println("해당 값은 존재합니다");
		}else {
			System.out.println("없음");
		}
		
		System.out.println("삭제 전 arr : " + arr);
		System.out.println(arr.remove(1));
		System.out.println("삭제(1) 후 arr : " + arr);
		
		System.out.println(arr.remove("안녕"));
		System.out.println("삭제(안녕) 후 arr : " + arr);
		
		arr.add("안녕");
		arr.add("111");
		arr.add("222");
		
		System.out.println("arr 추가 후 : "+arr);
		System.out.println(arr.indexOf("안녕")); //이 값이 있는 index값을 출력(없으면 -1)
		System.out.println(arr.indexOf("안녕111"));
		int index = arr.indexOf("안녕");
		System.out.println("index : "+index);
		
		arr.set(index, "안녕하세요"); //해당 index값 변경
		System.out.println(arr);
	}
}
