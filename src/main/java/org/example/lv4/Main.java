package org.example.lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 메뉴 아이템 생성(치킨)
        Menu chickenMenu = new Menu("Chicken"); // 카테고리별 메뉴 객체 생성
        chickenMenu.addMenuItem(new MenuItem("Fried Chicken", 18000, "크리스피한 후라이드치킨"));
        chickenMenu.addMenuItem(new MenuItem("Oven bake Chicken", 22000, "담백한 오븐구이치킨"));
        chickenMenu.addMenuItem (new MenuItem("Seasoned Chicken", 21000, "매콤달콤한 양념치킨"));
        chickenMenu.addMenuItem(new MenuItem("Soy sauce Chicken", 21000, "달콤짭짤한 간장치킨"));

        // 메뉴 아이템 생성(피자)
        Menu pizzaMenu = new Menu("Pizza");// 카테고리별 메뉴 객체 생성
        pizzaMenu.addMenuItem(new MenuItem("Cheese Pizza", 21000, "치즈가 늘어나는 맛있는 피자"));
        pizzaMenu.addMenuItem(new MenuItem("Pepperoni Pizza", 23000, "짭짤하고 기름진 맛있는 피자"));
        pizzaMenu.addMenuItem (new MenuItem("Margherita Pizza", 24000, "신선하고 담백한 맛있는 피자"));
        pizzaMenu.addMenuItem(new MenuItem("Gorgonzola Pizza", 23000, "단짠단짠 맛있는 피자"));


        // 메뉴 아이템 생성(음료)
        Menu drinksMenu = new Menu("Drinks");// 카테고리별 메뉴 객체 생성
        drinksMenu.addMenuItem(new MenuItem("Coke", 2500, "청량한 콜라"));
        drinksMenu.addMenuItem(new MenuItem("Beer", 3200, "시원한 생맥주"));
        drinksMenu.addMenuItem (new MenuItem("Cider", 2500, "청량한 사이다"));
        drinksMenu.addMenuItem(new MenuItem("Coffee", 2200, "과제와 공부에 찌든 당신을 위한 커피"));


        // 키오스크 객체 생성
        Kiosk kiosk = new Kiosk();
        // Kiosk에 메뉴 추가
        kiosk.addMenu(chickenMenu);
        kiosk.addMenu(pizzaMenu);
        kiosk.addMenu(drinksMenu);
        kiosk.start();
    }
}
