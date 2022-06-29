package com.java.usenko.gui.action;

import com.java.usenko.entity.Client;
import com.java.usenko.util.ScannerUtil;

import java.util.Date;

public class CreateClientAction extends AbstractAction {

    public CreateClientAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        System.out.println("Введите имя клиента");
        String name = ScannerUtil.readString();
        System.out.println("Введите дату заселения");
        Date startDate = ScannerUtil.readDate();
        System.out.println("Введите дату выселения");
        Date endDate = ScannerUtil.readDate();

        Client client = new Client();
        client.setName(name);
        client.setStartDate(startDate);
        client.setEndDate(endDate);
        getHotelProvider().getClientService().create(client);
    }
}
