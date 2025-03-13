package org.example.lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String category; // 메뉴 카테고리
    private List<MenuItem> menuItems; // 카테고리별 메뉴 리스트

    // 생성자 카테고리명 초기화
    public Menu(String category)  {
        this.category = category;
        this.menuItems =new ArrayList<>();
    }
    //카테고리 이름 반환
    public String   getCategory() {
        return category;
    }
    // 메뉴 리스트 반환
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
    // 현재 카테고리 모든 메뉴 출력
    public void printMenu() {
        System.out.println("[ " + category + " ]");

        for(int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.println((i + 1) + ". " + item.getName()+" | W "+item.getPrice()+" | "+item.getInfo());
        }
    }

}