package org.example.lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String category;
    private List<Chicken> chickens;
    private List<Pizza> pizzas;
    private List<Drinks> drinks;

    public Menu(String category)  {
        this.category = category;
        this.chickens =new ArrayList<>();
        this.pizzas = new ArrayList<>();
        this.drinks =new ArrayList<>();
    }

    public String getCategory() {
        return category;
    }
    public List<Chicken> getChicken() {
        return
    }

}