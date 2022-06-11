package com.java.zad3e;

public class Room implements IAddRoom, Comparable<Room> {

        StatusRoom statusRoom;
        private int stars;
        private int sleepPlace;
        private int price;

    public Room(StatusRoom statusRoom,int stars, int sleepPlace, int price) {
        this.statusRoom = statusRoom;
        this.stars = stars;
        this.sleepPlace = sleepPlace;
        this.price = price;
    }


    public StatusRoom getStatusRoom() {
        return statusRoom;
    }

    public void setStatusRoom(StatusRoom statusRoom) {
        this.statusRoom = statusRoom;
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

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public int compareTo(Room r1) {
        return this.stars - r1.stars;
    }

    @Override
    public int compareTo1(Room r3) {
        return this.price - r3.price;
    }

    @Override
    public int compareTo2(Room r3) {
        return this.sleepPlace - r3.sleepPlace;
    }

    @Override
    public String toString() {
        return "Room{" +
                "stars=" + stars +
                ", sleepPlace=" + sleepPlace +
                ", price=" + price +
                '}';
    }
}





