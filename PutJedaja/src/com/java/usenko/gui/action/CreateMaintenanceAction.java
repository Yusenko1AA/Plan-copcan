package com.java.usenko.gui.action;

import com.java.usenko.entity.Maintenance;
import com.java.usenko.entity.MaintenanceType;
import com.java.usenko.gui.Action;
import com.java.usenko.util.ScannerUtil;

import java.util.Date;

public class CreateMaintenanceAction extends AbstractAction implements Action {
    public CreateMaintenanceAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        Maintenance maintenance = new Maintenance();

        System.out.println("Введите тип услуги: | massage | cleaning | alcohol | food |");
        String value = ScannerUtil.readString();
        MaintenanceType status = MaintenanceType.getValueOf(value);
        maintenance.setMaintenanceType(status);

        System.out.println("введите цену услуги");
        double price = ScannerUtil.readDouble();
        System.out.println("Введите дату выдачи услуги");
        Date date = ScannerUtil.readDate();

        maintenance.setPrice(price);
        maintenance.setDate(date);
        getHotelProvider().getMaintenanceService().create(maintenance);
    }
}
