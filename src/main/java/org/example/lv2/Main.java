package org.example.lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // Main 함수

        // 메뉴 아이템 생성
        MenuItem chicken1 = new MenuItem("Fried Chicken", 18000, "크리스피한 후라이드");
        MenuItem chicken2 = new MenuItem("Oven bake Chicken", 22000, "담백한 오븐구이");
        MenuItem chicken3 = new MenuItem("Seasoned Chicken", 21000, "매콤달콤한 양념");
        MenuItem chicken4 = new MenuItem("Soy sauce Chicken", 21000, "달콤짭짤한 간장");

        // add 함수 활용 리스트에 메뉴 아이템 추가
        List<MenuItem> menuItems = new ArrayList<>();// List 선언 chicken menuitem 추가
        menuItems.add(chicken1);
        menuItems.add(chicken2);
        menuItems.add(chicken3);
        menuItems.add(chicken4);

        // Scanner 선언
        Scanner scanner = new Scanner(System.in);

        // 메뉴 출력 - 향상된 for 문
        System.out.println("[ CHICKEN MENU ]");
        for (MenuItem item : menuItems) {
            System.out.println("치킨 메뉴 = " + "이름: " + item.getName() + " | W  " + item.getPrice() + " | " + item.getInfo());
        }

        boolean running = true;

        while (running) {

            // 숫자 입력 받기
            System.out.println("메뉴를 골라주세요(종료하려면 '0' 입력): ");
            int choice = scanner.nextInt();

            // 입력된 숫자에 따른 처리
            switch (choice) {
                case 0:
                    System.out.println("메뉴선택을 종료합니다.");
                    running = false; // 0 입력시 while 문 종료 (프로그램 종료)
                    break;
                case 1:
                    System.out.println("Fried Chicken 선택: " + menuItems.get(0).getName() + " | W " + menuItems.get(0).getPrice() + " | " + menuItems.get(0).getInfo());
                    break; // switch문을 탈출해서 while문으로 돌아가 반복
                case 2:
                    System.out.println("Oven bake Chicken 선택: " + menuItems.get(1).getName() + " | W " + menuItems.get(1).getPrice() + " | " + menuItems.get(1).getInfo());
                    break; // switch문을 탈출해서 while문으로 돌아가 반복
                case 3:
                    System.out.println("Seasoned Chicken 선택: " + menuItems.get(2).getName() + " | W " + menuItems.get(2).getPrice() + " | " + menuItems.get(2).getInfo());
                    break; // switch문을 탈출해서 while문으로 돌아가 반복
                case 4:
                    System.out.println("Soy sauce Chicken 선택: " + menuItems.get(3).getName() + " | W " + menuItems.get(3).getPrice() + " | " + menuItems.get(3).getInfo());
                    break; // switch문을 탈출해서 while문으로 돌아가 반복
                default:   // 예외처리
                    System.out.println("옳바르지 않은 선택입니다. 다시 선택해주세요.");
            }
            System.out.println();
        }
    }
}
