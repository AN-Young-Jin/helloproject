package com.yedam.object;

public class ObjectEx3 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
//		p1.name = "홍규연";
//		p1.setName("홍규연");
//		p1.age = 38;
//		p1.setage(38);
//		p1.age = -20;
//		p1.setage(-20);
		System.out.println(p1.getName() +", " + p1.getAge());
//		p1.yearAfter(51);
	}
}
