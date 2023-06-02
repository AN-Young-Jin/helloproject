package com.yedam.object;

public class Student {
	// field.
	private String stdNo;
	private String stdName;
	private String gender;
	private int score;

	// constructor.
	public Student(String stdNo, String stdName, String gender, int score) {
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.gender = gender;
		this.score = score;
	}

	// methods. getter/setter.
	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// 학생의 정보 출력하는 메소드.
	public void showInfo() {
		System.out.printf("학번 %s, 이름 %s, 점수 %d \n", stdNo, stdName, score);
	}

}
