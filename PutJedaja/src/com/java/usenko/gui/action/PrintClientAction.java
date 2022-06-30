package com.java.usenko.gui.action;

import com.java.usenko.entity.Client;
import com.java.usenko.gui.Action;
import com.java.usenko.util.ScannerUtil;

public class PrintClientAction extends AbstractAction implements Action {
    public PrintClientAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {

        System.out.println("Введите идшник клиента");
        long id = ScannerUtil.readLong();

        Client client = getHotelProvider().getClientService().getById(id);
        System.out.println(client);
    }
}
