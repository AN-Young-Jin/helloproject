package com.yedam.operator;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
			
		System.out.println("첫번째");
		int c = scr.nextInt();
		System.out.println("두번째");
		int d = scr.nextInt();
		int e = 0;
		for(int i=c; i<=d; i++) {
			for(int n=1; n<10; n++) {
				e = i*n;
				System.out.println(e);
			}
		}
		
		}
												
	}

