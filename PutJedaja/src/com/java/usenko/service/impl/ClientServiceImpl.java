package com.java.usenko.service.impl;

import com.java.usenko.comparator.ClientByAlphabetComparator;
import com.java.usenko.comparator.ClientByEndDateComparator;
import com.java.usenko.comparator.ClientByStartDateComparator;
import com.java.usenko.dao.ClientDao;
import com.java.usenko.entity.Client;
import com.java.usenko.service.ClientService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClientServiceImpl implements ClientService {
    private ClientDao clientDao;

    public ClientServiceImpl(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    public List<Client> getClientsSortedByAlphabet() {
        return getAllSortedBy(new ClientByAlphabetComparator());
    }

    @Override
    public List<Client> getClientsSortedByStartDate() {
        return getAllSortedBy(new ClientByStartDateComparator());
    }

    @Override
    public List<Client> getClientSortedByEndDate() {
        return getAllSortedBy(new ClientByEndDateComparator());
    }

    @Override
    public List<Client> getThreeLastClients() {
        List<Client> clients = getClientSortedByEndDate();
        List<Client> lastThreeClients = new ArrayList<>();
        for(int i = 1; i <= 3; i++) {
            lastThreeClients.add(clients.get(clients.size() - i));
        }
        return lastThreeClients;
    }

    @Override
    public int getSizeClients() {
        return clientDao.getAll().size();
    }

    private List<Client> getAllSortedBy(Comparator<Client> comparator) {
        List<Client> clients = clientDao.getAll();
        clients.sort(comparator);
        return clients;
    }
}
