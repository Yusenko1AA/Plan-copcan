package com.java.usenko.gui.action;

import com.java.usenko.entity.Room;
import com.java.usenko.entity.RoomStatus;
import com.java.usenko.util.ScannerUtil;

public class GetChangeRoomStatusAction extends AbstractAction {
    public GetChangeRoomStatusAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        Room room = new Room();

        System.out.println("Измените статус комнаты: | repaired | serviced | available |");
        String value = ScannerUtil.readString();
        RoomStatus status = RoomStatus.getValueOf(value);
        room.setRoomStatus(status);

        getHotelProvider().getRoomService().changeRoomStatus(room.getId(), room.getRoomStatus());
    }
}
