package com.java.usenko.zad3e;

import com.java.usenko.dao.RoomDao;
import com.java.usenko.dao.impl.RoomDaoImpl;
import com.java.usenko.entity.Client;
import com.java.usenko.entity.Room;

public abstract class E_Administrator {
    public static void main(String[] args) {
        RoomDao roomDao = new RoomDaoImpl();
        Client client = new Client();
        Room room = new Room();
        roomDao.addClientToRoom(client, room);
    }
}

