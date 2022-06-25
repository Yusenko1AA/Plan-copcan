package com.java.usenko.service;

import com.java.usenko.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> getClientsSortedByAlphabet();

    List<Client> getClientsSortedByStartDate();

    List<Client> getClientsSortedByEndDate();

    List<Client> getThreeLastClients();

    int getSizeClients();

    long amountOfPayment(Long clientId);
}
