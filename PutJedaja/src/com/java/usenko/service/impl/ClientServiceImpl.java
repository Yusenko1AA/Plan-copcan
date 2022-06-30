package com.java.usenko.service.impl;

import com.java.usenko.comparator.*;
import com.java.usenko.dao.ClientDao;
import com.java.usenko.entity.Client;
import com.java.usenko.entity.Maintenance;
import com.java.usenko.service.ClientService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
    public List<Client> getClientsSortedByEndDate() {
        return getAllSortedBy(new ClientByEndDateComparator());
    }

    @Override
    public List<Client> getThreeLastClients() {
        List<Client> clients = getClientsSortedByEndDate();
        List<Client> lastThreeClients = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            lastThreeClients.add(clients.get(clients.size() - i));
        }
        return lastThreeClients;
    }

    @Override
    public int getSizeClients() {
        return clientDao.getAll().size();
    }

    @Override
    public double amountOfPayment(Long clientId) {
        Client client = clientDao.get(clientId);

        int maintenancePrice = 0;
        for (Maintenance maintenance : client.getMaintenances()) {
            maintenancePrice = (int) (maintenancePrice + maintenance.getPrice());
        }

        double roomPrice = client.getRoom().getPrice();
        long diffInMillies = Math.abs(client.getEndDate().getTime() - client.getStartDate().getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        roomPrice = roomPrice * diff;

        return maintenancePrice + roomPrice;
    }

    @Override
    public List<Maintenance> getClientsMaintenanceSortedByPrice(Long clientId) {
        Client client = clientDao.get(clientId);
        List<Maintenance> maintenances = new ArrayList<>(client.getMaintenances());
        maintenances.sort(new MaintenanceByPriceComparator());
        return maintenances;

    }

    @Override
    public List<Maintenance> getClientsMaintenanceSortedByDate(Long clientId) {
        Client client = clientDao.get(clientId);
        List<Maintenance> maintenances = new ArrayList<>(client.getMaintenances());
        maintenances.sort(new MaintenanceByDateComparator());
        return maintenances;
    }

    @Override
    public Client getById(Long clientId) {
        return clientDao.get(clientId);
    }

    private List<Client> getAllSortedBy(Comparator<Client> comparator) {
        List<Client> clients = clientDao.getAll();
        clients.sort(comparator);
        return clients;
    }

    @Override
    public void create(Client client) {
        clientDao.add(client);
    }
}
