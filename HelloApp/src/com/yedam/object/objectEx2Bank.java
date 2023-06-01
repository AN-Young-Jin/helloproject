package com.yedam.object;

import java.util.Scanner;

public class objectEx2Bank {
	public static void main(String[] args) {
		Bank[] accounts = new Bank[3];

		boolean run = true;
		int selectNo = 0;

		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.종료");
			System.out.println("선택> ");
			selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) { // 등록
				for (int i = 0; i < accounts.length; i++) {
					Bank b1 = new Bank();
					System.out.println("계좌 입력");
					b1.accountNo = scn.nextLine();
					if (i != 0) {
						boolean run1 = false; // 중복된 아이디를 체크하기위해 선언
						for (int j = 0; j < i; j++) {
							if (accounts[j].accountNo.equals(b1.accountNo)) {
								run1 = true; // 중복된 아이디임을 확인.
								break; // 중복여부를 확인했으면 다음 순번을 볼 필요없음
							}
						}
						if (run1) {
							System.out.println("ㄴㄴ");
							i--; // 순번을 한번 빼줌.
							continue;
						}

					}
					System.out.println("이름 입력");
					b1.owner = scn.nextLine();
					System.out.println("입금하셈");
					b1.balance = Integer.parseInt(scn.nextLine());

					accounts[i] = b1;
				}
			} else if (selectNo == 2) { // 조회
				System.out.println("계장번호를 입력해라");
				String a = scn.nextLine();
				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i].accountNo.equals(a)) {
						System.out.printf("예금주는 %s , 금액은 %d입니다 \n", accounts[i].owner, accounts[i].balance);
					}
				}
			} else if (selectNo == 3) { // 입금
				System.out.println("입금할 계좌 적어라");
				String a = scn.nextLine();
				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i].accountNo.equals(a)) {
						System.out.println("얼마넣을꺼고");
						accounts[i].balance += Integer.parseInt(scn.nextLine());
					}
				}
			} else if (selectNo == 4) { // 출금
				System.out.println("출금할 계좌 적어라");
				String a = scn.nextLine();
				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i].accountNo.equals(a)) {
						System.out.println("얼마뺄꼬");
						accounts[i].balance -= Integer.parseInt(scn.nextLine());
					}
				}
			} else if (selectNo == 5) { // 종료
				run = false;
			}

		} // end of while

		System.out.println("end of prog");
		scn.close();
	}
}
