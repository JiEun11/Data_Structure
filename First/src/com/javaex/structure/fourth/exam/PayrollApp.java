package com.javaex.structure.fourth.exam;

import java.util.Scanner;


public class PayrollApp {
	static Scanner sc;

	public static void main(String[] args) {
		
		SalaryManagement sm = new SalaryManagement();
		
		System.out.println("—————급여 관리 시스템—————");
		
		while(true) {
			System.out.println("1. 관리자 모드 2. 사용자 모드 3. 프로그램 종료");
			sc = new Scanner(System.in);
			int num = sc.nextInt();
			int temp_id = 0;
            int temp_pw = 0;
			switch(num) {
			case 1:
				sc = new Scanner(System.in);
				System.out.println("id와 pw를 입력하세요.");
				System.out.print("ID: ");
                temp_id = sc.nextInt();
                
				System.out.print("Password: ");
                temp_pw = sc.nextInt();
	
                
				if(sm.checkAdmin(temp_id, temp_pw)) {
					// 관리자 모드 진입
					sm.adminMode();
				} else {
					System.out.println("관리자 로그인에 실패하였습니다.");
					System.out.println();
					break;
				}
				// 관리자 모드
				break;
			case 2:
				sm.userMode(temp_id, temp_pw);
				// 사용자 모드
				break;
			case 3:
				System.out.println("————급여 관리 시스템 종료————");
				return;
			}
		}

	}
	

}