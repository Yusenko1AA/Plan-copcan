package com.java.usenko.gui.action;

import com.java.usenko.gui.Action;

public abstract class AbstractAction implements Action {
    private final HotelProvider hotelProvider;

    protected AbstractAction(HotelProvider hotelProvider) {
        this.hotelProvider = hotelProvider;
    }

    protected HotelProvider getHotelProvider() {
     return this.hotelProvider;
    }

}
