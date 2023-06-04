package com.yedam.object;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Ex34 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

//		for(int i=0; i<5; i++) {
//			for (int j=4; j>i; j--) {
//				System.out.print(" ");
//			}
//			for(int z = 0 ; z<=i; z++)
//			System.out.print("*");
//			System.out.println();
//		}
//		

//		System.out.println("숫자를 입력하세요");
//		int m = 0;
//		m = scn.nextInt();
//		int n = 0;
//		n = scn.nextInt();
//		for(int i=m; i<=m; i++) {
//			for(int j=1; j<=n; j++) {
//				
//				System.out.println(m +"X"+ j +"=" + m*j );
//			}
//		}
//		
//		
		int[] arr1 = { 10, 20, 330, 50, 3, 60, -3 };
//		System.out.println("번호를 입력하세요");
//		int a = scn.nextInt();

//		arr1[a] = 1000;

//		System.out.println(arr1[5]);
//		for(int i=0; i<arr1.length; i++ ) {
//			if(arr1[i] != arr1[3]) {
//				System.out.println(arr1[i]);
//			}
//		}

//		int max = 0;
//		int min = arr1[0];
//		for (int i = 0; i < arr1.length; i++) {
//			if (arr1[i] > max) {
//				max = arr1[i];
//			} else if (arr1[i] < min) {
//				min = arr1[i];
//			}
//		}
//		System.out.println(min);

		
//		int[] arr2 = new int[5];
//		System.out.println("숫자 5개를 입력해라");
//		
//		for(int i=0; i<arr2.length; i++) {
//			 arr2[i] = Integer.parseInt(scn.nextLine());
//		}
//		for(int i=0; i<arr2.length; i++) {
//			if(arr2[i] %3 ==0) {
//				System.out.println(arr2[i]);
//			}
//		}
		
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				//작성위치
				System.out.println("학생수를 입력하세요");
				studentNum = scn.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				//작성위치
				System.out.println("점수를 입력하세요");
				for(int i =0; i<scores.length; i++) {	
				int score = scn.nextInt();
				scores[i] = score;
				}
				break;
			case 3:
				//작성위치
				for(int i =0 ; i<scores.length; i++) {
					System.out.println(scores[i]);
				}
				break;
			case 4:
				//작성위치
				int max = 0;
				int sum = 0;
				int avg = 0;
				for(int i = 0; i<scores.length; i++) {
					sum += scores[i];
					if(scores[i]>max) {
						max = scores[i];
					}
				}
				avg = sum/studentNum;
				System.out.printf("최고점수는 %d 평균은 %d입니다 \n",max,avg);
				break;
			case 5:
				//작성위치
				run = false;
				
			}
			
		}
		
		System.out.println("끝");
		
		
	} //main
}
