package com.java.usenko.gui.action;

import com.java.usenko.entity.Client;
import com.java.usenko.util.ScannerUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreateClientWriteCsvAction extends AbstractAction {
    public CreateClientWriteCsvAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() throws FileNotFoundException {
        System.out.println("Введите идшник клиента");
        long id = ScannerUtil.readLong();

        File csvFile = new File("D:\\JAVA\\client.csv");
        PrintWriter out = new PrintWriter(csvFile);

        Client client = getHotelProvider().getClientService().getById(id);
        out.println(client);

        out.close();
        System.out.println("Клиент записан в csv (путь к файлу D://JAVA):");
    }
}
