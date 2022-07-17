package com.java.usenko.gui.action;

import com.java.usenko.entity.Maintenance;
import com.java.usenko.gui.Action;
import com.java.usenko.util.ScannerUtil;

public class PrintMaintenanceAction extends AbstractAction implements Action {
    public PrintMaintenanceAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Введите идшник сервиса");
        long id = ScannerUtil.readLong();

        Maintenance maintenance = getHotelProvider().getMaintenanceService().getById(id);
        System.out.println(maintenance);
    }
}
