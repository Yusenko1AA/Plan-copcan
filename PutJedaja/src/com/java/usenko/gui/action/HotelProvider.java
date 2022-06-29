package com.java.usenko.gui.action;

import com.java.usenko.service.ClientService;
import com.java.usenko.service.MaintenanceService;
import com.java.usenko.service.RoomService;

public class HotelProvider {
    private RoomService roomService;
    private ClientService clientService;
    private MaintenanceService maintenanceService;

    public HotelProvider(RoomService roomService, ClientService clientService, MaintenanceService maintenanceService) {
        this.roomService = roomService;
        this.clientService = clientService;
        this.maintenanceService = maintenanceService;
    }

    public RoomService getRoomService() {
        return roomService;
    }

    public ClientService getClientService() {
        return clientService;
    }

    public MaintenanceService getMaintenanceService() {
        return maintenanceService;
    }
}
