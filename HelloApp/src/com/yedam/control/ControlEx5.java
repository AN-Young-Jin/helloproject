package com.yedam.control;

public class ControlEx5 {
	public static void main(String[] args) {
		// while, do while
		boolean isTrue = false;
		int sum = 0;
		int avg = 0;
		isTrue = true;
		/*while(isTrue) {
			System.out.println("print");
		}*/
		
		do {
			//System.out.println("do print");
			int result = (int)(Math.random()*6)+1;
			sum += result;
			avg++;
			if(sum>100)
				isTrue = false;
		} while (isTrue);
		System.out.println("펼균: " + sum * 1.0/avg);
		
		isTrue = true;
		avg = 0;
		while (isTrue) {
			
			//종료조건
			if(avg++ >5) {
				isTrue = false;
			}
			if(avg%2 ==0) {
				System.out.println("짝수입니다");
			} else {
				continue; // 구문의 아래부분을 실행하지 않고 다음순번으로 처리
				//System.out.println("홀수입니다");
			}
		}
	}
}
