package com.javaex.structure.fourth.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class SalaryManagement {

     // private String empNum; // 사원(사원번호를 통해 검색)
     private FulltimeEmployee regular;
     private ParttimeEmployee partTime;
  
          
     public SalaryManagement() { // 정규직
        /*
         this.regular = regular;
         partTime = null;
     }
  
     public SalaryManagement(ParttimeEmployee partTime) { // 비정규직
         /*
          * divRP는 급여관리 객체를 만드는 클래스에서 해당 직원 사번의 첫글자 정규직 = R / 비정규직 = P로 판단함
          */
         regular = null;
         this.partTime = partTime;
     }


     public boolean checkAdmin(int id, int pw){
         if(id == 1 && pw == 1234)
         {
            return true;
         }
         return false;

     }

     public void adminMode() {
        System.out.println("------------관리자 모드 ----------------");
        
        Scanner sc =new Scanner(System.in);
        FulltimeManage fm = new FulltimeManage();
        boolean flag = false;
        
        while(true) {
           sc = new Scanner(System.in);
           System.out.println("1.번 등록 2.수정 3.삭제 4.검색 5.전체 조회 6.되돌아가기");
           int num = sc.nextInt();
           
           switch(num) {
           case 1:
              fm.input();
              break;
           case 2:
              fm.modifi();
              break;
           case 3:
              fm.delete();
              break;
           case 4:
              fm.search();
              break;
           case 5:
              fm.allOutput();
              break;
           case 6:
              flag = true;
              break;
           }
           
           if(flag) {
              System.out.println("---------------관리자 모드 종료 -----------------");
              break;
              
           }
              
        }
        
     }

     public void UserMode(int id, int pw){
        System.out.println("------------사원 모드 ----------------");
        
        Scanner sc =new Scanner(System.in);
        FulltimeManage fm = new FulltimeManage();
        boolean flag = false;
        
        while(true) {
           sc = new Scanner(System.in);
           System.out.println("1.조회");
           int num = sc.nextInt();
           
           switch(num) {
           case 1:
              fm.userSearch(id, pw);
              break;
           }
           
           if(flag) {
              System.out.println("---------------관리자 모드 종료 -----------------");
              break;
              
           }
              
        }
     }
  
 }
 