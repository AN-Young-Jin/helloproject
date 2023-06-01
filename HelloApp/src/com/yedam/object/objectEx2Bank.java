package com.yedam.object;

import java.util.Scanner;

public class objectEx2Bank {
	public static void main(String[] args) {
		Bank[] accounts = new Bank[3];
		Bank b1 = new Bank();
		boolean run = true;
		int selectNo = 0;
		
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.종료");
			System.out.println("선택> ");
			selectNo = Integer.parseInt(scn.nextLine());
			
			if(selectNo ==1) { //등록
				for(int i=0; i<accounts.length; i++) {
				System.out.println("계좌 입력");
				b1.accountNo = scn.nextLine();
				System.out.println("이름 입력");
				b1.owner = scn.nextLine();
				System.out.println("입금하셈");
				b1.balance = Integer.parseInt(scn.nextLine());
				}
			} else if (selectNo ==2) { // 조회
				for(int i=0; i<accounts.length; i++) {
					System.out.println("조회");
					
				}
			} else if (selectNo ==3) { // 입금
				
			} else if (selectNo ==4) { // 출금
				
			} else if (selectNo ==5) { // 종료
				
			}
			
			
			
			
		} // end of while
		
		System.out.println("end of prog");
		scn.close();
	}
}
