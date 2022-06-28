package com.java.usenko.gui.action;

import com.java.usenko.entity.Client;
import com.java.usenko.gui.Action;
import com.java.usenko.service.ClientService;
import com.java.usenko.util.ScannerUtil;

import java.util.Date;

public class CreateClientAction implements Action {

    private final ClientService clientService;

    public CreateClientAction(ClientService clientService) {
        this.clientService = clientService;
    }
    // TODO: разобраться с датами
    @Override
    public void execute() {
        System.out.println("Введите имя клиента");
        String name = ScannerUtil.readString();
        System.out.println("Введите дату заселения");
        // String startDate = ScannerUtil.readStartDate();
        System.out.println("Введите дату выселения");
        // String endDate = ScannerUtil.readEndDate();
        Client client = new Client();
        client.setName(name);
        // client.setStartDate();
        // client.setEndDate();
        clientService.create(client);
    }
}
