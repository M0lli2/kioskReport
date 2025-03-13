package org.example.lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 메뉴 아이템 생성(치킨)
        Chicken chicken1 = new Chicken("Fried Chicken", 18000, "크리스피한 후라이드치킨");
        Chicken chicken2 = new Chicken("Oven bake Chicken", 22000, "담백한 오븐구이치킨");
        Chicken chicken3 = new Chicken("Seasoned Chicken", 21000, "매콤달콤한 양념치킨");
        Chicken chicken4 = new Chicken("Soy sauce Chicken", 21000, "달콤짭짤한 간장치킨");

        // add 함수 활용 리스트에 메뉴 아이템 추가(치킨)
        List<Chicken> chickens = new ArrayList<>();// List 선언 chicken menuitem 추가
        chickens.add(chicken1);
        chickens.add(chicken2);
        chickens.add(chicken3);
        chickens.add(chicken4);

        // 메뉴 아이템 생성(피자)
        Pizza pizza1 = new Pizza("Cheese Pizza", 21000, "치즈가 늘어나는 맛있는 피자");
        Pizza pizza2 = new Pizza("Pepperoni Pizza", 23000, "짭짤하고 기름진 맛있는 피자");
        Pizza pizza3 = new Pizza("Margherita Pizza", 24000, "신선하고 담백한 맛있는 피자");
        Pizza pizza4 = new Pizza("Gorgonzola Pizza", 23000, "단짠단짠 맛있는 피자");

        // add 함수 활용 리스트에 메뉴 아이템 추가(피자)
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(pizza1);
        pizzas.add(pizza2);
        pizzas.add(pizza3);
        pizzas.add(pizza4);

        // 메뉴 아이템 생성(음료)
        Drinks drink1 = new Drinks("Cheese Pizza", 21000, "치즈가 늘어나는 맛있는 피자");
        Drinks drink2 = new Drinks("Pepperoni Pizza", 23000, "짭짤하고 기름진 맛있는 피자");
        Drinks drink3 = new Drinks("Margherita Pizza", 24000, "신선하고 담백한 맛있는 피자");
        Drinks drink4 = new Drinks("Gorgonzola Pizza", 23000, "단짠단짠 맛있는 피자");

        // add 함수 활용 리스트에 메뉴 아이템 추가(음료)
        List<Drinks> drinks = new ArrayList<>();
        drinks.add(drink1);
        drinks.add(drink2);
        drinks.add(drink3);
        drinks.add(drink4);




        // 키오스크
        Kiosk kiosk = new Kiosk(chickens, pizzas, drinks);
        kiosk.start();
    }
}
