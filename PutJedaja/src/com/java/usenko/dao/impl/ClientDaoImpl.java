package com.java.usenko.dao.impl;

import com.java.usenko.dao.ClientDao;
import com.java.usenko.entity.Client;

public class ClientDaoImpl extends AbstractDaoImpl<Client> implements ClientDao {

    @Override
    public void update(Long clientId, Client entityToUpdate) {
        Client oldClient = get(clientId);
        oldClient.setName(entityToUpdate.getName());
    }
}

