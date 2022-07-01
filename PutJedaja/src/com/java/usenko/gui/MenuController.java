package com.java.usenko.gui;

import com.java.usenko.util.ScannerUtil;

public class MenuController {

    private Builder builder;
    private Navigator navigator;

    public MenuController(Builder builder, Navigator navigator) {
        this.builder = builder;
        this.navigator = navigator;
    }

    public void run() {
        builder.buildMenu();
        Menu rootMenu = builder.getRootMenu();
        navigator.setCurrentMenu(rootMenu);
        int currentIndex = 0;
        while (currentIndex != -1) {
            navigator.printMenu();
            currentIndex = ScannerUtil.readInt();
            navigator.navigate(currentIndex);
        }
    }
}
