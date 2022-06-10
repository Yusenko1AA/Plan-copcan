package com.java.zad3e;

import java.awt.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public abstract class E_Administrator implements IAddService,IAddRoom {
    public static void main(String[] args) {



        ArrayList clientList = new ArrayList();
        clientList.add(new Client("Petr",20));
        clientList.add(new Client("Sasha",25));
        clientList.add(new Client("Vanya",26));
        clientList.add(new Client("Semen",30));
        clientList.add(new Client("Matvej",17));
        clientList.add(new Client("Ivan",19));
        clientList.add(new Client("Georgij",42));

        for(Object o : clientList){
            System.out.println(o);
        }


        ArrayList roomList = new ArrayList();
        roomList.add(new Room(StatusRoom.AVAILABLE,3,1,15));
        roomList.add(new Room(StatusRoom.AVAILABLE,3,2,25));
        roomList.add(new Room(StatusRoom.AVAILABLE,3,3,35));
        roomList.add(new Room(StatusRoom.REPAIRED,3,2,25));
        roomList.add(new Room(StatusRoom.AVAILABLE,4,1,25));
        roomList.add(new Room(StatusRoom.AVAILABLE,4,2,40));
        roomList.add(new Room(StatusRoom.AVAILABLE,4,3,60));
        roomList.add(new Room(StatusRoom.SERVICED,4,3,60));
        roomList.add(new Room(StatusRoom.AVAILABLE,5,1,35));
        roomList.add(new Room(StatusRoom.AVAILABLE,5,2,55));
        roomList.add(new Room(StatusRoom.AVAILABLE,5,3,85));

        for(Object o1 : roomList){
            System.out.println(o1);
        }

    }
}
