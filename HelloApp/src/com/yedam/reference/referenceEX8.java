package com.yedam.reference;

import java.util.Scanner;

public class referenceEX8 {
	public static void main(String[] args) {
		//학생수 => 점수입력 , 점수출력, 최고점수 ,평균점수
		
		Scanner scn = new Scanner(System.in);
		int studentNum = 0; // 학생수 지정
		int[] scores = null;
		boolean run = true;
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scn.nextLine());
			
			if(selectNo ==1) { //학생수
				System.out.println("학생수> ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
			} else if (selectNo ==2) { //배열의 크기만큼 학생의 점수
				if(scores ==null) {
					System.out.println("배열의 크기 정해라");
					continue;
				}
				for(int i=0; i<scores.length; i++) {
					scores[i] = Integer.parseInt(scn.nextLine());
				}
				
			} else if (selectNo ==3) { // 배열의 점수 출력
				if(scores ==null) {
					System.out.println("배열의 크기 정해라");
					continue;
				}
				for(int i=0; i<scores.length; i++) {
					System.out.println(scores[i]);
				}
			} else if (selectNo ==4) { // 분석 : 최고점 , 평균
				if(scores ==null) {
					System.out.println("배열의 크기 정해라");
					continue;
				}
				int max = scores[0];
				for(int i=0; i<scores.length; i++) {
					if(scores[i] > max) {
						max = scores[i];
					}
				}
				int sum = 0;
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];
				}
				System.out.printf("최고점은 %d 평균은 %d \n" ,max,(sum/studentNum));
			} else if (selectNo ==5) { // 종료
				run = false;
			}
							
						
		}
		System.out.println("end of prog");
	}// main end
}
