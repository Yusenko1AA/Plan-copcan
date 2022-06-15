package com.java.usenko.comparator;

import com.java.usenko.entity.Room;

import java.util.Comparator;

public class RoomBySleepPlaceComparator implements Comparator<Room> {
    @Override
    public int compare(Room o1, Room o2) {
        return o1.getSleepPlace() - o2.getSleepPlace();
    }
}
