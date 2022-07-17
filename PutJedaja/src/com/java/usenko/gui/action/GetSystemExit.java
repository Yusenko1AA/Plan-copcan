package com.java.usenko.gui.action;

public class GetSystemExit extends AbstractAction{

    public GetSystemExit(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Программа остановлена");
        System.exit(0);
    }
}
