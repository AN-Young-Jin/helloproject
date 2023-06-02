package com.yedam.object;

import java.util.Scanner;



public class objectEx2Bank {
	static Bank[] accounts = new Bank[3];
	static Scanner scn = new Scanner(System.in);
	//조회계좌정보 유무
	public static boolean checkAccount(String accountNo) {
		boolean isExist = false;
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] !=null && accounts[i].getAccountNo().equals(accountNo)) {
				isExist = true;
				break;
			}
		}
		return isExist;
	}
	
	//계좌 등록 기능
	public static void registerAccount() {
		for (int i = 0; i < accounts.length; i++) {
			Bank b1 = new Bank();
			System.out.println("계좌 입력");
			b1.setAccountNo(scn.nextLine());
			if (i != 0) {
				boolean run1 = false;
				for (int j = 0; j < i; j++) {
					if (accounts[j].getAccountNo().equals(b1.getAccountNo())) {
						run1 = true; 
						break; 
					}
				}
				if (run1) {
					System.out.println("ㄴㄴ");
					i--; 
					//continue; //반복문안에서 return.
					return;
				}

			}
			System.out.println("이름 입력");
			b1.setOwner(scn.nextLine())  ;
			System.out.println("입금하셈");
			b1.setBalance(Integer.parseInt(scn.nextLine()));

			accounts[i] = b1;
		}
	}
	
	//조회
	public static void searchAccount() {
		System.out.println("계장번호를 입력해라");
		String a = scn.nextLine();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountNo().equals(a)) {
				System.out.printf("예금주는 %s , 금액은 %d입니다 \n", accounts[i].getOwner(), accounts[i].getBalance());
			}
		}
	}
	
	//입금
	public static void deposit() {
		System.out.println("입금할 계좌 적어라");
		String a = scn.nextLine();
		
		boolean isTrue = checkAccount(a); // true/false
		if(!isTrue) {
			System.out.println("찾고자하는 계좌없다");
			return; //메소드의 실행 멈춤.
		}
		
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountNo().equals(a)) {
				System.out.println("얼마넣을꺼고");
				//accounts[i].balance += Integer.parseInt(scn.nextLine());
				accounts[i].setBalance(accounts[i].getBalance() + Integer.parseInt(scn.nextLine()));
			}
		}
	}
	
	//출금
	public static void withdraw() {
		System.out.println("출금할 계좌 적어라");
		String a = scn.nextLine();
		
		boolean isTrue = checkAccount(a); // true/false
		if(!isTrue) {
			System.out.println("찾고자하는 계좌없다");
			return;
		}
		
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountNo().equals(a)) {
				System.out.println("얼마뺄꼬");
				//accounts[i].balance -= Integer.parseInt(scn.nextLine());
				accounts[i].setBalance(accounts[i].getBalance() - Integer.parseInt(scn.nextLine()));
			}
		}
	}

	public static void main(String[] args) {
		
//		Bank b1 = new Bank();
//		b1.setAccountNo("11-11");
//		b1.setOwner("홍길동");
//		b1.setBalance(10000);
//		
		boolean run = true;
		int selectNo = 0;

		while (run) {
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.종료");
			System.out.println("선택> ");
			selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) { // 등록
				registerAccount();
			} else if (selectNo == 2) { // 조회
				searchAccount();
			} else if (selectNo == 3) { // 입금
				deposit();
			} else if (selectNo == 4) { // 출금
				withdraw();
			} else if (selectNo == 5) { // 종료
				run = false;
			}
		} // end of while

		System.out.println("end of prog");
		scn.close();
	}
}
