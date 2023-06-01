package com.yedam.reference;

import java.util.Scanner;

public class referenceEx6 {
	public static void main(String[] args) {
		// 학생3명 : 홍규연의 영어,수학: 홍준표  , 레드규연
		int[][] intAry =   {new int[] {80,90} , // 홍규연 영어,수학
							new int[] {85,85} , // 홍준표 영어,수학
							new int[] {70,80}   // 레드규연 영어,수학
		};
		
//		intAry[0] = new int[] {22,23};
		System.out.printf("홍길동의 영어점수 %d점 \n", intAry[0][0] );
		System.out.printf("홍준표의 영어점수 %d점 \n", intAry[1][1] );
		System.out.printf("레드규연의 영어점수 %d점 \n", intAry[2][1] );
		int engSum = 0;
		int mathSum = 0;
//		engSum = intAry[0][0] + intAry[1][0] + intAry[2][0];
		for(int i=0; i<intAry.length; i++) {
			engSum +=intAry[i][0];
		}
		System.out.printf("영어점수의 합계: %d \n", engSum);
		
		for(int i=0; i<intAry.length; i++) {
			mathSum +=intAry[i][1];
		}
		System.out.printf("수학점수의 합계: %d \n", mathSum);
		
		//영어,수학 점수 .
		int totalSum = 0;
		for(int i=0; i<intAry.length; i++) {
			for(int j=0; j<intAry.length-1; j++) {
			totalSum += intAry[i][j];
			}
		}
		System.out.printf("전체 점수는 %d \n", totalSum);
		
		String[] nameAry = {"홍규연" , "홍준표" , "레드규연"};
		
		Scanner scn = new Scanner(System.in);
		System.out.println("학생이름 :");
		String searchName = scn.nextLine();
		boolean isExist =false;
		
		for (int i =0 ; i <nameAry.length; i++) {
			if(nameAry[i].equals(searchName)) {
			System.out.printf("%s 의 영어점수는 %d , 수학점수는 %d \n" , nameAry[i],intAry[i][0],intAry[i][1]);
			isExist =true;
			} 
		}		
		if(isExist == false) {
			System.out.println("노답입니다");
				}
		
		scn.close();
	}// main end
}
