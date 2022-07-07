package com.java.usenko.gui.action;

import com.java.usenko.entity.Client;
import com.java.usenko.entity.Room;

public class GetRemoveClientFromRoomAction extends AbstractAction {
    public GetRemoveClientFromRoomAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Клиент удален из комнаты");
        Client client = new Client();
        Room room = new Room();
        getHotelProvider().getRoomService().removeClientFromRoom(client.getId(), room.getId());
    }
}
