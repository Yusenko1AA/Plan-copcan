package com.java.usenko.gui.action;

import com.java.usenko.entity.Room;
import com.java.usenko.gui.Action;
import com.java.usenko.service.RoomService;

import java.util.Scanner;

public class PrintRoomAction implements Action {
    private final RoomService roomService;

    public PrintRoomAction(RoomService roomService) {
        this.roomService = roomService;
    }

    @Override
    public void execute() {
        //TODO: считывание из утилиты
        System.out.println("Введите идшник комнаты");
        Scanner scanner = new Scanner(System.in);
        Long roomId = scanner.nextLong();
        Room room = roomService.getById(roomId);
        System.out.println(room);
    }
}
