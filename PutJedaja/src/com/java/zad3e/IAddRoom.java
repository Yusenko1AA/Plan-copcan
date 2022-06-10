package com.java.zad3e;

public interface IAddRoom {
    Room getRoom1 = new Room(StatusRoom.REPAIRED,3, 2,35);
    Room getRoom2 = new Room(StatusRoom.SERVICED,2, 2,25);
    Room getRoom3 = new Room(StatusRoom.AVAILABLE,4,2,65);
    Room getRoom4 = new Room(StatusRoom.AVAILABLE,4,3,75);
    Room getRoom5 = new Room(StatusRoom.AVAILABLE,5,1,35);

    int compareTo1(Room r3);

    int compareTo2(Room r3);
}
