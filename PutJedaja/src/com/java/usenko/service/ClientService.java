package com.java.usenko.service;

import com.java.usenko.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> getClientsSortedByAlphabet();
    List<Client> getClientsSortedByStartDate();
    List<Client> getClientSortedByEndDate();
    List<Client> getThreeLastClients();
    int getSizeClients();
}
