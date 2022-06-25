package com.java.usenko.service;

import com.java.usenko.entity.Maintenance;

import java.util.List;

public interface MaintenanceService {
    List<Maintenance> getMaintenanceSortedByPrice();
    List<Maintenance> getMaintenanceSortedByType();
    List<Maintenance> getMaintenanceSortedByDate();
}
