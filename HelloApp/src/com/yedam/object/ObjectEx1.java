package com.yedam.object;

import java.util.Scanner;

public class ObjectEx1 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		Member[] members = new Member[2];
		//등록
		for(int i=0; i<members.length; i++) {
			Member m1 = new Member();
			System.out.print("아이디를 입력> ");
			String id = scn.nextLine();
				
				if (i != 0) {
					boolean dudu = false; // 중복된 아이디를 체크하기위해 선언
					for(int j=0; j<i; j++) {
					if(members[j].memberId.equals(id)) {
						dudu =true; //중복된 아이디임을 확인.
						break; //중복여부를 확인했으면 다음 순번을 볼 필요없음
					}
				}		
					if(dudu) {
						System.out.println("ㄴㄴ");
						i--; //순번을 한번 빼줌.
						continue;
					}			
					m1.memberId = id;
			}				
			
			System.out.print("이름을 입력> ");
			m1.membetName = scn.nextLine();
			System.out.print("포인트를 입력> ");
			m1.point = Integer.parseInt(scn.nextLine());
			
			members[i] = m1;
		}
		//memberId 조회 후 point를 변경.
		System.out.println("조회할 아이디를 입력하세요");
		String searchId = scn.nextLine();
		System.out.println("변경할 ponit를 입력하세요");
		int newpoint = Integer.parseInt(scn.nextLine());
		
		for(int i =0;  i<members.length; i++) {
			if(members[i].memberId.equals(searchId)) {
				members[i].point = newpoint;
				System.out.println("변경된값: " +members[i].point);
			}
			
		}
		
				
		//출력
		for(int i=0; i<members.length; i++) {
			System.out.printf("아이디: %s, 이름: %s, ponit: %d \n",
					members[i].memberId,
					members[i].membetName,
					members[i].point);
		}
		scn.close();
	}
}
