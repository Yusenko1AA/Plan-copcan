package com.java.usenko.gui.action;

import com.java.usenko.entity.Client;

public class GetClientsMaintenanceSortedByDateAction extends AbstractAction {
    public GetClientsMaintenanceSortedByDateAction(HotelProvider hotelProvider) {
        super(hotelProvider);
    }

    @Override
    public void execute() {
        Client client = new Client();

        System.out.println("Отсортировать услуги клиента по дате:");
        getHotelProvider().getClientService().getClientsMaintenanceSortedByDate(client.getId()).forEach(System.out::println);
    }
}
