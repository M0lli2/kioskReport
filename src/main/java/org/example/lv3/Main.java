package org.example.lv3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

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

        // 키오스크
        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();
    }
}
