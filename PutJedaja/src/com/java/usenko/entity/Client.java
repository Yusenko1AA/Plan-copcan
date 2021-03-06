package com.java.usenko.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client extends AbstractEntity {
    private String name;
    private Date startDate;
    private Date endDate;
    private Room room;
    private List<Maintenance> maintenances = new ArrayList<>();

    public Client() {
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", room=" + room +
                ", maintenances=" + maintenances +
                '}';
    }

    public Client(String name, Date startDate, Date endDate, Room room) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List<Maintenance> getMaintenances() {
        return maintenances;
    }

    public void setMaintenances(List<Maintenance> maintenances) {
        this.maintenances = maintenances;
    }
}


