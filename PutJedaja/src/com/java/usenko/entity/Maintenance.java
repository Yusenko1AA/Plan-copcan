package com.java.usenko.entity;

public class Maintenance {
    private Long id;
    TypeMaintenance typeService;
    private int price;

    public Maintenance(Long id, TypeMaintenance typeService, int price) {
        this.id = id;
        this.typeService = typeService;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeMaintenance getTypeService() {
        return typeService;
    }

    public void setTypeService(TypeMaintenance typeService) {
        this.typeService = typeService;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

