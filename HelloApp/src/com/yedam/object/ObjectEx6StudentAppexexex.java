package com.yedam.object;

import java.util.Scanner;

public class ObjectEx6StudentApp {
	// 학생정보관리 App.
	// 1.등록 2.목록 3.조회(이름) 4.수정(점수) 5.삭제 6.종료.
	// 학생정보: 학생번호(23-001)/이름/성별(남,여)/점수

	static Student[] students = new Student[6];
	static Scanner scn = new Scanner(System.in);

	public static void init() {
		students[0] = new Student("23-01", "홍길동", "남", 80);
		students[1] = new Student("23-02", "황진이", "여", 85);
		students[2] = new Student("23-03", "황보경", "여", 89);
		students[3] = new Student("23-04", "홍길동", "남", 82);
//		students[4] = new Student("23-05", "무지개", "여", 85);
//		students[5] = new Student("23-06", "고구마", "남", 88);
	}

	public static void main(String[] args) {

		boolean run = true;
		init();

		while (run) {
			printMenu();
			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {
				register();
			} else if (selectNo == 2) {
				list();
			} else if (selectNo == 3) {
				search();
			} else if (selectNo == 4) {
				modify();
			} else if (selectNo == 5) {
				remove();
			} else if (selectNo == 6) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		}
		System.out.println("end of prog.");
	} // end of main().

	// 1.register(), 2.list() 3.search() 4.modify() 5.remove()
	// _____________________남-1명, 여-2명, 최고점수: 이름 - 100점

	public static void register() {
		boolean isNull = false;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				isNull = true;
				break;
			}
		}
		if (!isNull) {
			System.out.println("등록할 공간이 없습니다.");
			return;
		}

		System.out.print("학생번호> ");
		String stdNo = scn.nextLine();
		System.out.print("학생이름> ");
		String stdName = scn.nextLine();
		System.out.print("성별> ");
		String gender = scn.nextLine();
		System.out.print("점수> ");
		int score = Integer.parseInt(scn.nextLine());

		Student newOne = new Student(stdNo, stdName, gender, score);

		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = newOne;
				System.out.println("등록되었습니다.");
				break;
			}
		}
	} // end of register()

	public static void list() {
		boolean isExist = false;
		int mCnt = 0, wCnt = 0, mScore = 0;
		String mName = "";
		for (Student std : students) {
			if (std != null) {
				std.showInfo();
				isExist = true;
				if (std.getGender().equals("남"))
					mCnt++;
				else
					wCnt++;

				if (mScore < std.getScore()) {
					mScore = std.getScore();
					mName = std.getStdName();
				}
			} else {
				System.out.println("null");
			}
		}
		if (isExist) {
			System.out.println("---------------------------");
			System.out.printf("남-%d, 여-%d, 최고점수: %s - %d점\n", mCnt, wCnt, mName, mScore);
		} else {
			System.out.println("등록된 정보가 없습니다.");
		}
	} // end of list()

	public static void search() {
		System.out.printf("이름을 입력하세요> ");
		String sname = scn.nextLine();

		boolean isExist = false;
		for (Student student : students) {
			if (student != null && student.getStdName().equals(sname)) {
				student.showInfo();
				isExist = true;
			}
		}
		if (!isExist) {
			System.out.printf("%s 학생정보가 없습니다.", sname);
		}
	}

	public static void modify() {
		System.out.print("수정할 학생번호를 입력하세요.");
		String sno = scn.nextLine();

		if (!checkInfo(sno)) {
			System.out.println("찾는 정보가 없습니다.");
			return;
		}

		System.out.print("점수를 입력하세요.");
		int score = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStdNo().equals(sno)) {
				students[i].setScore(score);
				System.out.println("처리 완료.");
			}
		}
	}

	public static void remove() {
		System.out.println("삭제할 학생번호를 입력하세요.");
		String sno = scn.nextLine();

		if (!checkInfo(sno)) {
			System.out.println("찾는 정보가 없습니다.");
			return;
		}

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStdNo().equals(sno)) {
				students[i] = null;
				System.out.println("정상적으로 처리되었습니다.");
				break;
			}
		}
	} // end of remove()

	public static boolean checkInfo(String sno) {
		boolean isExist = false;
		for (Student student : students) {
			if (student != null && student.getStdNo().equals(sno)) {
				isExist = true;
				break;
			}
		}
		return isExist;
	}

	public static void printMenu() {
		System.out.println("-----------------------------------");
		System.out.println("1.등록 2.목록 3.조회(이름) 4.수정 5.삭제 6.종료");
		System.out.print("선택> ");
	}
}
