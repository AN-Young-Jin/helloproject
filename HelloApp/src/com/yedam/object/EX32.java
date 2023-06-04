package com.yedam.object;

import java.util.Scanner;

public class EX32 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = 0;
		System.out.println("연도를 입력하세요");
		int b = scn.nextInt();
		if (a % 4 == 0) {
			if (a % 100 != 0 || a % 400 == 0) {
				System.out.println("윤년입니다");
			}
		} else {
			System.out.println("윤년이아닙니다");
		}

	}
}
