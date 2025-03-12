package org.example.lv3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> menuItems; // 메뉴항목 저장 리스트
    private Scanner scanner; // 스캐너

    // 생성자
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.scanner = new Scanner(System.in);
    }

    public void start() { // main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리
       // 프로그램 실행 상태 관리 변수
        boolean running = true;

        while (running) {
            System.out.println("[ Kiosk Menu ]"); // 메뉴목록 출력
            for(int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.println((i + 1) + ". " + item.getName()+" | W "+item.getPrice()+" | "+item.getInfo());
            }
            // 종료 출력
            System.out.println("메뉴를 골라주세요(종료하려면 '0' 입력): ");
            // 정수로 입력받기
            int choice = -1;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                // 정수가 이닐시 예외
                scanner.nextLine();
                System.out.println("잘못된 입력이빈다. 숫자를 입력하세요.");
                continue; // 반복문 처음으로 돌아감
            }
            // switch-case 문으로 기본 옵션 처리
            switch (choice) {
                case 0:  // 종료 옵션 선택
                    System.out.println("프로그램을 종료합니다.");
                    running = false; // 반복문 종료 조건
                    break;

                default:
                    // 메뉴 범위 내의 선택인지 확인
                    if (choice >= 1 && choice <= menuItems.size()) {
                        MenuItem selectItem = menuItems.get(choice - 1);
                        System.out.println(selectItem.getName() + " W " + selectItem.getPrice() +" | " +  selectItem.getInfo()); // 선택메뉴 출력
                    } else {
                        System.out.println("잘못된 입력이빈다. 다시 선택해주세요."); // 옳바르지 않은 메뉴 번호 입렧 시
                    }
                    break;
            }
            System.out.println();// 줄 바꿈
        }
        scanner.close();
        }
    }


