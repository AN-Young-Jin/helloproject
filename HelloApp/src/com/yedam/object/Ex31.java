package com.yedam.object;

import java.util.Scanner;

public class Ex31 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x=0;
		int y=0;
		
		System.out.println("x값을 입력하세요");
		 x = scn.nextInt();
		System.out.println("y값을 입력하세요");
		 y = scn.nextInt();
		if(x>0 && y>0) {
			System.out.println("1");
		} else if (x<0 && y>0) {
			System.out.println("2");
		} else if (x<0 && y<0) {
			System.out.println("3");
		} else if (x>0 && y<0) {
			System.out.println("4");
		}
	}
}

