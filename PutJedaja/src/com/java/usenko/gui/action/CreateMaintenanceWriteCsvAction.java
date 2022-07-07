package com.java.usenko.gui.action;

import com.java.usenko.entity.Maintenance;
import com.java.usenko.util.ScannerUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreateMaintenanceWriteCsvAction extends AbstractAction {
    public CreateMaintenanceWriteCsvAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() throws FileNotFoundException {
        System.out.println("Введите идшник сервиса");
        long id = ScannerUtil.readLong();

        File csvFile = new File("D:\\JAVA\\maintenance.csv");
        PrintWriter out = new PrintWriter(csvFile);

        Maintenance maintenance = getHotelProvider().getMaintenanceService().getById(id);
        out.println(maintenance);

        out.close();
        System.out.println("Услуга записана в csv (путь к файлу D://JAVA):");
    }
}
