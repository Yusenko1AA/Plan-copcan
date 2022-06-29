package com.java.usenko.gui.action;

import com.java.usenko.entity.Room;
import com.java.usenko.entity.RoomStatus;
import com.java.usenko.gui.Action;
import com.java.usenko.util.ScannerUtil;

public class CreateRoomAction extends AbstractAction implements Action {

    public CreateRoomAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }


    @Override
    public void execute() {
        //TODO: считать кол-во звезд, цену, спальные места
        Room room = new Room();

        System.out.println("Установите статус комнаты: | available | serviced | repaired |");
        String value = ScannerUtil.readString();
        RoomStatus status = RoomStatus.getValueOf(value);
        room.setRoomStatus(status);

        System.out.println("введите количество звезд");
        int star = ScannerUtil.readInt();
        System.out.println("введите количество cпальных мест");
        int sleepPlace = ScannerUtil.readInt();
        System.out.println("введите цену");
        double price = ScannerUtil.readDouble();

        room.setStars(star);
        room.setSleepPlace(sleepPlace);
        room.setPrice(price);
        // исправил но правильно ли?
        getHotelProvider().getRoomService().create(room);
    }
}
