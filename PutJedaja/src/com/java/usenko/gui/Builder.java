package com.java.usenko.gui;

import com.java.usenko.gui.action.*;
import com.java.usenko.service.RoomService;

public class Builder {
    private Menu rootMenu;

    private final HotelProvider hotelProvider;

    public Builder(HotelProvider hotelProvider) {
        this.hotelProvider = hotelProvider;
    }

    public Menu getRootMenu() {
        return rootMenu;
    }

    public void buildMenu() {
        Menu rootMenu = new Menu("Главное меню");

        Menu roomMenu = new Menu("Меню комнат");
        MenuItem createRoomMenuItem = new MenuItem("Создать комнату", new CreateRoomAction(hotelProvider), roomMenu);
        MenuItem printRoomMenuItem = new MenuItem("Вывести комнату", new PrintRoomAction(hotelProvider), roomMenu);
        roomMenu.addItem(new MenuItem("Вывести список комнат", new PrintRoomAction(hotelProvider),roomMenu));

        // Пункты меню для сортировки комнат по:
        roomMenu.addItem(new MenuItem("Отсортировать комнаты по цене", new GetAllRoomSortedByPriceAction(hotelProvider), roomMenu));
        roomMenu.addItem(new MenuItem("Отсортировать комнаты по кол-ву спальных мест", new GetAllRoomSortedBySleepPlaceAction(hotelProvider), roomMenu));
        roomMenu.addItem(new MenuItem("Отсортировать комнаты по кол-ву звезд", new GetAllRoomSortedByStarsAction(hotelProvider), roomMenu));

        // Пункты меню для сортировки свободных комнат по:
        roomMenu.addItem(new MenuItem("Отсортировать свободные комнаты по цене", new GetAllFreeRoomSortedByPriceAction(hotelProvider), roomMenu));
        roomMenu.addItem(new MenuItem("Отсортировать свободные комнаты по кол-ву спальных мест", new GetAllFreeRoomSortedBySleepPlaceAction(hotelProvider), roomMenu));
        roomMenu.addItem(new MenuItem("Отсортировать свободные комнаты по кол-ву звезд", new GetAllFreeRoomSortedByStarsAction(hotelProvider), roomMenu));

        MenuItem toRootFromRoomMenuItem = new MenuItem("Назад", null, rootMenu);

        roomMenu.getMenuItems().add(createRoomMenuItem);
        roomMenu.getMenuItems().add(printRoomMenuItem);
        roomMenu.getMenuItems().add(toRootFromRoomMenuItem);

        MenuItem roomMenuItem = new MenuItem("Меню комнат", null, roomMenu);

        CreateClientAction createClientAction = new CreateClientAction(hotelProvider);
        rootMenu.getMenuItems().add(roomMenuItem);

        this.rootMenu = rootMenu;
    }
}
