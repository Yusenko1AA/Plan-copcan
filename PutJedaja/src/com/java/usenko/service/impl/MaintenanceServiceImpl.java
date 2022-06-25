package com.java.usenko.service.impl;

import com.java.usenko.comparator.MaintenanceByDateComparator;
import com.java.usenko.comparator.MaintenanceByPriceComparator;
import com.java.usenko.comparator.MaintenanceByTypeMaintenanceComparator;
import com.java.usenko.dao.MaintenanceDao;
import com.java.usenko.entity.Maintenance;
import com.java.usenko.service.MaintenanceService;

import java.util.Comparator;
import java.util.List;

public class MaintenanceServiceImpl implements MaintenanceService {
    MaintenanceDao maintenanceDao;

    public MaintenanceServiceImpl(MaintenanceDao maintenanceDao) {
        this.maintenanceDao = maintenanceDao;
    }

    @Override
    public List<Maintenance> getMaintenanceSortedByPrice() {
        return getAllSortedBy(new MaintenanceByPriceComparator());
    }

    @Override
    public List<Maintenance> getMaintenanceSortedByType() {
        return getAllSortedBy(new MaintenanceByTypeMaintenanceComparator());
    }

    @Override
    public List<Maintenance> getMaintenanceSortedByDate() {
        return getAllSortedBy(new MaintenanceByDateComparator());
    }

    private List<Maintenance> getAllSortedBy(Comparator<Maintenance> comparator) {
        List<Maintenance> maintenances = maintenanceDao.getAll();
        maintenances.sort(comparator);
        return maintenances;
    }
}