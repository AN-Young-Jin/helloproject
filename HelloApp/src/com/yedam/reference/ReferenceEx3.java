package com.yedam.reference;

public class ReferenceEx3 {
	public static void main(String[] args) {
		// 학생점수 : 89.5 78.9 90.4 값을 저장. sum , avg 구함
		
		double[] dou = {89.5 , 78.9, 90.4};
		dou = new double[] {55.5 , 66.6 , 77.7, 88.8};
		double maxVal = 0;
		double sum = 0;
		for(int i=0; i<4; i++) { //for(double douu : dou){sum += douu }
			if(maxVal<dou[i]) {
				maxVal = dou[i];
			}
			sum += dou[i];
		}
		double avg = sum/3;
		System.out.println(sum);
		System.out.println(avg);
		System.out.printf("합계점수는 %.2f, 평균은 %.2f, 최고점수는 %.2f", sum,avg,maxVal);
	}
}
