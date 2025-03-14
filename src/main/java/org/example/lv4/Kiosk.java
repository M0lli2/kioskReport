package org.example.lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus; // 전체 메뉴 리스트
    private Scanner scanner; // 스캐너

    // 생성자
    public Kiosk() {
        this.menus = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    // 카테고리별 메뉴 추가
    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    // Kiosk 실행
    public void start() {
        // 프로그램 실행 상태 관리 변수
        boolean running = true;

        while (running) {
            System.out.println("[ Kiosk Menu ]"); // 메뉴목록 출력

            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + "." + menus.get(i).getCategory());
            }
            // 종료 출력
            System.out.println("메뉴를 골라주세요(종료하려면 '0' 입력): ");

            // 정수로 입력받기
            int choice = scanner.nextInt();
            scanner.nextInt();

            if (choice < 1 || choice > menus.size()) {
                System.out.println("잘못된 입력이빈다. 숫자를 입력하세요.");
                continue; // 반복문 처음으로 돌아감
            }
            // 선택한 카테고리 메뉴 출력
            Menu select = menus.get(choice - 1);
            select.printMenu();
            System.out.println("메뉴를 선택하세요(뒤로가려면 '0'입력):");
            int choiceMenu = scanner.nextInt();
            scanner.nextLine();

            if (choiceMenu == 0) {
                continue;
            }
            List<MenuItem> menuItems = select.getMenuItems();
            if (choiceMenu < 1 || choiceMenu > menuItems.size()) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            //t선택한 메뉴 출력
            MenuItem chooseMenu = menuItems.get(choiceMenu-1);
            System.out.println("선택한 메뉴: " );
            System.out.println(chooseMenu.getName()+" | W "+ chooseMenu.getPrice()+" | "+ chooseMenu.getInfo());
            scanner.close();
        }

    }
}

