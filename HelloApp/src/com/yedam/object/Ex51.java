package com.yedam.object;

import java.util.Scanner;

 class tem1 {
	String name;
	int price;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}
 
public class Ex51 {
	
	static Scanner scn = new Scanner(System.in);
	static tem1[] items ;
	public static void main(String[] args) {
		
		
		boolean run = true;
		int itemNo =0;
		
		while(run) {
			System.out.println("1.상품수 2.상품 및 가격입력 3.제품별 가격 4.분석 5.종료");
			System.out.println("선택 >");
			int selno = Integer.parseInt(scn.nextLine());
			
			switch(selno){
			case 1:
				System.out.println("상품수를 입력하세요");
				itemNo = Integer.parseInt(scn.nextLine());
				items = new tem1[itemNo];
				break;
				
			case 2:
				for(int i =0; i<items.length; i++) {
				System.out.println("상품이름을 입력하세요");
				String name = scn.nextLine();
				System.out.println("상품가격을 입력하세요");
				int price = Integer.parseInt(scn.nextLine());
				
				tem1 t1 = new tem1();
				t1.setName(name);
				t1.setPrice(price);
				items[i]= t1;
				}
				break;
			case 3:
				for(int i=0; i<items.length; i++) {
					System.out.println(items[i].getName() +"="+ items[i].getPrice());
				}
				break;
				
			case 4:
				int max =0;
				int sum =0;
				int sum1 =0;
				for(int i=0; i<items.length; i++) {
					sum += items[i].getPrice();
					if(items[i].getPrice()>max) {
						max = items[i].getPrice();
					}
					sum1 = sum - max;
				}
				System.out.printf("최고가격은 %d원이고 제외한 총합은 %d입니다. \n ",max , sum1);
				break;
				
			case 5:
				run = false;
			}
				
		}
		System.out.println("끝");
	}
}
