package com.java.usenko.comparator;

import com.java.usenko.entity.Room;

import java.util.Comparator;

public class RoomByPriceComparator implements Comparator<Room> {
    @Override
    public int compare(Room o1, Room o2) {
        //TODO: сделавть результат вычитания интовым
        return ((int) (o1.getPrice() - o2.getPrice()));
    }
}
