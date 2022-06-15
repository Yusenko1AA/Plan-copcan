package com.java.usenko.dao;

import com.java.usenko.entity.Client;
import java.util.List;

public interface ClientDao {
    void add(Client client);
    void remove(Long clientId);
    Client get(Long clientId);
    List<Client> getAll();
    void update(Long clientId, Client roomToUpdate);
}
