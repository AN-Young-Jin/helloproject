package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("첫째");
		int num1 = scn.nextInt();
		System.out.println("둘째");
		int num2= scn.nextInt();
		thirdMethod(num1,num2);
		scn.close();
		//firstMethod();
		//secondMethod();
	}	
	
	
	public static void firstMethod() {
		// Scanner 사용해서 입력값을 2개
				// 3, 4 => 3의 4제곱에 값을 출력.
				Scanner scn = new Scanner(System.in);
				System.out.println("첫번째 숫자를 입력하세요");
				int num1 = scn.nextInt();
				System.out.println("두번째 숫자를 입력하세요");
				int num2 = scn.nextInt();
				int result;
				 result = (int)Math.pow(num1, num2);
				
				System.out.println(result);
				
				scn.close();
				
	} // first end
	
	public static void secondMethod() {
		//Scanner 활용
		// I am a boy,  => 
		Scanner scn1 = new Scanner(System.in);
		System.out.println("첫째 입력");
		String num3 = scn1.nextLine();
		System.out.println("둘째 입력");
		int num4 = scn1.nextInt();
		
		
		for(int i = 1 ; i<=num4; i++) {
			System.out.println(num3);
			
			scn1.close();
		}
	} // second end
	
	public static void thirdMethod(int a, int b) {
		
		int result = a+b;
		System.out.println("결과값은 : " + result);
						
		
	}
} // main end
