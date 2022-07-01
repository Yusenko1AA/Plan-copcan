package com.java.usenko.main;


import com.java.usenko.dao.ClientDao;
import com.java.usenko.dao.MaintenanceDao;
import com.java.usenko.dao.RoomDao;
import com.java.usenko.dao.impl.ClientDaoImpl;
import com.java.usenko.dao.impl.MaintenanceDaoImpl;
import com.java.usenko.dao.impl.RoomDaoImpl;
import com.java.usenko.gui.Builder;
import com.java.usenko.gui.MenuController;
import com.java.usenko.gui.Navigator;
import com.java.usenko.gui.action.HotelProvider;
import com.java.usenko.service.ClientService;
import com.java.usenko.service.MaintenanceService;
import com.java.usenko.service.RoomService;
import com.java.usenko.service.impl.ClientServiceImpl;
import com.java.usenko.service.impl.MaintenanceServiceImpl;
import com.java.usenko.service.impl.RoomServiceImpl;

public abstract class E_Administrator {
    public static void main(String[] args) {
        RoomDao roomDao = new RoomDaoImpl();
        MaintenanceDao maintenanceDao = new MaintenanceDaoImpl();
        ClientDao clientDao = new ClientDaoImpl();
        RoomService roomService = new RoomServiceImpl(roomDao, maintenanceDao, clientDao);
        MaintenanceService maintenanceService = new MaintenanceServiceImpl(maintenanceDao);
        ClientService clientService = new ClientServiceImpl(clientDao);
        HotelProvider hotelProvider = new HotelProvider(roomService, clientService, maintenanceService);

        Builder builder = new Builder(hotelProvider);
        Navigator navigator = new Navigator();
        MenuController menuController = new MenuController(builder, navigator);
        menuController.run();
    }
}

