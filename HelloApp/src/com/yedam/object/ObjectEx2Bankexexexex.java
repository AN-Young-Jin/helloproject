package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bankexexexex {

	static Bank[] accounts = new Bank[3];
	static Scanner scn = new Scanner(System.in);

	// 조회계좌정보가 유무.
	public static boolean checkAccount(String accountNo) {
		boolean isExist = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null //
					&& accounts[i].getAccountNo().equals(accountNo)) {
				isExist = true;
				break;
			}
		}
		return isExist;
	}

	// 한계좌 등록 기능.
	public static void registerAccount() {
		System.out.print("계좌번호입력> ");
		String account = scn.nextLine();

		System.out.print("예금주입력> ");
		String owner = scn.nextLine();

		System.out.print("금액입력> ");
		int balance = Integer.parseInt(scn.nextLine());

		Bank bank = new Bank();
//		bank.accountNo = account;
//		bank.owner = owner;
//		bank.balance = balance;
		bank.setAccountNo(account);
		bank.setOwner(owner);
		bank.setBalance(balance);

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = bank;
				System.out.println("정상적으로 등록.");
				break;
			}
		}
	}

	// 계좌정보 조회.
	public static void searchAccount() {
		System.out.print("조회할 계좌번호> ");
		String account = scn.nextLine();
		boolean isExist = false; // 계좌의 존재여부를 체크하기위한 변수.
		for (int i = 0; i < accounts.length; i++) {
			// 배열위치의 값이 null 아닌 경우에만 조건검색.
			if (accounts[i] != null && accounts[i].getAccountNo().equals(account)) {
				System.out.printf("예금주: %s, 잔액: %d\n", //
						accounts[i].getOwner(), accounts[i].getBalance());
				isExist = true;
				break; // 조회하려는 계좌를 찾았으면 더 반복할 필요가 없다.
			}
		}
		if (!isExist) {
			System.out.printf("%s 계좌가 존재하지 않습니다.\n", account);
		}

	}

	// 입금.
	public static void deposit() {
		System.out.print("계좌번호입력> ");
		String account = scn.nextLine();

		boolean isTrue = checkAccount(account); // true / false
		if (!isTrue) {
			System.out.println("찾는 계좌정보가 없습니다.");
			return;
		}

		System.out.print("금액입력> ");
		int balance = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < accounts.length; i++) {
			// 배열위치의 값이 null 아닌 경우에만 조건검색.
			if (accounts[i] != null && accounts[i].getAccountNo().equals(account)) {
				accounts[i].setBalance(accounts[i].getBalance() + balance);
			}
		}

	}

	// 출금.
	public static void withdraw() {
		System.out.print("계좌번호입력> ");
		String account = scn.nextLine();

		boolean isTrue = checkAccount(account); // true / false
		if (!isTrue) {
			System.out.println("찾는 계좌정보가 없습니다.");
			return; // 메소드의 실행 멈춤.
		}

		System.out.print("금액입력> ");
		int balance = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < accounts.length; i++) {
			// 배열위치의 값이 null 아닌 경우에만 조건검색.
			if (accounts[i] != null && accounts[i].getAccountNo().equals(account)) {
				// accounts[i].balance = accounts[i].balance - balance;
				accounts[i].setBalance(accounts[i].getBalance() - balance);
			}
		}

	}
	
	// 배열삭제.
	public static void removeAccount() {
		System.out.print("삭제할 계좌번호입력> ");
		String account = scn.nextLine();
		for(int i=0 ; i<accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo().equals(account)) {
				accounts[i] = null; //값을 null 대체
				System.out.println("정상적으로 삭제되었습니다.");
				break;
			}
		}
	}
	
	public static void initialData() {
		Bank b1 = new Bank();
//		b1.accountNo = "11-11";
//		b1.owner = "홍길동";
//		b1.balance = 10000;
		b1.setAccountNo("11-11");
		b1.setOwner("홍길동");
		b1.setBalance(10000);
//		Bank b2 = new Bank();
//		b2.accountNo = "11-22";
//		b2.owner = "박길동";
//		b2.balance = 20000;
//		Bank b3 = new Bank();
//		b3.accountNo = "11-33";
//		b3.owner = "최길동";
//		b3.balance = 30000;

		accounts = new Bank[3]; // 계좌3건 등록
		accounts[0] = b1; // 첫번째 데이터 저장.

	}

	public static void main(String[] args) {
		// int[] {0,0,0}, Bank[] {null,null,null}
		initialData(); // 초기값을 등록.

		boolean run = true;
		int selectNo = 0;
		while (run) {
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.삭제 6.종료");
			System.out.print("선택> ");
			selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) { // 등록.
				registerAccount();
			} else if (selectNo == 2) { // 조회(계좌번호)
				searchAccount();
			} else if (selectNo == 3) { // 입금
				deposit();
			} else if (selectNo == 4) { // 출금
				withdraw();
			} else if (selectNo == 5) {// 삭제
				removeAccount();
			} else if (selectNo == 6) { // 종료.
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		} // end of while().
		System.out.println("end of prog.");
		scn.close();
	} // end of main().
}

