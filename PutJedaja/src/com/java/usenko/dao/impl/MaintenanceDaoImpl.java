package com.java.usenko.dao.impl;

import com.java.usenko.dao.MaintenanceDao;
import com.java.usenko.entity.Maintenance;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceDaoImpl implements MaintenanceDao {
    private List<Maintenance> maintenances = new ArrayList<>();

    @Override
    public void add(Maintenance maintenance) {

    }

    @Override
    public void remove(Long maintenanceId) {
        maintenances.removeIf(maintenance -> maintenance.getId().equals(maintenanceId));
    }

    @Override
    public Maintenance get(Long maintenanceId) {
        for (Maintenance maintenance : maintenances) {
            if (maintenanceId.equals(maintenance.getId())) {
                return maintenance;
            }
        }
        return null;
    }

    @Override
    public List<Maintenance> getAll() {
        return new ArrayList<>(maintenances);
    }

    @Override
    public void update(Long maintenanceID, Maintenance maintenanceToUpdate) {
        Maintenance oldMaintenance = get(maintenanceID);
        oldMaintenance.setMaintenanceType(maintenanceToUpdate.getMaintenanceType());
        oldMaintenance.setPrice(maintenanceToUpdate.getPrice());
    }
}


