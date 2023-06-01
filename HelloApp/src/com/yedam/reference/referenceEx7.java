package com.yedam.reference;

public class referenceEx7 {
	public static void main(String[] args) {
		
		
		//학교의 키. a반(2) b반(4) c반(3)
		double[][] heightAry = {
				{173.5 , 168.3}, 				//a반
				{173.5 , 158.3, 182.4, 177.3},	//b반
				{173.5 , 168.3, 155.1}			//c반
		};
	//	System.out.println(heightAry[1].length);
		
		// 각반별로 키의 평균을 구해
		for(int i=0; i < heightAry.length; i++) {
			double sum =0;
			for (int j=0; j<heightAry[i].length; j++) {
				sum += heightAry[i][j];
				
			}
			System.out.printf("%d반의 평균키 : %.1f \n", i+1,(sum/heightAry[i].length) );
		}
		
		
	}
}
