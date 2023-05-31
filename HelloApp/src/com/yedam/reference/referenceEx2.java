package com.yedam.reference;

public class referenceEx2 {
	public static void main(String[] args) {
		// int s1 = 90; int s2 = 80;  ... int s20 = 90;
		int[] intAry = {30,40,50};
		double[] dblAry = {30.0 , 40.0 , 50.0};
		String[] strAry = {"H" , "E" , "L" , "L" , "O"};
		int[] intAry2 = new int[3]; // 3개의 공간만듬 0,0,0
		
		// 배열의 크기는 한번 정해지면 불변
		//intAry[3] = 33; // 자리없어서 에러
		System.out.println(intAry2[0]);
		intAry2[0] = 33;
		System.out.println(intAry2[0]);
		
		int sum = intAry[0] + intAry[1] + intAry[2];
		sum = 0; //초기값을 지정.
		for(int i = 0 ; i<3; i++) {
			sum += intAry[i];
		}
		//확장 for
		for(String str : strAry) {
			System.out.println(str);
		}
		System.out.println("sum: " + sum);
		double sum1 = dblAry[0] + dblAry[1] + dblAry[2];
		
	}
}
