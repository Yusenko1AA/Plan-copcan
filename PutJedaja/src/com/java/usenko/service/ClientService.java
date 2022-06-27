package com.java.usenko.service;

import com.java.usenko.entity.Client;
import com.java.usenko.entity.Maintenance;

import java.util.List;

public interface ClientService {
    List<Client> getClientsSortedByAlphabet();

    List<Client> getClientsSortedByStartDate();

    List<Client> getClientsSortedByEndDate();

    List<Client> getThreeLastClients();

    int getSizeClients();

    double amountOfPayment(Long clientId);

    List<Maintenance> getClientsMaintenanceSortedByPrice(Long clientId);

    List<Maintenance> getClientsMaintenanceSortedByDate(Long clientId);
}
