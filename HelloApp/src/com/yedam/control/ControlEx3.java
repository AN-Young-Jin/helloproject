package com.yedam.control;

public class ControlEx3 {
	public static void main(String[] args) {
		int month = 5;
		String days = "Sun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		System.out.println("===========================");
		
		for(int i=0; i<getFirstDate(month); i++) {
		System.out.printf("%3s ", "");
		}
		for(int day = 1; day <=getLastDate(month); day++) {
			System.out.printf("%3d ", day);
			if((getFirstDate(month) + day) % 7 == 0) {
				System.out.println();
			}
		}
	}
	//4, 5, 6 월 달력. 토 월 수 30 31 30  
	public static int getFirstDate(int month) {
		int result = 0;
		switch(month) {
		case 4:
			result = 6; break;
		case 5:
			result = 1;break;
		case 6:
			result = 3;
			}
		return result;
		}
	
	
	public static int getLastDate(int month) {
		int result = 0;
		switch(month) {
		case 4:
			result = 30;break;
		case 5:
			result = 31;break;
		case 6:
			result = 30;
			}
		return result;
		}
	
	
	public static void method1() {
		//반복문 : for , while , do ~ while 
		for(int i=0; i<10; i++) {
			if(i % 2 ==1)
				System.out.printf("i의 값은 %d \n", i);
//			else
//				System.out.println("짝수입니다");
		}
	} // method1() end
	public static void method2() {
		for(int num=1;num<10;num++) {
			for(int num2=2; num2<=5; num2++) {	
				int num1 = num2; 
				System.out.printf("%d * %d = %d ", num1,num, (num1*num));
			}
			System.out.println();
		}
	} // method2() end
}
