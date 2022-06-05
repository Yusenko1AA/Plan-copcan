/*
package com.java.zad3b;

public class Flower {
    private final double price;
    private final String name;
    private final Color color;

    protected Flower(double price, String name, Color color) {
        if (price < 0) {
            throw new IllegalArgumentException("Price can not be less then zero.");
        }
        this.price = price;
        if (name == null) {
            throw new NullPointerException("Argument name can not be null.");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name of flower can not be empty.");
        }
        this.name = name;
        if (color == null) {
            throw new NullPointerException("Argument color can not be null.");
        }
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }
}
*/