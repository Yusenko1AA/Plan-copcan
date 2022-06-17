package com.java.usenko.zad3e;

import com.java.usenko.dao.ClientDao;
import com.java.usenko.dao.RoomDao;
import com.java.usenko.dao.impl.ClientDaoImpl;
import com.java.usenko.dao.impl.RoomDaoImpl;
import com.java.usenko.entity.Client;
import com.java.usenko.entity.Room;
import com.java.usenko.service.ClientService;
import com.java.usenko.service.RoomService;
import com.java.usenko.service.impl.ClientServiceImpl;
import com.java.usenko.service.impl.RoomServiceImpl;

import java.util.Date;

public abstract class E_Administrator {
    public static void main(String[] args) {
        ClientDao clientDao = new ClientDaoImpl();
        ClientService clientService = new ClientServiceImpl(clientDao);
        Client client = new Client();
        client.setEndDate(new Date());
        Client client1 = new Client();
        client1.setEndDate(new Date());
        Client client2 = new Client();
        client2.setEndDate(new Date());
        clientDao.add(client);
        clientDao.add(client1);
        clientDao.add(client2);
        clientService.getThreeLastClients();
       // roomDao.addClientToRoom(client, room);
    }
}

