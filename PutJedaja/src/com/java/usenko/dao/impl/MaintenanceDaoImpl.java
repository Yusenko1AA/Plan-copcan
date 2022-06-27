package com.java.usenko.dao.impl;

import com.java.usenko.dao.MaintenanceDao;
import com.java.usenko.entity.Maintenance;

public class MaintenanceDaoImpl extends AbstractDaoImpl<Maintenance> implements MaintenanceDao {

    @Override
    public void update(Long maintenanceID, Maintenance maintenanceToUpdate) {
        Maintenance oldMaintenance = get(maintenanceID);
        oldMaintenance.setMaintenanceType(maintenanceToUpdate.getMaintenanceType());
        oldMaintenance.setPrice(maintenanceToUpdate.getPrice());
    }
}


