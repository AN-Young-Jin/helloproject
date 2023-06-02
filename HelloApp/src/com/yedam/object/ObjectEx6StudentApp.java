package com.yedam.object;

import java.util.Scanner;

public class ObjectEx6StudentApp {
	// 학생정보관리 App.
	// 1.등록 2.목록 3.조회(이름) 4.수정(점수) 5.삭제 6.종료.
	// 학생정보 : 학생번호(23-001)/이름/성별(남,여)/점수
	static Scanner scn = new Scanner(System.in);
	static Student[] Students = new Student[2];

	public static void register() {
		for (int i = 0; i < Students.length; i++) {
			System.out.println("학생번호를 입력하세요");
			String sid = scn.nextLine();
			if (i != 0) {
				boolean err = false;
				for (int j = 0; j < i; j++) {
					if (Students[j].getSid().equals(sid)) {
						err = true;
						break;
					}
				}
				if(err) {
					System.out.println("다시가셈");
					i--;
					continue;
				}
			}
			System.out.println("이름을 입력하세요");
			String sname = scn.nextLine();
			System.out.println("성별을 입력하세요");
			String sex = scn.nextLine();
			System.out.println("점수를 입력하세요");
			int score = Integer.parseInt(scn.nextLine());

			Student s1 = new Student();
			s1.setSid(sid);
			s1.setSname(sname);
			s1.setSex(sex);
			s1.setScore(score);

			for (int j = 0; j < Students.length; j++) {
				if (Students[j] == null) {
					Students[j] = s1;
					System.out.println("등록되었습니다.");
					break;
				}
			}
		}
	}

	public static void list() {
		int nam = 0;
		int num = 0;
		String mName = "";
		int mScore = 0;
		for (int i = 0; i < Students.length; i++) {
			if (Students[i] == null) {
				continue;
			}
			System.out.printf("학생번호:%s 이름:%s 성별:%s 점수:%d \n", Students[i].getSid(), Students[i].getSname(),
					Students[i].getSex(), Students[i].getScore());
			if (Students[i].getSex().equals("남")) {
				nam++;
			} else {
				num++;
			}
			if (mScore < Students[i].getScore()) {
				mScore = Students[i].getScore();
				mName = Students[i].getSname();
			}
		}
		System.out.printf("남자:%d 여자 %d 최고점수 %s - %d \n", nam, num, mName, mScore);
	}

	public static void search() {
		System.out.println("조회할 이름을 입력해라");
		String sname = scn.nextLine();
		boolean isExist = false;
		for (int i = 0; i < Students.length; i++) {
			if (Students[i] != null && Students[i].getSname().equals(sname)) {
				System.out.printf("학생번호:%s 이름:%s 성별:%s 점수:%d \n", Students[i].getSid(), Students[i].getSname(),
						Students[i].getSex(), Students[i].getScore());
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			System.out.printf("%s 이름이 존재하지 않습니다. \n", sname);
		}
	}

	public static void modify() {
		System.out.println("수정할 학생번호 입력해라");
		String sid = scn.nextLine();
		boolean ab = false;
		for (int i = 0; i < Students.length; i++) {
			if (Students[i] != null && Students[i].getSid().equals(sid)) {
				System.out.println("수정할 점수 입력해라");
				Students[i].setScore(Integer.parseInt(scn.nextLine()));

				ab = true;
				break;
			}
		}
		if (ab) {
			System.out.println("수정되었다.");
		} else {
			System.out.println("없는번호다.");

		}
	}

	public static void remove() {
		System.out.println("삭제할 학생번호 입력해라");
		String sid = scn.nextLine();
		boolean ab = false;
		for (int i = 0; i < Students.length; i++) {
			if (Students[i] != null && Students[i].getSid().equals(sid)) {
				Students[i] = null;
				ab = true;
				break;
			}
		}
		if (ab) {
			System.out.println("삭제되었다.");
		} else {
			System.out.println("없는번호다.");

		}
	}

	public static void main(String[] args) {
		boolean good = true;
		int selectnum = 0;
		while (good) {
			System.out.println("1.등록 2.목록 3.조회(이름) 4.수정(점수) 5.삭제 6.종료");
			System.out.print("선택> ");
			selectnum = Integer.parseInt(scn.nextLine());
			if (selectnum == 1) {
				register();
			} else if (selectnum == 2) {
				list();
			} else if (selectnum == 3) {
				search();
			} else if (selectnum == 4) {
				modify();
			} else if (selectnum == 5) {
				remove();
			} else if (selectnum == 6) {
				good = false;
			}
		}

	}

	// 1.register() 2.list() 3.search() 4.modify() 5.remove()
	// 남 -2명 , 여 -3명 , 최고점수: 이름 - 100점
}
