package com.java.usenko.gui.action;

import com.java.usenko.entity.Room;
import com.java.usenko.gui.Action;
import com.java.usenko.util.ScannerUtil;

public class PrintRoomAction extends AbstractAction implements Action {
    public PrintRoomAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {

        System.out.println("Введите идшник комнаты");
        long id = ScannerUtil.readLong();

        Room room = getHotelProvider().getRoomService().getById(id);
        System.out.println(room);
    }
}
