package com.aschelfo.coffee;

public class Menu {
    // 1. Core Object Fields (State variables)
    private String name;
    private double price;

    // 2. Constructor Blueprint (How to make an individual coffee item)
    public Menu(String name, double price) {
      this.name = name;
      this.price = price;
    }

    // 3. Getter Methods (How to securely pull information out)
    public String getName() {
      return name;
    }

    public double getPrice() {
      return price;
    }
}
