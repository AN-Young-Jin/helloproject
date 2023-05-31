package com.yedam.control;

public class ControlEx4 {
	public static void main(String[] args) {
		// 1부터 100까지의 수중에서 3의배수의 합계 method1()
		// Math.random() 의 2번 실행 => 두수의 합이 5가 되는 경우.
		// 반복회수를 중단. method2()
		// 반복문 for를 활용 
		//*
		//**
		//***
		//****  method3()
		//method1();
		//method2();
		//method3();
		method4();
		
	}
	public static void method1() {
		int sum = 0;
		for (int i=1; i<=100; i++) {
			if(i %3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	public static void method2() {
		while(true) {
			int num1 = (int)(Math.random()*4)+1;
			int num2 = (int)(Math.random()*4)+1;
			int result = num1 + num2;
		 if(result == 5) {
			 System.out.println(result);
			 break;
		 	} 
		}
	}
	public static void method3() {
		
		
		for(int i=1; i<5; i++) {
			for(int j=1; j<5; j++) {
				if( i < j ) {
					System.out.printf("%s" , "");
				} else {
					System.out.printf("%s" , "*");
				}
			}
			System.out.println();
		}
	}
	
	public static void method4() {
		
		
		for(int i=1; i<5; i++) {
			for(int j=1; j<5; j++) {
				if( i + j >= 5) {
					System.out.printf("%s" , "*");
				} else {
					System.out.printf("%s" , " ");
				}
			}
			System.out.println();
		}
	}
}
