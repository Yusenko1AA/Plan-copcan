package com.java.usenko.gui;

import com.java.usenko.gui.action.CreateRoomAction;
import com.java.usenko.gui.action.PrintRoomAction;
import com.java.usenko.service.RoomService;

public class Builder {
    private Menu rootMenu;

    private final RoomService roomService;

    public Builder(RoomService roomService) {
        this.roomService = roomService;
    }

    public Menu getRootMenu() {
        return rootMenu;
    }

    public void buildMenu() {
        Menu rootMenu = new Menu("Главное меню");

        Menu roomMenu = new Menu("Меню комнат");
        MenuItem createRoomMenuItem = new MenuItem("Создать комнату", new CreateRoomAction(roomService), roomMenu);
        MenuItem printRoomMenuItem = new MenuItem("Вывести комнату", new PrintRoomAction(roomService), roomMenu);
        MenuItem toRootFromRoomMenuItem = new MenuItem("Назад", null, rootMenu);
        roomMenu.getMenuItems().add(createRoomMenuItem);
        roomMenu.getMenuItems().add(printRoomMenuItem);
        roomMenu.getMenuItems().add(toRootFromRoomMenuItem);

        MenuItem roomMenuItem = new MenuItem("Меню комнат", null, roomMenu);
        rootMenu.getMenuItems().add(roomMenuItem);

        this.rootMenu = rootMenu;
    }
}
