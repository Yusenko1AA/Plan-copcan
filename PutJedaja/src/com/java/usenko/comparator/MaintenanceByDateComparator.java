package com.java.usenko.comparator;

import com.java.usenko.entity.Maintenance;

import java.util.Comparator;

public class MaintenanceByDateComparator implements Comparator<Maintenance> {
    @Override
    public int compare(Maintenance o1, Maintenance o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}
