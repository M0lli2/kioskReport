package org.example.lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> menuItems;
    private Scanner scanner;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("[ Kiosk Menu ]");
        }
    }
}
