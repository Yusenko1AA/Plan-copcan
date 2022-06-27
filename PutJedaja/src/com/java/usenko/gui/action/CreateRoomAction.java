package com.java.usenko.gui.action;

import com.java.usenko.entity.Room;
import com.java.usenko.entity.RoomStatus;
import com.java.usenko.gui.Action;
import com.java.usenko.service.RoomService;
import com.java.usenko.util.ScannerUtil;

import java.util.Scanner;

public class CreateRoomAction implements Action {

    private final RoomService roomService;

    public CreateRoomAction(RoomService roomService) {
        this.roomService = roomService;
    }

    @Override
    public void execute() {
        //TODO: считать кол-во звезд, цену, спальные места
        System.out.println("введите количество звезд");
        int star = ScannerUtil.readInt();
        System.out.println("введите количество cпальных мест");
        int sleepPlace = ScannerUtil.readInt();
        System.out.println("введите цену");
        double price = ScannerUtil.readDouble();
        Room room = new Room();
        room.setRoomStatus(RoomStatus.AVAILABLE);
        room.setStars(star);
        room.setSleepPlace(sleepPlace);
        room.setPrice(price);
        roomService.create(room);
    }
}
