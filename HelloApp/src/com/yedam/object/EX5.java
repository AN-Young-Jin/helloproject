package com.yedam.object;

import java.util.Scanner;


 class tem {
	String name;
	int itemno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setItemno(int itemno) {
		this.itemno = itemno;
	}
	public int getItemno() {
		return itemno;
	}
	
}
 
public class EX5 {
	static tem[] items ;
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		int itemNo = 0;
		
	
		
		while(run) {
			System.out.println("1.상품수 2.상품 및 가격입력 3.제품별 가격 4.분석 5.종료");
			System.out.println("선택 >");
			int selno = Integer.parseInt(scn.nextLine());
			
			
			switch(selno) {
			case 1 :
				System.out.println("상품수를 입력하세요");
				itemNo = Integer.parseInt(scn.nextLine());
				items = new tem[itemNo];
				break;
				
			case 2 : 
				System.out.println("상품 및 가격을 입력하세요");
				for(int i =0 ; i <items.length; i++) {
					String name = scn.nextLine();
					int itemno = Integer.parseInt(scn.nextLine());
					
					tem t1 = new tem();
					t1.setName(name);
					t1.setItemno(itemno);
					items[i] = t1;
				}
				break;
				
			case 3 : 
				for(int i=0; i<items.length; i++) {
					System.out.println(items[i].getName()+ "=" + items[i].getItemno());
				}
				break;
			case 4 :
				int max =0;
				int sum =0;
				int sum1 = 0;
				for(int i=0 ; i<items.length; i++) {
					sum += items[i].getItemno();
					if(items[i].getItemno() > max) {
						max = items[i].getItemno();
					}
					sum1 = sum - max;
				}
				System.out.printf("최고가격 %d 총합 %d \n",max ,sum1);
				break;
			case 5 :
				run = false;
			}
		}
		System.out.println("끝");
	} // main
}
