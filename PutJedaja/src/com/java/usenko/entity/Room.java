package com.java.usenko.entity;

import java.util.ArrayList;
import java.util.List;

public class Room  extends AbstractEntity {
    private RoomStatus roomStatus;
    private int stars;
    private int sleepPlace;
    private double price;
    private List<Client> clients = new ArrayList<>();

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomStatus=" + roomStatus +
                ", stars=" + stars +
                ", sleepPlace=" + sleepPlace +
                ", price=" + price +
                ", clients=" + clients +
                '}';
    }

    public Room() {

    }

    public Room(RoomStatus roomStatus, int stars, int sleepPlace, int price) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

