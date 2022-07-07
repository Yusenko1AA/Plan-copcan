package com.java.usenko.gui;

import java.io.FileNotFoundException;
import java.util.List;

public class Navigator {

    private Menu currentMenu;

    public void printMenu() {
        System.out.println("Текущее меню: " + currentMenu.getName());
        List<MenuItem> items = currentMenu.getMenuItems();
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ") " + items.get(i).getTitle());
        }
    }

    public void navigate(Integer index) throws FileNotFoundException {
        MenuItem menuItem = currentMenu.getMenuItems().get(index - 1);
        menuItem.doAction();
        setCurrentMenu(menuItem.getNextMenu());
    }

    public void setCurrentMenu(Menu currentMenu) {
        this.currentMenu = currentMenu;
    }
}
