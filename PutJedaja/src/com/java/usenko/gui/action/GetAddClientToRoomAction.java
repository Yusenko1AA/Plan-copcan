package com.java.usenko.gui.action;

import com.java.usenko.entity.Client;
import com.java.usenko.entity.Room;

public class GetAddClientToRoomAction extends AbstractAction {
    public GetAddClientToRoomAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Клиент добавлен в комнату");
        Client client = new Client();
        Room room = new Room();
        getHotelProvider().getRoomService().addClientToRoom(client.getId(), room.getId());
    }
}
