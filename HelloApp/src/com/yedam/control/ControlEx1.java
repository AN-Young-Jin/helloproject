package com.yedam.control;

public class ControlEx1 {
	public static void main(String[] args) {
		//0 ~ 1 사이의 임의의 수를 생성.
		//3.453455443554435345 => 3
		//0 ~ 9 => 1 ~ 10
		int result = (int) (Math.random() * 10) + 1; //
		System.out.println(result);
		if (result % 2 ==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		// Math.random 을 활용해서 10 ~ 100 까지의 임의의 수.
		// 생성된 값이 100~90 A출력.
		// 80 ~ 89 B, 70~79 C , 그외는 D
		while(true) {
			int result1 = (int)(Math.random()*91) +10;
			System.out.println(result1);
		 if (result1 == 100) {
			 break;
		 	}
		}
		int result1 = (int)(Math.random()*91) +10;
		String msg = "";
		if (result1 >= 90) {
			System.out.println(result1 +"점입니다."+ "등급은 " + "A");
			msg = "A";
		} else if (result1 >= 80) {
			System.out.println(result1 +"점입니다."+ "등급은 " + "B");
			msg = "B";
		} else if (result1 >= 70) {
			System.out.println(result1 +"점입니다."+ "등급은 " + "C");
			msg = "C";
		} else {
			System.out.println(result1 +"점입니다."+ "등급은 " + "D");
			msg = "D";
		}
		System.out.printf("%d점은 %s등급입니다.", result1, msg);
	}
}
