package com.yedam.reference;

import java.util.Scanner;

// 학생: 이름(String), 영어점수(int) , 수학점수(int)
class Student{
	String name; //속성
	int engScore;
	int mathScore;
}

public class referenceEx9 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "레드규연";
		s1.engScore = 25;
		s1.mathScore = 15;
		
		Student s2 = new Student();
		s2.name = "레드준표";
		s2.engScore = 8;
		s2.mathScore = 18;
		
		Student s3 = new Student();
		s3.name = "레드콤보";
		s3.engScore = 28;
		s3.mathScore = 48;
		
		Student[] students = {s1,s2,s3};
		Scanner scn = new Scanner(System.in);
		String sName = scn.nextLine();
		boolean a = false;
		
		for(int i=0; i<students.length; i++) {
			if(students[i].name.equals(sName)) {
			System.out.println(students[i].name);
			System.out.println(students[i].engScore);
			System.out.println(students[i].mathScore);
			System.out.println("----------------------");
			a = true;
			}
		}
			if(a == false) {
			System.out.println("노답");
		}
		scn.close();
	}
}
