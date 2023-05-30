package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx1 {
	// 메소드 : 함수인데 객체(object)에 소속되어있는 메소드.
	public static void main(String[] args) {
		/*
		 * 
		 *  사용자의 값을 입력받도록 num1, num2 값을 입력받고
		 *  num1(1) ~ num2(3) 사이의 값의 합계를 구하시오.
		 * 
		 *  짝수만 계산합.
		 * 
		 */
		int num1= 0;
		int num2= 0;
		int result = 0; 		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("첫숫자를 입력하세요.");
		num1 = scn.nextInt();
				String str = "";
		System.out.println("두번숫자를 입력하세요.");
		num2 = scn.nextInt();
		
		for(int i=num1; i<=num2; i++) {
			if(i%2 == 0) {
				result += i;
			}
			System.out.println();
		}
		System.out.println("결과값은 " + result);
		
		
		/*try {
			str = scn.nextLine(); // 함수가 객체에 소속되어있는것을 메소드.
		} catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
		}
		System.out.println("결과값은 " + result);
		
		scn.close(); // resource 환원.*/
	}
}
