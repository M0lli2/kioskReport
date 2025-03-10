package org.example.lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuItem {
    private String name;
    private double price;
    private String info;


    public MenuItem(String name, double price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }
    public void item() {
        System.out.println("이름: " + name + ", 가격: " + price + "원, 설명: " + info);
    }


    // main 함수
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();// List 선언 Lv1 chicken menuitem 추가
        Scanner scanner = new Scanner(System.in);  // Scanner 선언

        // MenuItem 객체? item 추가
        menuItems.add(new MenuItem("Fried Chicken", 18000, "크리스피한 후라이드"));
        menuItems.add(new MenuItem("Oven bake Chicken", 22000, "담백한 오븐구이"));
        menuItems.add(new MenuItem("Seasoned Chicken", 21000, "매콤달콤한 양념"));
        menuItems.add(new MenuItem("Soy sauce Chicken", 21000, "달콤짭짤한 간장"));

        // 메뉴 출력 - 향상된 for 문
        for (MenuItem item : menuItems) {
            System.out.println("치킨 메뉴 = "+ menuItems);
        }



    }
}
