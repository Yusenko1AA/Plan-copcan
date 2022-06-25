package com.java.usenko.comparator;

import com.java.usenko.entity.Client;

import java.util.Comparator;

public class ClientByEndDateComparator implements Comparator<Client> {

    @Override
    public int compare(Client o1, Client o2) {
        return o1.getEndDate().compareTo(o2.getEndDate());
    }
}

