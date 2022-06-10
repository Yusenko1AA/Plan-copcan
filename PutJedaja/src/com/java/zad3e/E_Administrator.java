package com.java.zad3e;

import java.awt.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class E_Administrator implements IAddService,IAddRoom {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();


        ArrayList clientList = new ArrayList();
        clientList.add(new Client("Petr",20));
        clientList.add(new Client("Sasha",25));
        clientList.add(new Client("Vanya",26));
        clientList.add(new Client("Semen",30));
        clientList.add(new Client("Matvej",17));
        clientList.add(new Client("Ivan",19));
        clientList.add(new Client("Georgij",42));






        Set roomSet = new TreeSet();
        roomSet.add(new Room(StatusRoom.AVAILABLE,3,1,15));
        roomSet.add(new Room(StatusRoom.AVAILABLE,3,2,25));
        roomSet.add(new Room(StatusRoom.AVAILABLE,3,3,35));
        roomSet.add(new Room(StatusRoom.REPAIRED,3,2,25));
        roomSet.add(new Room(StatusRoom.AVAILABLE,4,1,25));
        roomSet.add(new Room(StatusRoom.AVAILABLE,4,2,40.5));
        roomSet.add(new Room(StatusRoom.AVAILABLE,4,3,60.5));
        roomSet.add(new Room(StatusRoom.SERVICED,4,3,60.5));
        roomSet.add(new Room(StatusRoom.AVAILABLE,5,1,35));
        roomSet.add(new Room(StatusRoom.AVAILABLE,5,2,55));
        roomSet.add(new Room(StatusRoom.AVAILABLE,5,3,85));




    }
}
