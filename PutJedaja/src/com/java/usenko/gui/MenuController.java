package com.java.usenko.gui;

import com.java.usenko.gui.action.HotelProvider;

import java.util.Scanner;

public class MenuController {

    private Builder builder;
    private Navigator navigator;

    public MenuController(Builder builder, Navigator navigator, HotelProvider hotelProvider) {
        this.builder = builder;
        this.navigator = navigator;
       // AbstractAction.initializeHotelProvider(hotelProvider);
    }

    public void run() {
        builder.buildMenu();
        Menu rootMenu = builder.getRootMenu();
        navigator.setCurrentMenu(rootMenu);
        int currentIndex = 0;
        while (currentIndex != -1) {
            navigator.printMenu();
            //TODO: считать с консоли индекс
            Scanner scanner = new Scanner(System.in);
            currentIndex = scanner.nextInt();
            navigator.navigate(currentIndex);
        }
    }
}
