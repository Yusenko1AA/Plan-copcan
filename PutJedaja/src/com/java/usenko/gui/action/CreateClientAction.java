package com.java.usenko.gui.action;

import com.java.usenko.entity.Client;
import com.java.usenko.gui.Action;
import com.java.usenko.util.ScannerUtil;

import java.util.Date;

public class CreateClientAction extends AbstractAction implements Action {

    public CreateClientAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        Client client = new Client();

        System.out.println("Введите имя клиента");
        String name = ScannerUtil.readString();
        System.out.println("Введите дату заселения");
        Date startDate = ScannerUtil.readDate();
        System.out.println("Введите дату выселения");
        Date endDate = ScannerUtil.readDate();

        client.setName(name);
        client.setStartDate(startDate);
        client.setEndDate(endDate);
        getHotelProvider().getClientService().create(client);
    }
}
