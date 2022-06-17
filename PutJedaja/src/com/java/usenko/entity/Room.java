package com.java.usenko.entity;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private Long id;
    private RoomStatus roomStatus;
    private int stars;
    private int sleepPlace;
    private int price;
    private List<Client> clients = new ArrayList<>();

    public Room() {

    }

    public Room(Long id, RoomStatus roomStatus, int stars, int sleepPlace, int price) {
        this.id = id;
        this.roomStatus = roomStatus;
        this.stars = stars;
        this.sleepPlace = sleepPlace;
        this.price = price;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getSleepPlace() {
        return sleepPlace;
    }

    public void setSleepPlace(int sleepPlace) {
        this.sleepPlace = sleepPlace;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

