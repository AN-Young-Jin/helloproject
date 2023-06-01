package com.yedam.reference;

import java.util.Arrays;
import java.util.Collections;

public class referenceEx5 {
	public static void main(String[] args) {
		Integer[] intAry = new Integer[3];
		intAry[0] = (int)(Math.random()*100);//3;
		intAry[1] = (int)(Math.random()*100);//7; 
		intAry[2] = (int)(Math.random()*100);//1; 
		
		Arrays.sort(intAry ,Collections.reverseOrder());
		for(int x : intAry) System.out.println(x + " ");

		
		
		
		
		
		
		
		
//		for(int i = 0; i<intAry.length; i++) {
//			//i = 0;
//			int temp = 0;
//			if(intAry[i] < intAry[i+1]) {
//				temp = intAry[i];
//			   intAry[i] = intAry[i+1];
//			   intAry[i+1] = temp;
//			}
//		}
	}
}
//		int a = (int)(Math.random()*100);//34;
//		int b = (int)(Math.random()*100);;
//		int c = (int)(Math.random()*100);;
//		
//		//제일 큰수 intAry의 첫번째: 제일큰값...제일작은값.
//		//intAry[0] = 85 , intAry[1] = 34 , intAry[2] = 22
//		int[] intAry = {85,34,22};
//		for (int i=0; i<intAry.length; i++) {
//			intAry[0]+= i;
//			System.out.println(intAry[i]);
//		}
//	

