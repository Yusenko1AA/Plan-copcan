package com.java.zad3e;

public class Service implements IAddService {
    TypeService typeService;
    private double price;

    public Service(TypeService typeService, double price) {
        this.typeService = typeService;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
