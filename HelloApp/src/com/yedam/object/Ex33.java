package com.yedam.object;

import java.util.Scanner;

public class Ex33 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("가위바위보");
		String a = scn.nextLine();
		
		
		switch(a) {
		case "가위" :
			System.out.println("이기기위해선 바위를 내야합니다"); break;
		
		case "바위" :
			System.out.println("이기기위해선 보를 내야합니다"); break;
			
		case "보" :
			System.out.println("이기기위해선 가위를 내야합니다");
		}
	}
}
