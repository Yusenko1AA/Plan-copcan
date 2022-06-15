package com.java.usenko.dao.impl;

import com.java.usenko.dao.ClientDao;
import com.java.usenko.entity.Client;
import java.util.ArrayList;
import java.util.List;

public class ClientDaoImpl implements ClientDao {
    private List<Client> clients = new ArrayList<>();

    @Override
    public void add(Client client) {
        clients.add(client);
    }

    @Override
    public void remove(Long clientId) {
        clients.removeIf(client -> client.getId().equals(clientId));
    }

    @Override
    public Client get(Long clientId) {
        for (Client client : clients) {
            if (clientId.equals(client.getId())) {
                return client;
            }
        }
        return null;
    }

    @Override
    public List<Client> getAll() {
        return new ArrayList<>(clients);
    }

    @Override
    public void update(Long clientID, Client clientToUpdate) {
        Client oldClient = get(clientID);
        oldClient.setName(clientToUpdate.getName());
        oldClient.setAge(clientToUpdate.getAge());
    }
    }

