package com.java.usenko.gui;

import com.java.usenko.gui.action.*;

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

        // Меню комнат
        Menu roomMenu = new Menu("Меню комнат");

        MenuItem createRoomMenuItem = new MenuItem("Создать комнату", new CreateRoomAction(hotelProvider), roomMenu);
        MenuItem printRoomMenuItem = new MenuItem("Вывести комнату", new PrintRoomAction(hotelProvider), roomMenu);
        roomMenu.addItem(new MenuItem("Вывести список комнат", new PrintRoomAction(hotelProvider), roomMenu));

        // Пункты меню для сортировки комнат по:
        roomMenu.addItem(new MenuItem("Отсортировать комнаты по цене", new GetAllRoomSortedByPriceAction(hotelProvider), roomMenu));
        roomMenu.addItem(new MenuItem("Отсортировать комнаты по кол-ву спальных мест", new GetAllRoomSortedBySleepPlaceAction(hotelProvider), roomMenu));
        roomMenu.addItem(new MenuItem("Отсортировать комнаты по кол-ву звезд", new GetAllRoomSortedByStarsAction(hotelProvider), roomMenu));

        // Пункты меню для сортировки свободных комнат по:
        roomMenu.addItem(new MenuItem("Отсортировать свободные комнаты по цене", new GetAllFreeRoomSortedByPriceAction(hotelProvider), roomMenu));
        roomMenu.addItem(new MenuItem("Отсортировать свободные комнаты по кол-ву спальных мест", new GetAllFreeRoomSortedBySleepPlaceAction(hotelProvider), roomMenu));
        roomMenu.addItem(new MenuItem("Отсортировать свободные комнаты по кол-ву звезд", new GetAllFreeRoomSortedByStarsAction(hotelProvider), roomMenu));

        //TODO: остальные пункты меню комнат: + проверить работоспособность приложения
        roomMenu.addItem(new MenuItem("Добавить клиента в комнату", new GetAddClientToRoomAction(hotelProvider), roomMenu));
        roomMenu.addItem(new MenuItem("Выселить клиента из комнаты", new GetRemoveClientFromRoomAction(hotelProvider), roomMenu));
        roomMenu.addItem(new MenuItem("Изменить статус комнаты", new GetChangeRoomStatusAction(hotelProvider), roomMenu));
        roomMenu.addItem(new MenuItem("Записать комнату в CSV по ID", new CreateRoomWriteCsvAction(hotelProvider), roomMenu));
        roomMenu.addItem(new MenuItem("Прочитать комнату из CSV по ID", new ReadRoomFromCsvAction(hotelProvider), roomMenu));

        // Выйти назад в главное меню из меню комнат
        MenuItem toRootFromRoomMenuItem = new MenuItem("Назад", null, rootMenu);

        roomMenu.getMenuItems().add(createRoomMenuItem);
        roomMenu.getMenuItems().add(printRoomMenuItem);
        roomMenu.getMenuItems().add(toRootFromRoomMenuItem);

        MenuItem roomMenuItem = new MenuItem("Меню комнат", null, roomMenu);

        // Меню клиента
        Menu clientMenu = new Menu("Меню клиента");

        MenuItem createClientMenuItem = new MenuItem("Создать клиента", new CreateClientAction(hotelProvider), clientMenu);
        MenuItem printClientMenuItem = new MenuItem("Вывести клиента", new PrintClientAction(hotelProvider), clientMenu);
        clientMenu.addItem(new MenuItem("Вывести список клиентов", new PrintClientAction(hotelProvider), clientMenu));
        clientMenu.addItem(new MenuItem("Просмотреть 3-х последних клиентов и даты их пребывания", new GetLastThreeClientAction(hotelProvider), clientMenu));

        // Пункты меню для сортировки клиентов/услуг клиентов по:
        clientMenu.addItem(new MenuItem("Отсортировать клиентов по алфавиту", new GetAllClientSortedByAlphabet(hotelProvider), clientMenu));
        clientMenu.addItem(new MenuItem("Отсортировать клиентов по дате заселения", new GetAllClientSortedByStartDate(hotelProvider), clientMenu));
        clientMenu.addItem(new MenuItem("Отсортировать клиентов по дате выселения", new GetAllClientSortedByEndDate(hotelProvider), clientMenu));
        clientMenu.addItem(new MenuItem("Отсортировать услуги клиета по цене", new GetClientsMaintenanceSortedByPriceAction(hotelProvider), clientMenu));
        clientMenu.addItem(new MenuItem("Отсортировать услуги клиента по дате", new GetClientsMaintenanceSortedByDateAction(hotelProvider), clientMenu));

        //TODO: Остальные пункты меню клиента: + проверить работоспособность приложения
        clientMenu.addItem(new MenuItem("Вывести итоговую стоимость за проживание", new GetAmountOfPaymentAction(hotelProvider), clientMenu));
        clientMenu.addItem(new MenuItem("Записать клиента в CSV по ID", new CreateClientWriteCsvAction(hotelProvider), clientMenu));
        clientMenu.addItem(new MenuItem("Прочитать клиента из CSV по ID", new ReadClientFromCsvAction(hotelProvider), clientMenu));

        // Выйти назад в главное меню из меню клиента
        MenuItem toRootFromClientMenuItem = new MenuItem("Назад", null, rootMenu);

        clientMenu.getMenuItems().add(createClientMenuItem);
        clientMenu.getMenuItems().add(printClientMenuItem);
        clientMenu.getMenuItems().add(toRootFromClientMenuItem);

        MenuItem clientMenuItem = new MenuItem("Меню клиента", null, clientMenu);

        // Меню услуг
        Menu maintenanceMenu = new Menu("Меню услуг");

        MenuItem createMaintenanceMenuItem = new MenuItem("Создать услугу", new CreateMaintenanceAction(hotelProvider), maintenanceMenu);
        MenuItem printMaintenanceMenuItem = new MenuItem("Вывести услугу", new PrintMaintenanceAction(hotelProvider), maintenanceMenu);
        maintenanceMenu.addItem(new MenuItem("Показать список услуг", new PrintMaintenanceAction(hotelProvider), maintenanceMenu));

        // Пункты меню для сортировки услуг по:
        maintenanceMenu.addItem(new MenuItem("Отсортировать услуги по цене", new GetAllMaintenanceSortedByPriceAction(hotelProvider), maintenanceMenu));
        maintenanceMenu.addItem(new MenuItem("Отсортировать услуги по датам", new GetAllMaintenanceSortedByDateAction(hotelProvider), maintenanceMenu));
        maintenanceMenu.addItem(new MenuItem("Отсортировать услуги по типу услуг", new GetAllMaintenanceSortedByTypeAction(hotelProvider), maintenanceMenu));

        //TODO: Остальные пункты меню услуг: + проверить работоспособность новых пунктов
        maintenanceMenu.addItem(new MenuItem("Записать услугу в CSV по ID", new CreateMaintenanceWriteCsvAction(hotelProvider), maintenanceMenu));
        maintenanceMenu.addItem(new MenuItem("Прочитать услугу из CSV по ID", new ReadMaintenanceFromCsvAction(hotelProvider), maintenanceMenu));

        // Выйти назад в главное меню из меню сервиса
        MenuItem toRootFromMaintenanceMenuItem = new MenuItem("Назад", null, rootMenu);

        maintenanceMenu.getMenuItems().add(createMaintenanceMenuItem);
        maintenanceMenu.getMenuItems().add(printMaintenanceMenuItem);
        maintenanceMenu.getMenuItems().add(toRootFromMaintenanceMenuItem);

        MenuItem maintenanceMenuItem = new MenuItem("Меню услуг", null, maintenanceMenu);

        // Добавляем пункты меню КОМНАТЫ в главное меню
        CreateRoomAction createRoomAction = new CreateRoomAction(hotelProvider);
        rootMenu.getMenuItems().add(roomMenuItem);

        // Добавляем пункты меню КЛИЕНТА в главное меню
        CreateClientAction createClientAction = new CreateClientAction(hotelProvider);
        rootMenu.getMenuItems().add(clientMenuItem);

        // Добавляем пункты меню УСЛУГ в главное меню
        CreateMaintenanceAction createMaintenanceAction = new CreateMaintenanceAction(hotelProvider);
        rootMenu.getMenuItems().add(maintenanceMenuItem);

        // Пункт меню для остановки приложения
        Menu exitMenu = new Menu("Закрыть приложение");
        MenuItem createExitMenu = new MenuItem("Закрыть приложение", new GetSystemExit(hotelProvider), null);
        exitMenu.getMenuItems().add(createExitMenu);
        GetSystemExit getSystemExit = new GetSystemExit(hotelProvider);
        rootMenu.getMenuItems().add(createExitMenu);

        this.rootMenu = rootMenu;
    }
}
