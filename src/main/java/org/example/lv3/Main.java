package org.example.lv3;

import org.example.lv3.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> menu = new ArrayList<>();
        menu.add(new MenuItem("Fried Chicken", 18000, "크리스피한 후라이드");
        menu.add(new MenuItem());
        menu.add(new MenuItem());

        Kiosk kiosk = new Kiosk(menu);
        kiosk.start();
    }
}
