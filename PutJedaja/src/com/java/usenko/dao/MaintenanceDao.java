package com.java.usenko.dao;

import com.java.usenko.entity.Maintenance;
import java.util.List;

public interface MaintenanceDao {
    void add(Maintenance maintenance);
    void remove(Long maintenanceId);
    Maintenance get(Long maintenanceId);
    List<Maintenance> getAll();
    void update(Long maintenanceId, Maintenance maintenanceToUpdate);
}
