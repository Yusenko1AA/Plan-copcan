package com.java.zad3e;

public class Room implements IAddRoom {

        StatusRoom statusRoom;
        private int stars;
        private int sleepPlace;
        private double price;

    public Room(StatusRoom statusRoom,int stars, int sleepPlace, double price) {
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

    public void setPrice(double price) {
        this.price = price;
    }
}





