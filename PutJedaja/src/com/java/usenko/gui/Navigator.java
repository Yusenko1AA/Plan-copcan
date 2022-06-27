package com.java.usenko.gui;

public class Navigator {

    private Menu currentMenu;

    public void printMenu() {
        for (int i = 0; i < currentMenu.getMenuItems().size(); i++) {
            System.out.println((i + 1) + ") " + currentMenu.getMenuItems().get(i).getTitle());
        }
    }

    public void navigate(Integer index) {
        MenuItem menuItem = currentMenu.getMenuItems().get(index - 1);
        menuItem.doAction();
        this.currentMenu = menuItem.getNextMenu();
    }

    public void setCurrentMenu(Menu currentMenu) {
        this.currentMenu = currentMenu;
    }
}
